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

public class ComplexTest {

    private static final Logger log = LoggerFactory.getLogger(ComplexTest.class);

    @Test
    public void complexTest() {
        String ra = "(π b,d (S)) ∩ (π b,d (T)) ∪ (π b,d (S)) - (π b,d (T))";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("(SELECT b,d FROM S) INTERSECT (SELECT b,d FROM T) UNION (SELECT b,d FROM S) EXCEPT (SELECT b,d FROM T)", query);
    }

    @Test
    public void complexTest2() {
        String ra = "(π b, d S ∩ π b, d T) ∪ (π b, d S - π b, d T)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("(SELECT b,d FROM S INTERSECT SELECT b,d FROM T) UNION (SELECT b,d FROM S EXCEPT SELECT b,d FROM T)", query);
    }

    @Test
    public void complexTest3() {
        String ra = "R ⨝ R.c = S.b S ⨝ S.b = T.b T";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT * FROM R INNER JOIN S ON R.c=S.b INNER JOIN T ON S.b=T.b", query);
    }

    @Test
    public void complexTest4() {
        String ra = "π R.a, S.b, T.d R ⨝ R.c = S.b S ⨝ S.b = T.b T";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT R.a,S.b,T.d FROM R INNER JOIN S ON R.c=S.b INNER JOIN T ON S.b=T.b", query);
    }

    @Test
    public void complexTest5() {
        String ra = "τ x.a asc π x.a, x.b ρ x (π R.a, R.b σ R.a > 1 and R.b = 'd' R) - (π R.a, R.b σ R.a > 5 R)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT x.a,x.b FROM ((SELECT R.a,R.b FROM R WHERE R.a>1 and R.b='d') EXCEPT (SELECT R.a,R.b FROM R WHERE R.a>5)) as x ORDER BY x.a asc", query);
    }

    @Test
    public void complexTest6() {
        String ra = "τ x.a asc π x.a, x.b ρ x (π R.a, R.b σ R.a > 1 and R.b = 'd' R) - (π R.a, R.b σ R.a > 5 R)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT x.a,x.b FROM ((SELECT R.a,R.b FROM R WHERE R.a>1 and R.b='d') EXCEPT (SELECT R.a,R.b FROM R WHERE R.a>5)) as x ORDER BY x.a asc", query);
    }
}
