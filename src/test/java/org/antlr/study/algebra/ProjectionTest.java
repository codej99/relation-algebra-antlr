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

public class ProjectionTest {
    private static final Logger log = LoggerFactory.getLogger(ProjectionTest.class);

    @Test
    public void 하나의_projection_구문테스트() {
        String ra = "π R.a, R.b R";
//        String ra = "π R.a, R.b (R)";
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
    public void projectionSelection_테스트() {
        String ra = "π R.a, R.b σ R.a > 0 R";
//        String ra = "π R.a, R.b σ R.a > 0 (R)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT R.a,R.b FROM R WHERE R.a>0", query);
    }
}
