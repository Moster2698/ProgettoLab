// Generated from /Users/alessio/Code/HaveFunProject/src/HaveFunAndArnoldC.g4 by ANTLR 4.12.0
package generation;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HaveFunAndArnoldCParser}.
 */
public interface HaveFunAndArnoldCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HaveFunAndArnoldCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HaveFunAndArnoldCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaveFunAndArnoldCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HaveFunAndArnoldCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaveFunAndArnoldCParser#arnoldIni}.
	 * @param ctx the parse tree
	 */
	void enterArnoldIni(HaveFunAndArnoldCParser.ArnoldIniContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaveFunAndArnoldCParser#arnoldIni}.
	 * @param ctx the parse tree
	 */
	void exitArnoldIni(HaveFunAndArnoldCParser.ArnoldIniContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globalAssignValue}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#globalEnv}.
	 * @param ctx the parse tree
	 */
	void enterGlobalAssignValue(HaveFunAndArnoldCParser.GlobalAssignValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalAssignValue}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#globalEnv}.
	 * @param ctx the parse tree
	 */
	void exitGlobalAssignValue(HaveFunAndArnoldCParser.GlobalAssignValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldIfElseCheck}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldIfElseCheck(HaveFunAndArnoldCParser.ArnoldIfElseCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldIfElseCheck}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldIfElseCheck(HaveFunAndArnoldCParser.ArnoldIfElseCheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldIfCheck}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldIfCheck(HaveFunAndArnoldCParser.ArnoldIfCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldIfCheck}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldIfCheck(HaveFunAndArnoldCParser.ArnoldIfCheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldWhileCycle}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldWhileCycle(HaveFunAndArnoldCParser.ArnoldWhileCycleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldWhileCycle}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldWhileCycle(HaveFunAndArnoldCParser.ArnoldWhileCycleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldPrintExpression}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldPrintExpression(HaveFunAndArnoldCParser.ArnoldPrintExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldPrintExpression}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldPrintExpression(HaveFunAndArnoldCParser.ArnoldPrintExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldAssignValue}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldAssignValue(HaveFunAndArnoldCParser.ArnoldAssignValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldAssignValue}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldAssignValue(HaveFunAndArnoldCParser.ArnoldAssignValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldDeclareVariable}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldDeclareVariable(HaveFunAndArnoldCParser.ArnoldDeclareVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldDeclareVariable}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldDeclareVariable(HaveFunAndArnoldCParser.ArnoldDeclareVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldOp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#arnoldOperations}.
	 * @param ctx the parse tree
	 */
	void enterArnoldOp(HaveFunAndArnoldCParser.ArnoldOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldOp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#arnoldOperations}.
	 * @param ctx the parse tree
	 */
	void exitArnoldOp(HaveFunAndArnoldCParser.ArnoldOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldIdExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterArnoldIdExp(HaveFunAndArnoldCParser.ArnoldIdExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldIdExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitArnoldIdExp(HaveFunAndArnoldCParser.ArnoldIdExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldStringExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterArnoldStringExp(HaveFunAndArnoldCParser.ArnoldStringExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldStringExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitArnoldStringExp(HaveFunAndArnoldCParser.ArnoldStringExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldNumberExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterArnoldNumberExp(HaveFunAndArnoldCParser.ArnoldNumberExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldNumberExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitArnoldNumberExp(HaveFunAndArnoldCParser.ArnoldNumberExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldBoolExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterArnoldBoolExp(HaveFunAndArnoldCParser.ArnoldBoolExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldBoolExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitArnoldBoolExp(HaveFunAndArnoldCParser.ArnoldBoolExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaveFunAndArnoldCParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterFun(HaveFunAndArnoldCParser.FunContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaveFunAndArnoldCParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitFun(HaveFunAndArnoldCParser.FunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varGlobalAssign}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void enterVarGlobalAssign(HaveFunAndArnoldCParser.VarGlobalAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varGlobalAssign}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void exitVarGlobalAssign(HaveFunAndArnoldCParser.VarGlobalAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nd}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void enterNd(HaveFunAndArnoldCParser.NdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nd}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void exitNd(HaveFunAndArnoldCParser.NdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code skip}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void enterSkip(HaveFunAndArnoldCParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void exitSkip(HaveFunAndArnoldCParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldInit}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void enterArnoldInit(HaveFunAndArnoldCParser.ArnoldInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldInit}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void exitArnoldInit(HaveFunAndArnoldCParser.ArnoldInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void enterWhile(HaveFunAndArnoldCParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void exitWhile(HaveFunAndArnoldCParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void enterIf(HaveFunAndArnoldCParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void exitIf(HaveFunAndArnoldCParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code seq}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void enterSeq(HaveFunAndArnoldCParser.SeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code seq}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void exitSeq(HaveFunAndArnoldCParser.SeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void enterAssign(HaveFunAndArnoldCParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void exitAssign(HaveFunAndArnoldCParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code out}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void enterOut(HaveFunAndArnoldCParser.OutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code out}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 */
	void exitOut(HaveFunAndArnoldCParser.OutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nat}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNat(HaveFunAndArnoldCParser.NatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nat}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNat(HaveFunAndArnoldCParser.NatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinus(HaveFunAndArnoldCParser.PlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinus(HaveFunAndArnoldCParser.PlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBool(HaveFunAndArnoldCParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBool(HaveFunAndArnoldCParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globalID}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterGlobalID(HaveFunAndArnoldCParser.GlobalIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalID}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitGlobalID(HaveFunAndArnoldCParser.GlobalIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divMulMod}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDivMulMod(HaveFunAndArnoldCParser.DivMulModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divMulMod}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDivMulMod(HaveFunAndArnoldCParser.DivMulModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNot(HaveFunAndArnoldCParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNot(HaveFunAndArnoldCParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterEqExp(HaveFunAndArnoldCParser.EqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitEqExp(HaveFunAndArnoldCParser.EqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmpExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCmpExp(HaveFunAndArnoldCParser.CmpExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmpExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCmpExp(HaveFunAndArnoldCParser.CmpExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLogicExp(HaveFunAndArnoldCParser.LogicExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLogicExp(HaveFunAndArnoldCParser.LogicExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParExp(HaveFunAndArnoldCParser.ParExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParExp(HaveFunAndArnoldCParser.ParExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFunction(HaveFunAndArnoldCParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFunction(HaveFunAndArnoldCParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pow}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPow(HaveFunAndArnoldCParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPow(HaveFunAndArnoldCParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterId(HaveFunAndArnoldCParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitId(HaveFunAndArnoldCParser.IdContext ctx);
}