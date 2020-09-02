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

public class GroupbyTest {

    private static final Logger log = LoggerFactory.getLogger(GroupbyTest.class);

    @Test
    public void 그룹핑테스트() {
        String ra = "γ R.a, R.b; count(*)→cnt, sum(R.a)→sum σ R.a > 1 R";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT R.a,R.b,count(*) as cnt,sum(R.a) as sum FROM R WHERE R.a>1 GROUP BY R.a,R.b", query);
    }

    @Test
    public void 그룹핑ProjectionSelection조합테스트() {
        String ra = "π R.a, R.b, cnt, sum γ R.a, R.b; count(*)→cnt, sum(R.a)→sum σ R.a > 1 R";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT R.a,R.b,count(*) as cnt,sum(R.a) as sum FROM R WHERE R.a>1 GROUP BY R.a,R.b", query);
    }

    @Test
    public void 그룹핑ProjectionOrderby테스트() {
        String ra = "τ R.a desc π R.a, R.b, cnt, sum γ R.a, R.b; count(*)→cnt, sum(R.a)→sum σ R.a > 1 R";
        RaLexer lexer = new RaLexer(CharStreams.fromString(ra));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RaParser parser = new RaParser(tokens);
        ParseTree tree = parser.expr();
        log.info(tree.toStringTree(parser));
        RaInterpreter interpreter = new RaInterpreter();
        Object query = interpreter.visit(tree);
        assertEquals("SELECT R.a,R.b,count(*) as cnt,sum(R.a) as sum FROM R WHERE R.a>1 GROUP BY R.a,R.b ORDER BY R.a desc", query);
    }
}
