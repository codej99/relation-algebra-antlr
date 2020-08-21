// Generated from Ra.g4 by ANTLR 4.8
package org.antlr.study.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RaParser}.
 */
public interface RaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(RaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(RaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RaParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(RaParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RaParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(RaParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RaParser#selection}.
	 * @param ctx the parse tree
	 */
	void enterSelection(RaParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RaParser#selection}.
	 * @param ctx the parse tree
	 */
	void exitSelection(RaParser.SelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RaParser#naturaljoin}.
	 * @param ctx the parse tree
	 */
	void enterNaturaljoin(RaParser.NaturaljoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link RaParser#naturaljoin}.
	 * @param ctx the parse tree
	 */
	void exitNaturaljoin(RaParser.NaturaljoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link RaParser#crossjoin}.
	 * @param ctx the parse tree
	 */
	void enterCrossjoin(RaParser.CrossjoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link RaParser#crossjoin}.
	 * @param ctx the parse tree
	 */
	void exitCrossjoin(RaParser.CrossjoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleRelation}
	 * labeled alternative in {@link RaParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterSimpleRelation(RaParser.SimpleRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleRelation}
	 * labeled alternative in {@link RaParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitSimpleRelation(RaParser.SimpleRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedRelation}
	 * labeled alternative in {@link RaParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterNestedRelation(RaParser.NestedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedRelation}
	 * labeled alternative in {@link RaParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitNestedRelation(RaParser.NestedRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RaParser#orderby}.
	 * @param ctx the parse tree
	 */
	void enterOrderby(RaParser.OrderbyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RaParser#orderby}.
	 * @param ctx the parse tree
	 */
	void exitOrderby(RaParser.OrderbyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RaParser#orders}.
	 * @param ctx the parse tree
	 */
	void enterOrders(RaParser.OrdersContext ctx);
	/**
	 * Exit a parse tree produced by {@link RaParser#orders}.
	 * @param ctx the parse tree
	 */
	void exitOrders(RaParser.OrdersContext ctx);
	/**
	 * Enter a parse tree produced by {@link RaParser#order}.
	 * @param ctx the parse tree
	 */
	void enterOrder(RaParser.OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link RaParser#order}.
	 * @param ctx the parse tree
	 */
	void exitOrder(RaParser.OrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link RaParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(RaParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RaParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(RaParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RaParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(RaParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RaParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(RaParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RaParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(RaParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RaParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(RaParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RaParser#fullvalue}.
	 * @param ctx the parse tree
	 */
	void enterFullvalue(RaParser.FullvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RaParser#fullvalue}.
	 * @param ctx the parse tree
	 */
	void exitFullvalue(RaParser.FullvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RaParser#rename}.
	 * @param ctx the parse tree
	 */
	void enterRename(RaParser.RenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RaParser#rename}.
	 * @param ctx the parse tree
	 */
	void exitRename(RaParser.RenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RaParser#renameAttr}.
	 * @param ctx the parse tree
	 */
	void enterRenameAttr(RaParser.RenameAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link RaParser#renameAttr}.
	 * @param ctx the parse tree
	 */
	void exitRenameAttr(RaParser.RenameAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link RaParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(RaParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RaParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(RaParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RaParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(RaParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RaParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(RaParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RaParser#logicalOps}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOps(RaParser.LogicalOpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RaParser#logicalOps}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOps(RaParser.LogicalOpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RaParser#compared}.
	 * @param ctx the parse tree
	 */
	void enterCompared(RaParser.ComparedContext ctx);
	/**
	 * Exit a parse tree produced by {@link RaParser#compared}.
	 * @param ctx the parse tree
	 */
	void exitCompared(RaParser.ComparedContext ctx);
	/**
	 * Enter a parse tree produced by {@link RaParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(RaParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link RaParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(RaParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link RaParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(RaParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link RaParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(RaParser.DataContext ctx);
}