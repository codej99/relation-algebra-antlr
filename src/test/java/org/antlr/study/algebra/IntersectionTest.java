package org.antlr.study.algebra;

import org.antlr.study.generated.RaLexer;
import org.antlr.study.generated.RaParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class IntersectionTest {
    private static final Logger log = LoggerFactory.getLogger(IntersectionTest.class);

    @Test
    public void intersectionTest() {
        String ra = "(π b,d S) ∩ (π b,d T)";
//        String ra = "(π b,d (S)) ∩ (π b,d (T))";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("(SELECT b,d FROM S) INTERSECT (SELECT b,d FROM T)", query);
    }

    @Test
    public void intersectionTest2() {
        String ra = "(π b,d σ b!='L' S) ∩ (π b,d σ d>10 T)";
//        String ra = "(π b,d σ b!='L' (S)) ∩ (π b,d σ d>10 (T))";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("(SELECT b,d FROM S WHERE b!='L') INTERSECT (SELECT b,d FROM T WHERE d>10)", query);
    }
}
