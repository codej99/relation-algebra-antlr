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
		RULE_crossjoin = 4, RULE_relation = 5, RULE_orderby = 6, RULE_orders = 7, 
		RULE_order = 8, RULE_direction = 9, RULE_attributes = 10, RULE_attribute = 11, 
		RULE_fullvalue = 12, RULE_rename = 13, RULE_renameAttr = 14, RULE_conditions = 15, 
		RULE_condition = 16, RULE_logicalOps = 17, RULE_compared = 18, RULE_comp = 19, 
		RULE_data = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "projection", "selection", "naturaljoin", "crossjoin", "relation", 
			"orderby", "orders", "order", "direction", "attributes", "attribute", 
			"fullvalue", "rename", "renameAttr", "conditions", "condition", "logicalOps", 
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
		public ProjectionContext projection() {
			return getRuleContext(ProjectionContext.class,0);
		}
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public NaturaljoinContext naturaljoin() {
			return getRuleContext(NaturaljoinContext.class,0);
		}
		public CrossjoinContext crossjoin() {
			return getRuleContext(CrossjoinContext.class,0);
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
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				projection();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				selection();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				naturaljoin();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				crossjoin();
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
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public RenameContext rename() {
			return getRuleContext(RenameContext.class,0);
		}
		public OrderbyContext orderby() {
			return getRuleContext(OrderbyContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(PROJECTION);
			setState(49);
			attributes();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RENAME) {
				{
				setState(50);
				rename();
				}
			}

			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_BY) {
				{
				setState(53);
				orderby();
				}
			}

			setState(56);
			match(T__0);
			setState(57);
			relation();
			setState(58);
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

	public static class SelectionContext extends ParserRuleContext {
		public TerminalNode SELECTION() { return getToken(RaParser.SELECTION, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public RenameContext rename() {
			return getRuleContext(RenameContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(SELECTION);
			setState(61);
			conditions();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RENAME) {
				{
				setState(62);
				rename();
				}
			}

			setState(65);
			match(T__0);
			setState(66);
			relation();
			setState(67);
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
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode NATURAL_JOIN() { return getToken(RaParser.NATURAL_JOIN, 0); }
		public List<OrderbyContext> orderby() {
			return getRuleContexts(OrderbyContext.class);
		}
		public OrderbyContext orderby(int i) {
			return getRuleContext(OrderbyContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_BY) {
				{
				setState(69);
				orderby();
				}
			}

			setState(72);
			match(T__0);
			setState(73);
			relation();
			setState(74);
			match(T__1);
			setState(75);
			match(NATURAL_JOIN);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_BY) {
				{
				setState(76);
				orderby();
				}
			}

			setState(79);
			match(T__0);
			setState(80);
			relation();
			setState(81);
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
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<OrderbyContext> orderby() {
			return getRuleContexts(OrderbyContext.class);
		}
		public OrderbyContext orderby(int i) {
			return getRuleContext(OrderbyContext.class,i);
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
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_BY) {
				{
				setState(83);
				orderby();
				}
			}

			setState(86);
			match(T__0);
			setState(87);
			relation();
			setState(88);
			match(T__1);
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				match(CARTESIAN);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER_BY) {
					{
					setState(90);
					orderby();
					}
				}

				setState(93);
				match(T__0);
				setState(94);
				relation();
				setState(95);
				match(T__1);
				}
				}
				setState(99); 
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
		enterRule(_localctx, 10, RULE_relation);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new SimpleRelationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(STRING);
				}
				break;
			case T__0:
			case PROJECTION:
			case SELECTION:
			case ORDER_BY:
				_localctx = new NestedRelationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				expr();
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
		enterRule(_localctx, 12, RULE_orderby);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(ORDER_BY);
			setState(106);
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
		enterRule(_localctx, 14, RULE_orders);
		int _la;
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				order();
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(109);
					match(T__2);
					setState(110);
					order();
					}
					}
					setState(113); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
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
		enterRule(_localctx, 16, RULE_order);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			attribute();
			setState(119);
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
		enterRule(_localctx, 18, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
		enterRule(_localctx, 20, RULE_attributes);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				attribute();
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(125);
					match(T__2);
					setState(126);
					attribute();
					}
					}
					setState(129); 
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
		enterRule(_localctx, 22, RULE_attribute);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
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
		enterRule(_localctx, 24, RULE_fullvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(STRING);
			setState(138);
			match(T__5);
			setState(139);
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

	public static class RenameContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(RaParser.RENAME, 0); }
		public TerminalNode STRING() { return getToken(RaParser.STRING, 0); }
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
		enterRule(_localctx, 26, RULE_rename);
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(RENAME);
				setState(142);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(RENAME);
				setState(144);
				renameAttr();
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(145);
					match(T__2);
					setState(146);
					renameAttr();
					}
					}
					setState(149); 
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
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(STRING);
			setState(154);
			match(RENAME_ATTR);
			setState(155);
			attribute();
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
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				condition();
				setState(159);
				logicalOps();
				setState(160);
				conditions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(T__0);
				setState(163);
				conditions();
				setState(164);
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
			setState(168);
			compared();
			setState(169);
			comp();
			setState(170);
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
			setState(172);
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
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
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
			setState(178);
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
			setState(180);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\5\2\61\n\2\3"+
		"\3\3\3\3\3\5\3\66\n\3\3\3\5\39\n\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4B\n"+
		"\4\3\4\3\4\3\4\3\4\3\5\5\5I\n\5\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\5\3\5\3"+
		"\5\3\5\3\6\5\6W\n\6\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\6\3\6\3\6\3\6\6\6d"+
		"\n\6\r\6\16\6e\3\7\3\7\5\7j\n\7\3\b\3\b\3\b\3\t\3\t\3\t\6\tr\n\t\r\t\16"+
		"\ts\3\t\5\tw\n\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\6\f\u0082\n\f\r"+
		"\f\16\f\u0083\5\f\u0086\n\f\3\r\3\r\5\r\u008a\n\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u0096\n\17\r\17\16\17\u0097\5\17\u009a"+
		"\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00a9\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u00b3\n"+
		"\24\3\25\3\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*\2\6\3\2\6\7\3\2\t\13\3\2\32\37\3\2\30\31\2\u00b9\2\60\3\2\2"+
		"\2\4\62\3\2\2\2\6>\3\2\2\2\bH\3\2\2\2\nV\3\2\2\2\fi\3\2\2\2\16k\3\2\2"+
		"\2\20v\3\2\2\2\22x\3\2\2\2\24{\3\2\2\2\26\u0085\3\2\2\2\30\u0089\3\2\2"+
		"\2\32\u008b\3\2\2\2\34\u0099\3\2\2\2\36\u009b\3\2\2\2 \u00a8\3\2\2\2\""+
		"\u00aa\3\2\2\2$\u00ae\3\2\2\2&\u00b2\3\2\2\2(\u00b4\3\2\2\2*\u00b6\3\2"+
		"\2\2,\61\5\4\3\2-\61\5\6\4\2.\61\5\b\5\2/\61\5\n\6\2\60,\3\2\2\2\60-\3"+
		"\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\3\3\2\2\2\62\63\7\f\2\2\63\65\5\26\f"+
		"\2\64\66\5\34\17\2\65\64\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\679\5\16\b"+
		"\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:;\7\3\2\2;<\5\f\7\2<=\7\4\2\2=\5\3"+
		"\2\2\2>?\7\r\2\2?A\5 \21\2@B\5\34\17\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2C"+
		"D\7\3\2\2DE\5\f\7\2EF\7\4\2\2F\7\3\2\2\2GI\5\16\b\2HG\3\2\2\2HI\3\2\2"+
		"\2IJ\3\2\2\2JK\7\3\2\2KL\5\f\7\2LM\7\4\2\2MO\7\21\2\2NP\5\16\b\2ON\3\2"+
		"\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\3\2\2RS\5\f\7\2ST\7\4\2\2T\t\3\2\2\2UW\5"+
		"\16\b\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\3\2\2YZ\5\f\7\2Zc\7\4\2\2[]"+
		"\7\20\2\2\\^\5\16\b\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\3\2\2`a\5\f\7"+
		"\2ab\7\4\2\2bd\3\2\2\2c[\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\13\3\2"+
		"\2\2gj\7\30\2\2hj\5\2\2\2ig\3\2\2\2ih\3\2\2\2j\r\3\2\2\2kl\7\24\2\2lm"+
		"\5\20\t\2m\17\3\2\2\2nq\5\22\n\2op\7\5\2\2pr\5\22\n\2qo\3\2\2\2rs\3\2"+
		"\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2uw\5\22\n\2vn\3\2\2\2vu\3\2\2\2w\21"+
		"\3\2\2\2xy\5\30\r\2yz\5\24\13\2z\23\3\2\2\2{|\t\2\2\2|\25\3\2\2\2}\u0086"+
		"\5\30\r\2~\u0081\5\30\r\2\177\u0080\7\5\2\2\u0080\u0082\5\30\r\2\u0081"+
		"\177\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2"+
		"\2\u0084\u0086\3\2\2\2\u0085}\3\2\2\2\u0085~\3\2\2\2\u0086\27\3\2\2\2"+
		"\u0087\u008a\7\30\2\2\u0088\u008a\5\32\16\2\u0089\u0087\3\2\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\31\3\2\2\2\u008b\u008c\7\30\2\2\u008c\u008d\7\b\2"+
		"\2\u008d\u008e\7\30\2\2\u008e\33\3\2\2\2\u008f\u0090\7\16\2\2\u0090\u009a"+
		"\7\30\2\2\u0091\u0092\7\16\2\2\u0092\u0095\5\36\20\2\u0093\u0094\7\5\2"+
		"\2\u0094\u0096\5\36\20\2\u0095\u0093\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u008f\3\2"+
		"\2\2\u0099\u0091\3\2\2\2\u009a\35\3\2\2\2\u009b\u009c\7\30\2\2\u009c\u009d"+
		"\7\17\2\2\u009d\u009e\5\30\r\2\u009e\37\3\2\2\2\u009f\u00a9\5\"\22\2\u00a0"+
		"\u00a1\5\"\22\2\u00a1\u00a2\5$\23\2\u00a2\u00a3\5 \21\2\u00a3\u00a9\3"+
		"\2\2\2\u00a4\u00a5\7\3\2\2\u00a5\u00a6\5 \21\2\u00a6\u00a7\7\4\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a8\u00a4\3\2"+
		"\2\2\u00a9!\3\2\2\2\u00aa\u00ab\5&\24\2\u00ab\u00ac\5(\25\2\u00ac\u00ad"+
		"\5&\24\2\u00ad#\3\2\2\2\u00ae\u00af\t\3\2\2\u00af%\3\2\2\2\u00b0\u00b3"+
		"\5\30\r\2\u00b1\u00b3\5*\26\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2"+
		"\u00b3\'\3\2\2\2\u00b4\u00b5\t\4\2\2\u00b5)\3\2\2\2\u00b6\u00b7\t\5\2"+
		"\2\u00b7+\3\2\2\2\25\60\658AHOV]eisv\u0083\u0085\u0089\u0097\u0099\u00a8"+
		"\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}