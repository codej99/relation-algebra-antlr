// Generated from Ra.g4 by ANTLR 4.8
package org.antlr.study.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, ASC=3, DESC=4, PROJECTION=5, SELECTION=6, RENAME=7, RENAME_ATTR=8, 
		UNION=9, INTERSECTION=10, DIFFERENCE=11, CARTESIAN=12, NATURAL_JOIN=13, 
		LEFT_OUTER_JOIN=14, RIGHT_OUTER_JOIN=15, FULL_OUTER_JOIN=16, ORDER_BY=17, 
		GROUP_BY=18, NOT_EQUAL=19, EQUAL=20, GREATER_EQUAL=21, GREATER=22, LESSER_EQUAL=23, 
		LESSER=24, STRING=25, NUMBER=26, PERIOD=27, COMMA=28, LBRACE=29, RBRACE=30, 
		WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AND", "OR", "ASC", "DESC", "PROJECTION", "SELECTION", "RENAME", "RENAME_ATTR", 
			"UNION", "INTERSECTION", "DIFFERENCE", "CARTESIAN", "NATURAL_JOIN", "LEFT_OUTER_JOIN", 
			"RIGHT_OUTER_JOIN", "FULL_OUTER_JOIN", "ORDER_BY", "GROUP_BY", "NOT_EQUAL", 
			"EQUAL", "GREATER_EQUAL", "GREATER", "LESSER_EQUAL", "LESSER", "STRING", 
			"NUMBER", "PERIOD", "COMMA", "LBRACE", "RBRACE", "WS", "A", "B", "C", 
			"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", 
			"R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'\u03C0'", "'\u03C3'", "'\u03C1'", "'\u2190'", 
			"'\u222A'", "'\u2229'", "'-'", "'\u2A2F'", "'\u2A1D'", "'\u27D5'", "'\u27D6'", 
			"'\u27D7'", "'\u03C4'", "'\u03B3'", "'!='", "'='", "'>='", "'>'", "'<='", 
			"'<'", null, null, "'.'", "','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "ASC", "DESC", "PROJECTION", "SELECTION", "RENAME", 
			"RENAME_ATTR", "UNION", "INTERSECTION", "DIFFERENCE", "CARTESIAN", "NATURAL_JOIN", 
			"LEFT_OUTER_JOIN", "RIGHT_OUTER_JOIN", "FULL_OUTER_JOIN", "ORDER_BY", 
			"GROUP_BY", "NOT_EQUAL", "EQUAL", "GREATER_EQUAL", "GREATER", "LESSER_EQUAL", 
			"LESSER", "STRING", "NUMBER", "PERIOD", "COMMA", "LBRACE", "RBRACE", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public RaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ra.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00fd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\6\32\u00b2\n\32\r\32\16\32"+
		"\u00b3\3\33\6\33\u00b7\n\33\r\33\16\33\u00b8\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \6 \u00c4\n \r \16 \u00c5\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\2\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2"+
		"U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2\3\2\37\7\2))\62;C\\a"+
		"ac|\3\2\62;\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGg"+
		"g\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2"+
		"PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4"+
		"\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u00e5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3"+
		"u\3\2\2\2\5y\3\2\2\2\7|\3\2\2\2\t\u0080\3\2\2\2\13\u0085\3\2\2\2\r\u0087"+
		"\3\2\2\2\17\u0089\3\2\2\2\21\u008b\3\2\2\2\23\u008d\3\2\2\2\25\u008f\3"+
		"\2\2\2\27\u0091\3\2\2\2\31\u0093\3\2\2\2\33\u0095\3\2\2\2\35\u0097\3\2"+
		"\2\2\37\u0099\3\2\2\2!\u009b\3\2\2\2#\u009d\3\2\2\2%\u009f\3\2\2\2\'\u00a1"+
		"\3\2\2\2)\u00a4\3\2\2\2+\u00a6\3\2\2\2-\u00a9\3\2\2\2/\u00ab\3\2\2\2\61"+
		"\u00ae\3\2\2\2\63\u00b1\3\2\2\2\65\u00b6\3\2\2\2\67\u00ba\3\2\2\29\u00bc"+
		"\3\2\2\2;\u00be\3\2\2\2=\u00c0\3\2\2\2?\u00c3\3\2\2\2A\u00c9\3\2\2\2C"+
		"\u00cb\3\2\2\2E\u00cd\3\2\2\2G\u00cf\3\2\2\2I\u00d1\3\2\2\2K\u00d3\3\2"+
		"\2\2M\u00d5\3\2\2\2O\u00d7\3\2\2\2Q\u00d9\3\2\2\2S\u00db\3\2\2\2U\u00dd"+
		"\3\2\2\2W\u00df\3\2\2\2Y\u00e1\3\2\2\2[\u00e3\3\2\2\2]\u00e5\3\2\2\2_"+
		"\u00e7\3\2\2\2a\u00e9\3\2\2\2c\u00eb\3\2\2\2e\u00ed\3\2\2\2g\u00ef\3\2"+
		"\2\2i\u00f1\3\2\2\2k\u00f3\3\2\2\2m\u00f5\3\2\2\2o\u00f7\3\2\2\2q\u00f9"+
		"\3\2\2\2s\u00fb\3\2\2\2uv\5A!\2vw\5[.\2wx\5G$\2x\4\3\2\2\2yz\5]/\2z{\5"+
		"c\62\2{\6\3\2\2\2|}\5A!\2}~\5e\63\2~\177\5E#\2\177\b\3\2\2\2\u0080\u0081"+
		"\5G$\2\u0081\u0082\5I%\2\u0082\u0083\5e\63\2\u0083\u0084\5E#\2\u0084\n"+
		"\3\2\2\2\u0085\u0086\7\u03c2\2\2\u0086\f\3\2\2\2\u0087\u0088\7\u03c5\2"+
		"\2\u0088\16\3\2\2\2\u0089\u008a\7\u03c3\2\2\u008a\20\3\2\2\2\u008b\u008c"+
		"\7\u2192\2\2\u008c\22\3\2\2\2\u008d\u008e\7\u222c\2\2\u008e\24\3\2\2\2"+
		"\u008f\u0090\7\u222b\2\2\u0090\26\3\2\2\2\u0091\u0092\7/\2\2\u0092\30"+
		"\3\2\2\2\u0093\u0094\7\u2a31\2\2\u0094\32\3\2\2\2\u0095\u0096\7\u2a1f"+
		"\2\2\u0096\34\3\2\2\2\u0097\u0098\7\u27d7\2\2\u0098\36\3\2\2\2\u0099\u009a"+
		"\7\u27d8\2\2\u009a \3\2\2\2\u009b\u009c\7\u27d9\2\2\u009c\"\3\2\2\2\u009d"+
		"\u009e\7\u03c6\2\2\u009e$\3\2\2\2\u009f\u00a0\7\u03b5\2\2\u00a0&\3\2\2"+
		"\2\u00a1\u00a2\7#\2\2\u00a2\u00a3\7?\2\2\u00a3(\3\2\2\2\u00a4\u00a5\7"+
		"?\2\2\u00a5*\3\2\2\2\u00a6\u00a7\7@\2\2\u00a7\u00a8\7?\2\2\u00a8,\3\2"+
		"\2\2\u00a9\u00aa\7@\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac\u00ad"+
		"\7?\2\2\u00ad\60\3\2\2\2\u00ae\u00af\7>\2\2\u00af\62\3\2\2\2\u00b0\u00b2"+
		"\t\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\64\3\2\2\2\u00b5\u00b7\t\3\2\2\u00b6\u00b5\3\2\2"+
		"\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\66"+
		"\3\2\2\2\u00ba\u00bb\7\60\2\2\u00bb8\3\2\2\2\u00bc\u00bd\7.\2\2\u00bd"+
		":\3\2\2\2\u00be\u00bf\7*\2\2\u00bf<\3\2\2\2\u00c0\u00c1\7+\2\2\u00c1>"+
		"\3\2\2\2\u00c2\u00c4\t\4\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\b "+
		"\2\2\u00c8@\3\2\2\2\u00c9\u00ca\t\5\2\2\u00caB\3\2\2\2\u00cb\u00cc\t\6"+
		"\2\2\u00ccD\3\2\2\2\u00cd\u00ce\t\7\2\2\u00ceF\3\2\2\2\u00cf\u00d0\t\b"+
		"\2\2\u00d0H\3\2\2\2\u00d1\u00d2\t\t\2\2\u00d2J\3\2\2\2\u00d3\u00d4\t\n"+
		"\2\2\u00d4L\3\2\2\2\u00d5\u00d6\t\13\2\2\u00d6N\3\2\2\2\u00d7\u00d8\t"+
		"\f\2\2\u00d8P\3\2\2\2\u00d9\u00da\t\r\2\2\u00daR\3\2\2\2\u00db\u00dc\t"+
		"\16\2\2\u00dcT\3\2\2\2\u00dd\u00de\t\17\2\2\u00deV\3\2\2\2\u00df\u00e0"+
		"\t\20\2\2\u00e0X\3\2\2\2\u00e1\u00e2\t\21\2\2\u00e2Z\3\2\2\2\u00e3\u00e4"+
		"\t\22\2\2\u00e4\\\3\2\2\2\u00e5\u00e6\t\23\2\2\u00e6^\3\2\2\2\u00e7\u00e8"+
		"\t\24\2\2\u00e8`\3\2\2\2\u00e9\u00ea\t\25\2\2\u00eab\3\2\2\2\u00eb\u00ec"+
		"\t\26\2\2\u00ecd\3\2\2\2\u00ed\u00ee\t\27\2\2\u00eef\3\2\2\2\u00ef\u00f0"+
		"\t\30\2\2\u00f0h\3\2\2\2\u00f1\u00f2\t\31\2\2\u00f2j\3\2\2\2\u00f3\u00f4"+
		"\t\32\2\2\u00f4l\3\2\2\2\u00f5\u00f6\t\33\2\2\u00f6n\3\2\2\2\u00f7\u00f8"+
		"\t\34\2\2\u00f8p\3\2\2\2\u00f9\u00fa\t\35\2\2\u00far\3\2\2\2\u00fb\u00fc"+
		"\t\36\2\2\u00fct\3\2\2\2\6\2\u00b3\u00b8\u00c5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}