import Exceptions.CastException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringEscapeUtils;
import value.*;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import generation.*;
public class HaveFunAndArnoldCImp extends HaveFunAndArnoldCBaseVisitor<Value> {

    private final LinkedList<Conf> vars;
    private final Conf globalVars;
    private final Set<FunValue> functions = new HashSet<>();

    private final HashMap<String, FloatValue> arnoldConf = new HashMap<>();

    private final Stack<Float> stack = new Stack<>();

    public HaveFunAndArnoldCImp(Conf conf) {
        this.globalVars = conf;
        vars = new LinkedList<>();
        vars.add(new Conf());
    }

    @Override
    public ComValue visitFun(HaveFunAndArnoldCParser.FunContext ctx) {
        List<TerminalNode> ids = ctx.ID();
        String funID = ids.get(0).getText();
        ids.remove(ids.get(0));
        Set<String> params = new HashSet<>();
        if(ids.size() != 0){
            for(int i = 0; i < ids.size(); i++){
                TerminalNode param = ids.get(i);
                if(params.contains(param.getText())){
                    System.err.println("Il parametro " + param.getText() + " non è corretto");
                    System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
                    System.exit(1);
                }
                params.add(param.getText());
            }
        }
        FunValue fun = new FunValue(funID, params, ctx.com(), ctx.exp());
        if(!functions.add(fun)){
            System.err.println("la funzione " + funID + " è già definita");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
        }
        return ComValue.INSTANCE;

    }

