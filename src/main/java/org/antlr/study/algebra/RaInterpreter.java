package org.antlr.study.algebra;

import org.antlr.study.RaBaseVisitor;
import org.antlr.study.RaParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class RaInterpreter extends RaBaseVisitor {
    private static Logger log = LoggerFactory.getLogger(RaInterpreter.class);
    boolean nested = false;

    @Override
    public String visitProjection(RaParser.ProjectionContext ctx) {
        boolean nesting = nested;
        log.info("==============================");
        log.info("visitProjection in : nesting :" + nesting);

        String orderby = "";
        if (ctx.orderby() != null) {
            orderby = " ORDER BY ";
            int cnt = ctx.orderby().orders().getChildCount();
            for (int i = 0; i < cnt; i++) {
                if (ctx.orderby().orders().getChild(i) instanceof RaParser.OrderContext) {
                    RaParser.OrderContext order = (RaParser.OrderContext) ctx.orderby().orders().getChild(i);
                    orderby += order.attribute().getText() + " " + order.direction().getText();
                } else {
                    orderby += ctx.orderby().orders().getChild(i).getText();
                }
            }
        }
        log.info("orderby >>>" + orderby);
        String query = "";
        if (ctx.attributes() != null) {
            String attributes = ctx.attributes().getText();
            String rename = "";
            Object renameAttr = null;
            if (ctx.rename() != null) {
                if(ctx.rename().renameAttr() != null)
                    renameAttr = ctx.rename().renameAttr();
                else
                    rename = ctx.rename().STRING().getText();
            }
            Object relation = visit(ctx.relation());
            log.info("visitProjection attributes=" + "|" + attributes + "|");
            log.info("visitProjection rename=" + "|" + rename + "|");
            log.info("visitProjection renameAttr=" + "|" + renameAttr + "|");
            log.info("visitProjection relation=" + "|" + relation + "|");
            log.info("visitProjection nesting=" + "|" + nesting + "|");

            if (!rename.equals("")) {
                attributes = attributes.replaceAll("[a-zA-z]*[.]", rename + ".");
            }

            String subQuery = "SELECT " + attributes + " FROM " + relation;

            if (orderby != null)
                subQuery += orderby;

            if (!rename.equals("")) {
                subQuery += " as " + rename;
            }

            if (nesting) {
                query = "( " + subQuery + " )";
            } else {
                query = subQuery;
            }
        }
        return query;
    }

    @Override
    public String visitSelection(RaParser.SelectionContext ctx) {
        // TODO Auto-generated method stub
        boolean nesting = nested;
        log.info("==============================");
        log.info("visitSelection in : nesting :" + nesting);
        String condlist = "";

        RaParser.ConditionsContext condContext = ctx.conditions();
        while (condContext != null) {
            List<ParseTree> tree = condContext.children;
            for (ParseTree parseTree : tree) {
                Class clazz = parseTree.getClass();
                if (clazz == RaParser.ConditionContext.class || clazz == RaParser.LogicalOpsContext.class)
                    condlist += " " + parseTree.getText();
            }
            condContext = condContext.conditions();
        }

        String rename = "";
        if (ctx.rename() != null) {
            rename = ctx.rename().STRING().getText();
        }

        Object relation = visit(ctx.relation());
        log.info("visitSelection relation " + relation);

        if (!rename.equals("")) {
            condlist = condlist.replaceAll("[a-zA-z]*[.]", rename + ".");
            relation += " as " + rename;
        }

        String subQuery = "SELECT * FROM " + relation + " WHERE " + condlist.trim();

        String query;
        if (nesting) {
            query = "( " + subQuery + " )";
        } else {
            query = subQuery;
        }
        log.info("visitSelection " + query);
        return query;
    }

    @Override
    public String visitNaturaljoin(RaParser.NaturaljoinContext ctx) {
        boolean nesting = nested;
        log.info("==============================");
        log.info("visitNatural in : nesting " + nesting);
        Object A = visit(ctx.relation(0));
        Object B = visit(ctx.relation(1));

        String subQuery = A + " NATURAL JOIN " + B;
        String query;
        if (nesting) {
            query = subQuery;
        } else {
            query = "SELECT * FROM " + subQuery;
        }
        return query;
    }

    @Override
    public String visitCrossjoin(RaParser.CrossjoinContext ctx) {
        log.info("visitCrossjoin");
        boolean nesting = nested;
        List<RaParser.RelationContext> relations = new ArrayList<>();
        for (RaParser.RelationContext relationContext : ctx.relation()) {
            relations.add(relationContext);
        }
        String subQuery = relations.get(0).getText();
        for (int i = 1; i < relations.size(); i++) {
            subQuery += "," + relations.get(i).getText();
        }
        String query;
        if (nesting) {
            query = subQuery;
        } else {
            query = "SELECT * FROM " + subQuery;
        }
        return query;
    }

    @Override
    public String visitSimpleRelation(RaParser.SimpleRelationContext ctx) {
        log.info("visitSimpleRelation in " + ctx.getText());
        nested = false;
        return ctx.STRING().getText();
    }

    @Override
    public Object visitNestedRelation(RaParser.NestedRelationContext ctx) {
        log.info("visitNestedRelation in " + ctx.expr().getText());
        nested = true;
        Object relation = visit(ctx.expr());
        nested = false;
        return relation;
    }

    @Override
    public String visitRename(RaParser.RenameContext ctx) {
        log.info("visitRename");
        return ctx.getText();
    }

}
