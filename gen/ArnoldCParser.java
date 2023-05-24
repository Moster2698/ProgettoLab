// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ArnoldCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STARTMAIN=1, ENDMAIN=2, AT=3, TRUE=4, FALSE=5, PLUSOPERATOR=6, MINUSOPERATOR=7, 
		MULTIPLICATIONOPERATOR=8, DIVISIONOPERATOR=9, EQUALTO=10, GREATERTHAN=11, 
		OR=12, AND=13, PRINT=14, DECLARE=15, SETINITIALVALUE=16, ASSIGNVARIABLE=17, 
		SETVALUE=18, ENDASSIGNVARIABLE=19, IF=20, ELSE=21, ENDIF=22, WHILE=23, 
		ENDWHILE=24, ID=25, NUMBER=26, STRING_LITERAL=27, WS=28;
	public static final int
		RULE_program = 0, RULE_arnoldIni = 1, RULE_coms = 2, RULE_com = 3, RULE_expression = 4, 
		RULE_operations = 5, RULE_operation = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "arnoldIni", "coms", "com", "expression", "operations", "operation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'IT'S SHOWTIME'", "'YOU HAVE BEEN TERMINATED'", "'@'", "'NO PROBLEMO'", 
			"'I LIED'", "'GET UP'", "'GET DOWN'", "'YOU'RE FIRED'", "'HE HAD TO SPLIT'", 
			"'YOU ARE NOT YOU YOU ARE ME'", "'LET OFF SOME STEAM BENNET'", "'CONSIDER THAT A DIVORCE'", 
			"'KNOCK KNOCK'", "'TALK TO THE HAND'", "'HEY CHRISTMAS TREE'", "'YOU SET US UP'", 
			"'GET TO THE CHOPPER'", "'HERE IS MY INVITATION'", "'ENOUGH TALK'", "'BECAUSE I'M GOING TO SAY PLEASE'", 
			"'BULLSHIT'", "'YOU HAVE NO RESPECT FOR LOGIC'", "'STICK AROUND'", "'CHILL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STARTMAIN", "ENDMAIN", "AT", "TRUE", "FALSE", "PLUSOPERATOR", 
			"MINUSOPERATOR", "MULTIPLICATIONOPERATOR", "DIVISIONOPERATOR", "EQUALTO", 
			"GREATERTHAN", "OR", "AND", "PRINT", "DECLARE", "SETINITIALVALUE", "ASSIGNVARIABLE", 
			"SETVALUE", "ENDASSIGNVARIABLE", "IF", "ELSE", "ENDIF", "WHILE", "ENDWHILE", 
			"ID", "NUMBER", "STRING_LITERAL", "WS"
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

	public ArnoldCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
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
		public TerminalNode STARTMAIN() { return getToken(ArnoldCParser.STARTMAIN, 0); }
		public ComsContext coms() {
			return getRuleContext(ComsContext.class,0);
		}
		public TerminalNode ENDMAIN() { return getToken(ArnoldCParser.ENDMAIN, 0); }
		public ArnoldIniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arnoldIni; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldIni(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldIni(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArnoldIniContext arnoldIni() throws RecognitionException {
		ArnoldIniContext _localctx = new ArnoldIniContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_arnoldIni);
		try {
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(STARTMAIN);
				setState(17);
				coms();
				setState(18);
				match(ENDMAIN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(STARTMAIN);
				setState(21);
				match(ENDMAIN);
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
	public static class ComsContext extends ParserRuleContext {
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public ComsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterComs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitComs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitComs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComsContext coms() throws RecognitionException {
		ComsContext _localctx = new ComsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_coms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 9617408L) != 0) {
				{
				{
				setState(24);
				com();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ArnoldWhileContext extends ComContext {
		public TerminalNode WHILE() { return getToken(ArnoldCParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode ENDWHILE() { return getToken(ArnoldCParser.ENDWHILE, 0); }
		public ArnoldWhileContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldPrintIDContext extends ComContext {
		public TerminalNode PRINT() { return getToken(ArnoldCParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(ArnoldCParser.ID, 0); }
		public ArnoldPrintIDContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldPrintID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldPrintID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldPrintID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldIFContext extends ComContext {
		public TerminalNode IF() { return getToken(ArnoldCParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(ArnoldCParser.ENDIF, 0); }
		public ArnoldIFContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldIF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldIF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldIF(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldAssignContext extends ComContext {
		public TerminalNode ASSIGNVARIABLE() { return getToken(ArnoldCParser.ASSIGNVARIABLE, 0); }
		public TerminalNode ID() { return getToken(ArnoldCParser.ID, 0); }
		public TerminalNode SETVALUE() { return getToken(ArnoldCParser.SETVALUE, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public TerminalNode ENDASSIGNVARIABLE() { return getToken(ArnoldCParser.ENDASSIGNVARIABLE, 0); }
		public ArnoldAssignContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldDECLAREContext extends ComContext {
		public TerminalNode DECLARE() { return getToken(ArnoldCParser.DECLARE, 0); }
		public TerminalNode ID() { return getToken(ArnoldCParser.ID, 0); }
		public TerminalNode SETINITIALVALUE() { return getToken(ArnoldCParser.SETINITIALVALUE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArnoldDECLAREContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldDECLARE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldDECLARE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldDECLARE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldIFElseContext extends ComContext {
		public TerminalNode IF() { return getToken(ArnoldCParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ArnoldCParser.ELSE, 0); }
		public TerminalNode ENDIF() { return getToken(ArnoldCParser.ENDIF, 0); }
		public ArnoldIFElseContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldIFElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldIFElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldIFElse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldPrintStringContext extends ComContext {
		public TerminalNode PRINT() { return getToken(ArnoldCParser.PRINT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ArnoldCParser.STRING_LITERAL, 0); }
		public ArnoldPrintStringContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldPrintString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldPrintString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldPrintString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_com);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ArnoldIFElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(IF);
				setState(31);
				expression();
				setState(32);
				com();
				setState(33);
				match(ELSE);
				setState(34);
				com();
				setState(35);
				match(ENDIF);
				}
				break;
			case 2:
				_localctx = new ArnoldIFContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(IF);
				setState(38);
				expression();
				setState(39);
				com();
				setState(40);
				match(ENDIF);
				}
				break;
			case 3:
				_localctx = new ArnoldWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(WHILE);
				setState(43);
				expression();
				setState(44);
				com();
				setState(45);
				match(ENDWHILE);
				}
				break;
			case 4:
				_localctx = new ArnoldPrintIDContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(PRINT);
				setState(48);
				match(ID);
				}
				break;
			case 5:
				_localctx = new ArnoldPrintStringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				match(PRINT);
				setState(50);
				match(STRING_LITERAL);
				}
				break;
			case 6:
				_localctx = new ArnoldAssignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				match(ASSIGNVARIABLE);
				setState(52);
				match(ID);
				setState(53);
				match(SETVALUE);
				setState(54);
				com();
				setState(55);
				operations(0);
				setState(56);
				match(ENDASSIGNVARIABLE);
				}
				break;
			case 7:
				_localctx = new ArnoldDECLAREContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(58);
				match(DECLARE);
				setState(59);
				match(ID);
				setState(60);
				match(SETINITIALVALUE);
				setState(61);
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
	public static class VarexprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(ArnoldCParser.ID, 0); }
		public VarexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterVarexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitVarexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitVarexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueexprContext extends ExpressionContext {
		public TerminalNode AT() { return getToken(ArnoldCParser.AT, 0); }
		public TerminalNode TRUE() { return getToken(ArnoldCParser.TRUE, 0); }
		public TrueexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterTrueexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitTrueexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitTrueexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberexprContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(ArnoldCParser.NUMBER, 0); }
		public NumberexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterNumberexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitNumberexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitNumberexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseexprContext extends ExpressionContext {
		public TerminalNode AT() { return getToken(ArnoldCParser.AT, 0); }
		public TerminalNode FALSE() { return getToken(ArnoldCParser.FALSE, 0); }
		public FalseexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterFalseexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitFalseexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitFalseexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new VarexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(ID);
				}
				break;
			case 2:
				_localctx = new NumberexprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(NUMBER);
				}
				break;
			case 3:
				_localctx = new TrueexprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(AT);
				setState(67);
				match(TRUE);
				}
				break;
			case 4:
				_localctx = new FalseexprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(AT);
				setState(69);
				match(FALSE);
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
	public static class OperationsContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitOperations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		return operations(0);
	}

	private OperationsContext operations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperationsContext _localctx = new OperationsContext(_ctx, _parentState);
		OperationsContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_operations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(73);
			operation();
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operations);
					setState(75);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(76);
					operation();
					}
					} 
				}
				setState(81);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	 
		public OperationContext() { }
		public void copyFrom(OperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OropContext extends OperationContext {
		public TerminalNode OR() { return getToken(ArnoldCParser.OR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OropContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterOrop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitOrop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitOrop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualopContext extends OperationContext {
		public TerminalNode EQUALTO() { return getToken(ArnoldCParser.EQUALTO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EqualopContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterEqualop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitEqualop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitEqualop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndopContext extends OperationContext {
		public TerminalNode AND() { return getToken(ArnoldCParser.AND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AndopContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterAndop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitAndop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitAndop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreateropContext extends OperationContext {
		public TerminalNode GREATERTHAN() { return getToken(ArnoldCParser.GREATERTHAN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GreateropContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterGreaterop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitGreaterop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitGreaterop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusopContext extends OperationContext {
		public TerminalNode MINUSOPERATOR() { return getToken(ArnoldCParser.MINUSOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MinusopContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterMinusop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitMinusop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitMinusop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusopContext extends OperationContext {
		public TerminalNode PLUSOPERATOR() { return getToken(ArnoldCParser.PLUSOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PlusopContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterPlusop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitPlusop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitPlusop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicationopContext extends OperationContext {
		public TerminalNode MULTIPLICATIONOPERATOR() { return getToken(ArnoldCParser.MULTIPLICATIONOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MultiplicationopContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterMultiplicationop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitMultiplicationop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitMultiplicationop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisionopContext extends OperationContext {
		public TerminalNode DIVISIONOPERATOR() { return getToken(ArnoldCParser.DIVISIONOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DivisionopContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterDivisionop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitDivisionop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitDivisionop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operation);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUSOPERATOR:
				_localctx = new PlusopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(PLUSOPERATOR);
				setState(83);
				expression();
				}
				break;
			case MINUSOPERATOR:
				_localctx = new MinusopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(MINUSOPERATOR);
				setState(85);
				expression();
				}
				break;
			case MULTIPLICATIONOPERATOR:
				_localctx = new MultiplicationopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(MULTIPLICATIONOPERATOR);
				setState(87);
				expression();
				}
				break;
			case DIVISIONOPERATOR:
				_localctx = new DivisionopContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(DIVISIONOPERATOR);
				setState(89);
				expression();
				}
				break;
			case EQUALTO:
				_localctx = new EqualopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				match(EQUALTO);
				setState(91);
				expression();
				}
				break;
			case GREATERTHAN:
				_localctx = new GreateropContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				match(GREATERTHAN);
				setState(93);
				expression();
				}
				break;
			case OR:
				_localctx = new OropContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				match(OR);
				setState(95);
				expression();
				}
				break;
			case AND:
				_localctx = new AndopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(96);
				match(AND);
				setState(97);
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
		case 5:
			return operations_sempred((OperationsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operations_sempred(OperationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001ce\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u0017\b\u0001\u0001\u0002\u0005\u0002\u001a\b\u0002\n\u0002\f\u0002"+
		"\u001d\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003?\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"G\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005N\b\u0005\n\u0005\f\u0005Q\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006c\b\u0006\u0001\u0006\u0000\u0001"+
		"\n\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0000p\u0000\u000e\u0001"+
		"\u0000\u0000\u0000\u0002\u0016\u0001\u0000\u0000\u0000\u0004\u001b\u0001"+
		"\u0000\u0000\u0000\u0006>\u0001\u0000\u0000\u0000\bF\u0001\u0000\u0000"+
		"\u0000\nH\u0001\u0000\u0000\u0000\fb\u0001\u0000\u0000\u0000\u000e\u000f"+
		"\u0003\u0002\u0001\u0000\u000f\u0001\u0001\u0000\u0000\u0000\u0010\u0011"+
		"\u0005\u0001\u0000\u0000\u0011\u0012\u0003\u0004\u0002\u0000\u0012\u0013"+
		"\u0005\u0002\u0000\u0000\u0013\u0017\u0001\u0000\u0000\u0000\u0014\u0015"+
		"\u0005\u0001\u0000\u0000\u0015\u0017\u0005\u0002\u0000\u0000\u0016\u0010"+
		"\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0017\u0003"+
		"\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0006\u0003\u0000\u0019\u0018"+
		"\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u0019"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u0005"+
		"\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0005\u0014\u0000\u0000\u001f \u0003\b\u0004\u0000 !\u0003\u0006\u0003"+
		"\u0000!\"\u0005\u0015\u0000\u0000\"#\u0003\u0006\u0003\u0000#$\u0005\u0016"+
		"\u0000\u0000$?\u0001\u0000\u0000\u0000%&\u0005\u0014\u0000\u0000&\'\u0003"+
		"\b\u0004\u0000\'(\u0003\u0006\u0003\u0000()\u0005\u0016\u0000\u0000)?"+
		"\u0001\u0000\u0000\u0000*+\u0005\u0017\u0000\u0000+,\u0003\b\u0004\u0000"+
		",-\u0003\u0006\u0003\u0000-.\u0005\u0018\u0000\u0000.?\u0001\u0000\u0000"+
		"\u0000/0\u0005\u000e\u0000\u00000?\u0005\u0019\u0000\u000012\u0005\u000e"+
		"\u0000\u00002?\u0005\u001b\u0000\u000034\u0005\u0011\u0000\u000045\u0005"+
		"\u0019\u0000\u000056\u0005\u0012\u0000\u000067\u0003\u0006\u0003\u0000"+
		"78\u0003\n\u0005\u000089\u0005\u0013\u0000\u00009?\u0001\u0000\u0000\u0000"+
		":;\u0005\u000f\u0000\u0000;<\u0005\u0019\u0000\u0000<=\u0005\u0010\u0000"+
		"\u0000=?\u0003\b\u0004\u0000>\u001e\u0001\u0000\u0000\u0000>%\u0001\u0000"+
		"\u0000\u0000>*\u0001\u0000\u0000\u0000>/\u0001\u0000\u0000\u0000>1\u0001"+
		"\u0000\u0000\u0000>3\u0001\u0000\u0000\u0000>:\u0001\u0000\u0000\u0000"+
		"?\u0007\u0001\u0000\u0000\u0000@G\u0005\u0019\u0000\u0000AG\u0005\u001a"+
		"\u0000\u0000BC\u0005\u0003\u0000\u0000CG\u0005\u0004\u0000\u0000DE\u0005"+
		"\u0003\u0000\u0000EG\u0005\u0005\u0000\u0000F@\u0001\u0000\u0000\u0000"+
		"FA\u0001\u0000\u0000\u0000FB\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000G\t\u0001\u0000\u0000\u0000HI\u0006\u0005\uffff\uffff\u0000IJ\u0003"+
		"\f\u0006\u0000JO\u0001\u0000\u0000\u0000KL\n\u0001\u0000\u0000LN\u0003"+
		"\f\u0006\u0000MK\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u000b\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000RS\u0005\u0006\u0000\u0000Sc\u0003\b\u0004"+
		"\u0000TU\u0005\u0007\u0000\u0000Uc\u0003\b\u0004\u0000VW\u0005\b\u0000"+
		"\u0000Wc\u0003\b\u0004\u0000XY\u0005\t\u0000\u0000Yc\u0003\b\u0004\u0000"+
		"Z[\u0005\n\u0000\u0000[c\u0003\b\u0004\u0000\\]\u0005\u000b\u0000\u0000"+
		"]c\u0003\b\u0004\u0000^_\u0005\f\u0000\u0000_c\u0003\b\u0004\u0000`a\u0005"+
		"\r\u0000\u0000ac\u0003\b\u0004\u0000bR\u0001\u0000\u0000\u0000bT\u0001"+
		"\u0000\u0000\u0000bV\u0001\u0000\u0000\u0000bX\u0001\u0000\u0000\u0000"+
		"bZ\u0001\u0000\u0000\u0000b\\\u0001\u0000\u0000\u0000b^\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000c\r\u0001\u0000\u0000\u0000\u0006\u0016"+
		"\u001b>FOb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}