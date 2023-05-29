// Generated from /Users/alessio/Code/HaveFunProject/src/Imp.g4 by ANTLR 4.12.0
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ImpParser}.
 */
public interface ImpListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by the {@code globalAssignValue}
	 * labeled alternative in {@link ImpParser#globalEnv}.
	 * @param ctx the parse tree
	 */
	void enterGlobalAssignValue(ImpParser.GlobalAssignValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalAssignValue}
	 * labeled alternative in {@link ImpParser#globalEnv}.
	 * @param ctx the parse tree
	 */
	void exitGlobalAssignValue(ImpParser.GlobalAssignValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldIfElseCheck}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldIfElseCheck(ImpParser.ArnoldIfElseCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldIfElseCheck}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldIfElseCheck(ImpParser.ArnoldIfElseCheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldIfCheck}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldIfCheck(ImpParser.ArnoldIfCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldIfCheck}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldIfCheck(ImpParser.ArnoldIfCheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldWhileCycle}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldWhileCycle(ImpParser.ArnoldWhileCycleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldWhileCycle}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldWhileCycle(ImpParser.ArnoldWhileCycleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldPrintExpression}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldPrintExpression(ImpParser.ArnoldPrintExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldPrintExpression}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldPrintExpression(ImpParser.ArnoldPrintExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldAssignValue}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldAssignValue(ImpParser.ArnoldAssignValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldAssignValue}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldAssignValue(ImpParser.ArnoldAssignValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldDeclareVariable}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void enterArnoldDeclareVariable(ImpParser.ArnoldDeclareVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldDeclareVariable}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 */
	void exitArnoldDeclareVariable(ImpParser.ArnoldDeclareVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldOp}
	 * labeled alternative in {@link ImpParser#arnoldOperations}.
	 * @param ctx the parse tree
	 */
	void enterArnoldOp(ImpParser.ArnoldOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldOp}
	 * labeled alternative in {@link ImpParser#arnoldOperations}.
	 * @param ctx the parse tree
	 */
	void exitArnoldOp(ImpParser.ArnoldOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldIdExp}
	 * labeled alternative in {@link ImpParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterArnoldIdExp(ImpParser.ArnoldIdExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldIdExp}
	 * labeled alternative in {@link ImpParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitArnoldIdExp(ImpParser.ArnoldIdExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldStringExp}
	 * labeled alternative in {@link ImpParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterArnoldStringExp(ImpParser.ArnoldStringExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldStringExp}
	 * labeled alternative in {@link ImpParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitArnoldStringExp(ImpParser.ArnoldStringExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldNumberExp}
	 * labeled alternative in {@link ImpParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterArnoldNumberExp(ImpParser.ArnoldNumberExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldNumberExp}
	 * labeled alternative in {@link ImpParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitArnoldNumberExp(ImpParser.ArnoldNumberExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arnoldBoolExp}
	 * labeled alternative in {@link ImpParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterArnoldBoolExp(ImpParser.ArnoldBoolExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arnoldBoolExp}
	 * labeled alternative in {@link ImpParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitArnoldBoolExp(ImpParser.ArnoldBoolExpContext ctx);
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
	 * Enter a parse tree produced by the {@code varGlobalAssign}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void enterVarGlobalAssign(ImpParser.VarGlobalAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varGlobalAssign}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 */
	void exitVarGlobalAssign(ImpParser.VarGlobalAssignContext ctx);
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
}