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
		LESSER=24, STRING=25, NUMBER=26, PERIOD=27, COMMA=28, LPAREN=29, RPAREN=30, 
		ARROW=31, SEMI=32, WS=33;
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
			"NUMBER", "PERIOD", "COMMA", "LPAREN", "RPAREN", "ARROW", "SEMI", "WS", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'\u03C0'", "'\u03C3'", "'\u03C1'", "'\u2190'", 
			"'\u222A'", "'\u2229'", "'-'", "'\u2A2F'", "'\u2A1D'", "'\u27D5'", "'\u27D6'", 
			"'\u27D7'", "'\u03C4'", "'\u03B3'", "'!='", "'='", "'>='", "'>'", "'<='", 
			"'<'", null, null, "'.'", "','", "'('", "')'", "'\u2192'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "ASC", "DESC", "PROJECTION", "SELECTION", "RENAME", 
			"RENAME_ATTR", "UNION", "INTERSECTION", "DIFFERENCE", "CARTESIAN", "NATURAL_JOIN", 
			"LEFT_OUTER_JOIN", "RIGHT_OUTER_JOIN", "FULL_OUTER_JOIN", "ORDER_BY", 
			"GROUP_BY", "NOT_EQUAL", "EQUAL", "GREATER_EQUAL", "GREATER", "LESSER_EQUAL", 
			"LESSER", "STRING", "NUMBER", "PERIOD", "COMMA", "LPAREN", "RPAREN", 
			"ARROW", "SEMI", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0105\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\6\32\u00b6\n\32"+
		"\r\32\16\32\u00b7\3\33\6\33\u00bb\n\33\r\33\16\33\u00bc\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\6\"\u00cc\n\"\r\"\16\"\u00cd"+
		"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\2\2=\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o"+
		"\2q\2s\2u\2w\2\3\2\37\b\2)),,\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\4"+
		"\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKk"+
		"k\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2"+
		"TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\|"+
		"|\2\u00ed\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3y\3\2\2\2"+
		"\5}\3\2\2\2\7\u0080\3\2\2\2\t\u0084\3\2\2\2\13\u0089\3\2\2\2\r\u008b\3"+
		"\2\2\2\17\u008d\3\2\2\2\21\u008f\3\2\2\2\23\u0091\3\2\2\2\25\u0093\3\2"+
		"\2\2\27\u0095\3\2\2\2\31\u0097\3\2\2\2\33\u0099\3\2\2\2\35\u009b\3\2\2"+
		"\2\37\u009d\3\2\2\2!\u009f\3\2\2\2#\u00a1\3\2\2\2%\u00a3\3\2\2\2\'\u00a5"+
		"\3\2\2\2)\u00a8\3\2\2\2+\u00aa\3\2\2\2-\u00ad\3\2\2\2/\u00af\3\2\2\2\61"+
		"\u00b2\3\2\2\2\63\u00b5\3\2\2\2\65\u00ba\3\2\2\2\67\u00be\3\2\2\29\u00c0"+
		"\3\2\2\2;\u00c2\3\2\2\2=\u00c4\3\2\2\2?\u00c6\3\2\2\2A\u00c8\3\2\2\2C"+
		"\u00cb\3\2\2\2E\u00d1\3\2\2\2G\u00d3\3\2\2\2I\u00d5\3\2\2\2K\u00d7\3\2"+
		"\2\2M\u00d9\3\2\2\2O\u00db\3\2\2\2Q\u00dd\3\2\2\2S\u00df\3\2\2\2U\u00e1"+
		"\3\2\2\2W\u00e3\3\2\2\2Y\u00e5\3\2\2\2[\u00e7\3\2\2\2]\u00e9\3\2\2\2_"+
		"\u00eb\3\2\2\2a\u00ed\3\2\2\2c\u00ef\3\2\2\2e\u00f1\3\2\2\2g\u00f3\3\2"+
		"\2\2i\u00f5\3\2\2\2k\u00f7\3\2\2\2m\u00f9\3\2\2\2o\u00fb\3\2\2\2q\u00fd"+
		"\3\2\2\2s\u00ff\3\2\2\2u\u0101\3\2\2\2w\u0103\3\2\2\2yz\5E#\2z{\5_\60"+
		"\2{|\5K&\2|\4\3\2\2\2}~\5a\61\2~\177\5g\64\2\177\6\3\2\2\2\u0080\u0081"+
		"\5E#\2\u0081\u0082\5i\65\2\u0082\u0083\5I%\2\u0083\b\3\2\2\2\u0084\u0085"+
		"\5K&\2\u0085\u0086\5M\'\2\u0086\u0087\5i\65\2\u0087\u0088\5I%\2\u0088"+
		"\n\3\2\2\2\u0089\u008a\7\u03c2\2\2\u008a\f\3\2\2\2\u008b\u008c\7\u03c5"+
		"\2\2\u008c\16\3\2\2\2\u008d\u008e\7\u03c3\2\2\u008e\20\3\2\2\2\u008f\u0090"+
		"\7\u2192\2\2\u0090\22\3\2\2\2\u0091\u0092\7\u222c\2\2\u0092\24\3\2\2\2"+
		"\u0093\u0094\7\u222b\2\2\u0094\26\3\2\2\2\u0095\u0096\7/\2\2\u0096\30"+
		"\3\2\2\2\u0097\u0098\7\u2a31\2\2\u0098\32\3\2\2\2\u0099\u009a\7\u2a1f"+
		"\2\2\u009a\34\3\2\2\2\u009b\u009c\7\u27d7\2\2\u009c\36\3\2\2\2\u009d\u009e"+
		"\7\u27d8\2\2\u009e \3\2\2\2\u009f\u00a0\7\u27d9\2\2\u00a0\"\3\2\2\2\u00a1"+
		"\u00a2\7\u03c6\2\2\u00a2$\3\2\2\2\u00a3\u00a4\7\u03b5\2\2\u00a4&\3\2\2"+
		"\2\u00a5\u00a6\7#\2\2\u00a6\u00a7\7?\2\2\u00a7(\3\2\2\2\u00a8\u00a9\7"+
		"?\2\2\u00a9*\3\2\2\2\u00aa\u00ab\7@\2\2\u00ab\u00ac\7?\2\2\u00ac,\3\2"+
		"\2\2\u00ad\u00ae\7@\2\2\u00ae.\3\2\2\2\u00af\u00b0\7>\2\2\u00b0\u00b1"+
		"\7?\2\2\u00b1\60\3\2\2\2\u00b2\u00b3\7>\2\2\u00b3\62\3\2\2\2\u00b4\u00b6"+
		"\t\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\64\3\2\2\2\u00b9\u00bb\t\3\2\2\u00ba\u00b9\3\2\2"+
		"\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\66"+
		"\3\2\2\2\u00be\u00bf\7\60\2\2\u00bf8\3\2\2\2\u00c0\u00c1\7.\2\2\u00c1"+
		":\3\2\2\2\u00c2\u00c3\7*\2\2\u00c3<\3\2\2\2\u00c4\u00c5\7+\2\2\u00c5>"+
		"\3\2\2\2\u00c6\u00c7\7\u2194\2\2\u00c7@\3\2\2\2\u00c8\u00c9\7=\2\2\u00c9"+
		"B\3\2\2\2\u00ca\u00cc\t\4\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2"+
		"\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0"+
		"\b\"\2\2\u00d0D\3\2\2\2\u00d1\u00d2\t\5\2\2\u00d2F\3\2\2\2\u00d3\u00d4"+
		"\t\6\2\2\u00d4H\3\2\2\2\u00d5\u00d6\t\7\2\2\u00d6J\3\2\2\2\u00d7\u00d8"+
		"\t\b\2\2\u00d8L\3\2\2\2\u00d9\u00da\t\t\2\2\u00daN\3\2\2\2\u00db\u00dc"+
		"\t\n\2\2\u00dcP\3\2\2\2\u00dd\u00de\t\13\2\2\u00deR\3\2\2\2\u00df\u00e0"+
		"\t\f\2\2\u00e0T\3\2\2\2\u00e1\u00e2\t\r\2\2\u00e2V\3\2\2\2\u00e3\u00e4"+
		"\t\16\2\2\u00e4X\3\2\2\2\u00e5\u00e6\t\17\2\2\u00e6Z\3\2\2\2\u00e7\u00e8"+
		"\t\20\2\2\u00e8\\\3\2\2\2\u00e9\u00ea\t\21\2\2\u00ea^\3\2\2\2\u00eb\u00ec"+
		"\t\22\2\2\u00ec`\3\2\2\2\u00ed\u00ee\t\23\2\2\u00eeb\3\2\2\2\u00ef\u00f0"+
		"\t\24\2\2\u00f0d\3\2\2\2\u00f1\u00f2\t\25\2\2\u00f2f\3\2\2\2\u00f3\u00f4"+
		"\t\26\2\2\u00f4h\3\2\2\2\u00f5\u00f6\t\27\2\2\u00f6j\3\2\2\2\u00f7\u00f8"+
		"\t\30\2\2\u00f8l\3\2\2\2\u00f9\u00fa\t\31\2\2\u00fan\3\2\2\2\u00fb\u00fc"+
		"\t\32\2\2\u00fcp\3\2\2\2\u00fd\u00fe\t\33\2\2\u00fer\3\2\2\2\u00ff\u0100"+
		"\t\34\2\2\u0100t\3\2\2\2\u0101\u0102\t\35\2\2\u0102v\3\2\2\2\u0103\u0104"+
		"\t\36\2\2\u0104x\3\2\2\2\6\2\u00b7\u00bc\u00cd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}