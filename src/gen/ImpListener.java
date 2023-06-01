// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ImpParser}.
 */
public interface ImpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ImpParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ImpParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ImpParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterFun(ImpParser.FunContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitFun(ImpParser.FunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globalAssign}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterGlobalAssign(ImpParser.GlobalAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalAssign}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitGlobalAssign(ImpParser.GlobalAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nd}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterNd(ImpParser.NdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nd}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitNd(ImpParser.NdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code skip}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterSkip(ImpParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitSkip(ImpParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldInit}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterArnoldInit(ImpParser.ArnoldInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldInit}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitArnoldInit(ImpParser.ArnoldInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterWhile(ImpParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitWhile(ImpParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterIf(ImpParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitIf(ImpParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code seq}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterSeq(ImpParser.SeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code seq}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitSeq(ImpParser.SeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ImpParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ImpParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code out}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterOut(ImpParser.OutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code out}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitOut(ImpParser.OutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nat}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNat(ImpParser.NatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nat}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNat(ImpParser.NatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinus(ImpParser.PlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinus(ImpParser.PlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBool(ImpParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBool(ImpParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globalID}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterGlobalID(ImpParser.GlobalIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalID}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitGlobalID(ImpParser.GlobalIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divMulMod}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDivMulMod(ImpParser.DivMulModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divMulMod}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDivMulMod(ImpParser.DivMulModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNot(ImpParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNot(ImpParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterEqExp(ImpParser.EqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitEqExp(ImpParser.EqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmpExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCmpExp(ImpParser.CmpExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmpExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCmpExp(ImpParser.CmpExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLogicExp(ImpParser.LogicExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLogicExp(ImpParser.LogicExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParExp(ImpParser.ParExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParExp(ImpParser.ParExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ImpParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ImpParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pow}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPow(ImpParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPow(ImpParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterId(ImpParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitId(ImpParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ImpParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ImpParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#arnoldIni}.
	 * @param ctx the parse tree
	 */
	void enterArnoldIni(ImpParser.ArnoldIniContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#arnoldIni}.
	 * @param ctx the parse tree
	 */
	void exitArnoldIni(ImpParser.ArnoldIniContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#coms}.
	 * @param ctx the parse tree
	 */
	void enterComs(ImpParser.ComsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#coms}.
	 * @param ctx the parse tree
	 */
	void exitComs(ImpParser.ComsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varexpr}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarexpr(ImpParser.VarexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varexpr}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarexpr(ImpParser.VarexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberexpr}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberexpr(ImpParser.NumberexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberexpr}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberexpr(ImpParser.NumberexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueexpr}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTrueexpr(ImpParser.TrueexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueexpr}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTrueexpr(ImpParser.TrueexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseexpr}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFalseexpr(ImpParser.FalseexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseexpr}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFalseexpr(ImpParser.FalseexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImpParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(ImpParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImpParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(ImpParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterPlusop(ImpParser.PlusopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitPlusop(ImpParser.PlusopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterMinusop(ImpParser.MinusopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitMinusop(ImpParser.MinusopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationop(ImpParser.MultiplicationopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationop(ImpParser.MultiplicationopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divisionop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterDivisionop(ImpParser.DivisionopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divisionop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitDivisionop(ImpParser.DivisionopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterEqualop(ImpParser.EqualopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitEqualop(ImpParser.EqualopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterGreaterop(ImpParser.GreateropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitGreaterop(ImpParser.GreateropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOrop(ImpParser.OropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOrop(ImpParser.OropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterAndop(ImpParser.AndopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitAndop(ImpParser.AndopContext ctx);
}