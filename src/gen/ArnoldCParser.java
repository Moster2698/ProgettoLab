// Generated from /Users/alessio/Code/HaveFunProject/src/ArnoldC.g4 by ANTLR 4.12.0
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
public class ArnoldCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STARTMAIN=1, ENDMAIN=2, AT=3, BOOL=4, TRUE=5, FALSE=6, PLUSOPERATOR=7, 
		MINUSOPERATOR=8, MULTIPLICATIONOPERATOR=9, DIVISIONOPERATOR=10, EQUALTO=11, 
		GREATERTHAN=12, OR=13, AND=14, ARNOLDIFPRINT=15, ARNOLDDECLARE=16, ARNOLDSETINITIALVALUE=17, 
		ARNOLDASSIGNVARIABLE=18, ARNOLDSETVALUE=19, ARNOLDENDASSIGNVARIABLE=20, 
		ARNOLDIF=21, ARNOLDELSE=22, ARNOLDENDIF=23, ARNOLDWHILE=24, ARNOLDENDWHILE=25, 
		ID=26, WS=27, STRING=28, FLOAT=29, ARNOLDPRINT=30;
	public static final int
		RULE_program = 0, RULE_arnoldIni = 1, RULE_arnoldCom = 2, RULE_operations = 3, 
		RULE_operand = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "arnoldIni", "arnoldCom", "operations", "operand"
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
			"'BULLSHIT'", "'YOU HAVE NO RESPECT FOR LOGIC'", "'STICK AROUND'", "'CHILL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STARTMAIN", "ENDMAIN", "AT", "BOOL", "TRUE", "FALSE", "PLUSOPERATOR", 
			"MINUSOPERATOR", "MULTIPLICATIONOPERATOR", "DIVISIONOPERATOR", "EQUALTO", 
			"GREATERTHAN", "OR", "AND", "ARNOLDIFPRINT", "ARNOLDDECLARE", "ARNOLDSETINITIALVALUE", 
			"ARNOLDASSIGNVARIABLE", "ARNOLDSETVALUE", "ARNOLDENDASSIGNVARIABLE", 
			"ARNOLDIF", "ARNOLDELSE", "ARNOLDENDIF", "ARNOLDWHILE", "ARNOLDENDWHILE", 
			"ID", "WS", "STRING", "FLOAT", "ARNOLDPRINT"
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
	public String getGrammarFileName() { return "ArnoldC.g4"; }

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
			setState(10);
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
		public TerminalNode ENDMAIN() { return getToken(ArnoldCParser.ENDMAIN, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(STARTMAIN);
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1092943872L) != 0)) {
				{
				{
				setState(13);
				arnoldCom();
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(19);
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
		public TerminalNode ARNOLDIF() { return getToken(ArnoldCParser.ARNOLDIF, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public List<ArnoldComContext> arnoldCom() {
			return getRuleContexts(ArnoldComContext.class);
		}
		public ArnoldComContext arnoldCom(int i) {
			return getRuleContext(ArnoldComContext.class,i);
		}
		public TerminalNode ARNOLDELSE() { return getToken(ArnoldCParser.ARNOLDELSE, 0); }
		public TerminalNode ARNOLDENDIF() { return getToken(ArnoldCParser.ARNOLDENDIF, 0); }
		public ArnoldIfElseContext(ArnoldComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldIfElse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldWhileContext extends ArnoldComContext {
		public TerminalNode ARNOLDWHILE() { return getToken(ArnoldCParser.ARNOLDWHILE, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode ARNOLDENDWHILE() { return getToken(ArnoldCParser.ARNOLDENDWHILE, 0); }
		public List<ArnoldComContext> arnoldCom() {
			return getRuleContexts(ArnoldComContext.class);
		}
		public ArnoldComContext arnoldCom(int i) {
			return getRuleContext(ArnoldComContext.class,i);
		}
		public ArnoldWhileContext(ArnoldComContext ctx) { copyFrom(ctx); }
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
	public static class ArnoldPrintExpContext extends ArnoldComContext {
		public TerminalNode ARNOLDPRINT() { return getToken(ArnoldCParser.ARNOLDPRINT, 0); }
		public TerminalNode STRING() { return getToken(ArnoldCParser.STRING, 0); }
		public TerminalNode ID() { return getToken(ArnoldCParser.ID, 0); }
		public ArnoldPrintExpContext(ArnoldComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldPrintExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldPrintExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldPrintExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldDeclareContext extends ArnoldComContext {
		public TerminalNode ARNOLDDECLARE() { return getToken(ArnoldCParser.ARNOLDDECLARE, 0); }
		public TerminalNode ID() { return getToken(ArnoldCParser.ID, 0); }
		public TerminalNode ARNOLDSETINITIALVALUE() { return getToken(ArnoldCParser.ARNOLDSETINITIALVALUE, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArnoldDeclareContext(ArnoldComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldDeclare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldIfContext extends ArnoldComContext {
		public TerminalNode ARNOLDIF() { return getToken(ArnoldCParser.ARNOLDIF, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArnoldComContext arnoldCom() {
			return getRuleContext(ArnoldComContext.class,0);
		}
		public TerminalNode ARNOLDENDIF() { return getToken(ArnoldCParser.ARNOLDENDIF, 0); }
		public ArnoldIfContext(ArnoldComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldAssignContext extends ArnoldComContext {
		public TerminalNode ARNOLDASSIGNVARIABLE() { return getToken(ArnoldCParser.ARNOLDASSIGNVARIABLE, 0); }
		public TerminalNode ID() { return getToken(ArnoldCParser.ID, 0); }
		public TerminalNode ARNOLDSETVALUE() { return getToken(ArnoldCParser.ARNOLDSETVALUE, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode ARNOLDENDASSIGNVARIABLE() { return getToken(ArnoldCParser.ARNOLDENDASSIGNVARIABLE, 0); }
		public List<OperationsContext> operations() {
			return getRuleContexts(OperationsContext.class);
		}
		public OperationsContext operations(int i) {
			return getRuleContext(OperationsContext.class,i);
		}
		public ArnoldAssignContext(ArnoldComContext ctx) { copyFrom(ctx); }
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

	public final ArnoldComContext arnoldCom() throws RecognitionException {
		ArnoldComContext _localctx = new ArnoldComContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arnoldCom);
		int _la;
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ArnoldIfElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				match(ARNOLDIF);
				setState(22);
				operand();
				setState(23);
				arnoldCom();
				setState(24);
				match(ARNOLDELSE);
				setState(25);
				arnoldCom();
				setState(26);
				match(ARNOLDENDIF);
				}
				break;
			case 2:
				_localctx = new ArnoldIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				match(ARNOLDIF);
				setState(29);
				operand();
				setState(30);
				arnoldCom();
				setState(31);
				match(ARNOLDENDIF);
				}
				break;
			case 3:
				_localctx = new ArnoldWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(ARNOLDWHILE);
				setState(34);
				operand();
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(35);
					arnoldCom();
					}
					}
					setState(38); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1092943872L) != 0) );
				setState(40);
				match(ARNOLDENDWHILE);
				}
				break;
			case 4:
				_localctx = new ArnoldPrintExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(ARNOLDPRINT);
				setState(43);
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
				setState(44);
				match(ARNOLDASSIGNVARIABLE);
				setState(45);
				match(ID);
				setState(46);
				match(ARNOLDSETVALUE);
				setState(47);
				operand();
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(48);
					operations();
					}
					}
					setState(51); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 32640L) != 0) );
				setState(53);
				match(ARNOLDENDASSIGNVARIABLE);
				}
				break;
			case 6:
				_localctx = new ArnoldDeclareContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				match(ARNOLDDECLARE);
				setState(56);
				match(ID);
				setState(57);
				match(ARNOLDSETINITIALVALUE);
				setState(58);
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
	public static class OperationsContext extends ParserRuleContext {
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
	 
		public OperationsContext() { }
		public void copyFrom(OperationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldPlusContext extends OperationsContext {
		public TerminalNode PLUSOPERATOR() { return getToken(ArnoldCParser.PLUSOPERATOR, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArnoldPlusContext(OperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldOrContext extends OperationsContext {
		public TerminalNode OR() { return getToken(ArnoldCParser.OR, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArnoldOrContext(OperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldGreaterContext extends OperationsContext {
		public TerminalNode GREATERTHAN() { return getToken(ArnoldCParser.GREATERTHAN, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArnoldGreaterContext(OperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldGreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldGreater(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldAndContext extends OperationsContext {
		public TerminalNode AND() { return getToken(ArnoldCParser.AND, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArnoldAndContext(OperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldEqualContext extends OperationsContext {
		public TerminalNode EQUALTO() { return getToken(ArnoldCParser.EQUALTO, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArnoldEqualContext(OperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldDivisionContext extends OperationsContext {
		public TerminalNode DIVISIONOPERATOR() { return getToken(ArnoldCParser.DIVISIONOPERATOR, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArnoldDivisionContext(OperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldMultiplicationContext extends OperationsContext {
		public TerminalNode MULTIPLICATIONOPERATOR() { return getToken(ArnoldCParser.MULTIPLICATIONOPERATOR, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArnoldMultiplicationContext(OperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldMinusContext extends OperationsContext {
		public TerminalNode MINUSOPERATOR() { return getToken(ArnoldCParser.MINUSOPERATOR, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ArnoldMinusContext(OperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operations);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUSOPERATOR:
				_localctx = new ArnoldPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(PLUSOPERATOR);
				setState(62);
				operand();
				}
				break;
			case MINUSOPERATOR:
				_localctx = new ArnoldMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(MINUSOPERATOR);
				setState(64);
				operand();
				}
				break;
			case MULTIPLICATIONOPERATOR:
				_localctx = new ArnoldMultiplicationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(MULTIPLICATIONOPERATOR);
				setState(66);
				operand();
				}
				break;
			case DIVISIONOPERATOR:
				_localctx = new ArnoldDivisionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				match(DIVISIONOPERATOR);
				setState(68);
				operand();
				}
				break;
			case EQUALTO:
				_localctx = new ArnoldEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				match(EQUALTO);
				setState(70);
				operand();
				}
				break;
			case GREATERTHAN:
				_localctx = new ArnoldGreaterContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				match(GREATERTHAN);
				setState(72);
				operand();
				}
				break;
			case OR:
				_localctx = new ArnoldOrContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(73);
				match(OR);
				setState(74);
				operand();
				}
				break;
			case AND:
				_localctx = new ArnoldAndContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(75);
				match(AND);
				setState(76);
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
		public TerminalNode FLOAT() { return getToken(ArnoldCParser.FLOAT, 0); }
		public ArnoldNumberexprContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldNumberexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldNumberexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldNumberexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldStringContext extends OperandContext {
		public TerminalNode STRING() { return getToken(ArnoldCParser.STRING, 0); }
		public ArnoldStringContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldIdexprContext extends OperandContext {
		public TerminalNode ID() { return getToken(ArnoldCParser.ID, 0); }
		public ArnoldIdexprContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldIdexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldIdexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldIdexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldBoolExpContext extends OperandContext {
		public TerminalNode AT() { return getToken(ArnoldCParser.AT, 0); }
		public TerminalNode BOOL() { return getToken(ArnoldCParser.BOOL, 0); }
		public ArnoldBoolExpContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterArnoldBoolExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitArnoldBoolExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitArnoldBoolExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operand);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ArnoldIdexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new ArnoldStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(STRING);
				}
				break;
			case FLOAT:
				_localctx = new ArnoldNumberexprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(FLOAT);
				}
				break;
			case AT:
				_localctx = new ArnoldBoolExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				match(AT);
				setState(83);
				match(BOOL);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001eW\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001\u000f\b\u0001\n"+
		"\u0001\f\u0001\u0012\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0004\u0002%\b\u0002\u000b\u0002\f\u0002&\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0004\u00022\b\u0002\u000b\u0002\f\u00023\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002<\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003N\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004U\b\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002"+
		"\u0004\u0006\b\u0000\u0001\u0002\u0000\u001a\u001a\u001c\u001cc\u0000"+
		"\n\u0001\u0000\u0000\u0000\u0002\f\u0001\u0000\u0000\u0000\u0004;\u0001"+
		"\u0000\u0000\u0000\u0006M\u0001\u0000\u0000\u0000\bT\u0001\u0000\u0000"+
		"\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b\u0001\u0001\u0000\u0000\u0000"+
		"\f\u0010\u0005\u0001\u0000\u0000\r\u000f\u0003\u0004\u0002\u0000\u000e"+
		"\r\u0001\u0000\u0000\u0000\u000f\u0012\u0001\u0000\u0000\u0000\u0010\u000e"+
		"\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0013"+
		"\u0001\u0000\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0005\u0002\u0000\u0000\u0014\u0003\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0005\u0015\u0000\u0000\u0016\u0017\u0003\b\u0004\u0000\u0017\u0018\u0003"+
		"\u0004\u0002\u0000\u0018\u0019\u0005\u0016\u0000\u0000\u0019\u001a\u0003"+
		"\u0004\u0002\u0000\u001a\u001b\u0005\u0017\u0000\u0000\u001b<\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0005\u0015\u0000\u0000\u001d\u001e\u0003\b\u0004"+
		"\u0000\u001e\u001f\u0003\u0004\u0002\u0000\u001f \u0005\u0017\u0000\u0000"+
		" <\u0001\u0000\u0000\u0000!\"\u0005\u0018\u0000\u0000\"$\u0003\b\u0004"+
		"\u0000#%\u0003\u0004\u0002\u0000$#\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0001"+
		"\u0000\u0000\u0000()\u0005\u0019\u0000\u0000)<\u0001\u0000\u0000\u0000"+
		"*+\u0005\u001e\u0000\u0000+<\u0007\u0000\u0000\u0000,-\u0005\u0012\u0000"+
		"\u0000-.\u0005\u001a\u0000\u0000./\u0005\u0013\u0000\u0000/1\u0003\b\u0004"+
		"\u000002\u0003\u0006\u0003\u000010\u0001\u0000\u0000\u000023\u0001\u0000"+
		"\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u000056\u0005\u0014\u0000\u00006<\u0001\u0000\u0000\u0000"+
		"78\u0005\u0010\u0000\u000089\u0005\u001a\u0000\u00009:\u0005\u0011\u0000"+
		"\u0000:<\u0003\b\u0004\u0000;\u0015\u0001\u0000\u0000\u0000;\u001c\u0001"+
		"\u0000\u0000\u0000;!\u0001\u0000\u0000\u0000;*\u0001\u0000\u0000\u0000"+
		";,\u0001\u0000\u0000\u0000;7\u0001\u0000\u0000\u0000<\u0005\u0001\u0000"+
		"\u0000\u0000=>\u0005\u0007\u0000\u0000>N\u0003\b\u0004\u0000?@\u0005\b"+
		"\u0000\u0000@N\u0003\b\u0004\u0000AB\u0005\t\u0000\u0000BN\u0003\b\u0004"+
		"\u0000CD\u0005\n\u0000\u0000DN\u0003\b\u0004\u0000EF\u0005\u000b\u0000"+
		"\u0000FN\u0003\b\u0004\u0000GH\u0005\f\u0000\u0000HN\u0003\b\u0004\u0000"+
		"IJ\u0005\r\u0000\u0000JN\u0003\b\u0004\u0000KL\u0005\u000e\u0000\u0000"+
		"LN\u0003\b\u0004\u0000M=\u0001\u0000\u0000\u0000M?\u0001\u0000\u0000\u0000"+
		"MA\u0001\u0000\u0000\u0000MC\u0001\u0000\u0000\u0000ME\u0001\u0000\u0000"+
		"\u0000MG\u0001\u0000\u0000\u0000MI\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000N\u0007\u0001\u0000\u0000\u0000OU\u0005\u001a\u0000\u0000"+
		"PU\u0005\u001c\u0000\u0000QU\u0005\u001d\u0000\u0000RS\u0005\u0003\u0000"+
		"\u0000SU\u0005\u0004\u0000\u0000TO\u0001\u0000\u0000\u0000TP\u0001\u0000"+
		"\u0000\u0000TQ\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000U\t\u0001"+
		"\u0000\u0000\u0000\u0006\u0010&3;MT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}