// Generated from /Users/alessio/Code/HaveFunProject/src/Imp.g4 by ANTLR 4.12.0
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
	 * Enter a parse tree produced by the {@code arnoldIfElse}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldIfElse(ImpParser.ArnoldIfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldIfElse}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldIfElse(ImpParser.ArnoldIfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldIf}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldIf(ImpParser.ArnoldIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldIf}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldIf(ImpParser.ArnoldIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldWhile}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldWhile(ImpParser.ArnoldWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldWhile}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldWhile(ImpParser.ArnoldWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldPrintExp}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldPrintExp(ImpParser.ArnoldPrintExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldPrintExp}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldPrintExp(ImpParser.ArnoldPrintExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldAssign}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldAssign(ImpParser.ArnoldAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldAssign}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldAssign(ImpParser.ArnoldAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldDeclare}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldDeclare(ImpParser.ArnoldDeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldDeclare}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldDeclare(ImpParser.ArnoldDeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldIdexpr}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArnoldIdexpr(ImpParser.ArnoldIdexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldIdexpr}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArnoldIdexpr(ImpParser.ArnoldIdexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldString}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArnoldString(ImpParser.ArnoldStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldString}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArnoldString(ImpParser.ArnoldStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldNumberexpr}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArnoldNumberexpr(ImpParser.ArnoldNumberexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldNumberexpr}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArnoldNumberexpr(ImpParser.ArnoldNumberexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldBoolExp}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArnoldBoolExp(ImpParser.ArnoldBoolExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldBoolExp}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArnoldBoolExp(ImpParser.ArnoldBoolExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldPlus}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArnoldPlus(ImpParser.ArnoldPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldPlus}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArnoldPlus(ImpParser.ArnoldPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldMinus}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArnoldMinus(ImpParser.ArnoldMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldMinus}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArnoldMinus(ImpParser.ArnoldMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldMultiplication}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArnoldMultiplication(ImpParser.ArnoldMultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldMultiplication}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArnoldMultiplication(ImpParser.ArnoldMultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldDivision}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArnoldDivision(ImpParser.ArnoldDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldDivision}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArnoldDivision(ImpParser.ArnoldDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldEqual}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArnoldEqual(ImpParser.ArnoldEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldEqual}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArnoldEqual(ImpParser.ArnoldEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldGreater}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArnoldGreater(ImpParser.ArnoldGreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldGreater}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArnoldGreater(ImpParser.ArnoldGreaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldOr}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArnoldOr(ImpParser.ArnoldOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldOr}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArnoldOr(ImpParser.ArnoldOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldAnd}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArnoldAnd(ImpParser.ArnoldAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldAnd}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArnoldAnd(ImpParser.ArnoldAndContext ctx);
}