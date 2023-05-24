import org.antlr.v4.runtime.tree.TerminalNode;
import value.*;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import gen.*;
public class IntImp extends ImpBaseVisitor<Value> {

    private final LinkedList<Conf> vars;
    private final Conf globalVars;
    private final Set<FunValue> functions = new HashSet<>();

    public IntImp(Conf conf) {
        this.globalVars = conf;
        vars = new LinkedList<>();
        vars.add(new Conf());
    }

    @Override
    public ComValue visitFun(ImpParser.FunContext ctx) {
        List<TerminalNode> ids = ctx.ID();
        String funID = ids.get(0).getText();
        //Rimuovo il nome della funzione
        ids.remove(ids.get(0));

        Set<String> params = new HashSet<>();
        //Controllo se ci sono altri parametri

        if(ids.size() != 0){
            for(int i = 0; i < ids.size(); i++){
                TerminalNode param = ids.get(i);
                //Se il parametro esiste già ritorna un errore
                if(params.contains(param.getText())){
                    System.err.println("Parameter name " + param.getText() + " clashes with previous parameters");
                    System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
                    System.exit(1);
                }
                params.add(param.getText());
            }
        }
        FunValue fun = new FunValue(funID, params, ctx.com(), ctx.exp());
        if(!functions.add(fun)){
            System.err.println("Fun " + funID + " already defined");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
        }
        return ComValue.INSTANCE;

    }