    @Override
    public Value visitVarGlobalAssign(HaveFunAndArnoldCParser.VarGlobalAssignContext ctx) {
        if(!globalVars.contains(ctx.ID().getText())){
            System.err.println("La variabile globale " + ctx.ID().getText() + " è già definita");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
        }
        globalVars.update(ctx.ID().getText(), visitExp(ctx.exp()));
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitGlobalAssignValue(HaveFunAndArnoldCParser.GlobalAssignValueContext ctx) {
        if(globalVars.contains(ctx.ID().getText())){
            System.err.println("La variabile globale " + ctx.ID().getText() + " è già definita");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
        }
        globalVars.update(ctx.ID().getText(), visitExp(ctx.exp()));
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitGlobalID(HaveFunAndArnoldCParser.GlobalIDContext ctx) {
        ExpValue<?> val = globalVars.get(ctx.ID().getText());
        if(val != null){
            return val;
        }
        System.err.println("La variabile globale " + ctx.ID().getText() + " non esiste");
        System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
        System.exit(1);
        return null;
    }

    private ComValue visitCom(HaveFunAndArnoldCParser.ComContext ctx) {
        return (ComValue) visit(ctx);
    }

    private ComValue visitArnoldCom(HaveFunAndArnoldCParser.ArnoldComContext ctx) {
        return (ComValue) visit(ctx);
    }

    private ExpValue<?> visitExp(ParserRuleContext ctx) {
        return (ExpValue<?>) visit(ctx);
    }

    private FloatValue visitOperand(ParserRuleContext ctx){
        return (FloatValue) visit(ctx);
    }

    private int visitNatExp(HaveFunAndArnoldCParser.ExpContext ctx) {
        try {
            return ((NatValue) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            CastException.castException("Natural", ctx);
        }

        return 0; // unreachable code
    }

    private boolean visitBoolExp(HaveFunAndArnoldCParser.ExpContext ctx) {
        try {
            return ((BoolValue) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            CastException.castException("Boolean", ctx);
        }
        return false; // unreachable code
    }

    private float visitFloatExp(HaveFunAndArnoldCParser.OperandContext ctx) {
        try {
            return ((FloatValue) visitOperand(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            CastException.castException("Float", ctx);
        }

        return 0F; // unreachable code
    }

    private boolean visitBoolExp(HaveFunAndArnoldCParser.OperandContext ctx) {
        try {
            return ((BoolValue) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            CastException.castException("Boolean", ctx);
        }
        return false; // unreachable code
    }

    private String VisitStringExp(HaveFunAndArnoldCParser.OperandContext ctx){
        try {
            return ((StringValue)visit(ctx)).toJavaValue();
        }
        catch (ClassCastException e) {
            CastException.castException("String", ctx);
        }
        return null;
    }

    @Override
    public ComValue visitIf(HaveFunAndArnoldCParser.IfContext ctx) {
        return visitBoolExp(ctx.exp())
                ? visitCom(ctx.com(0))
                : visitCom(ctx.com(1));
    }

    @Override
    public ComValue visitAssign(HaveFunAndArnoldCParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        ExpValue<?> v = visitExp(ctx.exp());
        vars.getLast().update(id, v);

        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitSkip(HaveFunAndArnoldCParser.SkipContext ctx) {
        return ComValue.INSTANCE;
    }

    @Override
    public Value visitArnoldInit(HaveFunAndArnoldCParser.ArnoldInitContext ctx) {
        return visit(ctx.arnoldIni());
    }

    @Override
    public ComValue visitSeq(HaveFunAndArnoldCParser.SeqContext ctx) {
        visitCom(ctx.com(0));
        return visitCom(ctx.com(1));
    }

    @Override
    public ComValue visitWhile(HaveFunAndArnoldCParser.WhileContext ctx) {
        if (!visitBoolExp(ctx.exp()))
            return ComValue.INSTANCE;

        visitCom(ctx.com());

        return visitWhile(ctx);
    }

    @Override
    public ComValue visitOut(HaveFunAndArnoldCParser.OutContext ctx) {
        System.out.println(visitExp(ctx.exp()));
        return ComValue.INSTANCE;
    }

    @Override
    public NatValue visitNat(HaveFunAndArnoldCParser.NatContext ctx) {
        return new NatValue(Integer.parseInt(ctx.NAT().getText()));
    }

    @Override
    public BoolValue visitBool(HaveFunAndArnoldCParser.BoolContext ctx) {
        return new BoolValue(Boolean.parseBoolean(ctx.BOOL().getText()));
    }

    @Override
    public ExpValue<?> visitParExp(HaveFunAndArnoldCParser.ParExpContext ctx) {
        return visitExp(ctx.exp());
    }

    @Override
    public NatValue visitPow(HaveFunAndArnoldCParser.PowContext ctx) {
        int base = visitNatExp(ctx.exp(0));
        int exp = visitNatExp(ctx.exp(1));

        return new NatValue((int) Math.pow(base, exp));
    }

    @Override
    public BoolValue visitNot(HaveFunAndArnoldCParser.NotContext ctx) {
        return new BoolValue(!visitBoolExp(ctx.exp()));
    }

    @Override
    public NatValue visitDivMulMod(HaveFunAndArnoldCParser.DivMulModContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case HaveFunAndArnoldCParser.DIV -> new NatValue(left / right);
            case HaveFunAndArnoldCParser.MUL -> new NatValue(left * right);
            case HaveFunAndArnoldCParser.MOD -> new NatValue(left % right);
            default -> null;
        };
    }

    @Override
    public NatValue visitPlusMinus(HaveFunAndArnoldCParser.PlusMinusContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case HaveFunAndArnoldCParser.PLUS -> new NatValue(left + right);
            case HaveFunAndArnoldCParser.MINUS -> new NatValue(Math.max(left - right, 0));
            default -> null;
        };
    }

    @Override
    public BoolValue visitEqExp(HaveFunAndArnoldCParser.EqExpContext ctx) {
        ExpValue<?> left = visitExp(ctx.exp(0));
        ExpValue<?> right = visitExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case HaveFunAndArnoldCParser.EQQ -> new BoolValue(left.equals(right));
            case HaveFunAndArnoldCParser.NEQ -> new BoolValue(!left.equals(right));
            default -> null; // unreachable code
        };
    }

    @Override
    public ExpValue<?> visitId(HaveFunAndArnoldCParser.IdContext ctx) {
        String id = ctx.ID().getText();

        if(!vars.getLast().contains(id)) {
            System.err.println("La variabile " + id + " usata ma non inizializzata");
            System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());

            System.exit(1);
        }

        return vars.getLast().get(id);
    }

    @Override
    public Value visitProgram(HaveFunAndArnoldCParser.ProgramContext ctx) {
        for(int i = 0; i < ctx.globalEnv().size(); i++){
            visit(ctx.globalEnv(i));
        }
        for(HaveFunAndArnoldCParser.FunContext f : ctx.fun())
            visit(f);
        return visitCom(ctx.com());
    }

    @Override
    public ComValue visitArnoldIni(HaveFunAndArnoldCParser.ArnoldIniContext ctx) {
        int i=0;
        for(i = 0; i < ctx.arnoldCom().size() - 1; i++){
            visitArnoldCom(ctx.arnoldCom(i));
        }
        return visitArnoldCom(ctx.arnoldCom(i));
    }

    @Override
    public ComValue visitArnoldIfElseCheck(HaveFunAndArnoldCParser.ArnoldIfElseCheckContext ctx) {
        return visitBoolExp(ctx.operand())
                ? visitArnoldCom(ctx.arnoldCom(0))
                : visitArnoldCom(ctx.arnoldCom(1));
    }

    @Override
    public ComValue visitArnoldIfCheck(HaveFunAndArnoldCParser.ArnoldIfCheckContext ctx) {
        if(visitFloatExp(ctx.operand()) == 1F)
            return visitArnoldCom(ctx.arnoldCom());
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitArnoldWhileCycle(HaveFunAndArnoldCParser.ArnoldWhileCycleContext ctx) {
        if (visitFloatExp(ctx.operand()) == 0F)
            return ComValue.INSTANCE;
        for (int i = 0; i < ctx.arnoldCom().size(); i++) {
            visitArnoldCom(ctx.arnoldCom(i));
        }
        return visitArnoldWhileCycle(ctx);
    }

    @Override
    public ComValue visitArnoldPrintExpression(HaveFunAndArnoldCParser.ArnoldPrintExpressionContext ctx) {
        if (ctx.ID() == null){
            System.out.println(ctx.STRING().getText());
        }
        else{
            String id = ctx.ID().getText();
            if (arnoldConf.get(id) != null){
                System.out.println(arnoldConf.get(id));
            }
        }
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitArnoldAssignValue(HaveFunAndArnoldCParser.ArnoldAssignValueContext ctx) {
        String id = ctx.ID().getText();
        stack.push(visitFloatExp(ctx.operand()));
        for (int i = 0; i < ctx.arnoldOperations().size(); i++) {
            visit(ctx.arnoldOperations(i));
        }
        Float result = stack.pop();
        arnoldConf.put(id, new FloatValue(result));
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitArnoldDeclareVariable(HaveFunAndArnoldCParser.ArnoldDeclareVariableContext ctx) {
        String id = ctx.ID().getText();
        arnoldConf.put(id, new FloatValue(visitFloatExp(ctx.operand())));
        return ComValue.INSTANCE;
    }

    @Override
    public FloatValue visitArnoldIdExp(HaveFunAndArnoldCParser.ArnoldIdExpContext ctx) {
        String id = ctx.ID().getText();
        if(arnoldConf.get(id) == null){
            System.err.println("La variabile " + id + " usata ma non inizializzata");
            System.err.println("@"+ ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
        }
        return arnoldConf.get(id);
    }

    @Override
    public Value visitArnoldStringExp(HaveFunAndArnoldCParser.ArnoldStringExpContext ctx) {
        return new StringValue(StringEscapeUtils.unescapeJava(ctx.STRING().getText().substring(1,
                ctx.STRING().getText().length() - 1)));
    }

    @Override
    public FloatValue visitArnoldNumberExp(HaveFunAndArnoldCParser.ArnoldNumberExpContext ctx) {
        return new FloatValue(Float.parseFloat(ctx.ARNOLDFLOAT().getText()));
    }

    @Override
    public FloatValue visitArnoldBoolExp(HaveFunAndArnoldCParser.ArnoldBoolExpContext ctx) {
        String tmp = ctx.ARNOLDBOOL().getText();
        return tmp.compareTo("NO PROBLEMO") == 0 ? new FloatValue(1f) : new FloatValue(0f);
    }

    @Override
    public FloatValue visitArnoldOp(HaveFunAndArnoldCParser.ArnoldOpContext ctx) {
        float left = stack.pop();
        float right = visitFloatExp(ctx.operand());
        boolean leftB = left >= 1F ? true : false;
        boolean rightB = visitFloatExp(ctx.operand()) >= 1F ? true : false;
        /*Gestione delle operazioni*/
        switch (ctx.arnoldOperation.getType()){
            case HaveFunAndArnoldCParser.ARNOLDPLUSOPERATOR:
                stack.push(left + right);
                return new FloatValue(left + right);
            case HaveFunAndArnoldCParser.ARNOLDMINUSOPERATOR:
                stack.push(left - right);
                return new FloatValue(left - right);
            case HaveFunAndArnoldCParser.ARNOLDMULTIPLICATIONOPERATOR:
                stack.push(left * right);
                return new FloatValue(left * right);
            case HaveFunAndArnoldCParser.ARNOLDDIVISIONOPERATOR:
                stack.push(left / right);
                return new FloatValue(left / right);
            case HaveFunAndArnoldCParser.ARNOLDEQUALTO:
                stack.push(left == right ? 1F: 0F);
                return new FloatValue(left == right ? 1F: 0F);
            case HaveFunAndArnoldCParser.ARNOLDGREATERTHAN:
                stack.push(left > right ? 1F: 0F);
                return new FloatValue(left > right ? 1F: 0F);
            case HaveFunAndArnoldCParser.ARNOLDOR:
                stack.push(leftB || rightB ? 1F: 0F);
                return new FloatValue((leftB || rightB) ? 1F : 0F);
            case HaveFunAndArnoldCParser.ARNOLDAND:
                stack.push(leftB && rightB ? 1F: 0F);
                return new FloatValue((leftB && rightB) ? 1F : 0F);
            default:
                return new FloatValue(0F);
        }
    }

    @Override
    public Value visitFunction(HaveFunAndArnoldCParser.FunctionContext ctx) {
        String id = ctx.ID().getText();
        List<HaveFunAndArnoldCParser.ExpContext> params = ctx.exp();

        for(FunValue fun: functions) {
            if (fun.getFunId().equals(id)) {
                if (params.size() != fun.getParamsLength()) {
                    System.err.println("La funzione " + fun.getFunId() + " è stata chiamata con un numero errato di argomenti");
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
                HaveFunAndArnoldCParser.ComContext com = fun.getCom();
                if (com != null)
                    visitCom(com);
                ExpValue<?> returnVal = visitExp(fun.getRet());
                vars.removeLast();
                return returnVal;
            }
        }
        System.err.println("La funzione " + id + " usata ma non dichiarata");
        System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
        System.exit(1);
        return null;
    }

    @Override
    public BoolValue visitCmpExp(HaveFunAndArnoldCParser.CmpExpContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case HaveFunAndArnoldCParser.GEQ -> new BoolValue(left >= right);
            case HaveFunAndArnoldCParser.LEQ -> new BoolValue(left <= right);
            case HaveFunAndArnoldCParser.LT  -> new BoolValue(left < right);
            case HaveFunAndArnoldCParser.GT  -> new BoolValue(left > right);
            default -> null;
        };
    }

    @Override
    public BoolValue visitLogicExp(HaveFunAndArnoldCParser.LogicExpContext ctx) {
        boolean left = visitBoolExp(ctx.exp(0));
        boolean right = visitBoolExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case HaveFunAndArnoldCParser.AND -> new BoolValue(left && right);
            case HaveFunAndArnoldCParser.OR -> new BoolValue(left || right);
            default -> null;
        };
    }

    @Override
    public Value visitNd(HaveFunAndArnoldCParser.NdContext ctx) {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 2);
        return visit(ctx.com(randomNum));
    }
}
