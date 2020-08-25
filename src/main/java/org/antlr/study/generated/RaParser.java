// Generated from Ra.g4 by ANTLR 4.8
package org.antlr.study.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RaParser extends Parser {
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
	public static final int
		RULE_expr = 0, RULE_projection = 1, RULE_selection = 2, RULE_naturaljoin = 3, 
		RULE_crossjoin = 4, RULE_rename = 5, RULE_relation = 6, RULE_orderby = 7, 
		RULE_orders = 8, RULE_order = 9, RULE_direction = 10, RULE_attributes = 11, 
		RULE_attribute = 12, RULE_fullvalue = 13, RULE_renameAttr = 14, RULE_conditions = 15, 
		RULE_condition = 16, RULE_logicalOps = 17, RULE_compared = 18, RULE_comp = 19, 
		RULE_data = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "projection", "selection", "naturaljoin", "crossjoin", "rename", 
			"relation", "orderby", "orders", "order", "direction", "attributes", 
			"attribute", "fullvalue", "renameAttr", "conditions", "condition", "logicalOps", 
			"compared", "comp", "data"
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

	@Override
	public String getGrammarFileName() { return "Ra.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExprContext extends ParserRuleContext {
		public NaturaljoinContext naturaljoin() {
			return getRuleContext(NaturaljoinContext.class,0);
		}
		public CrossjoinContext crossjoin() {
			return getRuleContext(CrossjoinContext.class,0);
		}
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public ProjectionContext projection() {
			return getRuleContext(ProjectionContext.class,0);
		}
		public RenameContext rename() {
			return getRuleContext(RenameContext.class,0);
		}
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				naturaljoin();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				crossjoin();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				selection();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				projection();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				rename();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				relation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProjectionContext extends ParserRuleContext {
		public TerminalNode PROJECTION() { return getToken(RaParser.PROJECTION, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_projection);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(PROJECTION);
				setState(51);
				attributes();
				setState(52);
				match(T__0);
				setState(53);
				expr();
				setState(54);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(PROJECTION);
				setState(57);
				attributes();
				setState(58);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionContext extends ParserRuleContext {
		public TerminalNode SELECTION() { return getToken(RaParser.SELECTION, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitSelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionContext selection() throws RecognitionException {
		SelectionContext _localctx = new SelectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(SELECTION);
			setState(63);
			conditions();
			setState(64);
			match(T__0);
			setState(65);
			expr();
			setState(66);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NaturaljoinContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NATURAL_JOIN() { return getToken(RaParser.NATURAL_JOIN, 0); }
		public NaturaljoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naturaljoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterNaturaljoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitNaturaljoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitNaturaljoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NaturaljoinContext naturaljoin() throws RecognitionException {
		NaturaljoinContext _localctx = new NaturaljoinContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_naturaljoin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__0);
			setState(69);
			expr();
			setState(70);
			match(T__1);
			setState(71);
			match(NATURAL_JOIN);
			setState(72);
			match(T__0);
			setState(73);
			expr();
			setState(74);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CrossjoinContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CARTESIAN() { return getTokens(RaParser.CARTESIAN); }
		public TerminalNode CARTESIAN(int i) {
			return getToken(RaParser.CARTESIAN, i);
		}
		public CrossjoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossjoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterCrossjoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitCrossjoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitCrossjoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossjoinContext crossjoin() throws RecognitionException {
		CrossjoinContext _localctx = new CrossjoinContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_crossjoin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__0);
			setState(77);
			expr();
			setState(78);
			match(T__1);
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				match(CARTESIAN);
				setState(80);
				match(T__0);
				setState(81);
				expr();
				setState(82);
				match(T__1);
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CARTESIAN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(RaParser.RENAME, 0); }
		public TerminalNode STRING() { return getToken(RaParser.STRING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<RenameAttrContext> renameAttr() {
			return getRuleContexts(RenameAttrContext.class);
		}
		public RenameAttrContext renameAttr(int i) {
			return getRuleContext(RenameAttrContext.class,i);
		}
		public RenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterRename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitRename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitRename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameContext rename() throws RecognitionException {
		RenameContext _localctx = new RenameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rename);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(RENAME);
				setState(89);
				match(STRING);
				setState(90);
				match(T__0);
				setState(91);
				expr();
				setState(92);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(RENAME);
				setState(95);
				renameAttr();
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96);
					match(T__2);
					setState(97);
					renameAttr();
					}
					}
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(102);
				match(T__0);
				setState(103);
				expr();
				setState(104);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(RENAME);
				setState(107);
				renameAttr();
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(108);
					match(T__2);
					setState(109);
					renameAttr();
					}
					}
					setState(112); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(114);
				match(T__0);
				setState(115);
				expr();
				setState(116);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	 
		public RelationContext() { }
		public void copyFrom(RelationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleRelationContext extends RelationContext {
		public TerminalNode STRING() { return getToken(RaParser.STRING, 0); }
		public SimpleRelationContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterSimpleRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitSimpleRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitSimpleRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NestedRelationContext extends RelationContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NestedRelationContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterNestedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitNestedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitNestedRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_relation);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new NestedRelationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(T__0);
				setState(121);
				expr();
				setState(122);
				match(T__1);
				}
				break;
			case STRING:
				_localctx = new SimpleRelationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderbyContext extends ParserRuleContext {
		public TerminalNode ORDER_BY() { return getToken(RaParser.ORDER_BY, 0); }
		public OrdersContext orders() {
			return getRuleContext(OrdersContext.class,0);
		}
		public OrderbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterOrderby(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitOrderby(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitOrderby(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderbyContext orderby() throws RecognitionException {
		OrderbyContext _localctx = new OrderbyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_orderby);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(ORDER_BY);
			setState(128);
			orders();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrdersContext extends ParserRuleContext {
		public List<OrderContext> order() {
			return getRuleContexts(OrderContext.class);
		}
		public OrderContext order(int i) {
			return getRuleContext(OrderContext.class,i);
		}
		public OrdersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orders; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterOrders(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitOrders(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitOrders(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdersContext orders() throws RecognitionException {
		OrdersContext _localctx = new OrdersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_orders);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				order();
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(131);
					match(T__2);
					setState(132);
					order();
					}
					}
					setState(135); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				order();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_order);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			attribute();
			setState(141);
			direction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectionContext extends ParserRuleContext {
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attributes);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				attribute();
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(147);
					match(T__2);
					setState(148);
					attribute();
					}
					}
					setState(151); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(RaParser.STRING, 0); }
		public FullvalueContext fullvalue() {
			return getRuleContext(FullvalueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attribute);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				fullvalue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullvalueContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(RaParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(RaParser.STRING, i);
		}
		public FullvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterFullvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitFullvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitFullvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullvalueContext fullvalue() throws RecognitionException {
		FullvalueContext _localctx = new FullvalueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fullvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(STRING);
			setState(160);
			match(T__5);
			setState(161);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameAttrContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(RaParser.STRING, 0); }
		public TerminalNode RENAME_ATTR() { return getToken(RaParser.RENAME_ATTR, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public RenameAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterRenameAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitRenameAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitRenameAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameAttrContext renameAttr() throws RecognitionException {
		RenameAttrContext _localctx = new RenameAttrContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_renameAttr);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(STRING);
				setState(165);
				match(RENAME_ATTR);
				setState(166);
				attribute();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionsContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public LogicalOpsContext logicalOps() {
			return getRuleContext(LogicalOpsContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_conditions);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				condition();
				setState(171);
				logicalOps();
				setState(172);
				conditions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(T__0);
				setState(175);
				conditions();
				setState(176);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public List<ComparedContext> compared() {
			return getRuleContexts(ComparedContext.class);
		}
		public ComparedContext compared(int i) {
			return getRuleContext(ComparedContext.class,i);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			compared();
			setState(181);
			comp();
			setState(182);
			compared();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOpsContext extends ParserRuleContext {
		public LogicalOpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterLogicalOps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitLogicalOps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitLogicalOps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOpsContext logicalOps() throws RecognitionException {
		LogicalOpsContext _localctx = new LogicalOpsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logicalOps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparedContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public ComparedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compared; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterCompared(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitCompared(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitCompared(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparedContext compared() throws RecognitionException {
		ComparedContext _localctx = new ComparedContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_compared);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				data();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompContext extends ParserRuleContext {
		public TerminalNode NOT_EQUAL() { return getToken(RaParser.NOT_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(RaParser.EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(RaParser.GREATER_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(RaParser.GREATER, 0); }
		public TerminalNode LESSER_EQUAL() { return getToken(RaParser.LESSER_EQUAL, 0); }
		public TerminalNode LESSER() { return getToken(RaParser.LESSER, 0); }
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_EQUAL) | (1L << EQUAL) | (1L << GREATER_EQUAL) | (1L << GREATER) | (1L << LESSER_EQUAL) | (1L << LESSER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(RaParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(RaParser.STRING, 0); }
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00c5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\5\2\63"+
		"\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\6\6W\n\6\r\6\16\6X\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7e\n\7"+
		"\r\7\16\7f\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7q\n\7\r\7\16\7r\3\7\3\7"+
		"\3\7\3\7\5\7y\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u0080\n\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\6\n\u0088\n\n\r\n\16\n\u0089\3\n\5\n\u008d\n\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\6\r\u0098\n\r\r\r\16\r\u0099\5\r\u009c\n\r\3\16"+
		"\3\16\5\16\u00a0\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00aa"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b5\n\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u00bf\n\24\3\25\3\25\3\26\3\26"+
		"\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\6\3\2\6\7"+
		"\3\2\t\13\3\2\32\37\3\2\30\31\2\u00c4\2\62\3\2\2\2\4>\3\2\2\2\6@\3\2\2"+
		"\2\bF\3\2\2\2\nN\3\2\2\2\fx\3\2\2\2\16\177\3\2\2\2\20\u0081\3\2\2\2\22"+
		"\u008c\3\2\2\2\24\u008e\3\2\2\2\26\u0091\3\2\2\2\30\u009b\3\2\2\2\32\u009f"+
		"\3\2\2\2\34\u00a1\3\2\2\2\36\u00a9\3\2\2\2 \u00b4\3\2\2\2\"\u00b6\3\2"+
		"\2\2$\u00ba\3\2\2\2&\u00be\3\2\2\2(\u00c0\3\2\2\2*\u00c2\3\2\2\2,\63\5"+
		"\b\5\2-\63\5\n\6\2.\63\5\6\4\2/\63\5\4\3\2\60\63\5\f\7\2\61\63\5\16\b"+
		"\2\62,\3\2\2\2\62-\3\2\2\2\62.\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2\62\61"+
		"\3\2\2\2\63\3\3\2\2\2\64\65\7\f\2\2\65\66\5\30\r\2\66\67\7\3\2\2\678\5"+
		"\2\2\289\7\4\2\29?\3\2\2\2:;\7\f\2\2;<\5\30\r\2<=\5\2\2\2=?\3\2\2\2>\64"+
		"\3\2\2\2>:\3\2\2\2?\5\3\2\2\2@A\7\r\2\2AB\5 \21\2BC\7\3\2\2CD\5\2\2\2"+
		"DE\7\4\2\2E\7\3\2\2\2FG\7\3\2\2GH\5\2\2\2HI\7\4\2\2IJ\7\21\2\2JK\7\3\2"+
		"\2KL\5\2\2\2LM\7\4\2\2M\t\3\2\2\2NO\7\3\2\2OP\5\2\2\2PV\7\4\2\2QR\7\20"+
		"\2\2RS\7\3\2\2ST\5\2\2\2TU\7\4\2\2UW\3\2\2\2VQ\3\2\2\2WX\3\2\2\2XV\3\2"+
		"\2\2XY\3\2\2\2Y\13\3\2\2\2Z[\7\16\2\2[\\\7\30\2\2\\]\7\3\2\2]^\5\2\2\2"+
		"^_\7\4\2\2_y\3\2\2\2`a\7\16\2\2ad\5\36\20\2bc\7\5\2\2ce\5\36\20\2db\3"+
		"\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\3\2\2ij\5\2\2\2jk\7"+
		"\4\2\2ky\3\2\2\2lm\7\16\2\2mp\5\36\20\2no\7\5\2\2oq\5\36\20\2pn\3\2\2"+
		"\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\3\2\2uv\5\2\2\2vw\7\4\2"+
		"\2wy\3\2\2\2xZ\3\2\2\2x`\3\2\2\2xl\3\2\2\2y\r\3\2\2\2z{\7\3\2\2{|\5\2"+
		"\2\2|}\7\4\2\2}\u0080\3\2\2\2~\u0080\7\30\2\2\177z\3\2\2\2\177~\3\2\2"+
		"\2\u0080\17\3\2\2\2\u0081\u0082\7\24\2\2\u0082\u0083\5\22\n\2\u0083\21"+
		"\3\2\2\2\u0084\u0087\5\24\13\2\u0085\u0086\7\5\2\2\u0086\u0088\5\24\13"+
		"\2\u0087\u0085\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u008d\5\24\13\2\u008c\u0084\3\2\2\2"+
		"\u008c\u008b\3\2\2\2\u008d\23\3\2\2\2\u008e\u008f\5\32\16\2\u008f\u0090"+
		"\5\26\f\2\u0090\25\3\2\2\2\u0091\u0092\t\2\2\2\u0092\27\3\2\2\2\u0093"+
		"\u009c\5\32\16\2\u0094\u0097\5\32\16\2\u0095\u0096\7\5\2\2\u0096\u0098"+
		"\5\32\16\2\u0097\u0095\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2"+
		"\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0093\3\2\2\2\u009b\u0094"+
		"\3\2\2\2\u009c\31\3\2\2\2\u009d\u00a0\7\30\2\2\u009e\u00a0\5\34\17\2\u009f"+
		"\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\33\3\2\2\2\u00a1\u00a2\7\30\2"+
		"\2\u00a2\u00a3\7\b\2\2\u00a3\u00a4\7\30\2\2\u00a4\35\3\2\2\2\u00a5\u00aa"+
		"\7\30\2\2\u00a6\u00a7\7\30\2\2\u00a7\u00a8\7\17\2\2\u00a8\u00aa\5\32\16"+
		"\2\u00a9\u00a5\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa\37\3\2\2\2\u00ab\u00b5"+
		"\5\"\22\2\u00ac\u00ad\5\"\22\2\u00ad\u00ae\5$\23\2\u00ae\u00af\5 \21\2"+
		"\u00af\u00b5\3\2\2\2\u00b0\u00b1\7\3\2\2\u00b1\u00b2\5 \21\2\u00b2\u00b3"+
		"\7\4\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00ab\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b4"+
		"\u00b0\3\2\2\2\u00b5!\3\2\2\2\u00b6\u00b7\5&\24\2\u00b7\u00b8\5(\25\2"+
		"\u00b8\u00b9\5&\24\2\u00b9#\3\2\2\2\u00ba\u00bb\t\3\2\2\u00bb%\3\2\2\2"+
		"\u00bc\u00bf\5\32\16\2\u00bd\u00bf\5*\26\2\u00be\u00bc\3\2\2\2\u00be\u00bd"+
		"\3\2\2\2\u00bf\'\3\2\2\2\u00c0\u00c1\t\4\2\2\u00c1)\3\2\2\2\u00c2\u00c3"+
		"\t\5\2\2\u00c3+\3\2\2\2\21\62>Xfrx\177\u0089\u008c\u0099\u009b\u009f\u00a9"+
		"\u00b4\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}