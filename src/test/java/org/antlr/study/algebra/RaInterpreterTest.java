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

public class RaInterpreterTest {
    private static Logger log = LoggerFactory.getLogger(RaInterpreterTest.class);

    @Test
    public void projectionSimpleTest() throws Exception {
        String ra = "π R.a, R.b (R)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        String query = (String) interpreter.visit(tree);
        assertEquals("SELECT R.a,R.b FROM R", query);
    }

    @Test
    public void projectionOrderbyTest() throws Exception {
        String ra = "π R.a, R.b τ R.a desc, R.c asc, R.d asc (R)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        String query = (String) interpreter.visit(tree);
        assertEquals("SELECT R.a,R.b FROM R ORDER BY R.a desc,R.c asc,R.d asc", query);
    }

    @Test
    public void projectionNestedTest() throws Exception {
        String ra = "π x.a, x.b, x.c ρx (π R.a, R.b, R.c (R))";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        String query = (String) interpreter.visit(tree);
        assertEquals("SELECT x.a,x.b,x.c FROM ( SELECT R.a,R.b,R.c FROM R ) as x", query);
    }

    @Test
    public void projectionRenameTest() throws Exception {
        String ra = "π R.b ρ Rel (R)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT Rel.b FROM R as Rel", query);
    }

    @Test
    public void projectionRenameTest2() throws Exception {
        String ra = "π out.b ρ out (π in.b ρ in (R))";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT out.b FROM ( SELECT in.b FROM R as in ) as out", query);
    }

    @Test
    public void projectionAttrRenameTest() throws Exception {
        String ra = "π x, y ρ x←a, y←b (R)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT a as x,b as y FROM R", query);
    }

    @Test
    public void selectionTest() throws Exception {
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
    public void selectionMultiConditionTest() throws Exception {
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

    @Test
    public void selectionRenameTest() throws Exception {
        String ra = "σ x.a > 0 ρ x (R)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT * FROM R as x WHERE x.a>0", query);
    }

    @Test
    public void naturalJoinTest() throws Exception {
        String ra = "(R) ⨝ (S)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT * FROM R NATURAL JOIN S", query);
    }

    @Test
    public void crossJoinTest() throws Exception {
        String ra = "(R) ⨯ (S) ⨯ (T)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT * FROM R,S,T", query);
    }
}