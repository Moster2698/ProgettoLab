// Generated from java-escape by ANTLR 4.11.1
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
	 * Visit a parse tree produced by {@link ImpParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun(ImpParser.FunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalAssign}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalAssign(ImpParser.GlobalAssignContext ctx);
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
	 * Visit a parse tree produced by {@link ImpParser#coms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComs(ImpParser.ComsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varexpr}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarexpr(ImpParser.VarexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberexpr}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberexpr(ImpParser.NumberexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueexpr}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueexpr(ImpParser.TrueexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseexpr}
	 * labeled alternative in {@link ImpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseexpr(ImpParser.FalseexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations(ImpParser.OperationsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusop(ImpParser.PlusopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusop(ImpParser.MinusopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationop(ImpParser.MultiplicationopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divisionop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionop(ImpParser.DivisionopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualop(ImpParser.EqualopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterop(ImpParser.GreateropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrop(ImpParser.OropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andop}
	 * labeled alternative in {@link ImpParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndop(ImpParser.AndopContext ctx);
}