// Generated from /Users/alessio/Code/HaveFunProject/src/HaveFunAndArnoldC.g4 by ANTLR 4.12.0
package generation;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HaveFunAndArnoldCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HaveFunAndArnoldCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HaveFunAndArnoldCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HaveFunAndArnoldCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaveFunAndArnoldCParser#arnoldIni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldIni(HaveFunAndArnoldCParser.ArnoldIniContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalAssignValue}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#globalEnv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalAssignValue(HaveFunAndArnoldCParser.GlobalAssignValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldIfElseCheck}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldIfElseCheck(HaveFunAndArnoldCParser.ArnoldIfElseCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldIfCheck}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldIfCheck(HaveFunAndArnoldCParser.ArnoldIfCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldWhileCycle}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldWhileCycle(HaveFunAndArnoldCParser.ArnoldWhileCycleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldPrintExpression}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldPrintExpression(HaveFunAndArnoldCParser.ArnoldPrintExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldAssignValue}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldAssignValue(HaveFunAndArnoldCParser.ArnoldAssignValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldDeclareVariable}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldDeclareVariable(HaveFunAndArnoldCParser.ArnoldDeclareVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldOp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#arnoldOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldOp(HaveFunAndArnoldCParser.ArnoldOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldIdExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldIdExp(HaveFunAndArnoldCParser.ArnoldIdExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldStringExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldStringExp(HaveFunAndArnoldCParser.ArnoldStringExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldNumberExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldNumberExp(HaveFunAndArnoldCParser.ArnoldNumberExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldBoolExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldBoolExp(HaveFunAndArnoldCParser.ArnoldBoolExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaveFunAndArnoldCParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun(HaveFunAndArnoldCParser.FunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varGlobalAssign}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarGlobalAssign(HaveFunAndArnoldCParser.VarGlobalAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nd}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNd(HaveFunAndArnoldCParser.NdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(HaveFunAndArnoldCParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldInit}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldInit(HaveFunAndArnoldCParser.ArnoldInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(HaveFunAndArnoldCParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(HaveFunAndArnoldCParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code seq}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq(HaveFunAndArnoldCParser.SeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(HaveFunAndArnoldCParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code out}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut(HaveFunAndArnoldCParser.OutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nat}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNat(HaveFunAndArnoldCParser.NatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(HaveFunAndArnoldCParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(HaveFunAndArnoldCParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalID}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalID(HaveFunAndArnoldCParser.GlobalIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divMulMod}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivMulMod(HaveFunAndArnoldCParser.DivMulModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(HaveFunAndArnoldCParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExp(HaveFunAndArnoldCParser.EqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpExp(HaveFunAndArnoldCParser.CmpExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExp(HaveFunAndArnoldCParser.LogicExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExp}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExp(HaveFunAndArnoldCParser.ParExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(HaveFunAndArnoldCParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(HaveFunAndArnoldCParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link HaveFunAndArnoldCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(HaveFunAndArnoldCParser.IdContext ctx);
}