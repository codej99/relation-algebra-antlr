package org.antlr.study.caculator;

import org.antlr.study.algebra.RaInterpreter;
import org.antlr.study.generated.CalculatorBaseVisitor;
import org.antlr.study.generated.CalculatorParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorInterpreter extends CalculatorBaseVisitor {

    private static final Logger log = LoggerFactory.getLogger(CalculatorInterpreter.class);

    @Override
    public Object visitParens(CalculatorParser.ParensContext ctx) {
        Object obj = visit(ctx.expression());
        log.debug("괄호 in {}", obj);
        return obj;
    }

    @Override
    public Integer visitNum(CalculatorParser.NumContext ctx) {
        Integer num = Integer.parseInt(ctx.getText());
        log.debug("숫자 in {}", num);
        return num;
    }

    @Override
    public Integer visitAddSub(CalculatorParser.AddSubContext ctx) {
        Integer left = (int) visit(ctx.expression(0));
        Integer right = (int) visit(ctx.expression(1));
        Integer result = ctx.op.getType() == CalculatorParser.ADD ? left + right : left - right;
        log.debug("더하기 or 빼기 {} {} {} = {}",left, ctx.op.getText(), right, result);
        return result;
    }

    @Override
    public Integer visitMulDiv(CalculatorParser.MulDivContext ctx) {
        Integer left = (int) visit(ctx.expression(0));
        Integer right = (int) visit(ctx.expression(1));
        Integer result = ctx.op.getType() == CalculatorParser.MUL ? left * right : left / right;
        log.debug("곱하기 or 나누기 {} {} {} = {}",left, ctx.op.getText(), right, result);
        return result;
    }
}
