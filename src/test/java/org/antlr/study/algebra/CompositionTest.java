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

public class CompositionTest {

    private static final Logger log = LoggerFactory.getLogger(CompositionTest.class);

    @Test
    public void compositionTest() {
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
    public void compositionTest2() {
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
    public void compositionTest3() {
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
    public void compositionTest4() {
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
}
