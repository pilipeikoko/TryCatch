// Generated from C:/Users/pilip/Desktop/trycatch\TryCatchParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TryCatchParser}.
 */
public interface TryCatchParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TryCatchParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TryCatchParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TryCatchParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TryCatchParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TryCatchParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(TryCatchParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TryCatchParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(TryCatchParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TryCatchParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(TryCatchParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TryCatchParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(TryCatchParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TryCatchParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void enterCatchBlock(TryCatchParser.CatchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TryCatchParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void exitCatchBlock(TryCatchParser.CatchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TryCatchParser#catchClassTypes}.
	 * @param ctx the parse tree
	 */
	void enterCatchClassTypes(TryCatchParser.CatchClassTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TryCatchParser#catchClassTypes}.
	 * @param ctx the parse tree
	 */
	void exitCatchClassTypes(TryCatchParser.CatchClassTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TryCatchParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(TryCatchParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TryCatchParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(TryCatchParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TryCatchParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(TryCatchParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TryCatchParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(TryCatchParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TryCatchParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(TryCatchParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TryCatchParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(TryCatchParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TryCatchParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(TryCatchParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TryCatchParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(TryCatchParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TryCatchParser#dummyClassInitialization}.
	 * @param ctx the parse tree
	 */
	void enterDummyClassInitialization(TryCatchParser.DummyClassInitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TryCatchParser#dummyClassInitialization}.
	 * @param ctx the parse tree
	 */
	void exitDummyClassInitialization(TryCatchParser.DummyClassInitializationContext ctx);
}