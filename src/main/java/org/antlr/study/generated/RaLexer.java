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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		PROJECTION=10, SELECTION=11, RENAME=12, RENAME_ATTR=13, CARTESIAN=14, 
		NATURAL_JOIN=15, LEFT_JOIN=16, RIGHT_JOIN=17, ORDER_BY=18, GROUP_BY=19, 
		UNION=20, INTERSECTION=21, STRING=22, NUMBER=23, NOT_EQUAL=24, EQUAL=25, 
		GREATER_EQUAL=26, GREATER=27, LESSER_EQUAL=28, LESSER=29, LOGICAL_OPS=30, 
		AND=31, OR=32, NOT=33, ASC=34, DESC=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"PROJECTION", "SELECTION", "RENAME", "RENAME_ATTR", "CARTESIAN", "NATURAL_JOIN", 
			"LEFT_JOIN", "RIGHT_JOIN", "ORDER_BY", "GROUP_BY", "UNION", "INTERSECTION", 
			"STRING", "NUMBER", "NOT_EQUAL", "EQUAL", "GREATER_EQUAL", "GREATER", 
			"LESSER_EQUAL", "LESSER", "LOGICAL_OPS", "AND", "OR", "NOT", "ASC", "DESC", 
			"WS", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
			"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'asc'", "'desc'", "'.'", "'AND'", "'OR'", 
			"'NOT'", "'\u03C0'", "'\u03C3'", "'\u03C1'", "'\u2190'", "'\u2A2F'", 
			"'\u2A1D'", "'\u27D5'", "'\u27D6'", "'\u03C4'", "'\u03B3'", "'\u222A'", 
			"'\u2229'", null, null, "'!='", "'=='", "'>='", "'>'", "'<='", "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "PROJECTION", 
			"SELECTION", "RENAME", "RENAME_ATTR", "CARTESIAN", "NATURAL_JOIN", "LEFT_JOIN", 
			"RIGHT_JOIN", "ORDER_BY", "GROUP_BY", "UNION", "INTERSECTION", "STRING", 
			"NUMBER", "NOT_EQUAL", "EQUAL", "GREATER_EQUAL", "GREATER", "LESSER_EQUAL", 
			"LESSER", "LOGICAL_OPS", "AND", "OR", "NOT", "ASC", "DESC", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0121\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\6\27\u00b5\n\27\r\27\16\27\u00b6\3"+
		"\30\6\30\u00ba\n\30\r\30\16\30\u00bb\3\31\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\5\37\u00d1"+
		"\n\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$"+
		"\3%\6%\u00e8\n%\r%\16%\u00e9\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+"+
		"\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3"+
		"=\3=\3>\3>\3?\3?\2\2@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a"+
		"\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\3\2\37\7\2))\62;C\\aac|\3"+
		"\2\62;\5\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2"+
		"HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4"+
		"\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYy"+
		"y\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u010b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3\177\3\2\2\2\5\u0081"+
		"\3\2\2\2\7\u0083\3\2\2\2\t\u0085\3\2\2\2\13\u0089\3\2\2\2\r\u008e\3\2"+
		"\2\2\17\u0090\3\2\2\2\21\u0094\3\2\2\2\23\u0097\3\2\2\2\25\u009b\3\2\2"+
		"\2\27\u009d\3\2\2\2\31\u009f\3\2\2\2\33\u00a1\3\2\2\2\35\u00a3\3\2\2\2"+
		"\37\u00a5\3\2\2\2!\u00a7\3\2\2\2#\u00a9\3\2\2\2%\u00ab\3\2\2\2\'\u00ad"+
		"\3\2\2\2)\u00af\3\2\2\2+\u00b1\3\2\2\2-\u00b4\3\2\2\2/\u00b9\3\2\2\2\61"+
		"\u00bd\3\2\2\2\63\u00c0\3\2\2\2\65\u00c3\3\2\2\2\67\u00c6\3\2\2\29\u00c8"+
		"\3\2\2\2;\u00cb\3\2\2\2=\u00d0\3\2\2\2?\u00d2\3\2\2\2A\u00d6\3\2\2\2C"+
		"\u00d9\3\2\2\2E\u00dd\3\2\2\2G\u00e1\3\2\2\2I\u00e7\3\2\2\2K\u00ed\3\2"+
		"\2\2M\u00ef\3\2\2\2O\u00f1\3\2\2\2Q\u00f3\3\2\2\2S\u00f5\3\2\2\2U\u00f7"+
		"\3\2\2\2W\u00f9\3\2\2\2Y\u00fb\3\2\2\2[\u00fd\3\2\2\2]\u00ff\3\2\2\2_"+
		"\u0101\3\2\2\2a\u0103\3\2\2\2c\u0105\3\2\2\2e\u0107\3\2\2\2g\u0109\3\2"+
		"\2\2i\u010b\3\2\2\2k\u010d\3\2\2\2m\u010f\3\2\2\2o\u0111\3\2\2\2q\u0113"+
		"\3\2\2\2s\u0115\3\2\2\2u\u0117\3\2\2\2w\u0119\3\2\2\2y\u011b\3\2\2\2{"+
		"\u011d\3\2\2\2}\u011f\3\2\2\2\177\u0080\7*\2\2\u0080\4\3\2\2\2\u0081\u0082"+
		"\7+\2\2\u0082\6\3\2\2\2\u0083\u0084\7.\2\2\u0084\b\3\2\2\2\u0085\u0086"+
		"\7c\2\2\u0086\u0087\7u\2\2\u0087\u0088\7e\2\2\u0088\n\3\2\2\2\u0089\u008a"+
		"\7f\2\2\u008a\u008b\7g\2\2\u008b\u008c\7u\2\2\u008c\u008d\7e\2\2\u008d"+
		"\f\3\2\2\2\u008e\u008f\7\60\2\2\u008f\16\3\2\2\2\u0090\u0091\7C\2\2\u0091"+
		"\u0092\7P\2\2\u0092\u0093\7F\2\2\u0093\20\3\2\2\2\u0094\u0095\7Q\2\2\u0095"+
		"\u0096\7T\2\2\u0096\22\3\2\2\2\u0097\u0098\7P\2\2\u0098\u0099\7Q\2\2\u0099"+
		"\u009a\7V\2\2\u009a\24\3\2\2\2\u009b\u009c\7\u03c2\2\2\u009c\26\3\2\2"+
		"\2\u009d\u009e\7\u03c5\2\2\u009e\30\3\2\2\2\u009f\u00a0\7\u03c3\2\2\u00a0"+
		"\32\3\2\2\2\u00a1\u00a2\7\u2192\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\7\u2a31"+
		"\2\2\u00a4\36\3\2\2\2\u00a5\u00a6\7\u2a1f\2\2\u00a6 \3\2\2\2\u00a7\u00a8"+
		"\7\u27d7\2\2\u00a8\"\3\2\2\2\u00a9\u00aa\7\u27d8\2\2\u00aa$\3\2\2\2\u00ab"+
		"\u00ac\7\u03c6\2\2\u00ac&\3\2\2\2\u00ad\u00ae\7\u03b5\2\2\u00ae(\3\2\2"+
		"\2\u00af\u00b0\7\u222c\2\2\u00b0*\3\2\2\2\u00b1\u00b2\7\u222b\2\2\u00b2"+
		",\3\2\2\2\u00b3\u00b5\t\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2"+
		"\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7.\3\2\2\2\u00b8\u00ba\t"+
		"\3\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\60\3\2\2\2\u00bd\u00be\7#\2\2\u00be\u00bf\7?\2\2"+
		"\u00bf\62\3\2\2\2\u00c0\u00c1\7?\2\2\u00c1\u00c2\7?\2\2\u00c2\64\3\2\2"+
		"\2\u00c3\u00c4\7@\2\2\u00c4\u00c5\7?\2\2\u00c5\66\3\2\2\2\u00c6\u00c7"+
		"\7@\2\2\u00c78\3\2\2\2\u00c8\u00c9\7>\2\2\u00c9\u00ca\7?\2\2\u00ca:\3"+
		"\2\2\2\u00cb\u00cc\7>\2\2\u00cc<\3\2\2\2\u00cd\u00d1\5? \2\u00ce\u00d1"+
		"\5A!\2\u00cf\u00d1\5C\"\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1>\3\2\2\2\u00d2\u00d3\5K&\2\u00d3\u00d4\5e\63\2\u00d4"+
		"\u00d5\5Q)\2\u00d5@\3\2\2\2\u00d6\u00d7\5g\64\2\u00d7\u00d8\5m\67\2\u00d8"+
		"B\3\2\2\2\u00d9\u00da\5e\63\2\u00da\u00db\5g\64\2\u00db\u00dc\5q9\2\u00dc"+
		"D\3\2\2\2\u00dd\u00de\5K&\2\u00de\u00df\5o8\2\u00df\u00e0\5O(\2\u00e0"+
		"F\3\2\2\2\u00e1\u00e2\5Q)\2\u00e2\u00e3\5S*\2\u00e3\u00e4\5o8\2\u00e4"+
		"\u00e5\5O(\2\u00e5H\3\2\2\2\u00e6\u00e8\t\4\2\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ec\b%\2\2\u00ecJ\3\2\2\2\u00ed\u00ee\t\5\2\2\u00eeL\3\2"+
		"\2\2\u00ef\u00f0\t\6\2\2\u00f0N\3\2\2\2\u00f1\u00f2\t\7\2\2\u00f2P\3\2"+
		"\2\2\u00f3\u00f4\t\b\2\2\u00f4R\3\2\2\2\u00f5\u00f6\t\t\2\2\u00f6T\3\2"+
		"\2\2\u00f7\u00f8\t\n\2\2\u00f8V\3\2\2\2\u00f9\u00fa\t\13\2\2\u00faX\3"+
		"\2\2\2\u00fb\u00fc\t\f\2\2\u00fcZ\3\2\2\2\u00fd\u00fe\t\r\2\2\u00fe\\"+
		"\3\2\2\2\u00ff\u0100\t\16\2\2\u0100^\3\2\2\2\u0101\u0102\t\17\2\2\u0102"+
		"`\3\2\2\2\u0103\u0104\t\20\2\2\u0104b\3\2\2\2\u0105\u0106\t\21\2\2\u0106"+
		"d\3\2\2\2\u0107\u0108\t\22\2\2\u0108f\3\2\2\2\u0109\u010a\t\23\2\2\u010a"+
		"h\3\2\2\2\u010b\u010c\t\24\2\2\u010cj\3\2\2\2\u010d\u010e\t\25\2\2\u010e"+
		"l\3\2\2\2\u010f\u0110\t\26\2\2\u0110n\3\2\2\2\u0111\u0112\t\27\2\2\u0112"+
		"p\3\2\2\2\u0113\u0114\t\30\2\2\u0114r\3\2\2\2\u0115\u0116\t\31\2\2\u0116"+
		"t\3\2\2\2\u0117\u0118\t\32\2\2\u0118v\3\2\2\2\u0119\u011a\t\33\2\2\u011a"+
		"x\3\2\2\2\u011b\u011c\t\34\2\2\u011cz\3\2\2\2\u011d\u011e\t\35\2\2\u011e"+
		"|\3\2\2\2\u011f\u0120\t\36\2\2\u0120~\3\2\2\2\7\2\u00b6\u00bb\u00d0\u00e9"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}