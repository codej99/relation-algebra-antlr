package org.antlr.study.caculator;

import org.antlr.study.generated.CalculatorLexer;
import org.antlr.study.generated.CalculatorParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class CalculatorVisitorTest {
    @Test
    public void addSubTest() throws Exception {
        String ra = "1+2-4";
        CalculatorLexer lexer = new CalculatorLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.expression();
        System.out.println(tree.toStringTree(parser));
        CalculatorInterpreter interpreter = new CalculatorInterpreter();
        Integer query = (Integer) interpreter.visit(tree);
        assertSame(-1, query);
    }

    @Test
    public void mulDivTest() throws Exception {
        String ra = "6*2/4";
        CalculatorLexer lexer = new CalculatorLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.expression();
        System.out.println(tree.toStringTree(parser));
        CalculatorInterpreter interpreter = new CalculatorInterpreter();
        Integer query = (Integer) interpreter.visit(tree);
        assertSame(3, query);
    }

    @Test
    public void compositeTest() throws Exception {
        String ra = "(6-2)+8/4*(1+6)";
        CalculatorLexer lexer = new CalculatorLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.expression();
        System.out.println(tree.toStringTree(parser));
        CalculatorInterpreter interpreter = new CalculatorInterpreter();
        Integer query = (Integer) interpreter.visit(tree);
        assertSame(18, query);
    }
}