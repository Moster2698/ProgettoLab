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
		ARNOLDSTARTMAIN=1, ARNOLDENDMAIN=2, ARNOLDAT=3, ARNOLDBOOL=4, ARNOLDTRUE=5, 
		ARNOLDFALSE=6, ARNOLDPLUSOPERATOR=7, ARNOLDMINUSOPERATOR=8, ARNOLDMULTIPLICATIONOPERATOR=9, 
		ARNOLDDIVISIONOPERATOR=10, ARNOLDEQUALTO=11, ARNOLDGREATERTHAN=12, ARNOLDOR=13, 
		ARNOLDAND=14, ARNOLDPRINT=15, ARNOLDDECLARE=16, ARNOLDSETINITIALVALUE=17, 
		ARNOLDASSIGNVARIABLE=18, ARNOLDSETVALUE=19, ARNOLDENDASSIGNVARIABLE=20, 
		ARNOLDIF=21, ARNOLDELSE=22, ARNOLDENDIF=23, ARNOLDWHILE=24, ARNOLDENDWHILE=25, 
		NAT=26, BOOL=27, PLUS=28, MINUS=29, MUL=30, DIV=31, MOD=32, POW=33, AND=34, 
		OR=35, EQQ=36, NEQ=37, LEQ=38, GEQ=39, LT=40, GT=41, NOT=42, IF=43, THEN=44, 
		ELSE=45, WHILE=46, SKIPP=47, ASSIGN=48, OUT=49, FUN=50, RETURN=51, GLOBAL=52, 
		LPAR=53, RPAR=54, LBRACE=55, RBRACE=56, COMMA=57, SEMICOLON=58, DOTG=59, 
		ND=60, DOLLAR=61, ID=62, WS=63, ARNOLDSTRING=64, STRING=65, ARNOLDFLOAT=66;
	public static final int
		RULE_prog = 0, RULE_arnoldIni = 1, RULE_arnoldCom = 2, RULE_arnoldOperations = 3, 
		RULE_operand = 4, RULE_fun = 5, RULE_com = 6, RULE_exp = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "arnoldIni", "arnoldCom", "arnoldOperations", "operand", "fun", 
			"com", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'IT'S SHOWTIME'", "'YOU HAVE BEEN TERMINATED'", "'@'", null, "'NO PROBLEMO'", 
			"'I LIED'", "'GET UP'", "'GET DOWN'", "'YOU'RE FIRED'", "'HE HAD TO SPLIT'", 
			"'YOU ARE NOT YOU YOU ARE ME'", "'LET OFF SOME STEAM BENNET'", "'CONSIDER THAT A DIVORCE'", 
			"'KNOCK KNOCK'", "'TALK TO THE HAND'", "'HEY CHRISTMAS TREE'", "'YOU SET US UP'", 
			"'GET TO THE CHOPPER'", "'HERE IS MY INVITATION'", "'ENOUGH TALK'", "'BECAUSE I'M GOING TO SAY PLEASE'", 
			"'BULLSHIT'", "'YOU HAVE NO RESPECT FOR LOGIC'", "'STICK AROUND'", "'CHILL'", 
			null, null, "'+'", "'-'", "'*'", "'/'", "'mod'", "'^'", "'&'", "'|'", 
			"'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'!'", "'if'", "'then'", 
			"'else'", "'while'", "'skip'", "'='", "'out'", "'fun'", "'return'", "'global'", 
			"'('", "')'", "'{'", "'}'", "','", "';'", "'.g'", "'nd'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ARNOLDSTARTMAIN", "ARNOLDENDMAIN", "ARNOLDAT", "ARNOLDBOOL", "ARNOLDTRUE", 
			"ARNOLDFALSE", "ARNOLDPLUSOPERATOR", "ARNOLDMINUSOPERATOR", "ARNOLDMULTIPLICATIONOPERATOR", 
			"ARNOLDDIVISIONOPERATOR", "ARNOLDEQUALTO", "ARNOLDGREATERTHAN", "ARNOLDOR", 
			"ARNOLDAND", "ARNOLDPRINT", "ARNOLDDECLARE", "ARNOLDSETINITIALVALUE", 
			"ARNOLDASSIGNVARIABLE", "ARNOLDSETVALUE", "ARNOLDENDASSIGNVARIABLE", 
			"ARNOLDIF", "ARNOLDELSE", "ARNOLDENDIF", "ARNOLDWHILE", "ARNOLDENDWHILE", 
			"NAT", "BOOL", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "AND", "OR", 
			"EQQ", "NEQ", "LEQ", "GEQ", "LT", "GT", "NOT", "IF", "THEN", "ELSE", 
			"WHILE", "SKIPP", "ASSIGN", "OUT", "FUN", "RETURN", "GLOBAL", "LPAR", 
			"RPAR", "LBRACE", "RBRACE", "COMMA", "SEMICOLON", "DOTG", "ND", "DOLLAR", 
			"ID", "WS", "ARNOLDSTRING", "STRING", "ARNOLDFLOAT"
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
	public static class ArnoldIniContext extends ParserRuleContext {
		public TerminalNode ARNOLDSTARTMAIN() { return getToken(ImpParser.ARNOLDSTARTMAIN, 0); }
		public TerminalNode ARNOLDENDMAIN() { return getToken(ImpParser.ARNOLDENDMAIN, 0); }
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
		enterRule(_localctx, 2, RULE_arnoldIni);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(ARNOLDSTARTMAIN);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19234816L) != 0)) {
				{
				{
				setState(26);
				arnoldCom();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(ARNOLDENDMAIN);
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
		public TerminalNode ARNOLDIF() { return getToken(ImpParser.ARNOLDIF, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public List<ArnoldComContext> arnoldCom() {
			return getRuleContexts(ArnoldComContext.class);
		}
		public ArnoldComContext arnoldCom(int i) {
			return getRuleContext(ArnoldComContext.class,i);
		}
		public TerminalNode ARNOLDELSE() { return getToken(ImpParser.ARNOLDELSE, 0); }
		public TerminalNode ARNOLDENDIF() { return getToken(ImpParser.ARNOLDENDIF, 0); }
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
		public TerminalNode ARNOLDWHILE() { return getToken(ImpParser.ARNOLDWHILE, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode ARNOLDENDWHILE() { return getToken(ImpParser.ARNOLDENDWHILE, 0); }
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
		public TerminalNode ARNOLDPRINT() { return getToken(ImpParser.ARNOLDPRINT, 0); }
		public TerminalNode STRING() { return getToken(ImpParser.STRING, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
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
		public TerminalNode ARNOLDDECLARE() { return getToken(ImpParser.ARNOLDDECLARE, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ARNOLDSETINITIALVALUE() { return getToken(ImpParser.ARNOLDSETINITIALVALUE, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
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
		public TerminalNode ARNOLDIF() { return getToken(ImpParser.ARNOLDIF, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArnoldComContext arnoldCom() {
			return getRuleContext(ArnoldComContext.class,0);
		}
		public TerminalNode ARNOLDENDIF() { return getToken(ImpParser.ARNOLDENDIF, 0); }
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
		public TerminalNode ARNOLDASSIGNVARIABLE() { return getToken(ImpParser.ARNOLDASSIGNVARIABLE, 0); }
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public TerminalNode ARNOLDSETVALUE() { return getToken(ImpParser.ARNOLDSETVALUE, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode ARNOLDENDASSIGNVARIABLE() { return getToken(ImpParser.ARNOLDENDASSIGNVARIABLE, 0); }
		public List<ArnoldOperationsContext> arnoldOperations() {
			return getRuleContexts(ArnoldOperationsContext.class);
		}
		public ArnoldOperationsContext arnoldOperations(int i) {
			return getRuleContext(ArnoldOperationsContext.class,i);
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
		enterRule(_localctx, 4, RULE_arnoldCom);
		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ArnoldIfElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(ARNOLDIF);
				setState(35);
				operand();
				setState(36);
				arnoldCom();
				setState(37);
				match(ARNOLDELSE);
				setState(38);
				arnoldCom();
				setState(39);
				match(ARNOLDENDIF);
				}
				break;
			case 2:
				_localctx = new ArnoldIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(ARNOLDIF);
				setState(42);
				operand();
				setState(43);
				arnoldCom();
				setState(44);
				match(ARNOLDENDIF);
				}
				break;
			case 3:
				_localctx = new ArnoldWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(ARNOLDWHILE);
				setState(47);
				operand();
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(48);
					arnoldCom();
					}
					}
					setState(51); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 19234816L) != 0) );
				setState(53);
				match(ARNOLDENDWHILE);
				}
				break;
			case 4:
				_localctx = new ArnoldPrintExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				match(ARNOLDPRINT);
				setState(56);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				_localctx = new ArnoldAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				match(ARNOLDASSIGNVARIABLE);
				setState(58);
				match(ID);
				setState(59);
				match(ARNOLDSETVALUE);
				setState(60);
				operand();
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(61);
					arnoldOperations();
					}
					}
					setState(64); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 32640L) != 0) );
				setState(66);
				match(ARNOLDENDASSIGNVARIABLE);
				}
				break;
			case 6:
				_localctx = new ArnoldDeclareContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				match(ARNOLDDECLARE);
				setState(69);
				match(ID);
				setState(70);
				match(ARNOLDSETINITIALVALUE);
				setState(71);
				operand();
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
	public static class ArnoldOperationsContext extends ParserRuleContext {
		public ArnoldOperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arnoldOperations; }
	 
		public ArnoldOperationsContext() { }
		public void copyFrom(ArnoldOperationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldPlusContext extends ArnoldOperationsContext {
		public TerminalNode ARNOLDPLUSOPERATOR() { return getToken(ImpParser.ARNOLDPLUSOPERATOR, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArnoldPlusContext(ArnoldOperationsContext ctx) { copyFrom(ctx); }
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
	public static class ArnoldOrContext extends ArnoldOperationsContext {
		public TerminalNode ARNOLDOR() { return getToken(ImpParser.ARNOLDOR, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArnoldOrContext(ArnoldOperationsContext ctx) { copyFrom(ctx); }
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
	public static class ArnoldGreaterContext extends ArnoldOperationsContext {
		public TerminalNode ARNOLDGREATERTHAN() { return getToken(ImpParser.ARNOLDGREATERTHAN, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArnoldGreaterContext(ArnoldOperationsContext ctx) { copyFrom(ctx); }
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
	public static class ArnoldAndContext extends ArnoldOperationsContext {
		public TerminalNode ARNOLDAND() { return getToken(ImpParser.ARNOLDAND, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArnoldAndContext(ArnoldOperationsContext ctx) { copyFrom(ctx); }
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
	public static class ArnoldEqualContext extends ArnoldOperationsContext {
		public TerminalNode ARNOLDEQUALTO() { return getToken(ImpParser.ARNOLDEQUALTO, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArnoldEqualContext(ArnoldOperationsContext ctx) { copyFrom(ctx); }
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
	public static class ArnoldDivisionContext extends ArnoldOperationsContext {
		public TerminalNode ARNOLDDIVISIONOPERATOR() { return getToken(ImpParser.ARNOLDDIVISIONOPERATOR, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArnoldDivisionContext(ArnoldOperationsContext ctx) { copyFrom(ctx); }
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
	public static class ArnoldMultiplicationContext extends ArnoldOperationsContext {
		public TerminalNode ARNOLDMULTIPLICATIONOPERATOR() { return getToken(ImpParser.ARNOLDMULTIPLICATIONOPERATOR, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArnoldMultiplicationContext(ArnoldOperationsContext ctx) { copyFrom(ctx); }
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
	public static class ArnoldMinusContext extends ArnoldOperationsContext {
		public TerminalNode ARNOLDMINUSOPERATOR() { return getToken(ImpParser.ARNOLDMINUSOPERATOR, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArnoldMinusContext(ArnoldOperationsContext ctx) { copyFrom(ctx); }
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

	public final ArnoldOperationsContext arnoldOperations() throws RecognitionException {
		ArnoldOperationsContext _localctx = new ArnoldOperationsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arnoldOperations);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARNOLDPLUSOPERATOR:
				_localctx = new ArnoldPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(ARNOLDPLUSOPERATOR);
				setState(75);
				operand();
				}
				break;
			case ARNOLDMINUSOPERATOR:
				_localctx = new ArnoldMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(ARNOLDMINUSOPERATOR);
				setState(77);
				operand();
				}
				break;
			case ARNOLDMULTIPLICATIONOPERATOR:
				_localctx = new ArnoldMultiplicationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(ARNOLDMULTIPLICATIONOPERATOR);
				setState(79);
				operand();
				}
				break;
			case ARNOLDDIVISIONOPERATOR:
				_localctx = new ArnoldDivisionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				match(ARNOLDDIVISIONOPERATOR);
				setState(81);
				operand();
				}
				break;
			case ARNOLDEQUALTO:
				_localctx = new ArnoldEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				match(ARNOLDEQUALTO);
				setState(83);
				operand();
				}
				break;
			case ARNOLDGREATERTHAN:
				_localctx = new ArnoldGreaterContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				match(ARNOLDGREATERTHAN);
				setState(85);
				operand();
				}
				break;
			case ARNOLDOR:
				_localctx = new ArnoldOrContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				match(ARNOLDOR);
				setState(87);
				operand();
				}
				break;
			case ARNOLDAND:
				_localctx = new ArnoldAndContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(88);
				match(ARNOLDAND);
				setState(89);
				operand();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperandContext extends ParserRuleContext {
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	 
		public OperandContext() { }
		public void copyFrom(OperandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldNumberexprContext extends OperandContext {
		public TerminalNode ARNOLDFLOAT() { return getToken(ImpParser.ARNOLDFLOAT, 0); }
		public ArnoldNumberexprContext(OperandContext ctx) { copyFrom(ctx); }
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
	public static class ArnoldStringContext extends OperandContext {
		public TerminalNode ARNOLDSTRING() { return getToken(ImpParser.ARNOLDSTRING, 0); }
		public ArnoldStringContext(OperandContext ctx) { copyFrom(ctx); }
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
	public static class ArnoldIdexprContext extends OperandContext {
		public TerminalNode ID() { return getToken(ImpParser.ID, 0); }
		public ArnoldIdexprContext(OperandContext ctx) { copyFrom(ctx); }
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
	public static class ArnoldBoolExpContext extends OperandContext {
		public TerminalNode ARNOLDAT() { return getToken(ImpParser.ARNOLDAT, 0); }
		public TerminalNode ARNOLDBOOL() { return getToken(ImpParser.ARNOLDBOOL, 0); }
		public ArnoldBoolExpContext(OperandContext ctx) { copyFrom(ctx); }
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

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operand);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ArnoldIdexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(ID);
				}
				break;
			case ARNOLDSTRING:
				_localctx = new ArnoldStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(ARNOLDSTRING);
				}
				break;
			case ARNOLDFLOAT:
				_localctx = new ArnoldNumberexprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(ARNOLDFLOAT);
				}
				break;
			case ARNOLDAT:
				_localctx = new ArnoldBoolExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				match(ARNOLDAT);
				setState(96);
				match(ARNOLDBOOL);
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
		enterRule(_localctx, 10, RULE_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(FUN);
			setState(100);
			match(ID);
			setState(101);
			match(LPAR);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(102);
				match(ID);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(103);
					match(COMMA);
					setState(104);
					match(ID);
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(RPAR);
			setState(116);
			match(LBRACE);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6958844276566392832L) != 0)) {
				{
				setState(117);
				com(0);
				setState(118);
				match(SEMICOLON);
				}
			}

			setState(122);
			match(RETURN);
			setState(123);
			exp(0);
			setState(124);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_com, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(127);
				match(IF);
				setState(128);
				match(LPAR);
				setState(129);
				exp(0);
				setState(130);
				match(RPAR);
				setState(131);
				match(THEN);
				setState(132);
				match(LBRACE);
				setState(133);
				com(0);
				setState(134);
				match(RBRACE);
				setState(135);
				match(ELSE);
				setState(136);
				match(LBRACE);
				setState(137);
				com(0);
				setState(138);
				match(RBRACE);
				}
				break;
			case ID:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				match(ID);
				setState(141);
				match(ASSIGN);
				setState(142);
				exp(0);
				}
				break;
			case GLOBAL:
				{
				_localctx = new GlobalAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(GLOBAL);
				setState(144);
				match(ID);
				setState(145);
				match(ASSIGN);
				setState(146);
				exp(0);
				}
				break;
			case SKIPP:
				{
				_localctx = new SkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(SKIPP);
				}
				break;
			case WHILE:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(WHILE);
				setState(149);
				match(LPAR);
				setState(150);
				exp(0);
				setState(151);
				match(RPAR);
				setState(152);
				match(LBRACE);
				setState(153);
				com(0);
				setState(154);
				match(RBRACE);
				}
				break;
			case OUT:
				{
				_localctx = new OutContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(OUT);
				setState(157);
				match(LPAR);
				setState(158);
				exp(0);
				setState(159);
				match(RPAR);
				}
				break;
			case LBRACE:
				{
				_localctx = new NdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(LBRACE);
				setState(162);
				com(0);
				setState(163);
				match(RBRACE);
				setState(164);
				match(ND);
				setState(165);
				match(LBRACE);
				setState(166);
				com(0);
				setState(167);
				match(RBRACE);
				}
				break;
			case DOLLAR:
				{
				_localctx = new ArnoldInitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(DOLLAR);
				setState(170);
				match(LBRACE);
				setState(171);
				arnoldIni();
				setState(172);
				match(RBRACE);
				setState(173);
				match(DOLLAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SeqContext(new ComContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_com);
					setState(177);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(178);
					match(SEMICOLON);
					setState(179);
					com(6);
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new NatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(186);
				match(NAT);
				}
				break;
			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(BOOL);
				}
				break;
			case 3:
				{
				_localctx = new FunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(ID);
				setState(189);
				match(LPAR);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4620697615929966592L) != 0)) {
					{
					setState(190);
					exp(0);
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(191);
						match(COMMA);
						setState(192);
						exp(0);
						}
						}
						setState(197);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(200);
				match(RPAR);
				}
				break;
			case 4:
				{
				_localctx = new ParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				match(LPAR);
				setState(202);
				exp(0);
				setState(203);
				match(RPAR);
				}
				break;
			case 5:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(NOT);
				setState(206);
				exp(8);
				}
				break;
			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new GlobalIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				match(ID);
				setState(209);
				match(DOTG);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(212);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(213);
						match(POW);
						setState(214);
						exp(9);
						}
						break;
					case 2:
						{
						_localctx = new DivMulModContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(215);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(216);
						((DivMulModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0)) ) {
							((DivMulModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(217);
						exp(8);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(218);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(219);
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
						setState(220);
						exp(7);
						}
						break;
					case 4:
						{
						_localctx = new CmpExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(221);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(222);
						((CmpExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168604160L) != 0)) ) {
							((CmpExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(223);
						exp(6);
						}
						break;
					case 5:
						{
						_localctx = new EqExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(224);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(225);
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
						setState(226);
						exp(5);
						}
						break;
					case 6:
						{
						_localctx = new LogicExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(227);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(228);
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
						setState(229);
						exp(4);
						}
						break;
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		case 6:
			return com_sempred((ComContext)_localctx, predIndex);
		case 7:
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
		"\u0004\u0001B\u00ec\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001\u001c\b\u0001"+
		"\n\u0001\f\u0001\u001f\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0004\u00022\b\u0002\u000b\u0002\f\u00023\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0004\u0002?\b\u0002\u000b\u0002\f\u0002@\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002I\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003[\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004b\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005j\b\u0005\n\u0005\f\u0005m\t"+
		"\u0005\u0005\u0005o\b\u0005\n\u0005\f\u0005r\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005y\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b0"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00b5\b\u0006"+
		"\n\u0006\f\u0006\u00b8\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00c2"+
		"\b\u0007\n\u0007\f\u0007\u00c5\t\u0007\u0003\u0007\u00c7\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00d3\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00e7\b\u0007\n\u0007\f\u0007\u00ea\t\u0007\u0001\u0007\u0000\u0002"+
		"\f\u000e\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0006\u0002\u0000"+
		">>AA\u0001\u0000\u001e \u0001\u0000\u001c\u001d\u0001\u0000&)\u0001\u0000"+
		"$%\u0001\u0000\"#\u010f\u0000\u0013\u0001\u0000\u0000\u0000\u0002\u0019"+
		"\u0001\u0000\u0000\u0000\u0004H\u0001\u0000\u0000\u0000\u0006Z\u0001\u0000"+
		"\u0000\u0000\ba\u0001\u0000\u0000\u0000\nc\u0001\u0000\u0000\u0000\f\u00af"+
		"\u0001\u0000\u0000\u0000\u000e\u00d2\u0001\u0000\u0000\u0000\u0010\u0012"+
		"\u0003\n\u0005\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0015\u0001"+
		"\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001"+
		"\u0000\u0000\u0000\u0014\u0016\u0001\u0000\u0000\u0000\u0015\u0013\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0003\f\u0006\u0000\u0017\u0018\u0005\u0000"+
		"\u0000\u0001\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u001d\u0005\u0001"+
		"\u0000\u0000\u001a\u001c\u0003\u0004\u0002\u0000\u001b\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000 !\u0005\u0002\u0000\u0000!"+
		"\u0003\u0001\u0000\u0000\u0000\"#\u0005\u0015\u0000\u0000#$\u0003\b\u0004"+
		"\u0000$%\u0003\u0004\u0002\u0000%&\u0005\u0016\u0000\u0000&\'\u0003\u0004"+
		"\u0002\u0000\'(\u0005\u0017\u0000\u0000(I\u0001\u0000\u0000\u0000)*\u0005"+
		"\u0015\u0000\u0000*+\u0003\b\u0004\u0000+,\u0003\u0004\u0002\u0000,-\u0005"+
		"\u0017\u0000\u0000-I\u0001\u0000\u0000\u0000./\u0005\u0018\u0000\u0000"+
		"/1\u0003\b\u0004\u000002\u0003\u0004\u0002\u000010\u0001\u0000\u0000\u0000"+
		"23\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u000045\u0001\u0000\u0000\u000056\u0005\u0019\u0000\u00006I\u0001\u0000"+
		"\u0000\u000078\u0005\u000f\u0000\u00008I\u0007\u0000\u0000\u00009:\u0005"+
		"\u0012\u0000\u0000:;\u0005>\u0000\u0000;<\u0005\u0013\u0000\u0000<>\u0003"+
		"\b\u0004\u0000=?\u0003\u0006\u0003\u0000>=\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BC\u0005\u0014\u0000\u0000CI\u0001\u0000\u0000"+
		"\u0000DE\u0005\u0010\u0000\u0000EF\u0005>\u0000\u0000FG\u0005\u0011\u0000"+
		"\u0000GI\u0003\b\u0004\u0000H\"\u0001\u0000\u0000\u0000H)\u0001\u0000"+
		"\u0000\u0000H.\u0001\u0000\u0000\u0000H7\u0001\u0000\u0000\u0000H9\u0001"+
		"\u0000\u0000\u0000HD\u0001\u0000\u0000\u0000I\u0005\u0001\u0000\u0000"+
		"\u0000JK\u0005\u0007\u0000\u0000K[\u0003\b\u0004\u0000LM\u0005\b\u0000"+
		"\u0000M[\u0003\b\u0004\u0000NO\u0005\t\u0000\u0000O[\u0003\b\u0004\u0000"+
		"PQ\u0005\n\u0000\u0000Q[\u0003\b\u0004\u0000RS\u0005\u000b\u0000\u0000"+
		"S[\u0003\b\u0004\u0000TU\u0005\f\u0000\u0000U[\u0003\b\u0004\u0000VW\u0005"+
		"\r\u0000\u0000W[\u0003\b\u0004\u0000XY\u0005\u000e\u0000\u0000Y[\u0003"+
		"\b\u0004\u0000ZJ\u0001\u0000\u0000\u0000ZL\u0001\u0000\u0000\u0000ZN\u0001"+
		"\u0000\u0000\u0000ZP\u0001\u0000\u0000\u0000ZR\u0001\u0000\u0000\u0000"+
		"ZT\u0001\u0000\u0000\u0000ZV\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000[\u0007\u0001\u0000\u0000\u0000\\b\u0005>\u0000\u0000]b\u0005@\u0000"+
		"\u0000^b\u0005B\u0000\u0000_`\u0005\u0003\u0000\u0000`b\u0005\u0004\u0000"+
		"\u0000a\\\u0001\u0000\u0000\u0000a]\u0001\u0000\u0000\u0000a^\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000b\t\u0001\u0000\u0000\u0000cd\u0005"+
		"2\u0000\u0000de\u0005>\u0000\u0000ep\u00055\u0000\u0000fk\u0005>\u0000"+
		"\u0000gh\u00059\u0000\u0000hj\u0005>\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000nf\u0001\u0000"+
		"\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"st\u00056\u0000\u0000tx\u00057\u0000\u0000uv\u0003\f\u0006\u0000vw\u0005"+
		":\u0000\u0000wy\u0001\u0000\u0000\u0000xu\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u00053\u0000\u0000{|\u0003"+
		"\u000e\u0007\u0000|}\u00058\u0000\u0000}\u000b\u0001\u0000\u0000\u0000"+
		"~\u007f\u0006\u0006\uffff\uffff\u0000\u007f\u0080\u0005+\u0000\u0000\u0080"+
		"\u0081\u00055\u0000\u0000\u0081\u0082\u0003\u000e\u0007\u0000\u0082\u0083"+
		"\u00056\u0000\u0000\u0083\u0084\u0005,\u0000\u0000\u0084\u0085\u00057"+
		"\u0000\u0000\u0085\u0086\u0003\f\u0006\u0000\u0086\u0087\u00058\u0000"+
		"\u0000\u0087\u0088\u0005-\u0000\u0000\u0088\u0089\u00057\u0000\u0000\u0089"+
		"\u008a\u0003\f\u0006\u0000\u008a\u008b\u00058\u0000\u0000\u008b\u00b0"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0005>\u0000\u0000\u008d\u008e\u0005"+
		"0\u0000\u0000\u008e\u00b0\u0003\u000e\u0007\u0000\u008f\u0090\u00054\u0000"+
		"\u0000\u0090\u0091\u0005>\u0000\u0000\u0091\u0092\u00050\u0000\u0000\u0092"+
		"\u00b0\u0003\u000e\u0007\u0000\u0093\u00b0\u0005/\u0000\u0000\u0094\u0095"+
		"\u0005.\u0000\u0000\u0095\u0096\u00055\u0000\u0000\u0096\u0097\u0003\u000e"+
		"\u0007\u0000\u0097\u0098\u00056\u0000\u0000\u0098\u0099\u00057\u0000\u0000"+
		"\u0099\u009a\u0003\f\u0006\u0000\u009a\u009b\u00058\u0000\u0000\u009b"+
		"\u00b0\u0001\u0000\u0000\u0000\u009c\u009d\u00051\u0000\u0000\u009d\u009e"+
		"\u00055\u0000\u0000\u009e\u009f\u0003\u000e\u0007\u0000\u009f\u00a0\u0005"+
		"6\u0000\u0000\u00a0\u00b0\u0001\u0000\u0000\u0000\u00a1\u00a2\u00057\u0000"+
		"\u0000\u00a2\u00a3\u0003\f\u0006\u0000\u00a3\u00a4\u00058\u0000\u0000"+
		"\u00a4\u00a5\u0005<\u0000\u0000\u00a5\u00a6\u00057\u0000\u0000\u00a6\u00a7"+
		"\u0003\f\u0006\u0000\u00a7\u00a8\u00058\u0000\u0000\u00a8\u00b0\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0005=\u0000\u0000\u00aa\u00ab\u00057\u0000"+
		"\u0000\u00ab\u00ac\u0003\u0002\u0001\u0000\u00ac\u00ad\u00058\u0000\u0000"+
		"\u00ad\u00ae\u0005=\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af"+
		"~\u0001\u0000\u0000\u0000\u00af\u008c\u0001\u0000\u0000\u0000\u00af\u008f"+
		"\u0001\u0000\u0000\u0000\u00af\u0093\u0001\u0000\u0000\u0000\u00af\u0094"+
		"\u0001\u0000\u0000\u0000\u00af\u009c\u0001\u0000\u0000\u0000\u00af\u00a1"+
		"\u0001\u0000\u0000\u0000\u00af\u00a9\u0001\u0000\u0000\u0000\u00b0\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\n\u0005\u0000\u0000\u00b2\u00b3\u0005"+
		":\u0000\u0000\u00b3\u00b5\u0003\f\u0006\u0006\u00b4\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\r\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba\u0006\u0007\uffff"+
		"\uffff\u0000\u00ba\u00d3\u0005\u001a\u0000\u0000\u00bb\u00d3\u0005\u001b"+
		"\u0000\u0000\u00bc\u00bd\u0005>\u0000\u0000\u00bd\u00c6\u00055\u0000\u0000"+
		"\u00be\u00c3\u0003\u000e\u0007\u0000\u00bf\u00c0\u00059\u0000\u0000\u00c0"+
		"\u00c2\u0003\u000e\u0007\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c6\u00be\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00d3\u00056\u0000\u0000\u00c9\u00ca\u00055\u0000\u0000\u00ca\u00cb\u0003"+
		"\u000e\u0007\u0000\u00cb\u00cc\u00056\u0000\u0000\u00cc\u00d3\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0005*\u0000\u0000\u00ce\u00d3\u0003\u000e\u0007"+
		"\b\u00cf\u00d3\u0005>\u0000\u0000\u00d0\u00d1\u0005>\u0000\u0000\u00d1"+
		"\u00d3\u0005;\u0000\u0000\u00d2\u00b9\u0001\u0000\u0000\u0000\u00d2\u00bb"+
		"\u0001\u0000\u0000\u0000\u00d2\u00bc\u0001\u0000\u0000\u0000\u00d2\u00c9"+
		"\u0001\u0000\u0000\u0000\u00d2\u00cd\u0001\u0000\u0000\u0000\u00d2\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00e8"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\n\t\u0000\u0000\u00d5\u00d6\u0005"+
		"!\u0000\u0000\u00d6\u00e7\u0003\u000e\u0007\t\u00d7\u00d8\n\u0007\u0000"+
		"\u0000\u00d8\u00d9\u0007\u0001\u0000\u0000\u00d9\u00e7\u0003\u000e\u0007"+
		"\b\u00da\u00db\n\u0006\u0000\u0000\u00db\u00dc\u0007\u0002\u0000\u0000"+
		"\u00dc\u00e7\u0003\u000e\u0007\u0007\u00dd\u00de\n\u0005\u0000\u0000\u00de"+
		"\u00df\u0007\u0003\u0000\u0000\u00df\u00e7\u0003\u000e\u0007\u0006\u00e0"+
		"\u00e1\n\u0004\u0000\u0000\u00e1\u00e2\u0007\u0004\u0000\u0000\u00e2\u00e7"+
		"\u0003\u000e\u0007\u0005\u00e3\u00e4\n\u0003\u0000\u0000\u00e4\u00e5\u0007"+
		"\u0005\u0000\u0000\u00e5\u00e7\u0003\u000e\u0007\u0004\u00e6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00e6\u00d7\u0001\u0000\u0000\u0000\u00e6\u00da\u0001"+
		"\u0000\u0000\u0000\u00e6\u00dd\u0001\u0000\u0000\u0000\u00e6\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e9\u000f\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001"+
		"\u0000\u0000\u0000\u0011\u0013\u001d3@HZakpx\u00af\u00b6\u00c3\u00c6\u00d2"+
		"\u00e6\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}