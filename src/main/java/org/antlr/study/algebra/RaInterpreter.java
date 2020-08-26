package org.antlr.study.algebra;

import org.antlr.study.generated.RaBaseVisitor;
import org.antlr.study.generated.RaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import static org.antlr.study.generated.RaParser.*;

public class RaInterpreter extends RaBaseVisitor {
    private static final Logger log = LoggerFactory.getLogger(RaInterpreter.class);
    private static final String SPACE = " ";
    private static final List JOIN_OPERATOR = Arrays.asList(IntersectionContext.class, UnionContext.class, SetDifferenceContext.class, NaturalJoinContext.class, CatesianProductContext.class, LeftJoinContext.class, RightJoinContext.class, FullJoinContext.class);

    @Override
    public String visitIntersection(RaParser.IntersectionContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        StringJoiner subQuery = new StringJoiner(SPACE);
        subQuery.add(left.toString()).add("INTERSECT").add(right.toString());
        log.debug("left={} - right={} - query={}", left, right, subQuery);
        return subQuery.toString();
    }

    @Override
    public String visitUnion(RaParser.UnionContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        StringJoiner subQuery = new StringJoiner(SPACE);
        subQuery.add(left.toString()).add("UNION").add(right.toString());
        log.debug("left={} - right={} - query={}", left, right, subQuery);
        return subQuery.toString();
    }

    @Override
    public String visitSetDifference(RaParser.SetDifferenceContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        StringJoiner subQuery = new StringJoiner(SPACE);
        subQuery.add(left.toString()).add("EXCEPT").add(right.toString());
        log.debug("left={} - right={} - query={}", left, right, subQuery);
        return subQuery.toString();
    }

    @Override
    public String visitNaturalJoin(RaParser.NaturalJoinContext ctx) {
        boolean nesting = ctx.getParent() != null;
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        StringJoiner subQuery = new StringJoiner(SPACE);
        if (ctx.condition() == null)
            subQuery.add(left.toString()).add("NATURAL JOIN").add(right.toString());
        else
            subQuery.add(left.toString()).add("INNER JOIN").add(right.toString()).add("ON").add(ctx.condition().getText());

        StringJoiner query = new StringJoiner(SPACE);
        // 중첩일경우 SQL일부만 구성하고 단일 구문일경우 SQL전체를 구성
        if (nesting)
            query.add(subQuery.toString());
        else
            query.add("SELECT").add("*").add("FROM").add(subQuery.toString());

        log.debug("nesting={} - left={} - right={} - condition={} - query={}", nesting, left, right, ctx.condition(), query);
        return query.toString();
    }

    @Override
    public String visitCatesianProduct(RaParser.CatesianProductContext ctx) {
        boolean nesting = ctx.getParent() != null;
        StringJoiner subQuery = new StringJoiner(",");
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        subQuery.add(left.toString()).add(right.toString());
        StringJoiner query = new StringJoiner(SPACE);
        if (nesting)
            query.add(subQuery.toString());
        else
            query.add("SELECT").add("*").add("FROM").add(subQuery.toString());

        log.debug("nesting={} - subQuery={} - query={}", nesting, subQuery, query);
        return query.toString();
    }

    @Override
    public String visitLeftJoin(RaParser.LeftJoinContext ctx) {
        boolean nesting = isNested(ctx.getParent());
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        StringJoiner subQuery = new StringJoiner(SPACE);
        if (ctx.condition() != null)
            subQuery.add(left.toString()).add("LEFT JOIN").add(right.toString()).add("ON").add(ctx.condition().getText());
        StringJoiner query = new StringJoiner(SPACE);
        if (nesting)
            query.add(subQuery.toString());
        else
            query.add("SELECT").add("*").add("FROM").add(subQuery.toString());

        log.debug("nesting={} - left={} - right={} - condition={} - query={}", nesting, left, right, ctx.condition(), query);
        return query.toString();
    }

