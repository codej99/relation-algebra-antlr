package org.antlr.study.algebra;

import org.antlr.study.algebra.backup.RaInterpreterTest;
import org.antlr.study.generated.RaLexer;
import org.antlr.study.generated.RaParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class RenameTest {
    private static Logger log = LoggerFactory.getLogger(RaInterpreterTest.class);

    @Test
    public void 리네임_릴레이션_only_구문테스트() {
        String ra = "ρ Rel (R)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT Rel.* FROM R as Rel", query);
    }

    @Test
    public void projection_테이블_리네임테스트() {
        String ra = "π Rel.b ρ Rel (R)";
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
    public void 중첨_projection_리네임테스트() {
        String ra = "π out.b ρ out (π in.b ρ in (R))";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT out.b FROM (SELECT in.b FROM R as in) as out", query);
    }

    @Test
    public void 리네임_어트리뷰트_only_테스트() {
        String ra = "ρ aa←a, bb←b, c (R)";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT R.a as aa,R.b as bb,R.c FROM R", query);
    }

    @Test
    public void projection_어트리뷰트_리네임테스트() {
        String ra = "ρ x←R.a, y←R.b (π R.a, R.b (R))";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT R.a as x,R.b as y FROM R", query);
    }

    @Test
    public void 리네임_어트리뷰트_릴레이션_리네임테스트() {
        String ra = "ρ aa←Rel.a, bb←Rel.b (π Rel.a, Rel.b, Rel.c ρ Rel (R))";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT Rel.a as aa,Rel.b as bb,Rel.c FROM R as Rel", query);
    }
}
