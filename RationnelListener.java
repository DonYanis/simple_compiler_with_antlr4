// Generated from Rationnel.g4 by ANTLR 4.9.2

    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RationnelParser}.
 */
public interface RationnelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RationnelParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(RationnelParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationnelParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(RationnelParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationnelParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(RationnelParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationnelParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(RationnelParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationnelParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(RationnelParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationnelParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(RationnelParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationnelParser#assignation}.
	 * @param ctx the parse tree
	 */
	void enterAssignation(RationnelParser.AssignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationnelParser#assignation}.
	 * @param ctx the parse tree
	 */
	void exitAssignation(RationnelParser.AssignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationnelParser#exprR}.
	 * @param ctx the parse tree
	 */
	void enterExprR(RationnelParser.ExprRContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationnelParser#exprR}.
	 * @param ctx the parse tree
	 */
	void exitExprR(RationnelParser.ExprRContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationnelParser#exprI}.
	 * @param ctx the parse tree
	 */
	void enterExprI(RationnelParser.ExprIContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationnelParser#exprI}.
	 * @param ctx the parse tree
	 */
	void exitExprI(RationnelParser.ExprIContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationnelParser#exprB}.
	 * @param ctx the parse tree
	 */
	void enterExprB(RationnelParser.ExprBContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationnelParser#exprB}.
	 * @param ctx the parse tree
	 */
	void exitExprB(RationnelParser.ExprBContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationnelParser#exprC}.
	 * @param ctx the parse tree
	 */
	void enterExprC(RationnelParser.ExprCContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationnelParser#exprC}.
	 * @param ctx the parse tree
	 */
	void exitExprC(RationnelParser.ExprCContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationnelParser#exprRep}.
	 * @param ctx the parse tree
	 */
	void enterExprRep(RationnelParser.ExprRepContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationnelParser#exprRep}.
	 * @param ctx the parse tree
	 */
	void exitExprRep(RationnelParser.ExprRepContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationnelParser#affichage}.
	 * @param ctx the parse tree
	 */
	void enterAffichage(RationnelParser.AffichageContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationnelParser#affichage}.
	 * @param ctx the parse tree
	 */
	void exitAffichage(RationnelParser.AffichageContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationnelParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void enterFinInstruction(RationnelParser.FinInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationnelParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void exitFinInstruction(RationnelParser.FinInstructionContext ctx);
}