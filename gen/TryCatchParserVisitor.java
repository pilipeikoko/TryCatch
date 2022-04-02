// Generated from C:/Users/pilip/Desktop/trycatch\TryCatchParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TryCatchParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TryCatchParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TryCatchParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TryCatchParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TryCatchParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(TryCatchParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TryCatchParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(TryCatchParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TryCatchParser#catchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchBlock(TryCatchParser.CatchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TryCatchParser#catchClassTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClassTypes(TryCatchParser.CatchClassTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TryCatchParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(TryCatchParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TryCatchParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(TryCatchParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TryCatchParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(TryCatchParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TryCatchParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(TryCatchParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TryCatchParser#dummyClassInitialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDummyClassInitialization(TryCatchParser.DummyClassInitializationContext ctx);
}