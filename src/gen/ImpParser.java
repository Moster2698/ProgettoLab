// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ImpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAT=1, BOOL=2, PLUS=3, MINUS=4, MUL=5, DIV=6, MOD=7, POW=8, AND=9, OR=10, 
		EQQ=11, NEQ=12, LEQ=13, GEQ=14, LT=15, GT=16, NOT=17, IF=18, THEN=19, 
		ELSE=20, WHILE=21, SKIPP=22, ASSIGN=23, OUT=24, FUN=25, RETURN=26, GLOBAL=27, 
		LPAR=28, RPAR=29, LBRACE=30, RBRACE=31, COMMA=32, SEMICOLON=33, DOTG=34, 
		ND=35, ID=36, WS=37;
	public static final int
		RULE_prog = 0, RULE_fun = 1, RULE_com = 2, RULE_exp = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "fun", "com", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'mod'", "'^'", "'&'", 
			"'|'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'!'", "'if'", "'then'", 
			"'else'", "'while'", "'skip'", "'='", "'out'", "'fun'", "'return'", "'global'", 
			"'('", "')'", "'{'", "'}'", "','", "';'", "'.g'", "'nd'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NAT", "BOOL", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "AND", 
			"OR", "EQQ", "NEQ", "LEQ", "GEQ", "LT", "GT", "NOT", "IF", "THEN", "ELSE", 
			"WHILE", "SKIPP", "ASSIGN", "OUT", "FUN", "RETURN", "GLOBAL", "LPAR", 
			"RPAR", "LBRACE", "RBRACE", "COMMA", "SEMICOLON", "DOTG", "ND", "ID", 
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ImpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ImpParser.EOF, 0); }
		public List<FunContext> fun() {
			return getRuleContexts(FunContext.class);
		}
		public FunContext fun(int i) {
			return getRuleContext(FunContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUN) {
				{
				{
				setState(8);
				fun();
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(14);
			com(0);
			setState(15);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(ImpParser.FUN, 0); }
		public List<TerminalNode> ID() { return getTokens(ImpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ImpParser.ID, i);
		}
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(ImpParser.LBRACE, 0); }
		public TerminalNode RETURN() { return getToken(ImpParser.RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ImpParser.RBRACE, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ImpParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ImpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImpParser.COMMA, i);
		}
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(FUN);
			setState(18);
			match(ID);
			setState(19);
			match(LPAR);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(20);
				match(ID);
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(21);
					match(COMMA);
					setState(22);
					match(ID);
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			match(RPAR);
			setState(34);
			match(LBRACE);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 69950767104L) != 0) {
				{
				setState(35);
				com(0);
				setState(36);
				match(SEMICOLON);
				}
			}

			setState(40);
			match(RETURN);
			setState(41);
			exp(0);
			setState(42);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
	 
		public ComContext() { }
		public void copyFrom(ComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalAssignContext extends ComContext {
		public TerminalNode GLOBAL() { return getToken(ImpParser.GLOBAL, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ImpParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public GlobalAssignContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterGlobalAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitGlobalAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitGlobalAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NdContext extends ComContext {
		public List<TerminalNode> LBRACE() { return getTokens(ImpParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(ImpParser.LBRACE, i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(ImpParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ImpParser.RBRACE, i);
		}
		public TerminalNode ND() { return getToken(ImpParser.ND, 0); }
		public NdContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterNd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitNd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitNd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipContext extends ComContext {
		public TerminalNode SKIPP() { return getToken(ImpParser.SKIPP, 0); }
		public SkipContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ComContext {
		public TerminalNode WHILE() { return getToken(ImpParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(ImpParser.LBRACE, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ImpParser.RBRACE, 0); }
		public WhileContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ComContext {
		public TerminalNode IF() { return getToken(ImpParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public TerminalNode THEN() { return getToken(ImpParser.THEN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(ImpParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(ImpParser.LBRACE, i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(ImpParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ImpParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(ImpParser.ELSE, 0); }
		public IfContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SeqContext extends ComContext {
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(ImpParser.SEMICOLON, 0); }
		public SeqContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitSeq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ComContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ImpParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutContext extends ComContext {
		public TerminalNode OUT() { return getToken(ImpParser.OUT, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public OutContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		return com(0);
	}

	private ComContext com(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComContext _localctx = new ComContext(_ctx, _parentState);
		ComContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_com, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(45);
				match(IF);
				setState(46);
				match(LPAR);
				setState(47);
				exp(0);
				setState(48);
				match(RPAR);
				setState(49);
				match(THEN);
				setState(50);
				match(LBRACE);
				setState(51);
				com(0);
				setState(52);
				match(RBRACE);
				setState(53);
				match(ELSE);
				setState(54);
				match(LBRACE);
				setState(55);
				com(0);
				setState(56);
				match(RBRACE);
				}
				break;
			case ID:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(ID);
				setState(59);
				match(ASSIGN);
				setState(60);
				exp(0);
				}
				break;
			case GLOBAL:
				{
				_localctx = new GlobalAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(GLOBAL);
				setState(62);
				match(ID);
				setState(63);
				match(ASSIGN);
				setState(64);
				exp(0);
				}
				break;
			case SKIPP:
				{
				_localctx = new SkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(SKIPP);
				}
				break;
			case WHILE:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(WHILE);
				setState(67);
				match(LPAR);
				setState(68);
				exp(0);
				setState(69);
				match(RPAR);
				setState(70);
				match(LBRACE);
				setState(71);
				com(0);
				setState(72);
				match(RBRACE);
				}
				break;
			case OUT:
				{
				_localctx = new OutContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(OUT);
				setState(75);
				match(LPAR);
				setState(76);
				exp(0);
				setState(77);
				match(RPAR);
				}
				break;
			case LBRACE:
				{
				_localctx = new NdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(LBRACE);
				setState(80);
				com(0);
				setState(81);
				match(RBRACE);
				setState(82);
				match(ND);
				setState(83);
				match(LBRACE);
				setState(84);
				com(0);
				setState(85);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SeqContext(new ComContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_com);
					setState(89);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(90);
					match(SEMICOLON);
					setState(91);
					com(5);
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NatContext extends ExpContext {
		public TerminalNode NAT() { return getToken(ImpParser.NAT, 0); }
		public NatContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterNat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitNat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitNat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusMinusContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ImpParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ImpParser.MINUS, 0); }
		public PlusMinusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ExpContext {
		public TerminalNode BOOL() { return getToken(ImpParser.BOOL, 0); }
		public BoolContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalIDContext extends ExpContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode DOTG() { return getToken(ImpParser.DOTG, 0); }
		public GlobalIDContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterGlobalID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitGlobalID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitGlobalID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivMulModContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DIV() { return getToken(ImpParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(ImpParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(ImpParser.MOD, 0); }
		public DivMulModContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterDivMulMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitDivMulMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitDivMulMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ExpContext {
		public TerminalNode NOT() { return getToken(ImpParser.NOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQQ() { return getToken(ImpParser.EQQ, 0); }
		public TerminalNode NEQ() { return getToken(ImpParser.NEQ, 0); }
		public EqExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitEqExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitEqExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CmpExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LT() { return getToken(ImpParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(ImpParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(ImpParser.GEQ, 0); }
		public TerminalNode GT() { return getToken(ImpParser.GT, 0); }
		public CmpExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterCmpExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitCmpExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitCmpExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(ImpParser.AND, 0); }
		public TerminalNode OR() { return getToken(ImpParser.OR, 0); }
		public LogicExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterLogicExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitLogicExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitLogicExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParExpContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public ParExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterParExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitParExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitParExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ExpContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(ImpParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ImpParser.RPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ImpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImpParser.COMMA, i);
		}
		public FunctionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode POW() { return getToken(ImpParser.POW, 0); }
		public PowContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public IdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new NatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(98);
				match(NAT);
				}
				break;
			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(BOOL);
				}
				break;
			case 3:
				{
				_localctx = new FunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(ID);
				setState(101);
				match(LPAR);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 68988043270L) != 0) {
					{
					setState(102);
					exp(0);
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(103);
						match(COMMA);
						setState(104);
						exp(0);
						}
						}
						setState(109);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(112);
				match(RPAR);
				}
				break;
			case 4:
				{
				_localctx = new ParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(LPAR);
				setState(114);
				exp(0);
				setState(115);
				match(RPAR);
				}
				break;
			case 5:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(NOT);
				setState(118);
				exp(8);
				}
				break;
			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new GlobalIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(ID);
				setState(121);
				match(DOTG);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(124);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(125);
						match(POW);
						setState(126);
						exp(9);
						}
						break;
					case 2:
						{
						_localctx = new DivMulModContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(127);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(128);
						((DivMulModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0) ) {
							((DivMulModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(129);
						exp(8);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(130);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(131);
						((PlusMinusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(132);
						exp(7);
						}
						break;
					case 4:
						{
						_localctx = new CmpExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(133);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(134);
						((CmpExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 122880L) != 0) ) {
							((CmpExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(135);
						exp(6);
						}
						break;
					case 5:
						{
						_localctx = new EqExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(136);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(137);
						((EqExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQQ || _la==NEQ) ) {
							((EqExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(138);
						exp(5);
						}
						break;
					case 6:
						{
						_localctx = new LogicExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(139);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(140);
						((LogicExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((LogicExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(141);
						exp(4);
						}
						break;
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return com_sempred((ComContext)_localctx, predIndex);
		case 3:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean com_sempred(ComContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u0094\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0005\u0000\n\b"+
		"\u0000\n\u0000\f\u0000\r\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u0018\b\u0001\n\u0001\f\u0001\u001b\t\u0001\u0005\u0001\u001d\b"+
		"\u0001\n\u0001\f\u0001 \t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\'\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002X\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002]\b\u0002\n\u0002\f\u0002`\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003j\b\u0003\n\u0003\f\u0003m\t\u0003\u0003"+
		"\u0003o\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003{\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u008f\b\u0003\n\u0003\f\u0003\u0092\t\u0003"+
		"\u0001\u0003\u0000\u0002\u0004\u0006\u0004\u0000\u0002\u0004\u0006\u0000"+
		"\u0005\u0001\u0000\u0005\u0007\u0001\u0000\u0003\u0004\u0001\u0000\r\u0010"+
		"\u0001\u0000\u000b\f\u0001\u0000\t\n\u00a8\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0002\u0011\u0001\u0000\u0000\u0000\u0004W\u0001\u0000\u0000\u0000"+
		"\u0006z\u0001\u0000\u0000\u0000\b\n\u0003\u0002\u0001\u0000\t\b\u0001"+
		"\u0000\u0000\u0000\n\r\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000"+
		"\u0000\u000b\f\u0001\u0000\u0000\u0000\f\u000e\u0001\u0000\u0000\u0000"+
		"\r\u000b\u0001\u0000\u0000\u0000\u000e\u000f\u0003\u0004\u0002\u0000\u000f"+
		"\u0010\u0005\u0000\u0000\u0001\u0010\u0001\u0001\u0000\u0000\u0000\u0011"+
		"\u0012\u0005\u0019\u0000\u0000\u0012\u0013\u0005$\u0000\u0000\u0013\u001e"+
		"\u0005\u001c\u0000\u0000\u0014\u0019\u0005$\u0000\u0000\u0015\u0016\u0005"+
		" \u0000\u0000\u0016\u0018\u0005$\u0000\u0000\u0017\u0015\u0001\u0000\u0000"+
		"\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000"+
		"\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u0014\u0001\u0000\u0000"+
		"\u0000\u001d \u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0001\u0000\u0000\u0000\u001f!\u0001\u0000\u0000\u0000 \u001e"+
		"\u0001\u0000\u0000\u0000!\"\u0005\u001d\u0000\u0000\"&\u0005\u001e\u0000"+
		"\u0000#$\u0003\u0004\u0002\u0000$%\u0005!\u0000\u0000%\'\u0001\u0000\u0000"+
		"\u0000&#\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000()\u0005\u001a\u0000\u0000)*\u0003\u0006\u0003\u0000*+\u0005"+
		"\u001f\u0000\u0000+\u0003\u0001\u0000\u0000\u0000,-\u0006\u0002\uffff"+
		"\uffff\u0000-.\u0005\u0012\u0000\u0000./\u0005\u001c\u0000\u0000/0\u0003"+
		"\u0006\u0003\u000001\u0005\u001d\u0000\u000012\u0005\u0013\u0000\u0000"+
		"23\u0005\u001e\u0000\u000034\u0003\u0004\u0002\u000045\u0005\u001f\u0000"+
		"\u000056\u0005\u0014\u0000\u000067\u0005\u001e\u0000\u000078\u0003\u0004"+
		"\u0002\u000089\u0005\u001f\u0000\u00009X\u0001\u0000\u0000\u0000:;\u0005"+
		"$\u0000\u0000;<\u0005\u0017\u0000\u0000<X\u0003\u0006\u0003\u0000=>\u0005"+
		"\u001b\u0000\u0000>?\u0005$\u0000\u0000?@\u0005\u0017\u0000\u0000@X\u0003"+
		"\u0006\u0003\u0000AX\u0005\u0016\u0000\u0000BC\u0005\u0015\u0000\u0000"+
		"CD\u0005\u001c\u0000\u0000DE\u0003\u0006\u0003\u0000EF\u0005\u001d\u0000"+
		"\u0000FG\u0005\u001e\u0000\u0000GH\u0003\u0004\u0002\u0000HI\u0005\u001f"+
		"\u0000\u0000IX\u0001\u0000\u0000\u0000JK\u0005\u0018\u0000\u0000KL\u0005"+
		"\u001c\u0000\u0000LM\u0003\u0006\u0003\u0000MN\u0005\u001d\u0000\u0000"+
		"NX\u0001\u0000\u0000\u0000OP\u0005\u001e\u0000\u0000PQ\u0003\u0004\u0002"+
		"\u0000QR\u0005\u001f\u0000\u0000RS\u0005#\u0000\u0000ST\u0005\u001e\u0000"+
		"\u0000TU\u0003\u0004\u0002\u0000UV\u0005\u001f\u0000\u0000VX\u0001\u0000"+
		"\u0000\u0000W,\u0001\u0000\u0000\u0000W:\u0001\u0000\u0000\u0000W=\u0001"+
		"\u0000\u0000\u0000WA\u0001\u0000\u0000\u0000WB\u0001\u0000\u0000\u0000"+
		"WJ\u0001\u0000\u0000\u0000WO\u0001\u0000\u0000\u0000X^\u0001\u0000\u0000"+
		"\u0000YZ\n\u0004\u0000\u0000Z[\u0005!\u0000\u0000[]\u0003\u0004\u0002"+
		"\u0005\\Y\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0005\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000ab\u0006\u0003\uffff\uffff\u0000b{\u0005\u0001"+
		"\u0000\u0000c{\u0005\u0002\u0000\u0000de\u0005$\u0000\u0000en\u0005\u001c"+
		"\u0000\u0000fk\u0003\u0006\u0003\u0000gh\u0005 \u0000\u0000hj\u0003\u0006"+
		"\u0003\u0000ig\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000nf\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000p{\u0005\u001d\u0000\u0000qr\u0005\u001c"+
		"\u0000\u0000rs\u0003\u0006\u0003\u0000st\u0005\u001d\u0000\u0000t{\u0001"+
		"\u0000\u0000\u0000uv\u0005\u0011\u0000\u0000v{\u0003\u0006\u0003\bw{\u0005"+
		"$\u0000\u0000xy\u0005$\u0000\u0000y{\u0005\"\u0000\u0000za\u0001\u0000"+
		"\u0000\u0000zc\u0001\u0000\u0000\u0000zd\u0001\u0000\u0000\u0000zq\u0001"+
		"\u0000\u0000\u0000zu\u0001\u0000\u0000\u0000zw\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000{\u0090\u0001\u0000\u0000\u0000|}\n\t\u0000"+
		"\u0000}~\u0005\b\u0000\u0000~\u008f\u0003\u0006\u0003\t\u007f\u0080\n"+
		"\u0007\u0000\u0000\u0080\u0081\u0007\u0000\u0000\u0000\u0081\u008f\u0003"+
		"\u0006\u0003\b\u0082\u0083\n\u0006\u0000\u0000\u0083\u0084\u0007\u0001"+
		"\u0000\u0000\u0084\u008f\u0003\u0006\u0003\u0007\u0085\u0086\n\u0005\u0000"+
		"\u0000\u0086\u0087\u0007\u0002\u0000\u0000\u0087\u008f\u0003\u0006\u0003"+
		"\u0006\u0088\u0089\n\u0004\u0000\u0000\u0089\u008a\u0007\u0003\u0000\u0000"+
		"\u008a\u008f\u0003\u0006\u0003\u0005\u008b\u008c\n\u0003\u0000\u0000\u008c"+
		"\u008d\u0007\u0004\u0000\u0000\u008d\u008f\u0003\u0006\u0003\u0004\u008e"+
		"|\u0001\u0000\u0000\u0000\u008e\u007f\u0001\u0000\u0000\u0000\u008e\u0082"+
		"\u0001\u0000\u0000\u0000\u008e\u0085\u0001\u0000\u0000\u0000\u008e\u0088"+
		"\u0001\u0000\u0000\u0000\u008e\u008b\u0001\u0000\u0000\u0000\u008f\u0092"+
		"\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091\u0007\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u000b\u000b\u0019\u001e&W^knz\u008e\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}