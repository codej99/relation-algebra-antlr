package org.antlr.study.algebra;

import org.antlr.study.generated.RaBaseVisitor;
import org.antlr.study.generated.RaParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class RaInterpreter extends RaBaseVisitor {
    private static final Logger log = LoggerFactory.getLogger(RaInterpreter.class);
    private static final String SPACE = " ";
    boolean nested = false;

    @Override
    public String visitIntersection(RaParser.IntersectionContext ctx) {
        log.debug("==============================");
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        log.debug("left={} - right={}", left, right);
        StringJoiner subQuery = new StringJoiner(SPACE);
        subQuery.add(left.toString()).add("INTERSECT").add(right.toString());
        return subQuery.toString();
    }

    @Override
    public String visitUnion(RaParser.UnionContext ctx) {
        log.debug("==============================");
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        log.debug("left={} - right={}", left, right);
        StringJoiner subQuery = new StringJoiner(SPACE);
        subQuery.add(left.toString()).add("UNION").add(right.toString());
        return subQuery.toString();
    }

    @Override
    public String visitSetDifference(RaParser.SetDifferenceContext ctx) {
        log.debug("==============================");
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        log.debug("left={} - right={}", left, right);
        StringJoiner subQuery = new StringJoiner(SPACE);
        subQuery.add(left.toString()).add("EXCEPT").add(right.toString());
        return subQuery.toString();
    }

    @Override
    public String visitNaturalJoin(RaParser.NaturalJoinContext ctx) {
        log.debug("==============================");
        log.debug("Parent is Empty={}", ctx.getParent().isEmpty());
        boolean nesting = !ctx.getParent().isEmpty();
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        log.debug("nesting={} - left={} - right={} - condition={}", nesting, left, right, ctx.condition());
        StringJoiner subQuery = new StringJoiner(SPACE);
        if (ctx.condition() == null)
            subQuery.add(left.toString()).add("NATURAL JOIN").add(right.toString());
        else
            subQuery.add(left.toString()).add("INNER JOIN").add(right.toString()).add("ON").add(ctx.condition().getText());
        StringJoiner query = new StringJoiner(SPACE);
        if (nesting)
            query.add(subQuery.toString());
        else
            query.add("SELECT * FROM").add(subQuery.toString());

        return query.toString();
    }

    @Override
    public String visitCatesianProduct(RaParser.CatesianProductContext ctx) {
        log.debug("==============================");
        log.debug("Parent is Empty={}", ctx.getParent().isEmpty());
        boolean nesting = !ctx.getParent().isEmpty();
        String subQuery = ctx.expr().stream().map(RuleContext::getText).collect(Collectors.joining(","));
        log.debug("nesting={} - subQuery={}", nesting, subQuery);
        StringJoiner query = new StringJoiner(SPACE);
        if (nesting)
            query.add(subQuery);
        else
            query.add("SELECT * FROM").add(subQuery);

        return query.toString();
    }

    @Override
    public String visitLeftJoin(RaParser.LeftJoinContext ctx) {
        log.debug("==============================");
        log.debug("Parent is Empty={}", ctx.getParent().isEmpty());
        boolean nesting = !ctx.getParent().isEmpty();
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        log.debug("nesting={} - left={} - right={} - condition={}", nesting, left, right, ctx.condition());
        StringJoiner subQuery = new StringJoiner(SPACE);
        if (ctx.condition() != null)
            subQuery.add(left.toString()).add("LEFT JOIN").add(right.toString()).add("ON").add(ctx.condition().getText());
        StringJoiner query = new StringJoiner(SPACE);
        if (nesting)
            query.add(subQuery.toString());
        else
            query.add("SELECT * FROM").add(subQuery.toString());

        return query.toString();
    }

    @Override
    public String visitRightJoin(RaParser.RightJoinContext ctx) {
        log.debug("==============================");
        log.debug("Parent is Empty={}", ctx.getParent().isEmpty());
        boolean nesting = !ctx.getParent().isEmpty();
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        log.debug("nesting={} - left={} - right={} - condition={}", nesting, left, right, ctx.condition());
        StringJoiner subQuery = new StringJoiner(SPACE);
        if (ctx.condition() != null)
            subQuery.add(left.toString()).add("RIGHT JOIN").add(right.toString()).add("ON").add(ctx.condition().getText());
        StringJoiner query = new StringJoiner(SPACE);
        if (nesting)
            query.add(subQuery.toString());
        else
            query.add("SELECT * FROM").add(subQuery.toString());

        return query.toString();
    }

    @Override public String visitFullJoin(RaParser.FullJoinContext ctx) {
        log.debug("==============================");
        log.debug("Parent is Empty={}", ctx.getParent().isEmpty());
        boolean nesting = !ctx.getParent().isEmpty();
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        log.debug("nesting={} - left={} - right={} - condition={}", nesting, left, right, ctx.condition());
        StringJoiner subQuery = new StringJoiner(SPACE);
        if (ctx.condition() != null)
            subQuery.add(left.toString()).add("FULL OUTER JOIN").add(right.toString()).add("ON").add(ctx.condition().getText());
        StringJoiner query = new StringJoiner(SPACE);
        if (nesting)
            query.add(subQuery.toString());
        else
            query.add("SELECT * FROM").add(subQuery.toString());

        return query.toString();
    }

    @Override
    public String visitProjection(RaParser.ProjectionContext ctx) {
        log.debug("==============================");
        boolean nesting = nested;
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
        if (ctx.attributes() != null) {
            String attributes = ctx.attributes().getText();
            Object expr = visit(ctx.expr());
            log.debug("attributes={}", attributes);
            log.debug("expr={}, class={}", expr, expr.getClass());
            log.debug("nesting={}", nesting);
            log.debug("orderby={}", orderby);
            subQuery.add("SELECT").add(attributes).add("FROM").add(expr.toString());
//            subQuery.add(orderby);
            log.debug("subQuery={}", subQuery);
        }
        return subQuery.toString();
    }

    @Override
    public String visitSelection(RaParser.SelectionContext ctx) {
        log.debug("==============================");
        boolean nesting = nested;
        StringJoiner conditions = new StringJoiner(SPACE);
        RaParser.ConditionsContext condContext = ctx.conditions();
        while (condContext != null) {
            List<ParseTree> tree = condContext.children;
            String condition = tree.stream()
                    .filter(parseTree -> parseTree.getClass() == RaParser.ConditionContext.class || parseTree.getClass() == RaParser.LogicalOpsContext.class)
                    .map(ParseTree::getText).collect(Collectors.joining(SPACE));
            conditions.add(condition);
            // next element
            condContext = condContext.conditions();
        }
        Object expr = visit(ctx.expr());
        log.debug("visited expression {}", expr);

        StringJoiner subQuery = new StringJoiner(SPACE);
        if (!ctx.getParent().isEmpty()) {
            subQuery.add(expr.toString()).add("WHERE").add(conditions.toString());
        } else {
            subQuery.add("SELECT").add("*").add("FROM").add(expr.toString()).add("WHERE").add(conditions.toString());
        }

        StringBuilder query = new StringBuilder();
        // select 구문이 nesting 되는 경우
        if (ctx.getParent().isEmpty() && nesting) {
            query.append("(").append(subQuery).append(")");
        } else {
            query.append(subQuery.toString());
        }
        log.debug("query={}", query);
        return query.toString();
    }

    /**
     * Relation이 단순 문자열일 경우
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitSimpleRelation(RaParser.SimpleRelationContext ctx) {
        log.debug("==============================");
        log.debug("simple relation={}", ctx.getText());
        nested = false;
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
        log.debug("==============================");
        log.debug("nested relation={}", ctx.expr().getText());
        nested = true;
        return visit(ctx.expr());
    }

    /**
     * 리네임에는 Relation 리네임, 어드리뷰트 리네임 두가지가 존재한다.
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitRename(RaParser.RenameContext ctx) {
        log.debug("==============================");
        log.debug("Parent is Empty={}", ctx.getParent().isEmpty());
        // rename 구문만 존재하는 경우 SELECT 문을 모두 작성하여 리턴 ex) ρ Rel (R)
        StringBuilder sql = new StringBuilder();
        if (ctx.getParent().isEmpty()) {
            log.debug("Rename only syntax");
            if (ctx.renameAttr().isEmpty()) {
                log.debug("Rename Relation");
                sql.append("SELECT").append(SPACE).append(ctx.STRING()).append(".*").append(SPACE)
                        .append("FROM").append(SPACE).append(ctx.expr().getText()).append(SPACE).append("as").append(SPACE).append(ctx.STRING());
            } else {
                if (ctx.expr().relation() instanceof RaParser.SimpleRelationContext) {
                    log.debug("Rename Attribute : expr={}", ctx.expr().getText());
                    String attrs = makeRenamedAttr(ctx.renameAttr(), ctx.expr().getText());
                    sql.append("SELECT").append(SPACE).append(attrs).append(SPACE).append("FROM").append(SPACE).append(ctx.expr().getText());
                } else {
                    Object expr = visit(ctx.expr());
                    log.debug("nested rename={}", expr);
                    return renameAttributes(ctx.renameAttr(), expr.toString());
                }
            }
            return sql.toString();
            // 부모 구문이 존재하는 경우 일부 쿼리만 작성하여 리턴
        } else {
            log.debug("expr={}, class={}", ctx.expr().getText(), ctx.expr().getClass());
            if (ctx.expr().relation() instanceof RaParser.SimpleRelationContext) {
                log.debug("simple rename={}", ctx.expr().getText());
                if (ctx.renameAttr().isEmpty()) {
                    return ctx.expr().getText() + SPACE + "as" + SPACE + ctx.STRING();
                } else {
                    return makeRenamedAttr(ctx.renameAttr(), ctx.expr().getText());
                }
            } else {
                Object expr = visit(ctx.expr());
                log.debug("nested rename={}", expr);
                sql.append("(").append(expr).append(") as ").append(ctx.STRING());
                return sql.toString();
            }
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
}
