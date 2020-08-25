// Generated from Ra.g4 by ANTLR 4.8
package org.antlr.study.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(RaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaParser#projection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection(RaParser.ProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaParser#selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection(RaParser.SelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaParser#naturaljoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaturaljoin(RaParser.NaturaljoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaParser#crossjoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossjoin(RaParser.CrossjoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaParser#rename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename(RaParser.RenameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedRelation}
	 * labeled alternative in {@link RaParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedRelation(RaParser.NestedRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleRelation}
	 * labeled alternative in {@link RaParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleRelation(RaParser.SimpleRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaParser#orderby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby(RaParser.OrderbyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaParser#orders}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrders(RaParser.OrdersContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaParser#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(RaParser.OrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(RaParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(RaParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(RaParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaParser#fullvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullvalue(RaParser.FullvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaParser#renameAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameAttr(RaParser.RenameAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(RaParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(RaParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaParser#logicalOps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOps(RaParser.LogicalOpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaParser#compared}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompared(RaParser.ComparedContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(RaParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(RaParser.DataContext ctx);
}