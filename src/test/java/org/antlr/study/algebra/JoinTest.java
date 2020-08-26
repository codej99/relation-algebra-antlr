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

public class JoinTest {
    private static final Logger log = LoggerFactory.getLogger(JoinTest.class);

    @Test
    public void naturalJoinTest() {
//        String ra = "R ⨝ S";
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

    /**
     * S ⨝ S.b = T.b T
     */
    @Test
    public void innerJoinTest() {
//        String ra = "S ⨝ S.b = T.b T";
        String ra = "(S) ⨝ S.b = T.b (T)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT * FROM S INNER JOIN T ON S.b=T.b", query);
    }

    /**
     * π S.b, T.b (S ⨝ S.b = T.b T)
     */
    @Test
    public void innerJoinProjectionTest() {
//        String ra = "π S.b, T.b (S ⨝ S.b = T.b T)";
        String ra = "π S.b, T.b ((S) ⨝ S.b = T.b (T))";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT S.b,T.b FROM S INNER JOIN T ON S.b=T.b", query);
    }

    /**
     * π S.b, T.b σ S.d > 10 (S ⨝ S.b = T.b T)
     */
    @Test
    public void innerJoinProjectionAndConditionTest() {
//        String ra = "π S.b, T.b σ S.d > 10 (S ⨝ S.b = T.b T)";
        String ra = "π S.b, T.b σ S.d > 10 ((S) ⨝ S.b = T.b (T))";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT S.b,T.b FROM S INNER JOIN T ON S.b=T.b WHERE S.d>10", query);
    }

    @Test
    public void catesianProductTest() {
//        String ra = "(R) ⨯ (S) ⨯ (T)";
        String ra = "R ⨯ S ⨯ T";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT * FROM R,S,T", query);
    }

    @Test
    public void catesianProductProjectionTest() {
        String ra = "π R.a, S.b, T.d ((R) ⨯ (S) ⨯ (T))";
//        String ra = "π R.a, S.b, T.d (R ⨯ S ⨯ T)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT R.a,S.b,T.d FROM R,S,T", query);
    }

    @Test
    public void catesianProductProjectionConditionTest() {
        String ra = "π R.a, S.b, T.d σ R.a > 5 and T.d = 100 (R ⨯ S ⨯ T)";
//        String ra = "π R.a, S.b, T.d σ R.a > 5 and T.d = 100 ((R) ⨯ (S) ⨯ (T))";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT R.a,S.b,T.d FROM R,S,T WHERE R.a>5 and T.d=100", query);
    }

    @Test
    public void leftJoinTest() {
//        String ra = "R ⟕ R.b = T.b T";
        String ra = "(R) ⟕ R.b = T.b (T)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT * FROM R LEFT JOIN T ON R.b=T.b", query);
    }

    @Test
    public void leftJoinSelectionTest() {
//        String ra = "σ R.a > 1 (R ⟕ R.b = T.b T)";
        String ra = "σ R.a > 1 ((R) ⟕ R.b = T.b (T))";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT * FROM R LEFT JOIN T ON R.b=T.b WHERE R.a>1", query);
    }

    @Test
    public void leftJoinSelectionProjectionTest() {
//        String ra = "π R.a σ R.a > 1 (R ⟕ R.b = T.b T)";
        String ra = "π R.a σ R.a > 1 ((R) ⟕ R.b = T.b (T))";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT R.a FROM R LEFT JOIN T ON R.b=T.b WHERE R.a>1", query);
    }

    @Test
    public void rightJoinTest() {
//        String ra = "R ⟖ R.b = T.b T";
        String ra = "(R) ⟖ R.b = T.b (T)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT * FROM R RIGHT JOIN T ON R.b=T.b", query);
    }

    @Test
    public void rightJoinSelectionTest() {
//        String ra = "σ R.a > 1 (R ⟖ R.b = T.b T)";
        String ra = "σ R.a > 1 ((R) ⟖ R.b = T.b (T))";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT * FROM R RIGHT JOIN T ON R.b=T.b WHERE R.a>1", query);
    }

    @Test
    public void rightJoinSelectionProjectionTest() {
//        String ra = "π R.a σ R.a > 1 (R ⟖ R.b = T.b T)";
        String ra = "π R.a σ R.a > 1 ((R) ⟖ R.b = T.b (T))";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT R.a FROM R RIGHT JOIN T ON R.b=T.b WHERE R.a>1", query);
    }

    @Test
    public void fullJoinTest() {
//        String ra = "R ⟗ R.b = T.b T";
        String ra = "(R) ⟗ R.b = T.b (T)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT * FROM R FULL OUTER JOIN T ON R.b=T.b", query);
    }

    @Test
    public void fullJoinSelectionTest() {
//        String ra = "σ R.a > 1 (R ⟗ R.b = T.b T)";
        String ra = "σ R.a > 1 ((R) ⟗ R.b = T.b (T))";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT * FROM R FULL OUTER JOIN T ON R.b=T.b WHERE R.a>1", query);
    }

    @Test
    public void fullJoinSelectionProjectionTest() {
//        String ra = "π R.a σ R.a > 1 (R ⟗ R.b = T.b T)";
        String ra = "π R.a σ R.a > 1 ((R) ⟗ R.b = T.b (T))";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT R.a FROM R FULL OUTER JOIN T ON R.b=T.b WHERE R.a>1", query);
    }
}
