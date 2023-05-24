// Generated from java-escape by ANTLR 4.11.1
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
	 * Visit a parse tree produced by {@link ArnoldCParser#coms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComs(ArnoldCParser.ComsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldIFElse}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldIFElse(ArnoldCParser.ArnoldIFElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldIF}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldIF(ArnoldCParser.ArnoldIFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldWhile}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldWhile(ArnoldCParser.ArnoldWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldPrintID}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldPrintID(ArnoldCParser.ArnoldPrintIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldPrintString}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldPrintString(ArnoldCParser.ArnoldPrintStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldAssign}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldAssign(ArnoldCParser.ArnoldAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldDECLARE}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldDECLARE(ArnoldCParser.ArnoldDECLAREContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varexpr}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarexpr(ArnoldCParser.VarexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberexpr}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberexpr(ArnoldCParser.NumberexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueexpr}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueexpr(ArnoldCParser.TrueexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseexpr}
	 * labeled alternative in {@link ArnoldCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseexpr(ArnoldCParser.FalseexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations(ArnoldCParser.OperationsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusop(ArnoldCParser.PlusopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusop(ArnoldCParser.MinusopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationop(ArnoldCParser.MultiplicationopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divisionop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionop(ArnoldCParser.DivisionopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualop(ArnoldCParser.EqualopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterop(ArnoldCParser.GreateropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrop(ArnoldCParser.OropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andop}
	 * labeled alternative in {@link ArnoldCParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndop(ArnoldCParser.AndopContext ctx);
}