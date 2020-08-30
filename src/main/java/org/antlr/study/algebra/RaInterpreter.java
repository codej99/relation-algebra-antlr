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
    private static final String COMMA = ",";
    private static final List JOIN_OPERATOR = Arrays.asList(IntersectionContext.class,
            UnionContext.class, SetDifferenceContext.class, NaturalJoinContext.class, CatesianProductContext.class,
            LeftJoinContext.class, RightJoinContext.class, FullJoinContext.class, RenameExprContext.class, OrderbyExprContext.class);

    private Class beforeVisit = null;

    public Class getBeforeVisit() {
        return beforeVisit;
    }

    @Override
    public String visitIntersection(IntersectionContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        StringJoiner subQuery = new StringJoiner(SPACE);
        subQuery.add(left.toString()).add("INTERSECT").add(right.toString());
        log.debug("left={} - right={} - query={}", left, right, subQuery);
        beforeVisit = IntersectionContext.class;
        return subQuery.toString();
    }

    @Override
    public String visitUnion(UnionContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        StringJoiner subQuery = new StringJoiner(SPACE);
        subQuery.add(left.toString()).add("UNION").add(right.toString());
        log.debug("left={} - right={} - query={}", left, right, subQuery);
        beforeVisit = UnionContext.class;
        return subQuery.toString();
    }

    @Override
    public String visitSetDifference(SetDifferenceContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        StringJoiner subQuery = new StringJoiner(SPACE);
        subQuery.add(left.toString()).add("EXCEPT").add(right.toString());
        log.debug("left={} - right={} - query={}", left, right, subQuery);
        beforeVisit = SetDifferenceContext.class;
        return subQuery.toString();
    }

    @Override
    public String visitNaturalJoin(NaturalJoinContext ctx) {
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
        beforeVisit = NaturalJoinContext.class;
        return query.toString();
    }

    @Override
    public String visitCatesianProduct(CatesianProductContext ctx) {
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
        beforeVisit = CatesianProductContext.class;
        return query.toString();
    }

    @Override
    public String visitLeftJoin(LeftJoinContext ctx) {
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
        beforeVisit = LeftJoinContext.class;
        return query.toString();
    }

    @Override
    public String visitRightJoin(RightJoinContext ctx) {
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
        beforeVisit = RightJoinContext.class;
        return query.toString();
    }

    @Override
    public String visitFullJoin(FullJoinContext ctx) {
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
        beforeVisit = FullJoinContext.class;
        return query.toString();
    }

    @Override
    public String visitProjection(ProjectionContext ctx) {
        StringJoiner subQuery = new StringJoiner(SPACE);
        String attributes = ctx.projectionExpr().attributes().getText();
        Object expr = visit(ctx.projectionExpr().expr());
        // check nesting
        boolean nesting = isNested(ctx.getParent());
        // Groupby에서 생성된 select 문의 attribute를 projection에서 사용한다.
        if (beforeVisit == GroupbyContext.class)
            subQuery.add(expr.toString());
        else
            subQuery.add("SELECT").add(attributes).add("FROM").add(expr.toString());

        StringBuilder query = new StringBuilder();
        if (nesting) {
            query.append("(").append(subQuery).append(")");
        } else {
            query.append(subQuery.toString());
        }
        log.debug("nesting={} - parent={} - attributes={} - subQuery={} - query={}", nesting, ctx.getText(), attributes, subQuery, query);
        beforeVisit = ProjectionContext.class;
        return query.toString();
    }

    @Override
    public String visitSelection(SelectionContext ctx) {
        StringJoiner conditions = new StringJoiner(SPACE);
        ConditionsContext condContext = ctx.selectionExpr().conditions();
        // 조건 조합
        while (condContext != null) {
            List<ParseTree> tree = condContext.children;
            String condition = tree.stream()
                    .filter(parseTree -> parseTree.getClass() == ConditionContext.class || parseTree.getClass() == LogicalOpsContext.class)
                    .map(ParseTree::getText).collect(Collectors.joining(SPACE));
            conditions.add(condition);
            // next element
            condContext = condContext.conditions();
        }
        Object expr = visit(ctx.selectionExpr().expr());
        StringJoiner subQuery = new StringJoiner(SPACE);
        // check nesting
        boolean nesting = isNested(ctx.getParent());
        if (nesting) {
            subQuery.add(expr.toString()).add("WHERE").add(conditions.toString());
        } else {
            subQuery.add("SELECT").add("*").add("FROM").add(expr.toString()).add("WHERE").add(conditions.toString());
        }
        log.debug("nesting={} - expr={} - class={} - conditions={} - query={}", nesting, expr, expr.getClass(), conditions, subQuery);
        beforeVisit = SelectionContext.class;
        return subQuery.toString();
    }

    /**
     * Relation이 단순 문자열일 경우
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitSimpleRelation(SimpleRelationContext ctx) {
        log.debug("simple relation={}", ctx.getText());
        beforeVisit = SimpleRelationContext.class;
        return ctx.STRING().getText();
    }

    /**
     * Relation이 expression일 경우
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitNestedRelation(NestedRelationContext ctx) {
        Object expr = visit(ctx.expr());
        log.debug("nested relation ={} - class={}", expr, expr.getClass());
        beforeVisit = NestedRelationContext.class;
        return expr;
    }

    /**
     * 리네임에는 Relation 리네임, 어드리뷰트 리네임 두가지가 존재한다.
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitRename(RenameContext ctx) {
        boolean nesting = isNested(ctx.getParent());
        beforeVisit = RenameContext.class;
        // 중첩된 구문일경우 일부 rename 쿼리만 작성하여 리턴
        if (nesting) {
            Object expr = visit(ctx.renameExpr().expr());
            log.debug("Nested rename={} class={}", ctx.renameExpr().expr().getText(), ctx.renameExpr().expr().getClass());
            if (ctx.renameExpr().expr().getClass() == RelationContext.class) {
                // relation 리네임
                if (ctx.renameExpr().renameAttrs() == null) {
                    StringJoiner query = new StringJoiner(SPACE);
                    query.add(expr.toString()).add("as").add(ctx.renameExpr().STRING().getText());
                    return query.toString();
                    // 어트리뷰트 리네임
                } else {
                    return makeRenamedAttr(ctx.renameExpr().renameAttrs(), expr.toString());
                }
            } else {
                log.debug("nested rename={}", expr);
                StringBuilder query = new StringBuilder();
                query.append("(").append(expr).append(") as ").append(ctx.renameExpr().STRING());
                return query.toString();
            }
            // rename 구문만 존재하는 경우 SELECT 문을 모두 작성하여 리턴 ex) ρ Rel (R)
        } else {
            log.debug("Simple Rename={}", ctx.renameExpr().expr().getText());
            Object expr = visit(ctx.renameExpr().expr());
            StringJoiner query = new StringJoiner(SPACE);
            // relation 리네임
            if (ctx.renameExpr().renameAttrs() == null) {
                log.debug("Relation rename expr={}", expr);
                query.add("SELECT").add(ctx.renameExpr().STRING() + ".*")
                        .add("FROM").add(expr.toString()).add("as").add(ctx.renameExpr().STRING().getText());
                // 어트리뷰트 리네임
            } else {
                // 어트리뷰트를 생성
                if (ctx.renameExpr().expr().getClass() == RelationContext.class) {
                    log.debug("Make rename Attribute : expr={}", ctx.renameExpr().expr().getText());
                    String attrs = makeRenamedAttr(ctx.renameExpr().renameAttrs(), expr.toString());
                    query.add("SELECT").add(attrs).add("FROM").add(ctx.renameExpr().expr().getText());
                    // 기존 어트리뷰트를 rename
                } else {
                    log.debug("Replace rename={}", expr);
                    return renameAttributes(ctx.renameExpr().renameAttrs(), expr.toString());
                }
            }
            return query.toString();
        }
    }

    @Override
    public String visitOrderby(OrderbyContext ctx) {
        boolean nesting = isNested(ctx.getParent());
        log.debug("nesting={} - orderby={}", nesting, ctx.orderbyExpr().getText());
        beforeVisit = OrderbyContext.class;
        StringJoiner orders = new StringJoiner(",");
        for (int i = 0; i < ctx.orderbyExpr().orders().getChildCount(); i++) {
            OrderContext order = ctx.orderbyExpr().orders().order(i);
            if (order != null)
                orders.add(order.attribute().getText() + SPACE + order.direction().getText());
        }
        if (nesting) {
            return "ORDER BY" + SPACE + orders.toString();
        } else {
            Object expr = visit(ctx.orderbyExpr().expr());
            return expr.toString() + SPACE + "ORDER BY" + SPACE + orders.toString();
        }
    }

    @Override
    public String visitGroupby(GroupbyContext ctx) {
        Object expr = visit(ctx.groupbyExpr().expr());
        GroupByAttrsContext groupbyAttrs = ctx.groupbyExpr().groupByAttrs();
        StringJoiner attrs = new StringJoiner(COMMA);
        for (GroupByAttrContext groupByAttrContext : groupbyAttrs.groupByAttr()) {
            StringBuilder attr = new StringBuilder();
            attr.append(groupByAttrContext.STRING(0)).append("(").append(groupByAttrContext.attributes().getText()).append(")").append(SPACE).append("as").append(SPACE).append(groupByAttrContext.STRING(1));
            attrs.add(attr);
        }
        log.debug("attrs={} - expr={} - groupby={}", attrs, expr, ctx.groupbyExpr().attributes().getText());
        StringJoiner query = new StringJoiner(SPACE);
        query.add("SELECT")
                .add(ctx.groupbyExpr().attributes().getText() + "," + attrs)
                .add("FROM").add(expr.toString())
                .add("GROUP BY").add(ctx.groupbyExpr().attributes().getText());
        beforeVisit = GroupbyContext.class;
        return query.toString();
    }

    private String makeRenamedAttr(RenameAttrsContext attributes, String expr) {
        beforeVisit = RenameAttrsContext.class;
        StringBuilder attr = new StringBuilder();
        RenameAttrsContext renameAttrs = attributes;
        // 조건 조합
        while (renameAttrs != null) {
            List<ParseTree> tree = renameAttrs.children;
            tree.stream()
                    .filter(parseTree -> parseTree.getClass() == RenameAttrContext.class)
                    .map(attribute -> {
                        if (!attr.toString().equals(""))
                            attr.append(",");
                        if (attribute.getChildCount() == 3) {
                            attr.append(expr).append(".").append(attribute.getChild(2).getText()).append(" as ").append(attribute.getChild(0).getText());
                        } else {
                            attr.append(expr).append(".").append(attribute.getText());
                        }
                        return attr.toString();
                    }).collect(Collectors.joining());
            // next element
            renameAttrs = renameAttrs.renameAttrs();
        }
        return attr.toString();
    }

    private String renameAttributes(RenameAttrsContext attributes, String sql) {
        StringJoiner renameAttributes = new StringJoiner(COMMA);
        RenameAttrsContext renameAttrs = attributes;
        // 조건 조합
        while (renameAttrs != null) {
            List<ParseTree> tree = renameAttrs.children;
            StringBuilder attr = new StringBuilder();
            for (ParseTree parseTree : tree) {
                if (parseTree.getClass() == RenameAttrContext.class) {
                    RenameAttrContext attribute = (RenameAttrContext) parseTree;
                    if (attribute.getChildCount() == 3) {
                        attr.append(attribute.getChild(2).getText()).append(" as ").append(attribute.getChild(0).getText());
                        log.debug("replace={} => to={}", attribute.getChild(2).getText(), attr);
                        sql = sql.replaceFirst(attribute.getChild(2).getText(), attr.toString());
                    }
                }
            }
            renameAttributes.add(attr);
            renameAttrs = renameAttrs.renameAttrs();
        }
        return sql;
    }

    private boolean isNested(ParserRuleContext parentContext) {
        if (parentContext != null)
            log.debug("Parent={} / {}", parentContext.getClass(), parentContext.getClass());
        return parentContext != null && !JOIN_OPERATOR.contains(parentContext.getClass());
    }
}