    @Override
    public String visitRightJoin(RaParser.RightJoinContext ctx) {
        boolean nesting = isNested(ctx.getParent());
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        StringJoiner subQuery = new StringJoiner(SPACE);
        if (ctx.condition() != null)
            subQuery.add(left.toString()).add("RIGHT JOIN").add(right.toString()).add("ON").add(ctx.condition().getText());
        StringJoiner query = new StringJoiner(SPACE);
        if (nesting)
            query.add(subQuery.toString());
        else
            query.add("SELECT").add("*").add("FROM").add(subQuery.toString());

        log.debug("nesting={} - left={} - right={} - condition={} - query={}", nesting, left, right, ctx.condition(), query);
        return query.toString();
    }

    @Override
    public String visitFullJoin(RaParser.FullJoinContext ctx) {
        boolean nesting = isNested(ctx.getParent());
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        StringJoiner subQuery = new StringJoiner(SPACE);
        if (ctx.condition() != null)
            subQuery.add(left.toString()).add("FULL OUTER JOIN").add(right.toString()).add("ON").add(ctx.condition().getText());
        StringJoiner query = new StringJoiner(SPACE);
        if (nesting)
            query.add(subQuery.toString());
        else
            query.add("SELECT").add("*").add("FROM").add(subQuery.toString());

        log.debug("nesting={} - left={} - right={} - condition={} - query={}", nesting, left, right, ctx.condition(), query);
        return query.toString();
    }

    @Override
    public String visitProjection(RaParser.ProjectionContext ctx) {
        String orderby = "";
//        if (ctx.orderby() != null) {
//            orderby = " ORDER BY ";
//            int cnt = ctx.orderby().orders().getChildCount();
//            for (int i = 0; i < cnt; i++) {
//                if (ctx.orderby().orders().getChild(i) instanceof RaParser.OrderContext) {
//                    RaParser.OrderContext order = (RaParser.OrderContext) ctx.orderby().orders().getChild(i);
//                    orderby += order.attribute().getText() + " " + order.direction().getText();
//                } else {
//                    orderby += ctx.orderby().orders().getChild(i).getText();
//                }
//            }
//        }
        StringJoiner subQuery = new StringJoiner(SPACE);
        String attributes = ctx.projectionExp().attributes().getText();
        Object expr = visit(ctx.projectionExp().expr());
        subQuery.add("SELECT").add(attributes).add("FROM").add(expr.toString());
//      subQuery.add(orderby);
        // after visit - check nesting
        boolean nesting = isNested(ctx.getParent());
        StringBuilder query = new StringBuilder();
        // select 구문이 nesting 되는 경우. 부모가 rename이면 괄호로 감싸지 않는다.
        if (nesting && ctx.getParent().getClass() != RaParser.RenameExpContext.class) {
            query.append("(").append(subQuery).append(")");
        } else {
            query.append(subQuery.toString());
        }
        log.debug("nesting={} - parent={} - expr={} - class={}", nesting, nesting ? ctx.getParent().getClass() : null, expr, expr.getClass());
        log.debug("attributes={} - orderby={}", attributes, orderby);
        log.debug("subQuery={}, query={}", subQuery, query);
        return query.toString();
    }

    @Override
    public String visitSelection(RaParser.SelectionContext ctx) {
        StringJoiner conditions = new StringJoiner(SPACE);
        RaParser.ConditionsContext condContext = ctx.selectionExp().conditions();
        // 조건 조합
        while (condContext != null) {
            List<ParseTree> tree = condContext.children;
            String condition = tree.stream()
                    .filter(parseTree -> parseTree.getClass() == RaParser.ConditionContext.class || parseTree.getClass() == RaParser.LogicalOpsContext.class)
                    .map(ParseTree::getText).collect(Collectors.joining(SPACE));
            conditions.add(condition);
            // next element
            condContext = condContext.conditions();
        }
        Object expr = visit(ctx.selectionExp().expr());
        StringJoiner subQuery = new StringJoiner(SPACE);
        // after visit - check nesting
        boolean nesting = isNested(ctx.getParent());
        if (nesting) {
            subQuery.add(expr.toString()).add("WHERE").add(conditions.toString());
        } else {
            subQuery.add("SELECT").add("*").add("FROM").add(expr.toString()).add("WHERE").add(conditions.toString());
        }
        log.debug("nesting={} - expr={} - class={}", nesting, expr, expr.getClass());
        log.debug("conditions={} - query={}", conditions, subQuery);
        return subQuery.toString();
    }

