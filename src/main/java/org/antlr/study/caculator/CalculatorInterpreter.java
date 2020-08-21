package org.antlr.study.caculator;

import org.antlr.study.generated.CalculatorBaseVisitor;
import org.antlr.study.generated.CalculatorParser;

public class CalculatorInterpreter extends CalculatorBaseVisitor {

    @Override
    public Object visitParens(CalculatorParser.ParensContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Integer visitNum(CalculatorParser.NumContext ctx) {
        return Integer.parseInt(ctx.getText());
    }

    @Override
    public Integer visitAddSub(CalculatorParser.AddSubContext ctx) {
        Integer left = (int) visit(ctx.expression(0));
        Integer right = (int) visit(ctx.expression(1));
        return ctx.op.getType() == CalculatorParser.ADD ? left + right : left - right;
    }

    @Override
    public Integer visitMulDiv(CalculatorParser.MulDivContext ctx) {
        Integer left = (int) visit(ctx.expression(0));
        Integer right = (int) visit(ctx.expression(1));
        return ctx.op.getType() == CalculatorParser.MUL ? left * right : left / right;
    }
}
