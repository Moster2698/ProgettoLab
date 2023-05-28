// Generated from /Users/alessio/Code/HaveFunProject/src/Imp.g4 by ANTLR 4.12.0
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
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAT=1, BOOL=2, PLUS=3, MINUS=4, MUL=5, DIV=6, MOD=7, POW=8, AND=9, OR=10, 
		EQQ=11, NEQ=12, LEQ=13, GEQ=14, LT=15, GT=16, NOT=17, IF=18, THEN=19, 
		ELSE=20, WHILE=21, SKIPP=22, ASSIGN=23, OUT=24, FUN=25, RETURN=26, GLOBAL=27, 
		LPAR=28, RPAR=29, LBRACE=30, RBRACE=31, COMMA=32, SEMICOLON=33, DOTG=34, 
		ND=35, DOLLAR=36, ID=37, WS=38, STARTMAIN=39, ENDMAIN=40, AT=41, TRUE=42, 
		FALSE=43, PLUSOPERATOR=44, MINUSOPERATOR=45, MULTIPLICATIONOPERATOR=46, 
		DIVISIONOPERATOR=47, EQUALTO=48, GREATERTHAN=49, PRINT=50, DECLARE=51, 
		SETINITIALVALUE=52, ASSIGNVARIABLE=53, SETVALUE=54, ENDASSIGNVARIABLE=55, 
		ENDIF=56, ENDWHILE=57, STRING=58, FLOAT=59;
	public static final int
		RULE_prog = 0, RULE_fun = 1, RULE_com = 2, RULE_exp = 3, RULE_program = 4, 
		RULE_arnoldIni = 5, RULE_arnoldCom = 6, RULE_expression = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "fun", "com", "exp", "program", "arnoldIni", "arnoldCom", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'mod'", "'^'", "'&'", 
			"'|'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'!'", "'if'", "'then'", 
			"'else'", "'while'", "'skip'", "'='", "'out'", "'fun'", "'return'", "'global'", 
			"'('", "')'", "'{'", "'}'", "','", "';'", "'.g'", "'nd'", "'$'", null, 
			null, "'IT'S SHOWTIME'", "'YOU HAVE BEEN TERMINATED'", "'@'", "'NO PROBLEMO'", 
			"'I LIED'", "'GET UP'", "'GET DOWN'", "'YOU'RE FIRED'", "'HE HAD TO SPLIT'", 
			"'YOU ARE NOT YOU YOU ARE ME'", "'LET OFF SOME STEAM BENNET'", "'TALK TO THE HAND'", 
			"'HEY CHRISTMAS TREE'", "'YOU SET US UP'", "'GET TO THE CHOPPER'", "'HERE IS MY INVITATION'", 
			"'ENOUGH TALK'", "'YOU HAVE NO RESPECT FOR LOGIC'", "'CHILL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NAT", "BOOL", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "AND", 
			"OR", "EQQ", "NEQ", "LEQ", "GEQ", "LT", "GT", "NOT", "IF", "THEN", "ELSE", 
			"WHILE", "SKIPP", "ASSIGN", "OUT", "FUN", "RETURN", "GLOBAL", "LPAR", 
			"RPAR", "LBRACE", "RBRACE", "COMMA", "SEMICOLON", "DOTG", "ND", "DOLLAR", 
			"ID", "WS", "STARTMAIN", "ENDMAIN", "AT", "TRUE", "FALSE", "PLUSOPERATOR", 
			"MINUSOPERATOR", "MULTIPLICATIONOPERATOR", "DIVISIONOPERATOR", "EQUALTO", 
			"GREATERTHAN", "PRINT", "DECLARE", "SETINITIALVALUE", "ASSIGNVARIABLE", 
			"SETVALUE", "ENDASSIGNVARIABLE", "ENDIF", "ENDWHILE", "STRING", "FLOAT"
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
	public String getGrammarFileName() { return "Imp.g4"; }

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
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUN) {
				{
				{
				setState(16);
				fun();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
			com(0);
			setState(23);
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
			setState(25);
			match(FUN);
			setState(26);
			match(ID);
			setState(27);
			match(LPAR);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(28);
				match(ID);
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(29);
					match(COMMA);
					setState(30);
					match(ID);
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			match(RPAR);
			setState(42);
			match(LBRACE);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 207389720576L) != 0)) {
				{
				setState(43);
				com(0);
				setState(44);
				match(SEMICOLON);
				}
			}

			setState(48);
			match(RETURN);
			setState(49);
			exp(0);
			setState(50);
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
	public static class ArnoldInitContext extends ComContext {
		public List<TerminalNode> DOLLAR() { return getTokens(ImpParser.DOLLAR); }
		public TerminalNode DOLLAR(int i) {
			return getToken(ImpParser.DOLLAR, i);
		}
		public TerminalNode LBRACE() { return getToken(ImpParser.LBRACE, 0); }
		public ArnoldIniContext arnoldIni() {
			return getRuleContext(ArnoldIniContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ImpParser.RBRACE, 0); }
		public ArnoldInitContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterArnoldInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitArnoldInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldInit(this);
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
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(53);
				match(IF);
				setState(54);
				match(LPAR);
				setState(55);
				exp(0);
				setState(56);
				match(RPAR);
				setState(57);
				match(THEN);
				setState(58);
				match(LBRACE);
				setState(59);
				com(0);
				setState(60);
				match(RBRACE);
				setState(61);
				match(ELSE);
				setState(62);
				match(LBRACE);
				setState(63);
				com(0);
				setState(64);
				match(RBRACE);
				}
				break;
			case ID:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(ID);
				setState(67);
				match(ASSIGN);
				setState(68);
				exp(0);
				}
				break;
			case GLOBAL:
				{
				_localctx = new GlobalAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(GLOBAL);
				setState(70);
				match(ID);
				setState(71);
				match(ASSIGN);
				setState(72);
				exp(0);
				}
				break;
			case SKIPP:
				{
				_localctx = new SkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(SKIPP);
				}
				break;
			case WHILE:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(WHILE);
				setState(75);
				match(LPAR);
				setState(76);
				exp(0);
				setState(77);
				match(RPAR);
				setState(78);
				match(LBRACE);
				setState(79);
				com(0);
				setState(80);
				match(RBRACE);
				}
				break;
			case OUT:
				{
				_localctx = new OutContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(OUT);
				setState(83);
				match(LPAR);
				setState(84);
				exp(0);
				setState(85);
				match(RPAR);
				}
				break;
			case LBRACE:
				{
				_localctx = new NdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(LBRACE);
				setState(88);
				com(0);
				setState(89);
				match(RBRACE);
				setState(90);
				match(ND);
				setState(91);
				match(LBRACE);
				setState(92);
				com(0);
				setState(93);
				match(RBRACE);
				}
				break;
			case DOLLAR:
				{
				_localctx = new ArnoldInitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(DOLLAR);
				setState(96);
				match(LBRACE);
				setState(97);
				arnoldIni();
				setState(98);
				match(RBRACE);
				setState(99);
				match(DOLLAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
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
					setState(103);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(104);
					match(SEMICOLON);
					setState(105);
					com(6);
					}
					} 
				}
				setState(110);
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new NatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(112);
				match(NAT);
				}
				break;
			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(BOOL);
				}
				break;
			case 3:
				{
				_localctx = new FunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(ID);
				setState(115);
				match(LPAR);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137707520006L) != 0)) {
					{
					setState(116);
					exp(0);
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(117);
						match(COMMA);
						setState(118);
						exp(0);
						}
						}
						setState(123);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(126);
				match(RPAR);
				}
				break;
			case 4:
				{
				_localctx = new ParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(LPAR);
				setState(128);
				exp(0);
				setState(129);
				match(RPAR);
				}
				break;
			case 5:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(NOT);
				setState(132);
				exp(8);
				}
				break;
			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new GlobalIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				match(ID);
				setState(135);
				match(DOTG);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(156);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(138);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(139);
						match(POW);
						setState(140);
						exp(9);
						}
						break;
					case 2:
						{
						_localctx = new DivMulModContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(141);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(142);
						((DivMulModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
							((DivMulModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						exp(8);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(144);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(145);
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
						setState(146);
						exp(7);
						}
						break;
					case 4:
						{
						_localctx = new CmpExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(147);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(148);
						((CmpExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 122880L) != 0)) ) {
							((CmpExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(149);
						exp(6);
						}
						break;
					case 5:
						{
						_localctx = new EqExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(150);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(151);
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
						setState(152);
						exp(5);
						}
						break;
					case 6:
						{
						_localctx = new LogicExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(153);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(154);
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
						setState(155);
						exp(4);
						}
						break;
					}
					} 
				}
				setState(160);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ArnoldIniContext arnoldIni() {
			return getRuleContext(ArnoldIniContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			arnoldIni();
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
	public static class ArnoldIniContext extends ParserRuleContext {
		public TerminalNode STARTMAIN() { return getToken(ImpParser.STARTMAIN, 0); }
		public TerminalNode ENDMAIN() { return getToken(ImpParser.ENDMAIN, 0); }
		public List<ArnoldComContext> arnoldCom() {
			return getRuleContexts(ArnoldComContext.class);
		}
		public ArnoldComContext arnoldCom(int i) {
			return getRuleContext(ArnoldComContext.class,i);
		}
		public ArnoldIniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arnoldIni; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterArnoldIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitArnoldIni(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldIni(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArnoldIniContext arnoldIni() throws RecognitionException {
		ArnoldIniContext _localctx = new ArnoldIniContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arnoldIni);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(STARTMAIN);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12384898977628160L) != 0)) {
				{
				{
				setState(164);
				arnoldCom();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(ENDMAIN);
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
	public static class ArnoldComContext extends ParserRuleContext {
		public ArnoldComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arnoldCom; }
	 
		public ArnoldComContext() { }
		public void copyFrom(ArnoldComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldIfElseContext extends ArnoldComContext {
		public TerminalNode IF() { return getToken(ImpParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ArnoldComContext> arnoldCom() {
			return getRuleContexts(ArnoldComContext.class);
		}
		public ArnoldComContext arnoldCom(int i) {
			return getRuleContext(ArnoldComContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ImpParser.ELSE, 0); }
		public TerminalNode ENDIF() { return getToken(ImpParser.ENDIF, 0); }
		public ArnoldIfElseContext(ArnoldComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterArnoldIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitArnoldIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldIfElse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldWhileContext extends ArnoldComContext {
		public TerminalNode WHILE() { return getToken(ImpParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ENDWHILE() { return getToken(ImpParser.ENDWHILE, 0); }
		public List<ArnoldComContext> arnoldCom() {
			return getRuleContexts(ArnoldComContext.class);
		}
		public ArnoldComContext arnoldCom(int i) {
			return getRuleContext(ArnoldComContext.class,i);
		}
		public ArnoldWhileContext(ArnoldComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterArnoldWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitArnoldWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldPrintExpContext extends ArnoldComContext {
		public TerminalNode PRINT() { return getToken(ImpParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArnoldPrintExpContext(ArnoldComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterArnoldPrintExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitArnoldPrintExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldPrintExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldDeclareContext extends ArnoldComContext {
		public TerminalNode DECLARE() { return getToken(ImpParser.DECLARE, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode SETINITIALVALUE() { return getToken(ImpParser.SETINITIALVALUE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArnoldDeclareContext(ArnoldComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterArnoldDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitArnoldDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldDeclare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldIfContext extends ArnoldComContext {
		public TerminalNode IF() { return getToken(ImpParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArnoldComContext arnoldCom() {
			return getRuleContext(ArnoldComContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(ImpParser.ENDIF, 0); }
		public ArnoldIfContext(ArnoldComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterArnoldIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitArnoldIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldAssignContext extends ArnoldComContext {
		public TerminalNode ASSIGNVARIABLE() { return getToken(ImpParser.ASSIGNVARIABLE, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode SETVALUE() { return getToken(ImpParser.SETVALUE, 0); }
		public TerminalNode ENDASSIGNVARIABLE() { return getToken(ImpParser.ENDASSIGNVARIABLE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArnoldAssignContext(ArnoldComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterArnoldAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitArnoldAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArnoldComContext arnoldCom() throws RecognitionException {
		ArnoldComContext _localctx = new ArnoldComContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arnoldCom);
		int _la;
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ArnoldIfElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(IF);
				setState(173);
				expression();
				setState(174);
				arnoldCom();
				setState(175);
				match(ELSE);
				setState(176);
				arnoldCom();
				setState(177);
				match(ENDIF);
				}
				break;
			case 2:
				_localctx = new ArnoldIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(IF);
				setState(180);
				expression();
				setState(181);
				arnoldCom();
				setState(182);
				match(ENDIF);
				}
				break;
			case 3:
				_localctx = new ArnoldWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(WHILE);
				setState(185);
				expression();
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(186);
					arnoldCom();
					}
					}
					setState(189); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 12384898977628160L) != 0) );
				setState(191);
				match(ENDWHILE);
				}
				break;
			case 4:
				_localctx = new ArnoldPrintExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				match(PRINT);
				setState(194);
				expression();
				}
				break;
			case 5:
				_localctx = new ArnoldAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				match(ASSIGNVARIABLE);
				setState(196);
				match(ID);
				setState(197);
				match(SETVALUE);
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(198);
					expression();
					}
					}
					setState(201); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 865801772638144000L) != 0) );
				setState(203);
				match(ENDASSIGNVARIABLE);
				}
				break;
			case 6:
				_localctx = new ArnoldDeclareContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				match(DECLARE);
				setState(206);
				match(ID);
				setState(207);
				match(SETINITIALVALUE);
				setState(208);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldNumberexprContext extends ExpressionContext {
		public TerminalNode FLOAT() { return getToken(ImpParser.FLOAT, 0); }
		public ArnoldNumberexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterArnoldNumberexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitArnoldNumberexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldNumberexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldPlusContext extends ExpressionContext {
		public TerminalNode PLUSOPERATOR() { return getToken(ImpParser.PLUSOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArnoldPlusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterArnoldPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitArnoldPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldStringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(ImpParser.STRING, 0); }
		public ArnoldStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterArnoldString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitArnoldString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldOrContext extends ExpressionContext {
		public TerminalNode OR() { return getToken(ImpParser.OR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArnoldOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterArnoldOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitArnoldOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldGreaterContext extends ExpressionContext {
		public TerminalNode GREATERTHAN() { return getToken(ImpParser.GREATERTHAN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArnoldGreaterContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterArnoldGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitArnoldGreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldGreater(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldAndContext extends ExpressionContext {
		public TerminalNode AND() { return getToken(ImpParser.AND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArnoldAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterArnoldAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitArnoldAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldEqualContext extends ExpressionContext {
		public TerminalNode EQUALTO() { return getToken(ImpParser.EQUALTO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArnoldEqualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterArnoldEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitArnoldEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldIdexprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public ArnoldIdexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterArnoldIdexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitArnoldIdexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldIdexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldDivisionContext extends ExpressionContext {
		public TerminalNode DIVISIONOPERATOR() { return getToken(ImpParser.DIVISIONOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArnoldDivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterArnoldDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitArnoldDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldMultiplicationContext extends ExpressionContext {
		public TerminalNode MULTIPLICATIONOPERATOR() { return getToken(ImpParser.MULTIPLICATIONOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArnoldMultiplicationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterArnoldMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitArnoldMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldBoolExpContext extends ExpressionContext {
		public TerminalNode AT() { return getToken(ImpParser.AT, 0); }
		public TerminalNode BOOL() { return getToken(ImpParser.BOOL, 0); }
		public ArnoldBoolExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterArnoldBoolExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitArnoldBoolExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldBoolExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldMinusContext extends ExpressionContext {
		public TerminalNode MINUSOPERATOR() { return getToken(ImpParser.MINUSOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArnoldMinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).enterArnoldMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImpListener ) ((ImpListener)listener).exitArnoldMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImpVisitor ) return ((ImpVisitor<? extends T>)visitor).visitArnoldMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ArnoldIdexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new ArnoldStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(STRING);
				}
				break;
			case FLOAT:
				_localctx = new ArnoldNumberexprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(FLOAT);
				}
				break;
			case AT:
				_localctx = new ArnoldBoolExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				match(AT);
				setState(215);
				match(BOOL);
				}
				break;
			case PLUSOPERATOR:
				_localctx = new ArnoldPlusContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
				match(PLUSOPERATOR);
				setState(217);
				expression();
				}
				break;
			case MINUSOPERATOR:
				_localctx = new ArnoldMinusContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(218);
				match(MINUSOPERATOR);
				setState(219);
				expression();
				}
				break;
			case MULTIPLICATIONOPERATOR:
				_localctx = new ArnoldMultiplicationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(220);
				match(MULTIPLICATIONOPERATOR);
				setState(221);
				expression();
				}
				break;
			case DIVISIONOPERATOR:
				_localctx = new ArnoldDivisionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(222);
				match(DIVISIONOPERATOR);
				setState(223);
				expression();
				}
				break;
			case EQUALTO:
				_localctx = new ArnoldEqualContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(224);
				match(EQUALTO);
				setState(225);
				expression();
				}
				break;
			case GREATERTHAN:
				_localctx = new ArnoldGreaterContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(226);
				match(GREATERTHAN);
				setState(227);
				expression();
				}
				break;
			case OR:
				_localctx = new ArnoldOrContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(228);
				match(OR);
				setState(229);
				expression();
				}
				break;
			case AND:
				_localctx = new ArnoldAndContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(230);
				match(AND);
				setState(231);
				expression();
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
			return precpred(_ctx, 5);
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
		"\u0004\u0001;\u00eb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001"+
		"\u0005\u0001%\b\u0001\n\u0001\f\u0001(\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002f\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002k\b\u0002\n\u0002\f\u0002"+
		"n\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003x\b\u0003\n\u0003\f\u0003"+
		"{\t\u0003\u0003\u0003}\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u0089\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u009d\b\u0003\n\u0003\f\u0003"+
		"\u00a0\t\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00a6\b\u0005\n\u0005\f\u0005\u00a9\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u00bc\b\u0006\u000b\u0006\f"+
		"\u0006\u00bd\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u00c8\b\u0006\u000b\u0006"+
		"\f\u0006\u00c9\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00d2\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00e9\b\u0007\u0001\u0007\u0000\u0002\u0004\u0006\b\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0000\u0005\u0001\u0000\u0005\u0007\u0001"+
		"\u0000\u0003\u0004\u0001\u0000\r\u0010\u0001\u0000\u000b\f\u0001\u0000"+
		"\t\n\u010f\u0000\u0013\u0001\u0000\u0000\u0000\u0002\u0019\u0001\u0000"+
		"\u0000\u0000\u0004e\u0001\u0000\u0000\u0000\u0006\u0088\u0001\u0000\u0000"+
		"\u0000\b\u00a1\u0001\u0000\u0000\u0000\n\u00a3\u0001\u0000\u0000\u0000"+
		"\f\u00d1\u0001\u0000\u0000\u0000\u000e\u00e8\u0001\u0000\u0000\u0000\u0010"+
		"\u0012\u0003\u0002\u0001\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012"+
		"\u0015\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013"+
		"\u0014\u0001\u0000\u0000\u0000\u0014\u0016\u0001\u0000\u0000\u0000\u0015"+
		"\u0013\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0004\u0002\u0000\u0017"+
		"\u0018\u0005\u0000\u0000\u0001\u0018\u0001\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0005\u0019\u0000\u0000\u001a\u001b\u0005%\u0000\u0000\u001b&\u0005"+
		"\u001c\u0000\u0000\u001c!\u0005%\u0000\u0000\u001d\u001e\u0005 \u0000"+
		"\u0000\u001e \u0005%\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 "+
		"#\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$\u001c"+
		"\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\')\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000)*\u0005\u001d\u0000\u0000*.\u0005\u001e\u0000\u0000+,\u0003"+
		"\u0004\u0002\u0000,-\u0005!\u0000\u0000-/\u0001\u0000\u0000\u0000.+\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"01\u0005\u001a\u0000\u000012\u0003\u0006\u0003\u000023\u0005\u001f\u0000"+
		"\u00003\u0003\u0001\u0000\u0000\u000045\u0006\u0002\uffff\uffff\u0000"+
		"56\u0005\u0012\u0000\u000067\u0005\u001c\u0000\u000078\u0003\u0006\u0003"+
		"\u000089\u0005\u001d\u0000\u00009:\u0005\u0013\u0000\u0000:;\u0005\u001e"+
		"\u0000\u0000;<\u0003\u0004\u0002\u0000<=\u0005\u001f\u0000\u0000=>\u0005"+
		"\u0014\u0000\u0000>?\u0005\u001e\u0000\u0000?@\u0003\u0004\u0002\u0000"+
		"@A\u0005\u001f\u0000\u0000Af\u0001\u0000\u0000\u0000BC\u0005%\u0000\u0000"+
		"CD\u0005\u0017\u0000\u0000Df\u0003\u0006\u0003\u0000EF\u0005\u001b\u0000"+
		"\u0000FG\u0005%\u0000\u0000GH\u0005\u0017\u0000\u0000Hf\u0003\u0006\u0003"+
		"\u0000If\u0005\u0016\u0000\u0000JK\u0005\u0015\u0000\u0000KL\u0005\u001c"+
		"\u0000\u0000LM\u0003\u0006\u0003\u0000MN\u0005\u001d\u0000\u0000NO\u0005"+
		"\u001e\u0000\u0000OP\u0003\u0004\u0002\u0000PQ\u0005\u001f\u0000\u0000"+
		"Qf\u0001\u0000\u0000\u0000RS\u0005\u0018\u0000\u0000ST\u0005\u001c\u0000"+
		"\u0000TU\u0003\u0006\u0003\u0000UV\u0005\u001d\u0000\u0000Vf\u0001\u0000"+
		"\u0000\u0000WX\u0005\u001e\u0000\u0000XY\u0003\u0004\u0002\u0000YZ\u0005"+
		"\u001f\u0000\u0000Z[\u0005#\u0000\u0000[\\\u0005\u001e\u0000\u0000\\]"+
		"\u0003\u0004\u0002\u0000]^\u0005\u001f\u0000\u0000^f\u0001\u0000\u0000"+
		"\u0000_`\u0005$\u0000\u0000`a\u0005\u001e\u0000\u0000ab\u0003\n\u0005"+
		"\u0000bc\u0005\u001f\u0000\u0000cd\u0005$\u0000\u0000df\u0001\u0000\u0000"+
		"\u0000e4\u0001\u0000\u0000\u0000eB\u0001\u0000\u0000\u0000eE\u0001\u0000"+
		"\u0000\u0000eI\u0001\u0000\u0000\u0000eJ\u0001\u0000\u0000\u0000eR\u0001"+
		"\u0000\u0000\u0000eW\u0001\u0000\u0000\u0000e_\u0001\u0000\u0000\u0000"+
		"fl\u0001\u0000\u0000\u0000gh\n\u0005\u0000\u0000hi\u0005!\u0000\u0000"+
		"ik\u0003\u0004\u0002\u0006jg\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u0005\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0006\u0003\uffff\uffff"+
		"\u0000p\u0089\u0005\u0001\u0000\u0000q\u0089\u0005\u0002\u0000\u0000r"+
		"s\u0005%\u0000\u0000s|\u0005\u001c\u0000\u0000ty\u0003\u0006\u0003\u0000"+
		"uv\u0005 \u0000\u0000vx\u0003\u0006\u0003\u0000wu\u0001\u0000\u0000\u0000"+
		"x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|t\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0089"+
		"\u0005\u001d\u0000\u0000\u007f\u0080\u0005\u001c\u0000\u0000\u0080\u0081"+
		"\u0003\u0006\u0003\u0000\u0081\u0082\u0005\u001d\u0000\u0000\u0082\u0089"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0011\u0000\u0000\u0084\u0089"+
		"\u0003\u0006\u0003\b\u0085\u0089\u0005%\u0000\u0000\u0086\u0087\u0005"+
		"%\u0000\u0000\u0087\u0089\u0005\"\u0000\u0000\u0088o\u0001\u0000\u0000"+
		"\u0000\u0088q\u0001\u0000\u0000\u0000\u0088r\u0001\u0000\u0000\u0000\u0088"+
		"\u007f\u0001\u0000\u0000\u0000\u0088\u0083\u0001\u0000\u0000\u0000\u0088"+
		"\u0085\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089"+
		"\u009e\u0001\u0000\u0000\u0000\u008a\u008b\n\t\u0000\u0000\u008b\u008c"+
		"\u0005\b\u0000\u0000\u008c\u009d\u0003\u0006\u0003\t\u008d\u008e\n\u0007"+
		"\u0000\u0000\u008e\u008f\u0007\u0000\u0000\u0000\u008f\u009d\u0003\u0006"+
		"\u0003\b\u0090\u0091\n\u0006\u0000\u0000\u0091\u0092\u0007\u0001\u0000"+
		"\u0000\u0092\u009d\u0003\u0006\u0003\u0007\u0093\u0094\n\u0005\u0000\u0000"+
		"\u0094\u0095\u0007\u0002\u0000\u0000\u0095\u009d\u0003\u0006\u0003\u0006"+
		"\u0096\u0097\n\u0004\u0000\u0000\u0097\u0098\u0007\u0003\u0000\u0000\u0098"+
		"\u009d\u0003\u0006\u0003\u0005\u0099\u009a\n\u0003\u0000\u0000\u009a\u009b"+
		"\u0007\u0004\u0000\u0000\u009b\u009d\u0003\u0006\u0003\u0004\u009c\u008a"+
		"\u0001\u0000\u0000\u0000\u009c\u008d\u0001\u0000\u0000\u0000\u009c\u0090"+
		"\u0001\u0000\u0000\u0000\u009c\u0093\u0001\u0000\u0000\u0000\u009c\u0096"+
		"\u0001\u0000\u0000\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009d\u00a0"+
		"\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u0007\u0001\u0000\u0000\u0000\u00a0\u009e"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003\n\u0005\u0000\u00a2\t\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a7\u0005\'\u0000\u0000\u00a4\u00a6\u0003\f"+
		"\u0006\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0005(\u0000\u0000\u00ab\u000b\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0005\u0012\u0000\u0000\u00ad\u00ae\u0003\u000e\u0007"+
		"\u0000\u00ae\u00af\u0003\f\u0006\u0000\u00af\u00b0\u0005\u0014\u0000\u0000"+
		"\u00b0\u00b1\u0003\f\u0006\u0000\u00b1\u00b2\u00058\u0000\u0000\u00b2"+
		"\u00d2\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0012\u0000\u0000\u00b4"+
		"\u00b5\u0003\u000e\u0007\u0000\u00b5\u00b6\u0003\f\u0006\u0000\u00b6\u00b7"+
		"\u00058\u0000\u0000\u00b7\u00d2\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005"+
		"\u0015\u0000\u0000\u00b9\u00bb\u0003\u000e\u0007\u0000\u00ba\u00bc\u0003"+
		"\f\u0006\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u00059\u0000"+
		"\u0000\u00c0\u00d2\u0001\u0000\u0000\u0000\u00c1\u00c2\u00052\u0000\u0000"+
		"\u00c2\u00d2\u0003\u000e\u0007\u0000\u00c3\u00c4\u00055\u0000\u0000\u00c4"+
		"\u00c5\u0005%\u0000\u0000\u00c5\u00c7\u00056\u0000\u0000\u00c6\u00c8\u0003"+
		"\u000e\u0007\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005"+
		"7\u0000\u0000\u00cc\u00d2\u0001\u0000\u0000\u0000\u00cd\u00ce\u00053\u0000"+
		"\u0000\u00ce\u00cf\u0005%\u0000\u0000\u00cf\u00d0\u00054\u0000\u0000\u00d0"+
		"\u00d2\u0003\u000e\u0007\u0000\u00d1\u00ac\u0001\u0000\u0000\u0000\u00d1"+
		"\u00b3\u0001\u0000\u0000\u0000\u00d1\u00b8\u0001\u0000\u0000\u0000\u00d1"+
		"\u00c1\u0001\u0000\u0000\u0000\u00d1\u00c3\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d2\r\u0001\u0000\u0000\u0000\u00d3\u00e9"+
		"\u0005%\u0000\u0000\u00d4\u00e9\u0005:\u0000\u0000\u00d5\u00e9\u0005;"+
		"\u0000\u0000\u00d6\u00d7\u0005)\u0000\u0000\u00d7\u00e9\u0005\u0002\u0000"+
		"\u0000\u00d8\u00d9\u0005,\u0000\u0000\u00d9\u00e9\u0003\u000e\u0007\u0000"+
		"\u00da\u00db\u0005-\u0000\u0000\u00db\u00e9\u0003\u000e\u0007\u0000\u00dc"+
		"\u00dd\u0005.\u0000\u0000\u00dd\u00e9\u0003\u000e\u0007\u0000\u00de\u00df"+
		"\u0005/\u0000\u0000\u00df\u00e9\u0003\u000e\u0007\u0000\u00e0\u00e1\u0005"+
		"0\u0000\u0000\u00e1\u00e9\u0003\u000e\u0007\u0000\u00e2\u00e3\u00051\u0000"+
		"\u0000\u00e3\u00e9\u0003\u000e\u0007\u0000\u00e4\u00e5\u0005\n\u0000\u0000"+
		"\u00e5\u00e9\u0003\u000e\u0007\u0000\u00e6\u00e7\u0005\t\u0000\u0000\u00e7"+
		"\u00e9\u0003\u000e\u0007\u0000\u00e8\u00d3\u0001\u0000\u0000\u0000\u00e8"+
		"\u00d4\u0001\u0000\u0000\u0000\u00e8\u00d5\u0001\u0000\u0000\u0000\u00e8"+
		"\u00d6\u0001\u0000\u0000\u0000\u00e8\u00d8\u0001\u0000\u0000\u0000\u00e8"+
		"\u00da\u0001\u0000\u0000\u0000\u00e8\u00dc\u0001\u0000\u0000\u0000\u00e8"+
		"\u00de\u0001\u0000\u0000\u0000\u00e8\u00e0\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e8\u00e4\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e9\u000f\u0001\u0000\u0000\u0000\u0010"+
		"\u0013!&.ely|\u0088\u009c\u009e\u00a7\u00bd\u00c9\u00d1\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}