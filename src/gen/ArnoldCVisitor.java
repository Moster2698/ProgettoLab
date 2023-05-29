// Generated from /Users/alessio/Code/HaveFunProject/src/ArnoldC.g4 by ANTLR 4.12.0
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArnoldCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArnoldCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArnoldCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ArnoldCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCParser#arnoldIni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldIni(ArnoldCParser.ArnoldIniContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldIfElse}
	 * labeled alternative in {@link ArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldIfElse(ArnoldCParser.ArnoldIfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldIf}
	 * labeled alternative in {@link ArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldIf(ArnoldCParser.ArnoldIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldWhile}
	 * labeled alternative in {@link ArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldWhile(ArnoldCParser.ArnoldWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldPrintExp}
	 * labeled alternative in {@link ArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldPrintExp(ArnoldCParser.ArnoldPrintExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldAssign}
	 * labeled alternative in {@link ArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldAssign(ArnoldCParser.ArnoldAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldDeclare}
	 * labeled alternative in {@link ArnoldCParser#arnoldCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldDeclare(ArnoldCParser.ArnoldDeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldPlus}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldPlus(ArnoldCParser.ArnoldPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldMinus}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldMinus(ArnoldCParser.ArnoldMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldMultiplication}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldMultiplication(ArnoldCParser.ArnoldMultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldDivision}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldDivision(ArnoldCParser.ArnoldDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldEqual}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldEqual(ArnoldCParser.ArnoldEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldGreater}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldGreater(ArnoldCParser.ArnoldGreaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldOr}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldOr(ArnoldCParser.ArnoldOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldAnd}
	 * labeled alternative in {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldAnd(ArnoldCParser.ArnoldAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldIdexpr}
	 * labeled alternative in {@link ArnoldCParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldIdexpr(ArnoldCParser.ArnoldIdexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldString}
	 * labeled alternative in {@link ArnoldCParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldString(ArnoldCParser.ArnoldStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldNumberexpr}
	 * labeled alternative in {@link ArnoldCParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldNumberexpr(ArnoldCParser.ArnoldNumberexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldBoolExp}
	 * labeled alternative in {@link ArnoldCParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldBoolExp(ArnoldCParser.ArnoldBoolExpContext ctx);
}