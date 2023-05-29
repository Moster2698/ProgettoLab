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
	 * Visit a parse tree produced by {@link ImpParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ImpParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#arnoldIni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldIni(ImpParser.ArnoldIniContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalAssign}
	 * labeled alternative in {@link ImpParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalAssign(ImpParser.GlobalAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldIfElse}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldIfElse(ImpParser.ArnoldIfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldIf}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldIf(ImpParser.ArnoldIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldWhile}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldWhile(ImpParser.ArnoldWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldPrintExp}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldPrintExp(ImpParser.ArnoldPrintExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldAssign}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldAssign(ImpParser.ArnoldAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldDeclare}
	 * labeled alternative in {@link ImpParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldDeclare(ImpParser.ArnoldDeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldPlus}
	 * labeled alternative in {@link ImpParser#arnoldOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldPlus(ImpParser.ArnoldPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldMinus}
	 * labeled alternative in {@link ImpParser#arnoldOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldMinus(ImpParser.ArnoldMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldMultiplication}
	 * labeled alternative in {@link ImpParser#arnoldOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldMultiplication(ImpParser.ArnoldMultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldDivision}
	 * labeled alternative in {@link ImpParser#arnoldOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldDivision(ImpParser.ArnoldDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldEqual}
	 * labeled alternative in {@link ImpParser#arnoldOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldEqual(ImpParser.ArnoldEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldGreater}
	 * labeled alternative in {@link ImpParser#arnoldOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldGreater(ImpParser.ArnoldGreaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldOr}
	 * labeled alternative in {@link ImpParser#arnoldOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldOr(ImpParser.ArnoldOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldAnd}
	 * labeled alternative in {@link ImpParser#arnoldOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldAnd(ImpParser.ArnoldAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldIdexpr}
	 * labeled alternative in {@link ImpParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldIdexpr(ImpParser.ArnoldIdexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldString}
	 * labeled alternative in {@link ImpParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldString(ImpParser.ArnoldStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldNumberexpr}
	 * labeled alternative in {@link ImpParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldNumberexpr(ImpParser.ArnoldNumberexprContext ctx);
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