    /**
     * Relation이 단순 문자열일 경우
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitSimpleRelation(RaParser.SimpleRelationContext ctx) {
        log.debug("simple relation={}", ctx.getText());
        return ctx.STRING().getText();
    }

    /**
     * Relation이 expression일 경우
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitNestedRelation(RaParser.NestedRelationContext ctx) {
//        nested = true;
        Object expr = visit(ctx.expr());
        log.debug("nested relation ={} - class={}", expr, expr.getClass());
        return expr;
    }

    /**
     * 리네임에는 Relation 리네임, 어드리뷰트 리네임 두가지가 존재한다.
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitRename(RaParser.RenameContext ctx) {
        boolean nesting = isNested(ctx.getParent());
        // 부모 구문이 존재하는 경우 일부 rename 쿼리만 작성하여 리턴
        if (nesting) {
            log.debug("Rename with parent expression");
            Object expr = visit(ctx.renameExp().expr());
            if (ctx.renameExp().expr().getClass() == RaParser.RelationContext.class) {
                log.debug("simple rename={}", ctx.renameExp().expr().getText());
                // relation 리네임
                if (ctx.renameExp().renameAttr().isEmpty()) {
                    StringJoiner query = new StringJoiner(SPACE);
                    query.add(expr.toString()).add("as").add(ctx.renameExp().STRING().getText());
                    return query.toString();
                    // relation 어트리뷰트 리네임
                } else {
                    return makeRenamedAttr(ctx.renameExp().renameAttr(), expr.toString());
                }
            } else {
                log.debug("nested rename={}", expr);
                StringBuilder query = new StringBuilder();
                query.append("(").append(expr).append(") as ").append(ctx.renameExp().STRING());
                return query.toString();
            }
            // rename 구문만 존재하는 경우 SELECT 문을 모두 작성하여 리턴 ex) ρ Rel (R)
        } else {
            log.debug("Rename only expression");
            Object expr = visit(ctx.renameExp().expr());
            StringJoiner query = new StringJoiner(SPACE);
            // relation 리네임
            if (ctx.renameExp().renameAttr().isEmpty()) {
                log.debug("Relation rename expr={}", expr);
                query.add("SELECT").add(ctx.renameExp().STRING() + ".*")
                        .add("FROM").add(expr.toString()).add("as").add(ctx.renameExp().STRING().getText());
                // 어트리뷰트 리네임
            } else {
                // 어트리뷰트를 생성
                if (ctx.renameExp().expr().getClass() == RaParser.RelationContext.class) {
                    log.debug("Rename Attribute : expr={}", ctx.renameExp().expr().getText());
                    String attrs = makeRenamedAttr(ctx.renameExp().renameAttr(), expr.toString());
                    query.add("SELECT").add(attrs).add("FROM").add(ctx.renameExp().expr().getText());
                    // 기존 어트리뷰트를 rename
                } else {
                    log.debug("nested rename={}", expr);
                    return renameAttributes(ctx.renameExp().renameAttr(), expr.toString());
                }
            }
            return query.toString();
        }
    }

    private String makeRenamedAttr(List<RaParser.RenameAttrContext> attributes, String expr) {
        StringBuilder attr = new StringBuilder();
        for (RaParser.RenameAttrContext attribute : attributes) {
            if (!attr.toString().equals(""))
                attr.append(",");
            if (attribute.getChildCount() == 3) {
                attr.append(expr).append(".").append(attribute.getChild(2).getText()).append(" as ").append(attribute.getChild(0).getText());
            } else {
                attr.append(expr).append(".").append(attribute.getText());
            }
        }
        return attr.toString();
    }

    private String renameAttributes(List<RaParser.RenameAttrContext> attributes, String sql) {
        for (RaParser.RenameAttrContext attribute : attributes) {
            StringBuilder attr = new StringBuilder();
            if (attribute.getChildCount() == 3) {
                attr.append(attribute.getChild(2).getText()).append(" as ").append(attribute.getChild(0).getText());
                log.debug("origin={} / replace={} => to={}", sql, attribute.getChild(2).getText(), attr);
                sql = sql.replace(attribute.getChild(2).getText(), attr.toString());
            }
        }
        return sql;
    }

    private boolean isNested(ParserRuleContext parentContext) {
        return parentContext != null && !JOIN_OPERATOR.contains(parentContext.getClass());
    }
}
