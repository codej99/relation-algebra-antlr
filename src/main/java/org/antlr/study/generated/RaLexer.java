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
		T__0=1, T__1=2, T__2=3, T__3=4, AND=5, OR=6, NOT=7, ASC=8, DESC=9, PROJECTION=10, 
		SELECTION=11, RENAME=12, RENAME_ATTR=13, UNION=14, INTERSECTION=15, DIFFERENCE=16, 
		CARTESIAN=17, NATURAL_JOIN=18, LEFT_JOIN=19, RIGHT_JOIN=20, ORDER_BY=21, 
		GROUP_BY=22, NOT_EQUAL=23, EQUAL=24, GREATER_EQUAL=25, GREATER=26, LESSER_EQUAL=27, 
		LESSER=28, STRING=29, NUMBER=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "AND", "OR", "NOT", "ASC", "DESC", "PROJECTION", 
			"SELECTION", "RENAME", "RENAME_ATTR", "UNION", "INTERSECTION", "DIFFERENCE", 
			"CARTESIAN", "NATURAL_JOIN", "LEFT_JOIN", "RIGHT_JOIN", "ORDER_BY", "GROUP_BY", 
			"NOT_EQUAL", "EQUAL", "GREATER_EQUAL", "GREATER", "LESSER_EQUAL", "LESSER", 
			"STRING", "NUMBER", "WS", "A", "B", "C", "D", "E", "F", "G", "H", "I", 
			"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", 
			"X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'.'", null, null, null, null, null, "'\u03C0'", 
			"'\u03C3'", "'\u03C1'", "'\u2190'", "'\u222A'", "'\u2229'", "'-'", "'\u2A2F'", 
			"'\u2A1D'", "'\u27D5'", "'\u27D6'", "'\u03C4'", "'\u03B3'", "'!='", "'='", 
			"'>='", "'>'", "'<='", "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "AND", "OR", "NOT", "ASC", "DESC", "PROJECTION", 
			"SELECTION", "RENAME", "RENAME_ATTR", "UNION", "INTERSECTION", "DIFFERENCE", 
			"CARTESIAN", "NATURAL_JOIN", "LEFT_JOIN", "RIGHT_JOIN", "ORDER_BY", "GROUP_BY", 
			"NOT_EQUAL", "EQUAL", "GREATER_EQUAL", "GREATER", "LESSER_EQUAL", "LESSER", 
			"STRING", "NUMBER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00ff\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\36\6\36\u00bc\n\36\r\36\16\36\u00bd\3\37\6\37\u00c1"+
		"\n\37\r\37\16\37\u00c2\3 \6 \u00c6\n \r \16 \u00c7\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3"+
		".\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\2\2;\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\2C\2E\2G\2I\2K\2M\2O"+
		"\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2\3\2\37\7\2))"+
		"\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFf"+
		"f\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2"+
		"OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4"+
		"\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u00e7\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\3u\3\2\2\2\5w\3\2\2\2\7y\3\2\2\2\t{\3\2\2\2\13}\3\2\2\2\r\u0081"+
		"\3\2\2\2\17\u0084\3\2\2\2\21\u0088\3\2\2\2\23\u008c\3\2\2\2\25\u0091\3"+
		"\2\2\2\27\u0093\3\2\2\2\31\u0095\3\2\2\2\33\u0097\3\2\2\2\35\u0099\3\2"+
		"\2\2\37\u009b\3\2\2\2!\u009d\3\2\2\2#\u009f\3\2\2\2%\u00a1\3\2\2\2\'\u00a3"+
		"\3\2\2\2)\u00a5\3\2\2\2+\u00a7\3\2\2\2-\u00a9\3\2\2\2/\u00ab\3\2\2\2\61"+
		"\u00ae\3\2\2\2\63\u00b0\3\2\2\2\65\u00b3\3\2\2\2\67\u00b5\3\2\2\29\u00b8"+
		"\3\2\2\2;\u00bb\3\2\2\2=\u00c0\3\2\2\2?\u00c5\3\2\2\2A\u00cb\3\2\2\2C"+
		"\u00cd\3\2\2\2E\u00cf\3\2\2\2G\u00d1\3\2\2\2I\u00d3\3\2\2\2K\u00d5\3\2"+
		"\2\2M\u00d7\3\2\2\2O\u00d9\3\2\2\2Q\u00db\3\2\2\2S\u00dd\3\2\2\2U\u00df"+
		"\3\2\2\2W\u00e1\3\2\2\2Y\u00e3\3\2\2\2[\u00e5\3\2\2\2]\u00e7\3\2\2\2_"+
		"\u00e9\3\2\2\2a\u00eb\3\2\2\2c\u00ed\3\2\2\2e\u00ef\3\2\2\2g\u00f1\3\2"+
		"\2\2i\u00f3\3\2\2\2k\u00f5\3\2\2\2m\u00f7\3\2\2\2o\u00f9\3\2\2\2q\u00fb"+
		"\3\2\2\2s\u00fd\3\2\2\2uv\7*\2\2v\4\3\2\2\2wx\7+\2\2x\6\3\2\2\2yz\7.\2"+
		"\2z\b\3\2\2\2{|\7\60\2\2|\n\3\2\2\2}~\5A!\2~\177\5[.\2\177\u0080\5G$\2"+
		"\u0080\f\3\2\2\2\u0081\u0082\5]/\2\u0082\u0083\5c\62\2\u0083\16\3\2\2"+
		"\2\u0084\u0085\5[.\2\u0085\u0086\5]/\2\u0086\u0087\5g\64\2\u0087\20\3"+
		"\2\2\2\u0088\u0089\5A!\2\u0089\u008a\5e\63\2\u008a\u008b\5E#\2\u008b\22"+
		"\3\2\2\2\u008c\u008d\5G$\2\u008d\u008e\5I%\2\u008e\u008f\5e\63\2\u008f"+
		"\u0090\5E#\2\u0090\24\3\2\2\2\u0091\u0092\7\u03c2\2\2\u0092\26\3\2\2\2"+
		"\u0093\u0094\7\u03c5\2\2\u0094\30\3\2\2\2\u0095\u0096\7\u03c3\2\2\u0096"+
		"\32\3\2\2\2\u0097\u0098\7\u2192\2\2\u0098\34\3\2\2\2\u0099\u009a\7\u222c"+
		"\2\2\u009a\36\3\2\2\2\u009b\u009c\7\u222b\2\2\u009c \3\2\2\2\u009d\u009e"+
		"\7/\2\2\u009e\"\3\2\2\2\u009f\u00a0\7\u2a31\2\2\u00a0$\3\2\2\2\u00a1\u00a2"+
		"\7\u2a1f\2\2\u00a2&\3\2\2\2\u00a3\u00a4\7\u27d7\2\2\u00a4(\3\2\2\2\u00a5"+
		"\u00a6\7\u27d8\2\2\u00a6*\3\2\2\2\u00a7\u00a8\7\u03c6\2\2\u00a8,\3\2\2"+
		"\2\u00a9\u00aa\7\u03b5\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7#\2\2\u00ac\u00ad"+
		"\7?\2\2\u00ad\60\3\2\2\2\u00ae\u00af\7?\2\2\u00af\62\3\2\2\2\u00b0\u00b1"+
		"\7@\2\2\u00b1\u00b2\7?\2\2\u00b2\64\3\2\2\2\u00b3\u00b4\7@\2\2\u00b4\66"+
		"\3\2\2\2\u00b5\u00b6\7>\2\2\u00b6\u00b7\7?\2\2\u00b78\3\2\2\2\u00b8\u00b9"+
		"\7>\2\2\u00b9:\3\2\2\2\u00ba\u00bc\t\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be<\3\2\2\2\u00bf"+
		"\u00c1\t\3\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3>\3\2\2\2\u00c4\u00c6\t\4\2\2\u00c5\u00c4"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\b \2\2\u00ca@\3\2\2\2\u00cb\u00cc\t\5\2\2\u00cc"+
		"B\3\2\2\2\u00cd\u00ce\t\6\2\2\u00ceD\3\2\2\2\u00cf\u00d0\t\7\2\2\u00d0"+
		"F\3\2\2\2\u00d1\u00d2\t\b\2\2\u00d2H\3\2\2\2\u00d3\u00d4\t\t\2\2\u00d4"+
		"J\3\2\2\2\u00d5\u00d6\t\n\2\2\u00d6L\3\2\2\2\u00d7\u00d8\t\13\2\2\u00d8"+
		"N\3\2\2\2\u00d9\u00da\t\f\2\2\u00daP\3\2\2\2\u00db\u00dc\t\r\2\2\u00dc"+
		"R\3\2\2\2\u00dd\u00de\t\16\2\2\u00deT\3\2\2\2\u00df\u00e0\t\17\2\2\u00e0"+
		"V\3\2\2\2\u00e1\u00e2\t\20\2\2\u00e2X\3\2\2\2\u00e3\u00e4\t\21\2\2\u00e4"+
		"Z\3\2\2\2\u00e5\u00e6\t\22\2\2\u00e6\\\3\2\2\2\u00e7\u00e8\t\23\2\2\u00e8"+
		"^\3\2\2\2\u00e9\u00ea\t\24\2\2\u00ea`\3\2\2\2\u00eb\u00ec\t\25\2\2\u00ec"+
		"b\3\2\2\2\u00ed\u00ee\t\26\2\2\u00eed\3\2\2\2\u00ef\u00f0\t\27\2\2\u00f0"+
		"f\3\2\2\2\u00f1\u00f2\t\30\2\2\u00f2h\3\2\2\2\u00f3\u00f4\t\31\2\2\u00f4"+
		"j\3\2\2\2\u00f5\u00f6\t\32\2\2\u00f6l\3\2\2\2\u00f7\u00f8\t\33\2\2\u00f8"+
		"n\3\2\2\2\u00f9\u00fa\t\34\2\2\u00fap\3\2\2\2\u00fb\u00fc\t\35\2\2\u00fc"+
		"r\3\2\2\2\u00fd\u00fe\t\36\2\2\u00fet\3\2\2\2\6\2\u00bd\u00c2\u00c7\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}