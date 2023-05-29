// Generated from /Users/alessio/Code/HaveFunProject/src/Imp.g4 by ANTLR 4.12.0
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ImpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ImpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ImpParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ImpParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#arnoldIni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldIni(ImpParser.ArnoldIniContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalAssignValue}
	 * labeled alternative in {@link ImpParser#globalEnv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalAssignValue(ImpParser.GlobalAssignValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldIfElseCheck}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldIfElseCheck(ImpParser.ArnoldIfElseCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldIfCheck}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldIfCheck(ImpParser.ArnoldIfCheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldWhileCycle}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldWhileCycle(ImpParser.ArnoldWhileCycleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldPrintExpression}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldPrintExpression(ImpParser.ArnoldPrintExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldAssignValue}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldAssignValue(ImpParser.ArnoldAssignValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldDeclareVariable}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldDeclareVariable(ImpParser.ArnoldDeclareVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldOp}
	 * labeled alternative in {@link ImpParser#arnoldOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldOp(ImpParser.ArnoldOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldIdExp}
	 * labeled alternative in {@link ImpParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldIdExp(ImpParser.ArnoldIdExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldStringExp}
	 * labeled alternative in {@link ImpParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldStringExp(ImpParser.ArnoldStringExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldNumberExp}
	 * labeled alternative in {@link ImpParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldNumberExp(ImpParser.ArnoldNumberExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldBoolExp}
	 * labeled alternative in {@link ImpParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldBoolExp(ImpParser.ArnoldBoolExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun(ImpParser.FunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varGlobalAssign}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarGlobalAssign(ImpParser.VarGlobalAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nd}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNd(ImpParser.NdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(ImpParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldInit}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldInit(ImpParser.ArnoldInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(ImpParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(ImpParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code seq}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq(ImpParser.SeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ImpParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code out}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut(ImpParser.OutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nat}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNat(ImpParser.NatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(ImpParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(ImpParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalID}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalID(ImpParser.GlobalIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divMulMod}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivMulMod(ImpParser.DivMulModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(ImpParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExp(ImpParser.EqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpExp(ImpParser.CmpExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExp(ImpParser.LogicExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExp(ImpParser.ParExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ImpParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(ImpParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ImpParser.IdContext ctx);
}