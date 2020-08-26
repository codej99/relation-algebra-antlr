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

public class SelectionTest {
    private static final Logger log = LoggerFactory.getLogger(SelectionTest.class);

    @Test
    public void selectionTest() {
//        String ra = "σ R.a > 0 R";
        String ra = "σ R.a > 0 (R)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT * FROM R WHERE R.a>0", query);
    }

    @Test
    public void selectionMultiConditionTest() {
//        String ra = "σ R.a > 0 AND R.a < 10 OR R.c > 100 R";
        String ra = "σ R.a > 0 AND R.a < 10 OR R.c > 100 (R)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT * FROM R WHERE R.a>0 AND R.a<10 OR R.c>100", query);
    }

    // 다른 예제
    @Test
    public void selectionOneConditionTest() {
        String ra = "σ topic = 'Database' Tutorials";
//        String ra = "σ topic = 'Database' (Tutorials)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT * FROM Tutorials WHERE topic='Database'", query);
    }

    @Test
    public void selectionTwoConditionTest() {
        String ra = "σ topic = 'Database' and author = 'abel' or sales > 50000 Tutorials";
//        String ra = "σ topic = 'Database' and author = 'abel' or sales > 50000 (Tutorials)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT * FROM Tutorials WHERE topic='Database' and author='abel' or sales>50000", query);
    }
}