    @Override
    public Value visitGlobalAssign(ImpParser.GlobalAssignContext ctx) {
        if(globalVars.contains(ctx.ID().getText())){
            System.err.println("Global var " + ctx.ID().getText() + " already defined");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
        }
        globalVars.update(ctx.ID().getText(), visitExp(ctx.exp()));
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitGlobalID(ImpParser.GlobalIDContext ctx) {
        ExpValue<?> val = globalVars.get(ctx.ID().getText());
        if(val != null){
            return val;
        }
        System.err.println("Global var " + ctx.ID().getText() + " does not exist");
        System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
        System.exit(1);
        return null;
    }

    private ComValue visitCom(ImpParser.ComContext ctx) {
        return (ComValue) visit(ctx);
    }

    private ExpValue<?> visitExp(ImpParser.ExpContext ctx) {
        return (ExpValue<?>) visit(ctx);
    }

    private int visitNatExp(ImpParser.ExpContext ctx) {
        try {
            return ((NatValue) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            System.err.println("Type mismatch exception!");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
            System.err.println("> Natural expression expected.");
            System.exit(1);
        }

        return 0; // unreachable code
    }

    private boolean visitBoolExp(ImpParser.ExpContext ctx) {
        try {
            return ((BoolValue) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            System.err.println("Type mismatch exception!");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
            System.err.println(ctx.getText());
            System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
            System.err.println("> Boolean expression expected.");
            System.exit(1);
        }

        return false; // unreachable code
    }

    @Override
    public ComValue visitProg(ImpParser.ProgContext ctx) {
        for(ImpParser.FunContext f : ctx.fun())
            visit(f);
        return visitCom(ctx.com());
    }

    @Override
    public ComValue visitIf(ImpParser.IfContext ctx) {
        return visitBoolExp(ctx.exp())
                ? visitCom(ctx.com(0))
                : visitCom(ctx.com(1));
    }

    @Override
    public ComValue visitAssign(ImpParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        ExpValue<?> v = visitExp(ctx.exp());
        vars.getLast().update(id, v);

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitSkip(ImpParser.SkipContext ctx) {
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitSeq(ImpParser.SeqContext ctx) {
        visitCom(ctx.com(0));
        return visitCom(ctx.com(1));
    }

    @Override
    public ComValue visitWhile(ImpParser.WhileContext ctx) {
        if (!visitBoolExp(ctx.exp()))
            return ComValue.INSTANCE;

        visitCom(ctx.com());

        return visitWhile(ctx);
    }

    @Override
    public ComValue visitOut(ImpParser.OutContext ctx) {
        System.out.println(visitExp(ctx.exp()));
        return ComValue.INSTANCE;
    }

    @Override
    public NatValue visitNat(ImpParser.NatContext ctx) {
        return new NatValue(Integer.parseInt(ctx.NAT().getText()));
    }

    @Override
    public BoolValue visitBool(ImpParser.BoolContext ctx) {
        return new BoolValue(Boolean.parseBoolean(ctx.BOOL().getText()));
    }

    @Override
    public ExpValue<?> visitParExp(ImpParser.ParExpContext ctx) {
        return visitExp(ctx.exp());
    }

    @Override
    public NatValue visitPow(ImpParser.PowContext ctx) {
        int base = visitNatExp(ctx.exp(0));
        int exp = visitNatExp(ctx.exp(1));

        return new NatValue((int) Math.pow(base, exp));
    }

    @Override
    public BoolValue visitNot(ImpParser.NotContext ctx) {
        return new BoolValue(!visitBoolExp(ctx.exp()));
    }

    @Override
    public NatValue visitDivMulMod(ImpParser.DivMulModContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.DIV -> new NatValue(left / right);
            case ImpParser.MUL -> new NatValue(left * right);
            case ImpParser.MOD -> new NatValue(left % right);
            default -> null;
        };
    }

    @Override
    public NatValue visitPlusMinus(ImpParser.PlusMinusContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.PLUS -> new NatValue(left + right);
            case ImpParser.MINUS -> new NatValue(Math.max(left - right, 0));
            default -> null;
        };
    }

    @Override
    public BoolValue visitEqExp(ImpParser.EqExpContext ctx) {
        ExpValue<?> left = visitExp(ctx.exp(0));
        ExpValue<?> right = visitExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.EQQ -> new BoolValue(left.equals(right));
            case ImpParser.NEQ -> new BoolValue(!left.equals(right));
            default -> null; // unreachable code
        };
    }

    @Override
    public ExpValue<?> visitId(ImpParser.IdContext ctx) {
        String id = ctx.ID().getText();

        if(!vars.getLast().contains(id)) {
            System.err.println("Variable " + id + " used but never instantiated");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());

            System.exit(1);
        }

        return vars.getLast().get(id);
    }

    @Override
    public Value visitFunction(ImpParser.FunctionContext ctx) {
        String id = ctx.ID().getText();
        List<ImpParser.ExpContext> params = ctx.exp();

        for(FunValue fun: functions) {
            if (fun.getFunId().equals(id)) {
                if (params.size() != fun.getParamsLength()) {
                    System.err.println("Function " + fun + " called with the wrong number of arguments");
                    System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
                    System.exit(1);
                }

                Conf memFunction = new Conf();
                int i = 0;
                for (String p : fun.getParams()) {
                    memFunction.update(p, visitExp(params.get(i)));
                    i++;
                }
                vars.add(memFunction);
                ImpParser.ComContext com = fun.getCom();
                if (com != null)
                    visitCom(com);
                ExpValue<?> returnVal = visitExp(fun.getRet());
                vars.removeLast();
                return returnVal;
            }
        }
        System.err.println("Function " + id + " used but never declared");
        System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
        System.exit(1);
        return null;
    }

    @Override
    public BoolValue visitCmpExp(ImpParser.CmpExpContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.GEQ -> new BoolValue(left >= right);
            case ImpParser.LEQ -> new BoolValue(left <= right);
            case ImpParser.LT  -> new BoolValue(left < right);
            case ImpParser.GT  -> new BoolValue(left > right);
            default -> null;
        };
    }

    @Override
    public BoolValue visitLogicExp(ImpParser.LogicExpContext ctx) {
        boolean left = visitBoolExp(ctx.exp(0));
        boolean right = visitBoolExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case ImpParser.AND -> new BoolValue(left && right);
            case ImpParser.OR -> new BoolValue(left || right);
            default -> null;
        };
    }

    @Override
    public Value visitNd(ImpParser.NdContext ctx) {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 2);
        return visit(ctx.com(randomNum));
    }
}
