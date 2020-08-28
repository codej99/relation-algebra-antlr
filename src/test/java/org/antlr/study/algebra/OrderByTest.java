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

public class OrderByTest {
    private static final Logger log = LoggerFactory.getLogger(OrderByTest.class);

//    @Test
    public void 하나의_orderby_구문테스트() {
        String ra = "τ R.a asc, R.b desc R";
//        String ra = "τ R.a asc, R.b desc (R)"; // 안됨
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        String query = (String) interpreter.visit(tree);
        assertEquals("SELECT * FROM R ORDER BY R.a asc,R.b desc", query);
    }

    @Test
    public void projection_orderby_구문테스트() {
        String ra = "τ R.a desc π R.a, R.b R";
//        String ra = "τ R.a desc π R.a, R.b (R)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        String query = (String) interpreter.visit(tree);
        assertEquals("SELECT R.a,R.b FROM R ORDER BY R.a desc", query);
    }

    @Test
    public void projection_orderby_condition_구문테스트() {
        String ra = "τ R.a desc π R.a, R.b σ R.a > 1 AND R.b = 'd' R";
//        String ra = "τ R.a desc π R.a, R.b (R)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        String query = (String) interpreter.visit(tree);
        assertEquals("SELECT R.a,R.b FROM R WHERE R.a>1 AND R.b='d' ORDER BY R.a desc", query);
    }
}
