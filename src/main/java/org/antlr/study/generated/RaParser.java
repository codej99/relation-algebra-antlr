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
		AND=1, OR=2, ASC=3, DESC=4, PROJECTION=5, SELECTION=6, RENAME=7, RENAME_ATTR=8, 
		UNION=9, INTERSECTION=10, DIFFERENCE=11, CARTESIAN=12, NATURAL_JOIN=13, 
		LEFT_OUTER_JOIN=14, RIGHT_OUTER_JOIN=15, FULL_OUTER_JOIN=16, ORDER_BY=17, 
		GROUP_BY=18, NOT_EQUAL=19, EQUAL=20, GREATER_EQUAL=21, GREATER=22, LESSER_EQUAL=23, 
		LESSER=24, STRING=25, NUMBER=26, PERIOD=27, COMMA=28, LBRACE=29, RBRACE=30, 
		WS=31;
	public static final int
		RULE_expr = 0, RULE_selectionExpr = 1, RULE_projectionExpr = 2, RULE_renameExpr = 3, 
		RULE_relationExpr = 4, RULE_orderbyExpr = 5, RULE_orders = 6, RULE_order = 7, 
		RULE_direction = 8, RULE_attributes = 9, RULE_attribute = 10, RULE_fullvalue = 11, 
		RULE_renameAttrs = 12, RULE_renameAttr = 13, RULE_conditions = 14, RULE_condition = 15, 
		RULE_logicalOps = 16, RULE_compared = 17, RULE_comp = 18, RULE_data = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "selectionExpr", "projectionExpr", "renameExpr", "relationExpr", 
			"orderbyExpr", "orders", "order", "direction", "attributes", "attribute", 
			"fullvalue", "renameAttrs", "renameAttr", "conditions", "condition", 
			"logicalOps", "compared", "comp", "data"
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FullJoinContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode FULL_OUTER_JOIN() { return getToken(RaParser.FULL_OUTER_JOIN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public FullJoinContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterFullJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitFullJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitFullJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrderbyContext extends ExprContext {
		public OrderbyExprContext orderbyExpr() {
			return getRuleContext(OrderbyExprContext.class,0);
		}
		public OrderbyContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class UnionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode UNION() { return getToken(RaParser.UNION, 0); }
		public UnionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitUnion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationContext extends ExprContext {
		public RelationExprContext relationExpr() {
			return getRuleContext(RelationExprContext.class,0);
		}
		public RelationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RightJoinContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RIGHT_OUTER_JOIN() { return getToken(RaParser.RIGHT_OUTER_JOIN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public RightJoinContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterRightJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitRightJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitRightJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectionContext extends ExprContext {
		public SelectionExprContext selectionExpr() {
			return getRuleContext(SelectionExprContext.class,0);
		}
		public SelectionContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class RenameContext extends ExprContext {
		public RenameExprContext renameExpr() {
			return getRuleContext(RenameExprContext.class,0);
		}
		public RenameContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class NaturalJoinContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NATURAL_JOIN() { return getToken(RaParser.NATURAL_JOIN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public NaturalJoinContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterNaturalJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitNaturalJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitNaturalJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetDifferenceContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIFFERENCE() { return getToken(RaParser.DIFFERENCE, 0); }
		public SetDifferenceContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterSetDifference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitSetDifference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitSetDifference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntersectionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INTERSECTION() { return getToken(RaParser.INTERSECTION, 0); }
		public IntersectionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterIntersection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitIntersection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitIntersection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CatesianProductContext extends ExprContext {
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
		public CatesianProductContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterCatesianProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitCatesianProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitCatesianProduct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftJoinContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LEFT_OUTER_JOIN() { return getToken(RaParser.LEFT_OUTER_JOIN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public LeftJoinContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterLeftJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitLeftJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitLeftJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProjectionContext extends ExprContext {
		public ProjectionExprContext projectionExpr() {
			return getRuleContext(ProjectionExprContext.class,0);
		}
		public ProjectionContext(ExprContext ctx) { copyFrom(ctx); }
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

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTION:
				{
				_localctx = new SelectionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(41);
				selectionExpr();
				}
				break;
			case PROJECTION:
				{
				_localctx = new ProjectionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				projectionExpr();
				}
				break;
			case RENAME:
				{
				_localctx = new RenameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				renameExpr();
				}
				break;
			case ORDER_BY:
				{
				_localctx = new OrderbyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				orderbyExpr();
				}
				break;
			case STRING:
			case LBRACE:
				{
				_localctx = new RelationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				relationExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(85);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new IntersectionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(48);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(49);
						match(INTERSECTION);
						setState(50);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new UnionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(51);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(52);
						match(UNION);
						setState(53);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new SetDifferenceContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(54);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(55);
						match(DIFFERENCE);
						setState(56);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new NaturalJoinContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(57);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(58);
						match(NATURAL_JOIN);
						setState(60);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
						case 1:
							{
							setState(59);
							condition();
							}
							break;
						}
						setState(62);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new LeftJoinContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(63);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(64);
						match(LEFT_OUTER_JOIN);
						setState(65);
						condition();
						setState(66);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new RightJoinContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(68);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(69);
						match(RIGHT_OUTER_JOIN);
						setState(70);
						condition();
						setState(71);
						expr(9);
						}
						break;
					case 7:
						{
						_localctx = new FullJoinContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(73);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(74);
						match(FULL_OUTER_JOIN);
						setState(75);
						condition();
						setState(76);
						expr(8);
						}
						break;
					case 8:
						{
						_localctx = new CatesianProductContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(78);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(81); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(79);
								match(CARTESIAN);
								setState(80);
								expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(83); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SelectionExprContext extends ParserRuleContext {
		public TerminalNode SELECTION() { return getToken(RaParser.SELECTION, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SelectionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterSelectionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitSelectionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitSelectionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionExprContext selectionExpr() throws RecognitionException {
		SelectionExprContext _localctx = new SelectionExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectionExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(SELECTION);
			setState(91);
			conditions();
			setState(92);
			expr(0);
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

	public static class ProjectionExprContext extends ParserRuleContext {
		public TerminalNode PROJECTION() { return getToken(RaParser.PROJECTION, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProjectionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterProjectionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitProjectionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitProjectionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionExprContext projectionExpr() throws RecognitionException {
		ProjectionExprContext _localctx = new ProjectionExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_projectionExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(PROJECTION);
			setState(95);
			attributes();
			setState(96);
			expr(0);
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

	public static class RenameExprContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(RaParser.RENAME, 0); }
		public TerminalNode STRING() { return getToken(RaParser.STRING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RenameAttrsContext renameAttrs() {
			return getRuleContext(RenameAttrsContext.class,0);
		}
		public RenameExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterRenameExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitRenameExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitRenameExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameExprContext renameExpr() throws RecognitionException {
		RenameExprContext _localctx = new RenameExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_renameExpr);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(RENAME);
				setState(99);
				match(STRING);
				setState(100);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(RENAME);
				setState(102);
				renameAttrs();
				setState(103);
				expr(0);
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

	public static class RelationExprContext extends ParserRuleContext {
		public RelationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationExpr; }
	 
		public RelationExprContext() { }
		public void copyFrom(RelationExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleRelationContext extends RelationExprContext {
		public TerminalNode STRING() { return getToken(RaParser.STRING, 0); }
		public SimpleRelationContext(RelationExprContext ctx) { copyFrom(ctx); }
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
	public static class NestedRelationContext extends RelationExprContext {
		public TerminalNode LBRACE() { return getToken(RaParser.LBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(RaParser.RBRACE, 0); }
		public NestedRelationContext(RelationExprContext ctx) { copyFrom(ctx); }
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

	public final RelationExprContext relationExpr() throws RecognitionException {
		RelationExprContext _localctx = new RelationExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_relationExpr);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				_localctx = new NestedRelationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(LBRACE);
				setState(108);
				expr(0);
				setState(109);
				match(RBRACE);
				}
				break;
			case STRING:
				_localctx = new SimpleRelationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
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

	public static class OrderbyExprContext extends ParserRuleContext {
		public TerminalNode ORDER_BY() { return getToken(RaParser.ORDER_BY, 0); }
		public OrdersContext orders() {
			return getRuleContext(OrdersContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OrderbyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderbyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterOrderbyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitOrderbyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitOrderbyExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderbyExprContext orderbyExpr() throws RecognitionException {
		OrderbyExprContext _localctx = new OrderbyExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_orderbyExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ORDER_BY);
			setState(115);
			orders();
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(116);
				expr(0);
				}
				break;
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

	public static class OrdersContext extends ParserRuleContext {
		public List<OrderContext> order() {
			return getRuleContexts(OrderContext.class);
		}
		public OrderContext order(int i) {
			return getRuleContext(OrderContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RaParser.COMMA, i);
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
		enterRule(_localctx, 12, RULE_orders);
		try {
			int _alt;
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				order();
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(120);
						match(COMMA);
						setState(121);
						order();
						}
						} 
					}
					setState(126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
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
		enterRule(_localctx, 14, RULE_order);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			attribute();
			setState(131);
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
		public TerminalNode ASC() { return getToken(RaParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(RaParser.DESC, 0); }
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
		enterRule(_localctx, 16, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
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
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RaParser.COMMA, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
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
		enterRule(_localctx, 18, RULE_attributes);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				attribute();
				setState(137);
				match(COMMA);
				setState(138);
				attributes();
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
		enterRule(_localctx, 20, RULE_attribute);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
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
		public TerminalNode PERIOD() { return getToken(RaParser.PERIOD, 0); }
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
		enterRule(_localctx, 22, RULE_fullvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(STRING);
			setState(147);
			match(PERIOD);
			setState(148);
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

	public static class RenameAttrsContext extends ParserRuleContext {
		public RenameAttrContext renameAttr() {
			return getRuleContext(RenameAttrContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RaParser.COMMA, 0); }
		public RenameAttrsContext renameAttrs() {
			return getRuleContext(RenameAttrsContext.class,0);
		}
		public RenameAttrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameAttrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).enterRenameAttrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RaListener ) ((RaListener)listener).exitRenameAttrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RaVisitor ) return ((RaVisitor<? extends T>)visitor).visitRenameAttrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameAttrsContext renameAttrs() throws RecognitionException {
		RenameAttrsContext _localctx = new RenameAttrsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_renameAttrs);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				renameAttr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				renameAttr();
				setState(152);
				match(COMMA);
				setState(153);
				renameAttrs();
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
		enterRule(_localctx, 26, RULE_renameAttr);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(STRING);
				setState(159);
				match(RENAME_ATTR);
				setState(160);
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
		enterRule(_localctx, 28, RULE_conditions);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				condition();
				setState(165);
				logicalOps();
				setState(166);
				conditions();
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
		enterRule(_localctx, 30, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			compared();
			setState(171);
			comp();
			setState(172);
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
		public TerminalNode AND() { return getToken(RaParser.AND, 0); }
		public TerminalNode OR() { return getToken(RaParser.OR, 0); }
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
		enterRule(_localctx, 32, RULE_logicalOps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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
		enterRule(_localctx, 34, RULE_compared);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
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
		enterRule(_localctx, 36, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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
		enterRule(_localctx, 38, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00bb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\5\2\61\n\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2?\n\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2T\n\2"+
		"\r\2\16\2U\7\2X\n\2\f\2\16\2[\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5l\n\5\3\6\3\6\3\6\3\6\3\6\5\6s\n\6\3\7\3\7"+
		"\3\7\5\7x\n\7\3\b\3\b\3\b\7\b}\n\b\f\b\16\b\u0080\13\b\3\b\5\b\u0083\n"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u008f\n\13\3\f\3"+
		"\f\5\f\u0093\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u009e\n"+
		"\16\3\17\3\17\3\17\3\17\5\17\u00a4\n\17\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00ab\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\5\23\u00b5\n\23\3"+
		"\24\3\24\3\25\3\25\3\25\2\3\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(\2\6\3\2\5\6\3\2\3\4\3\2\25\32\3\2\33\34\2\u00bf\2\60\3\2\2\2\4"+
		"\\\3\2\2\2\6`\3\2\2\2\bk\3\2\2\2\nr\3\2\2\2\ft\3\2\2\2\16\u0082\3\2\2"+
		"\2\20\u0084\3\2\2\2\22\u0087\3\2\2\2\24\u008e\3\2\2\2\26\u0092\3\2\2\2"+
		"\30\u0094\3\2\2\2\32\u009d\3\2\2\2\34\u00a3\3\2\2\2\36\u00aa\3\2\2\2 "+
		"\u00ac\3\2\2\2\"\u00b0\3\2\2\2$\u00b4\3\2\2\2&\u00b6\3\2\2\2(\u00b8\3"+
		"\2\2\2*+\b\2\1\2+\61\5\4\3\2,\61\5\6\4\2-\61\5\b\5\2.\61\5\f\7\2/\61\5"+
		"\n\6\2\60*\3\2\2\2\60,\3\2\2\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61"+
		"Y\3\2\2\2\62\63\f\17\2\2\63\64\7\f\2\2\64X\5\2\2\20\65\66\f\16\2\2\66"+
		"\67\7\13\2\2\67X\5\2\2\1789\f\r\2\29:\7\r\2\2:X\5\2\2\16;<\f\f\2\2<>\7"+
		"\17\2\2=?\5 \21\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@X\5\2\2\rAB\f\13\2\2B"+
		"C\7\20\2\2CD\5 \21\2DE\5\2\2\fEX\3\2\2\2FG\f\n\2\2GH\7\21\2\2HI\5 \21"+
		"\2IJ\5\2\2\13JX\3\2\2\2KL\f\t\2\2LM\7\22\2\2MN\5 \21\2NO\5\2\2\nOX\3\2"+
		"\2\2PS\f\b\2\2QR\7\16\2\2RT\5\2\2\2SQ\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3"+
		"\2\2\2VX\3\2\2\2W\62\3\2\2\2W\65\3\2\2\2W8\3\2\2\2W;\3\2\2\2WA\3\2\2\2"+
		"WF\3\2\2\2WK\3\2\2\2WP\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\3\3\2\2"+
		"\2[Y\3\2\2\2\\]\7\b\2\2]^\5\36\20\2^_\5\2\2\2_\5\3\2\2\2`a\7\7\2\2ab\5"+
		"\24\13\2bc\5\2\2\2c\7\3\2\2\2de\7\t\2\2ef\7\33\2\2fl\5\2\2\2gh\7\t\2\2"+
		"hi\5\32\16\2ij\5\2\2\2jl\3\2\2\2kd\3\2\2\2kg\3\2\2\2l\t\3\2\2\2mn\7\37"+
		"\2\2no\5\2\2\2op\7 \2\2ps\3\2\2\2qs\7\33\2\2rm\3\2\2\2rq\3\2\2\2s\13\3"+
		"\2\2\2tu\7\23\2\2uw\5\16\b\2vx\5\2\2\2wv\3\2\2\2wx\3\2\2\2x\r\3\2\2\2"+
		"y~\5\20\t\2z{\7\36\2\2{}\5\20\t\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~"+
		"\177\3\2\2\2\177\u0083\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\5\20\t\2\u0082"+
		"y\3\2\2\2\u0082\u0081\3\2\2\2\u0083\17\3\2\2\2\u0084\u0085\5\26\f\2\u0085"+
		"\u0086\5\22\n\2\u0086\21\3\2\2\2\u0087\u0088\t\2\2\2\u0088\23\3\2\2\2"+
		"\u0089\u008f\5\26\f\2\u008a\u008b\5\26\f\2\u008b\u008c\7\36\2\2\u008c"+
		"\u008d\5\24\13\2\u008d\u008f\3\2\2\2\u008e\u0089\3\2\2\2\u008e\u008a\3"+
		"\2\2\2\u008f\25\3\2\2\2\u0090\u0093\7\33\2\2\u0091\u0093\5\30\r\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\27\3\2\2\2\u0094\u0095\7\33\2"+
		"\2\u0095\u0096\7\35\2\2\u0096\u0097\7\33\2\2\u0097\31\3\2\2\2\u0098\u009e"+
		"\5\34\17\2\u0099\u009a\5\34\17\2\u009a\u009b\7\36\2\2\u009b\u009c\5\32"+
		"\16\2\u009c\u009e\3\2\2\2\u009d\u0098\3\2\2\2\u009d\u0099\3\2\2\2\u009e"+
		"\33\3\2\2\2\u009f\u00a4\7\33\2\2\u00a0\u00a1\7\33\2\2\u00a1\u00a2\7\n"+
		"\2\2\u00a2\u00a4\5\26\f\2\u00a3\u009f\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4"+
		"\35\3\2\2\2\u00a5\u00ab\5 \21\2\u00a6\u00a7\5 \21\2\u00a7\u00a8\5\"\22"+
		"\2\u00a8\u00a9\5\36\20\2\u00a9\u00ab\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa"+
		"\u00a6\3\2\2\2\u00ab\37\3\2\2\2\u00ac\u00ad\5$\23\2\u00ad\u00ae\5&\24"+
		"\2\u00ae\u00af\5$\23\2\u00af!\3\2\2\2\u00b0\u00b1\t\3\2\2\u00b1#\3\2\2"+
		"\2\u00b2\u00b5\5\26\f\2\u00b3\u00b5\5(\25\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5%\3\2\2\2\u00b6\u00b7\t\4\2\2\u00b7\'\3\2\2\2\u00b8"+
		"\u00b9\t\5\2\2\u00b9)\3\2\2\2\22\60>UWYkrw~\u0082\u008e\u0092\u009d\u00a3"+
		"\u00aa\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}