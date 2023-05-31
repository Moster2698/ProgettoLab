// Generated from /Users/alessio/Code/HaveFunProject/src/HaveFunAndArnoldC.g4 by ANTLR 4.12.0
package generation;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HaveFunAndArnoldCParser extends Parser {
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
		ND=60, DOLLAR=61, ID=62, WS=63, STRING=64, ARNOLDFLOAT=65;
	public static final int
		RULE_program = 0, RULE_arnoldIni = 1, RULE_globalEnv = 2, RULE_arnoldCom = 3, 
		RULE_arnoldOperations = 4, RULE_operand = 5, RULE_fun = 6, RULE_com = 7, 
		RULE_exp = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "arnoldIni", "globalEnv", "arnoldCom", "arnoldOperations", 
			"operand", "fun", "com", "exp"
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
			"ID", "WS", "STRING", "ARNOLDFLOAT"
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
	public String getGrammarFileName() { return "HaveFunAndArnoldC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HaveFunAndArnoldCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HaveFunAndArnoldCParser.EOF, 0); }
		public List<FunContext> fun() {
			return getRuleContexts(FunContext.class);
		}
		public FunContext fun(int i) {
			return getRuleContext(FunContext.class,i);
		}
		public List<GlobalEnvContext> globalEnv() {
			return getRuleContexts(GlobalEnvContext.class);
		}
		public GlobalEnvContext globalEnv(int i) {
			return getRuleContext(GlobalEnvContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUN) {
				{
				{
				setState(18);
				fun();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GLOBAL) {
				{
				{
				setState(24);
				globalEnv();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			com(0);
			setState(31);
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
		public TerminalNode ARNOLDSTARTMAIN() { return getToken(HaveFunAndArnoldCParser.ARNOLDSTARTMAIN, 0); }
		public TerminalNode ARNOLDENDMAIN() { return getToken(HaveFunAndArnoldCParser.ARNOLDENDMAIN, 0); }
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
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterArnoldIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitArnoldIni(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitArnoldIni(this);
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
			setState(33);
			match(ARNOLDSTARTMAIN);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19234816L) != 0)) {
				{
				{
				setState(34);
				arnoldCom();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
	public static class GlobalEnvContext extends ParserRuleContext {
		public GlobalEnvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalEnv; }
	 
		public GlobalEnvContext() { }
		public void copyFrom(GlobalEnvContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalAssignValueContext extends GlobalEnvContext {
		public TerminalNode GLOBAL() { return getToken(HaveFunAndArnoldCParser.GLOBAL, 0); }
		public TerminalNode ID() { return getToken(HaveFunAndArnoldCParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(HaveFunAndArnoldCParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HaveFunAndArnoldCParser.SEMICOLON, 0); }
		public GlobalAssignValueContext(GlobalEnvContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterGlobalAssignValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitGlobalAssignValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitGlobalAssignValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalEnvContext globalEnv() throws RecognitionException {
		GlobalEnvContext _localctx = new GlobalEnvContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_globalEnv);
		try {
			_localctx = new GlobalAssignValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(GLOBAL);
			setState(43);
			match(ID);
			setState(44);
			match(ASSIGN);
			setState(45);
			exp(0);
			setState(46);
			match(SEMICOLON);
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
	public static class ArnoldWhileCycleContext extends ArnoldComContext {
		public TerminalNode ARNOLDWHILE() { return getToken(HaveFunAndArnoldCParser.ARNOLDWHILE, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode ARNOLDENDWHILE() { return getToken(HaveFunAndArnoldCParser.ARNOLDENDWHILE, 0); }
		public List<ArnoldComContext> arnoldCom() {
			return getRuleContexts(ArnoldComContext.class);
		}
		public ArnoldComContext arnoldCom(int i) {
			return getRuleContext(ArnoldComContext.class,i);
		}
		public ArnoldWhileCycleContext(ArnoldComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterArnoldWhileCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitArnoldWhileCycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitArnoldWhileCycle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldAssignValueContext extends ArnoldComContext {
		public TerminalNode ARNOLDASSIGNVARIABLE() { return getToken(HaveFunAndArnoldCParser.ARNOLDASSIGNVARIABLE, 0); }
		public TerminalNode ID() { return getToken(HaveFunAndArnoldCParser.ID, 0); }
		public TerminalNode ARNOLDSETVALUE() { return getToken(HaveFunAndArnoldCParser.ARNOLDSETVALUE, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode ARNOLDENDASSIGNVARIABLE() { return getToken(HaveFunAndArnoldCParser.ARNOLDENDASSIGNVARIABLE, 0); }
		public List<ArnoldOperationsContext> arnoldOperations() {
			return getRuleContexts(ArnoldOperationsContext.class);
		}
		public ArnoldOperationsContext arnoldOperations(int i) {
			return getRuleContext(ArnoldOperationsContext.class,i);
		}
		public ArnoldAssignValueContext(ArnoldComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterArnoldAssignValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitArnoldAssignValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitArnoldAssignValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldPrintExpressionContext extends ArnoldComContext {
		public TerminalNode ARNOLDPRINT() { return getToken(HaveFunAndArnoldCParser.ARNOLDPRINT, 0); }
		public TerminalNode STRING() { return getToken(HaveFunAndArnoldCParser.STRING, 0); }
		public TerminalNode ID() { return getToken(HaveFunAndArnoldCParser.ID, 0); }
		public ArnoldPrintExpressionContext(ArnoldComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterArnoldPrintExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitArnoldPrintExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitArnoldPrintExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldIfElseCheckContext extends ArnoldComContext {
		public TerminalNode ARNOLDIF() { return getToken(HaveFunAndArnoldCParser.ARNOLDIF, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public List<ArnoldComContext> arnoldCom() {
			return getRuleContexts(ArnoldComContext.class);
		}
		public ArnoldComContext arnoldCom(int i) {
			return getRuleContext(ArnoldComContext.class,i);
		}
		public TerminalNode ARNOLDELSE() { return getToken(HaveFunAndArnoldCParser.ARNOLDELSE, 0); }
		public TerminalNode ARNOLDENDIF() { return getToken(HaveFunAndArnoldCParser.ARNOLDENDIF, 0); }
		public ArnoldIfElseCheckContext(ArnoldComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterArnoldIfElseCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitArnoldIfElseCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitArnoldIfElseCheck(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldIfCheckContext extends ArnoldComContext {
		public TerminalNode ARNOLDIF() { return getToken(HaveFunAndArnoldCParser.ARNOLDIF, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArnoldComContext arnoldCom() {
			return getRuleContext(ArnoldComContext.class,0);
		}
		public TerminalNode ARNOLDENDIF() { return getToken(HaveFunAndArnoldCParser.ARNOLDENDIF, 0); }
		public ArnoldIfCheckContext(ArnoldComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterArnoldIfCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitArnoldIfCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitArnoldIfCheck(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldDeclareVariableContext extends ArnoldComContext {
		public TerminalNode ARNOLDDECLARE() { return getToken(HaveFunAndArnoldCParser.ARNOLDDECLARE, 0); }
		public TerminalNode ID() { return getToken(HaveFunAndArnoldCParser.ID, 0); }
		public TerminalNode ARNOLDSETINITIALVALUE() { return getToken(HaveFunAndArnoldCParser.ARNOLDSETINITIALVALUE, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArnoldDeclareVariableContext(ArnoldComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterArnoldDeclareVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitArnoldDeclareVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitArnoldDeclareVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArnoldComContext arnoldCom() throws RecognitionException {
		ArnoldComContext _localctx = new ArnoldComContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arnoldCom);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ArnoldIfElseCheckContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(ARNOLDIF);
				setState(49);
				operand();
				setState(50);
				arnoldCom();
				setState(51);
				match(ARNOLDELSE);
				setState(52);
				arnoldCom();
				setState(53);
				match(ARNOLDENDIF);
				}
				break;
			case 2:
				_localctx = new ArnoldIfCheckContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(ARNOLDIF);
				setState(56);
				operand();
				setState(57);
				arnoldCom();
				setState(58);
				match(ARNOLDENDIF);
				}
				break;
			case 3:
				_localctx = new ArnoldWhileCycleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(ARNOLDWHILE);
				setState(61);
				operand();
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(62);
					arnoldCom();
					}
					}
					setState(65); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 19234816L) != 0) );
				setState(67);
				match(ARNOLDENDWHILE);
				}
				break;
			case 4:
				_localctx = new ArnoldPrintExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				match(ARNOLDPRINT);
				setState(70);
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
				_localctx = new ArnoldAssignValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				match(ARNOLDASSIGNVARIABLE);
				setState(72);
				match(ID);
				setState(73);
				match(ARNOLDSETVALUE);
				setState(74);
				operand();
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(75);
					arnoldOperations();
					}
					}
					setState(78); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 32640L) != 0) );
				setState(80);
				match(ARNOLDENDASSIGNVARIABLE);
				}
				break;
			case 6:
				_localctx = new ArnoldDeclareVariableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				match(ARNOLDDECLARE);
				setState(83);
				match(ID);
				setState(84);
				match(ARNOLDSETINITIALVALUE);
				setState(85);
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
	public static class ArnoldOpContext extends ArnoldOperationsContext {
		public Token arnoldOperation;
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode ARNOLDPLUSOPERATOR() { return getToken(HaveFunAndArnoldCParser.ARNOLDPLUSOPERATOR, 0); }
		public TerminalNode ARNOLDMINUSOPERATOR() { return getToken(HaveFunAndArnoldCParser.ARNOLDMINUSOPERATOR, 0); }
		public TerminalNode ARNOLDMULTIPLICATIONOPERATOR() { return getToken(HaveFunAndArnoldCParser.ARNOLDMULTIPLICATIONOPERATOR, 0); }
		public TerminalNode ARNOLDDIVISIONOPERATOR() { return getToken(HaveFunAndArnoldCParser.ARNOLDDIVISIONOPERATOR, 0); }
		public TerminalNode ARNOLDEQUALTO() { return getToken(HaveFunAndArnoldCParser.ARNOLDEQUALTO, 0); }
		public TerminalNode ARNOLDGREATERTHAN() { return getToken(HaveFunAndArnoldCParser.ARNOLDGREATERTHAN, 0); }
		public TerminalNode ARNOLDOR() { return getToken(HaveFunAndArnoldCParser.ARNOLDOR, 0); }
		public TerminalNode ARNOLDAND() { return getToken(HaveFunAndArnoldCParser.ARNOLDAND, 0); }
		public ArnoldOpContext(ArnoldOperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterArnoldOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitArnoldOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitArnoldOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArnoldOperationsContext arnoldOperations() throws RecognitionException {
		ArnoldOperationsContext _localctx = new ArnoldOperationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arnoldOperations);
		int _la;
		try {
			_localctx = new ArnoldOpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			((ArnoldOpContext)_localctx).arnoldOperation = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32640L) != 0)) ) {
				((ArnoldOpContext)_localctx).arnoldOperation = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(89);
			operand();
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
	public static class ArnoldNumberExpContext extends OperandContext {
		public TerminalNode ARNOLDFLOAT() { return getToken(HaveFunAndArnoldCParser.ARNOLDFLOAT, 0); }
		public ArnoldNumberExpContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterArnoldNumberExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitArnoldNumberExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitArnoldNumberExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldIdExpContext extends OperandContext {
		public TerminalNode ID() { return getToken(HaveFunAndArnoldCParser.ID, 0); }
		public ArnoldIdExpContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterArnoldIdExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitArnoldIdExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitArnoldIdExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldBoolExpContext extends OperandContext {
		public TerminalNode ARNOLDAT() { return getToken(HaveFunAndArnoldCParser.ARNOLDAT, 0); }
		public TerminalNode ARNOLDBOOL() { return getToken(HaveFunAndArnoldCParser.ARNOLDBOOL, 0); }
		public ArnoldBoolExpContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterArnoldBoolExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitArnoldBoolExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitArnoldBoolExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldStringExpContext extends OperandContext {
		public TerminalNode STRING() { return getToken(HaveFunAndArnoldCParser.STRING, 0); }
		public ArnoldStringExpContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterArnoldStringExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitArnoldStringExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitArnoldStringExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operand);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ArnoldIdExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new ArnoldStringExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(STRING);
				}
				break;
			case ARNOLDFLOAT:
				_localctx = new ArnoldNumberExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(ARNOLDFLOAT);
				}
				break;
			case ARNOLDAT:
				_localctx = new ArnoldBoolExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				match(ARNOLDAT);
				setState(95);
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
		public TerminalNode FUN() { return getToken(HaveFunAndArnoldCParser.FUN, 0); }
		public List<TerminalNode> ID() { return getTokens(HaveFunAndArnoldCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HaveFunAndArnoldCParser.ID, i);
		}
		public TerminalNode LPAR() { return getToken(HaveFunAndArnoldCParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(HaveFunAndArnoldCParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(HaveFunAndArnoldCParser.LBRACE, 0); }
		public TerminalNode RETURN() { return getToken(HaveFunAndArnoldCParser.RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HaveFunAndArnoldCParser.RBRACE, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HaveFunAndArnoldCParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HaveFunAndArnoldCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HaveFunAndArnoldCParser.COMMA, i);
		}
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(FUN);
			setState(99);
			match(ID);
			setState(100);
			match(LPAR);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(101);
				match(ID);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(102);
					match(COMMA);
					setState(103);
					match(ID);
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(RPAR);
			setState(115);
			match(LBRACE);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6954340676939022336L) != 0)) {
				{
				setState(116);
				com(0);
				setState(117);
				match(SEMICOLON);
				}
			}

			setState(121);
			match(RETURN);
			setState(122);
			exp(0);
			setState(123);
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
	public static class VarGlobalAssignContext extends ComContext {
		public TerminalNode ID() { return getToken(HaveFunAndArnoldCParser.ID, 0); }
		public TerminalNode DOTG() { return getToken(HaveFunAndArnoldCParser.DOTG, 0); }
		public TerminalNode ASSIGN() { return getToken(HaveFunAndArnoldCParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarGlobalAssignContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterVarGlobalAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitVarGlobalAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitVarGlobalAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NdContext extends ComContext {
		public List<TerminalNode> LBRACE() { return getTokens(HaveFunAndArnoldCParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(HaveFunAndArnoldCParser.LBRACE, i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(HaveFunAndArnoldCParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(HaveFunAndArnoldCParser.RBRACE, i);
		}
		public TerminalNode ND() { return getToken(HaveFunAndArnoldCParser.ND, 0); }
		public NdContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterNd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitNd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitNd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipContext extends ComContext {
		public TerminalNode SKIPP() { return getToken(HaveFunAndArnoldCParser.SKIPP, 0); }
		public SkipContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldInitContext extends ComContext {
		public List<TerminalNode> DOLLAR() { return getTokens(HaveFunAndArnoldCParser.DOLLAR); }
		public TerminalNode DOLLAR(int i) {
			return getToken(HaveFunAndArnoldCParser.DOLLAR, i);
		}
		public TerminalNode LBRACE() { return getToken(HaveFunAndArnoldCParser.LBRACE, 0); }
		public ArnoldIniContext arnoldIni() {
			return getRuleContext(ArnoldIniContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HaveFunAndArnoldCParser.RBRACE, 0); }
		public ArnoldInitContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterArnoldInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitArnoldInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitArnoldInit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ComContext {
		public TerminalNode WHILE() { return getToken(HaveFunAndArnoldCParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(HaveFunAndArnoldCParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(HaveFunAndArnoldCParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(HaveFunAndArnoldCParser.LBRACE, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HaveFunAndArnoldCParser.RBRACE, 0); }
		public WhileContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ComContext {
		public TerminalNode IF() { return getToken(HaveFunAndArnoldCParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(HaveFunAndArnoldCParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(HaveFunAndArnoldCParser.RPAR, 0); }
		public TerminalNode THEN() { return getToken(HaveFunAndArnoldCParser.THEN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(HaveFunAndArnoldCParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(HaveFunAndArnoldCParser.LBRACE, i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(HaveFunAndArnoldCParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(HaveFunAndArnoldCParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(HaveFunAndArnoldCParser.ELSE, 0); }
		public IfContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitIf(this);
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
		public TerminalNode SEMICOLON() { return getToken(HaveFunAndArnoldCParser.SEMICOLON, 0); }
		public SeqContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitSeq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ComContext {
		public TerminalNode ID() { return getToken(HaveFunAndArnoldCParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(HaveFunAndArnoldCParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutContext extends ComContext {
		public TerminalNode OUT() { return getToken(HaveFunAndArnoldCParser.OUT, 0); }
		public TerminalNode LPAR() { return getToken(HaveFunAndArnoldCParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(HaveFunAndArnoldCParser.RPAR, 0); }
		public OutContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitOut(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_com, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(126);
				match(IF);
				setState(127);
				match(LPAR);
				setState(128);
				exp(0);
				setState(129);
				match(RPAR);
				setState(130);
				match(THEN);
				setState(131);
				match(LBRACE);
				setState(132);
				com(0);
				setState(133);
				match(RBRACE);
				setState(134);
				match(ELSE);
				setState(135);
				match(LBRACE);
				setState(136);
				com(0);
				setState(137);
				match(RBRACE);
				}
				break;
			case 2:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(ID);
				setState(140);
				match(ASSIGN);
				setState(141);
				exp(0);
				}
				break;
			case 3:
				{
				_localctx = new VarGlobalAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(ID);
				setState(143);
				match(DOTG);
				setState(144);
				match(ASSIGN);
				setState(145);
				exp(0);
				}
				break;
			case 4:
				{
				_localctx = new SkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(SKIPP);
				}
				break;
			case 5:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(WHILE);
				setState(148);
				match(LPAR);
				setState(149);
				exp(0);
				setState(150);
				match(RPAR);
				setState(151);
				match(LBRACE);
				setState(152);
				com(0);
				setState(153);
				match(RBRACE);
				}
				break;
			case 6:
				{
				_localctx = new OutContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(OUT);
				setState(156);
				match(LPAR);
				setState(157);
				exp(0);
				setState(158);
				match(RPAR);
				}
				break;
			case 7:
				{
				_localctx = new NdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(LBRACE);
				setState(161);
				com(0);
				setState(162);
				match(RBRACE);
				setState(163);
				match(ND);
				setState(164);
				match(LBRACE);
				setState(165);
				com(0);
				setState(166);
				match(RBRACE);
				}
				break;
			case 8:
				{
				_localctx = new ArnoldInitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(DOLLAR);
				setState(169);
				match(LBRACE);
				setState(170);
				arnoldIni();
				setState(171);
				match(RBRACE);
				setState(172);
				match(DOLLAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
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
					setState(176);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(177);
					match(SEMICOLON);
					setState(178);
					com(6);
					}
					} 
				}
				setState(183);
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
		public TerminalNode NAT() { return getToken(HaveFunAndArnoldCParser.NAT, 0); }
		public NatContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterNat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitNat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitNat(this);
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
		public TerminalNode PLUS() { return getToken(HaveFunAndArnoldCParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HaveFunAndArnoldCParser.MINUS, 0); }
		public PlusMinusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ExpContext {
		public TerminalNode BOOL() { return getToken(HaveFunAndArnoldCParser.BOOL, 0); }
		public BoolContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalIDContext extends ExpContext {
		public TerminalNode ID() { return getToken(HaveFunAndArnoldCParser.ID, 0); }
		public TerminalNode DOTG() { return getToken(HaveFunAndArnoldCParser.DOTG, 0); }
		public GlobalIDContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterGlobalID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitGlobalID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitGlobalID(this);
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
		public TerminalNode DIV() { return getToken(HaveFunAndArnoldCParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(HaveFunAndArnoldCParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(HaveFunAndArnoldCParser.MOD, 0); }
		public DivMulModContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterDivMulMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitDivMulMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitDivMulMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ExpContext {
		public TerminalNode NOT() { return getToken(HaveFunAndArnoldCParser.NOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitNot(this);
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
		public TerminalNode EQQ() { return getToken(HaveFunAndArnoldCParser.EQQ, 0); }
		public TerminalNode NEQ() { return getToken(HaveFunAndArnoldCParser.NEQ, 0); }
		public EqExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitEqExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitEqExp(this);
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
		public TerminalNode LT() { return getToken(HaveFunAndArnoldCParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(HaveFunAndArnoldCParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(HaveFunAndArnoldCParser.GEQ, 0); }
		public TerminalNode GT() { return getToken(HaveFunAndArnoldCParser.GT, 0); }
		public CmpExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterCmpExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitCmpExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitCmpExp(this);
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
		public TerminalNode AND() { return getToken(HaveFunAndArnoldCParser.AND, 0); }
		public TerminalNode OR() { return getToken(HaveFunAndArnoldCParser.OR, 0); }
		public LogicExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterLogicExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitLogicExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitLogicExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParExpContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(HaveFunAndArnoldCParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(HaveFunAndArnoldCParser.RPAR, 0); }
		public ParExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterParExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitParExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitParExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ExpContext {
		public TerminalNode ID() { return getToken(HaveFunAndArnoldCParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(HaveFunAndArnoldCParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(HaveFunAndArnoldCParser.RPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HaveFunAndArnoldCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HaveFunAndArnoldCParser.COMMA, i);
		}
		public FunctionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitFunction(this);
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
		public TerminalNode POW() { return getToken(HaveFunAndArnoldCParser.POW, 0); }
		public PowContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpContext {
		public TerminalNode ID() { return getToken(HaveFunAndArnoldCParser.ID, 0); }
		public IdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaveFunAndArnoldCListener ) ((HaveFunAndArnoldCListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunAndArnoldCVisitor ) return ((HaveFunAndArnoldCVisitor<? extends T>)visitor).visitId(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new NatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(185);
				match(NAT);
				}
				break;
			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(BOOL);
				}
				break;
			case 3:
				{
				_localctx = new FunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(ID);
				setState(188);
				match(LPAR);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4620697615929966592L) != 0)) {
					{
					setState(189);
					exp(0);
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(190);
						match(COMMA);
						setState(191);
						exp(0);
						}
						}
						setState(196);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(199);
				match(RPAR);
				}
				break;
			case 4:
				{
				_localctx = new ParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				match(LPAR);
				setState(201);
				exp(0);
				setState(202);
				match(RPAR);
				}
				break;
			case 5:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				match(NOT);
				setState(205);
				exp(8);
				}
				break;
			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new GlobalIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(ID);
				setState(208);
				match(DOTG);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(229);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(211);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(212);
						match(POW);
						setState(213);
						exp(9);
						}
						break;
					case 2:
						{
						_localctx = new DivMulModContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(214);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(215);
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
						setState(216);
						exp(8);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(217);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(218);
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
						setState(219);
						exp(7);
						}
						break;
					case 4:
						{
						_localctx = new CmpExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(220);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(221);
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
						setState(222);
						exp(6);
						}
						break;
					case 5:
						{
						_localctx = new EqExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(223);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(224);
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
						setState(225);
						exp(5);
						}
						break;
					case 6:
						{
						_localctx = new LogicExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(226);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(227);
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
						setState(228);
						exp(4);
						}
						break;
					}
					} 
				}
				setState(233);
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
		case 7:
			return com_sempred((ComContext)_localctx, predIndex);
		case 8:
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
		"\u0004\u0001A\u00eb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005"+
		"\u0001$\b\u0001\n\u0001\f\u0001\'\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0004\u0003@\b\u0003\u000b\u0003\f\u0003"+
		"A\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003M\b\u0003\u000b\u0003"+
		"\f\u0003N\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003W\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"a\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006i\b\u0006\n\u0006\f\u0006l\t\u0006\u0005\u0006"+
		"n\b\u0006\n\u0006\f\u0006q\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006x\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00af\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00b4\b\u0007\n\u0007\f\u0007\u00b7"+
		"\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u00c1\b\b\n\b\f\b\u00c4\t\b\u0003\b\u00c6\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00d2\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u00e6\b\b\n\b\f\b\u00e9\t\b\u0001\b\u0000\u0002\u000e"+
		"\u0010\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0007\u0002\u0000"+
		">>@@\u0001\u0000\u0007\u000e\u0001\u0000\u001e \u0001\u0000\u001c\u001d"+
		"\u0001\u0000&)\u0001\u0000$%\u0001\u0000\"#\u0107\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000"+
		"\u0006V\u0001\u0000\u0000\u0000\bX\u0001\u0000\u0000\u0000\n`\u0001\u0000"+
		"\u0000\u0000\fb\u0001\u0000\u0000\u0000\u000e\u00ae\u0001\u0000\u0000"+
		"\u0000\u0010\u00d1\u0001\u0000\u0000\u0000\u0012\u0014\u0003\f\u0006\u0000"+
		"\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000"+
		"\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000"+
		"\u0016\u001b\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000"+
		"\u0018\u001a\u0003\u0004\u0002\u0000\u0019\u0018\u0001\u0000\u0000\u0000"+
		"\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000"+
		"\u001d\u001b\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u000e\u0007\u0000"+
		"\u001f \u0005\u0000\u0000\u0001 \u0001\u0001\u0000\u0000\u0000!%\u0005"+
		"\u0001\u0000\u0000\"$\u0003\u0006\u0003\u0000#\"\u0001\u0000\u0000\u0000"+
		"$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000"+
		"\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0005\u0002"+
		"\u0000\u0000)\u0003\u0001\u0000\u0000\u0000*+\u00054\u0000\u0000+,\u0005"+
		">\u0000\u0000,-\u00050\u0000\u0000-.\u0003\u0010\b\u0000./\u0005:\u0000"+
		"\u0000/\u0005\u0001\u0000\u0000\u000001\u0005\u0015\u0000\u000012\u0003"+
		"\n\u0005\u000023\u0003\u0006\u0003\u000034\u0005\u0016\u0000\u000045\u0003"+
		"\u0006\u0003\u000056\u0005\u0017\u0000\u00006W\u0001\u0000\u0000\u0000"+
		"78\u0005\u0015\u0000\u000089\u0003\n\u0005\u00009:\u0003\u0006\u0003\u0000"+
		":;\u0005\u0017\u0000\u0000;W\u0001\u0000\u0000\u0000<=\u0005\u0018\u0000"+
		"\u0000=?\u0003\n\u0005\u0000>@\u0003\u0006\u0003\u0000?>\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0005\u0019\u0000\u0000DW\u0001"+
		"\u0000\u0000\u0000EF\u0005\u000f\u0000\u0000FW\u0007\u0000\u0000\u0000"+
		"GH\u0005\u0012\u0000\u0000HI\u0005>\u0000\u0000IJ\u0005\u0013\u0000\u0000"+
		"JL\u0003\n\u0005\u0000KM\u0003\b\u0004\u0000LK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PQ\u0005\u0014\u0000\u0000QW\u0001\u0000"+
		"\u0000\u0000RS\u0005\u0010\u0000\u0000ST\u0005>\u0000\u0000TU\u0005\u0011"+
		"\u0000\u0000UW\u0003\n\u0005\u0000V0\u0001\u0000\u0000\u0000V7\u0001\u0000"+
		"\u0000\u0000V<\u0001\u0000\u0000\u0000VE\u0001\u0000\u0000\u0000VG\u0001"+
		"\u0000\u0000\u0000VR\u0001\u0000\u0000\u0000W\u0007\u0001\u0000\u0000"+
		"\u0000XY\u0007\u0001\u0000\u0000YZ\u0003\n\u0005\u0000Z\t\u0001\u0000"+
		"\u0000\u0000[a\u0005>\u0000\u0000\\a\u0005@\u0000\u0000]a\u0005A\u0000"+
		"\u0000^_\u0005\u0003\u0000\u0000_a\u0005\u0004\u0000\u0000`[\u0001\u0000"+
		"\u0000\u0000`\\\u0001\u0000\u0000\u0000`]\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000a\u000b\u0001\u0000\u0000\u0000bc\u00052\u0000\u0000"+
		"cd\u0005>\u0000\u0000do\u00055\u0000\u0000ej\u0005>\u0000\u0000fg\u0005"+
		"9\u0000\u0000gi\u0005>\u0000\u0000hf\u0001\u0000\u0000\u0000il\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kn\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000me\u0001\u0000\u0000\u0000"+
		"nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rs\u00056\u0000"+
		"\u0000sw\u00057\u0000\u0000tu\u0003\u000e\u0007\u0000uv\u0005:\u0000\u0000"+
		"vx\u0001\u0000\u0000\u0000wt\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000yz\u00053\u0000\u0000z{\u0003\u0010\b"+
		"\u0000{|\u00058\u0000\u0000|\r\u0001\u0000\u0000\u0000}~\u0006\u0007\uffff"+
		"\uffff\u0000~\u007f\u0005+\u0000\u0000\u007f\u0080\u00055\u0000\u0000"+
		"\u0080\u0081\u0003\u0010\b\u0000\u0081\u0082\u00056\u0000\u0000\u0082"+
		"\u0083\u0005,\u0000\u0000\u0083\u0084\u00057\u0000\u0000\u0084\u0085\u0003"+
		"\u000e\u0007\u0000\u0085\u0086\u00058\u0000\u0000\u0086\u0087\u0005-\u0000"+
		"\u0000\u0087\u0088\u00057\u0000\u0000\u0088\u0089\u0003\u000e\u0007\u0000"+
		"\u0089\u008a\u00058\u0000\u0000\u008a\u00af\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0005>\u0000\u0000\u008c\u008d\u00050\u0000\u0000\u008d\u00af\u0003"+
		"\u0010\b\u0000\u008e\u008f\u0005>\u0000\u0000\u008f\u0090\u0005;\u0000"+
		"\u0000\u0090\u0091\u00050\u0000\u0000\u0091\u00af\u0003\u0010\b\u0000"+
		"\u0092\u00af\u0005/\u0000\u0000\u0093\u0094\u0005.\u0000\u0000\u0094\u0095"+
		"\u00055\u0000\u0000\u0095\u0096\u0003\u0010\b\u0000\u0096\u0097\u0005"+
		"6\u0000\u0000\u0097\u0098\u00057\u0000\u0000\u0098\u0099\u0003\u000e\u0007"+
		"\u0000\u0099\u009a\u00058\u0000\u0000\u009a\u00af\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u00051\u0000\u0000\u009c\u009d\u00055\u0000\u0000\u009d\u009e"+
		"\u0003\u0010\b\u0000\u009e\u009f\u00056\u0000\u0000\u009f\u00af\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u00057\u0000\u0000\u00a1\u00a2\u0003\u000e"+
		"\u0007\u0000\u00a2\u00a3\u00058\u0000\u0000\u00a3\u00a4\u0005<\u0000\u0000"+
		"\u00a4\u00a5\u00057\u0000\u0000\u00a5\u00a6\u0003\u000e\u0007\u0000\u00a6"+
		"\u00a7\u00058\u0000\u0000\u00a7\u00af\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0005=\u0000\u0000\u00a9\u00aa\u00057\u0000\u0000\u00aa\u00ab\u0003\u0002"+
		"\u0001\u0000\u00ab\u00ac\u00058\u0000\u0000\u00ac\u00ad\u0005=\u0000\u0000"+
		"\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae}\u0001\u0000\u0000\u0000\u00ae"+
		"\u008b\u0001\u0000\u0000\u0000\u00ae\u008e\u0001\u0000\u0000\u0000\u00ae"+
		"\u0092\u0001\u0000\u0000\u0000\u00ae\u0093\u0001\u0000\u0000\u0000\u00ae"+
		"\u009b\u0001\u0000\u0000\u0000\u00ae\u00a0\u0001\u0000\u0000\u0000\u00ae"+
		"\u00a8\u0001\u0000\u0000\u0000\u00af\u00b5\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\n\u0005\u0000\u0000\u00b1\u00b2\u0005:\u0000\u0000\u00b2\u00b4"+
		"\u0003\u000e\u0007\u0006\u00b3\u00b0\u0001\u0000\u0000\u0000\u00b4\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b6\u000f\u0001\u0000\u0000\u0000\u00b7\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0006\b\uffff\uffff\u0000\u00b9\u00d2"+
		"\u0005\u001a\u0000\u0000\u00ba\u00d2\u0005\u001b\u0000\u0000\u00bb\u00bc"+
		"\u0005>\u0000\u0000\u00bc\u00c5\u00055\u0000\u0000\u00bd\u00c2\u0003\u0010"+
		"\b\u0000\u00be\u00bf\u00059\u0000\u0000\u00bf\u00c1\u0003\u0010\b\u0000"+
		"\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c5\u00bd\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00d2\u00056\u0000\u0000\u00c8"+
		"\u00c9\u00055\u0000\u0000\u00c9\u00ca\u0003\u0010\b\u0000\u00ca\u00cb"+
		"\u00056\u0000\u0000\u00cb\u00d2\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005"+
		"*\u0000\u0000\u00cd\u00d2\u0003\u0010\b\b\u00ce\u00d2\u0005>\u0000\u0000"+
		"\u00cf\u00d0\u0005>\u0000\u0000\u00d0\u00d2\u0005;\u0000\u0000\u00d1\u00b8"+
		"\u0001\u0000\u0000\u0000\u00d1\u00ba\u0001\u0000\u0000\u0000\u00d1\u00bb"+
		"\u0001\u0000\u0000\u0000\u00d1\u00c8\u0001\u0000\u0000\u0000\u00d1\u00cc"+
		"\u0001\u0000\u0000\u0000\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d1\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d2\u00e7\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\n\t\u0000\u0000\u00d4\u00d5\u0005!\u0000\u0000\u00d5\u00e6\u0003\u0010"+
		"\b\t\u00d6\u00d7\n\u0007\u0000\u0000\u00d7\u00d8\u0007\u0002\u0000\u0000"+
		"\u00d8\u00e6\u0003\u0010\b\b\u00d9\u00da\n\u0006\u0000\u0000\u00da\u00db"+
		"\u0007\u0003\u0000\u0000\u00db\u00e6\u0003\u0010\b\u0007\u00dc\u00dd\n"+
		"\u0005\u0000\u0000\u00dd\u00de\u0007\u0004\u0000\u0000\u00de\u00e6\u0003"+
		"\u0010\b\u0006\u00df\u00e0\n\u0004\u0000\u0000\u00e0\u00e1\u0007\u0005"+
		"\u0000\u0000\u00e1\u00e6\u0003\u0010\b\u0005\u00e2\u00e3\n\u0003\u0000"+
		"\u0000\u00e3\u00e4\u0007\u0006\u0000\u0000\u00e4\u00e6\u0003\u0010\b\u0004"+
		"\u00e5\u00d3\u0001\u0000\u0000\u0000\u00e5\u00d6\u0001\u0000\u0000\u0000"+
		"\u00e5\u00d9\u0001\u0000\u0000\u0000\u00e5\u00dc\u0001\u0000\u0000\u0000"+
		"\u00e5\u00df\u0001\u0000\u0000\u0000\u00e5\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u0011\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u0011\u0015\u001b%ANV`jow\u00ae\u00b5"+
		"\u00c2\u00c5\u00d1\u00e5\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}