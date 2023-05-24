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
		BEGINMAIN=1, ENDMAIN=2, AT=3, TRUE=4, FALSE=5, PLUSOPERATOR=6, MINUSOPERATOR=7, 
		MULTIPLICATIONOPERATOR=8, DIVISIONOPERATOR=9, EQUALTO=10, GREATERTHAN=11, 
		OR=12, AND=13, PRINT=14, DECLAREINT=15, SETINITIALVALUE=16, ASSIGNVARIABLE=17, 
		SETVALUE=18, ENDASSIGNVARIABLE=19, IF=20, ELSE=21, ENDIF=22, WHILE=23, 
		ENDWHILE=24, IDENTIFIER=25, NUMBER=26, STRING_LITERAL=27, WS=28;
	public static final int
		RULE_program = 0, RULE_main_function = 1, RULE_statements = 2, RULE_statement = 3, 
		RULE_print_stmt = 4, RULE_print_sconst_stmt = 5, RULE_print_var_stmt = 6, 
		RULE_var_decl_stmt = 7, RULE_condition_stmt = 8, RULE_while_stmt = 9, 
		RULE_expression = 10, RULE_var_assign_stmt = 11, RULE_operations = 12, 
		RULE_operation = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main_function", "statements", "statement", "print_stmt", 
			"print_sconst_stmt", "print_var_stmt", "var_decl_stmt", "condition_stmt", 
			"while_stmt", "expression", "var_assign_stmt", "operations", "operation"
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
			null, "BEGINMAIN", "ENDMAIN", "AT", "TRUE", "FALSE", "PLUSOPERATOR", 
			"MINUSOPERATOR", "MULTIPLICATIONOPERATOR", "DIVISIONOPERATOR", "EQUALTO", 
			"GREATERTHAN", "OR", "AND", "PRINT", "DECLAREINT", "SETINITIALVALUE", 
			"ASSIGNVARIABLE", "SETVALUE", "ENDASSIGNVARIABLE", "IF", "ELSE", "ENDIF", 
			"WHILE", "ENDWHILE", "IDENTIFIER", "NUMBER", "STRING_LITERAL", "WS"
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
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
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
			setState(28);
			main_function();
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
	public static class Main_functionContext extends ParserRuleContext {
		public TerminalNode BEGINMAIN() { return getToken(ArnoldCParser.BEGINMAIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ENDMAIN() { return getToken(ArnoldCParser.ENDMAIN, 0); }
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterMain_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitMain_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitMain_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main_function);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(BEGINMAIN);
				setState(31);
				statements();
				setState(32);
				match(ENDMAIN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(BEGINMAIN);
				setState(35);
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
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 9617408L) != 0) {
				{
				{
				setState(38);
				statement();
				}
				}
				setState(43);
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
	public static class StatementContext extends ParserRuleContext {
		public Var_decl_stmtContext var_decl_stmt() {
			return getRuleContext(Var_decl_stmtContext.class,0);
		}
		public Var_assign_stmtContext var_assign_stmt() {
			return getRuleContext(Var_assign_stmtContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Condition_stmtContext condition_stmt() {
			return getRuleContext(Condition_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLAREINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				var_decl_stmt();
				}
				break;
			case ASSIGNVARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				var_assign_stmt();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				print_stmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				condition_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				while_stmt();
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
	public static class Print_stmtContext extends ParserRuleContext {
		public Print_var_stmtContext print_var_stmt() {
			return getRuleContext(Print_var_stmtContext.class,0);
		}
		public Print_sconst_stmtContext print_sconst_stmt() {
			return getRuleContext(Print_sconst_stmtContext.class,0);
		}
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitPrint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print_stmt);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				print_var_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				print_sconst_stmt();
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
	public static class Print_sconst_stmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ArnoldCParser.PRINT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ArnoldCParser.STRING_LITERAL, 0); }
		public Print_sconst_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_sconst_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterPrint_sconst_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitPrint_sconst_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitPrint_sconst_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_sconst_stmtContext print_sconst_stmt() throws RecognitionException {
		Print_sconst_stmtContext _localctx = new Print_sconst_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print_sconst_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(PRINT);
			setState(56);
			match(STRING_LITERAL);
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
	public static class Print_var_stmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ArnoldCParser.PRINT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArnoldCParser.IDENTIFIER, 0); }
		public Print_var_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_var_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterPrint_var_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitPrint_var_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitPrint_var_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_var_stmtContext print_var_stmt() throws RecognitionException {
		Print_var_stmtContext _localctx = new Print_var_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print_var_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(PRINT);
			setState(59);
			match(IDENTIFIER);
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
	public static class Var_decl_stmtContext extends ParserRuleContext {
		public TerminalNode DECLAREINT() { return getToken(ArnoldCParser.DECLAREINT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArnoldCParser.IDENTIFIER, 0); }
		public TerminalNode SETINITIALVALUE() { return getToken(ArnoldCParser.SETINITIALVALUE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_decl_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterVar_decl_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitVar_decl_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitVar_decl_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_decl_stmtContext var_decl_stmt() throws RecognitionException {
		Var_decl_stmtContext _localctx = new Var_decl_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_decl_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(DECLAREINT);
			setState(62);
			match(IDENTIFIER);
			setState(63);
			match(SETINITIALVALUE);
			setState(64);
			expression();
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
	public static class Condition_stmtContext extends ParserRuleContext {
		public Condition_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_stmt; }
	 
		public Condition_stmtContext() { }
		public void copyFrom(Condition_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfelseendifContext extends Condition_stmtContext {
		public TerminalNode IF() { return getToken(ArnoldCParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ArnoldCParser.ELSE, 0); }
		public TerminalNode ENDIF() { return getToken(ArnoldCParser.ENDIF, 0); }
		public IfelseendifContext(Condition_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterIfelseendif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitIfelseendif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitIfelseendif(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfendidContext extends Condition_stmtContext {
		public TerminalNode IF() { return getToken(ArnoldCParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(ArnoldCParser.ENDIF, 0); }
		public IfendidContext(Condition_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterIfendid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitIfendid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitIfendid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_stmtContext condition_stmt() throws RecognitionException {
		Condition_stmtContext _localctx = new Condition_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition_stmt);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new IfelseendifContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(IF);
				setState(67);
				expression();
				setState(68);
				statements();
				setState(69);
				match(ELSE);
				setState(70);
				statements();
				setState(71);
				match(ENDIF);
				}
				break;
			case 2:
				_localctx = new IfendidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(IF);
				setState(74);
				expression();
				setState(75);
				statements();
				setState(76);
				match(ENDIF);
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
	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ArnoldCParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ENDWHILE() { return getToken(ArnoldCParser.ENDWHILE, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(WHILE);
			setState(81);
			expression();
			setState(82);
			statements();
			setState(83);
			match(ENDWHILE);
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
		public TerminalNode IDENTIFIER() { return getToken(ArnoldCParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 20, RULE_expression);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new VarexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new NumberexprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(NUMBER);
				}
				break;
			case 3:
				_localctx = new TrueexprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(AT);
				setState(88);
				match(TRUE);
				}
				break;
			case 4:
				_localctx = new FalseexprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(AT);
				setState(90);
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
	public static class Var_assign_stmtContext extends ParserRuleContext {
		public TerminalNode ASSIGNVARIABLE() { return getToken(ArnoldCParser.ASSIGNVARIABLE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArnoldCParser.IDENTIFIER, 0); }
		public TerminalNode SETVALUE() { return getToken(ArnoldCParser.SETVALUE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public TerminalNode ENDASSIGNVARIABLE() { return getToken(ArnoldCParser.ENDASSIGNVARIABLE, 0); }
		public Var_assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).enterVar_assign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCListener ) ((ArnoldCListener)listener).exitVar_assign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCVisitor ) return ((ArnoldCVisitor<? extends T>)visitor).visitVar_assign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assign_stmtContext var_assign_stmt() throws RecognitionException {
		Var_assign_stmtContext _localctx = new Var_assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ASSIGNVARIABLE);
			setState(94);
			match(IDENTIFIER);
			setState(95);
			match(SETVALUE);
			setState(96);
			expression();
			setState(97);
			operations(0);
			setState(98);
			match(ENDASSIGNVARIABLE);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_operations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(101);
			operation();
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operations);
					setState(103);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(104);
					operation();
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 26, RULE_operation);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUSOPERATOR:
				_localctx = new PlusopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(PLUSOPERATOR);
				setState(111);
				expression();
				}
				break;
			case MINUSOPERATOR:
				_localctx = new MinusopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(MINUSOPERATOR);
				setState(113);
				expression();
				}
				break;
			case MULTIPLICATIONOPERATOR:
				_localctx = new MultiplicationopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(MULTIPLICATIONOPERATOR);
				setState(115);
				expression();
				}
				break;
			case DIVISIONOPERATOR:
				_localctx = new DivisionopContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				match(DIVISIONOPERATOR);
				setState(117);
				expression();
				}
				break;
			case EQUALTO:
				_localctx = new EqualopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				match(EQUALTO);
				setState(119);
				expression();
				}
				break;
			case GREATERTHAN:
				_localctx = new GreateropContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				match(GREATERTHAN);
				setState(121);
				expression();
				}
				break;
			case OR:
				_localctx = new OropContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				match(OR);
				setState(123);
				expression();
				}
				break;
			case AND:
				_localctx = new AndopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(124);
				match(AND);
				setState(125);
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
		case 12:
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
		"\u0004\u0001\u001c\u0081\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001%\b"+
		"\u0001\u0001\u0002\u0005\u0002(\b\u0002\n\u0002\f\u0002+\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00032\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0003\u00046\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bO\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\\\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0005\fj\b\f\n\f\f\fm\t\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u007f\b\r\u0001\r\u0000\u0001"+
		"\u0018\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u0000\u0000\u0085\u0000\u001c\u0001\u0000\u0000\u0000\u0002"+
		"$\u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u00061\u0001"+
		"\u0000\u0000\u0000\b5\u0001\u0000\u0000\u0000\n7\u0001\u0000\u0000\u0000"+
		"\f:\u0001\u0000\u0000\u0000\u000e=\u0001\u0000\u0000\u0000\u0010N\u0001"+
		"\u0000\u0000\u0000\u0012P\u0001\u0000\u0000\u0000\u0014[\u0001\u0000\u0000"+
		"\u0000\u0016]\u0001\u0000\u0000\u0000\u0018d\u0001\u0000\u0000\u0000\u001a"+
		"~\u0001\u0000\u0000\u0000\u001c\u001d\u0003\u0002\u0001\u0000\u001d\u0001"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f \u0003"+
		"\u0004\u0002\u0000 !\u0005\u0002\u0000\u0000!%\u0001\u0000\u0000\u0000"+
		"\"#\u0005\u0001\u0000\u0000#%\u0005\u0002\u0000\u0000$\u001e\u0001\u0000"+
		"\u0000\u0000$\"\u0001\u0000\u0000\u0000%\u0003\u0001\u0000\u0000\u0000"+
		"&(\u0003\u0006\u0003\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*\u0005\u0001"+
		"\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,2\u0003\u000e\u0007\u0000"+
		"-2\u0003\u0016\u000b\u0000.2\u0003\b\u0004\u0000/2\u0003\u0010\b\u0000"+
		"02\u0003\u0012\t\u00001,\u0001\u0000\u0000\u00001-\u0001\u0000\u0000\u0000"+
		"1.\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000010\u0001\u0000\u0000"+
		"\u00002\u0007\u0001\u0000\u0000\u000036\u0003\f\u0006\u000046\u0003\n"+
		"\u0005\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u00006\t\u0001"+
		"\u0000\u0000\u000078\u0005\u000e\u0000\u000089\u0005\u001b\u0000\u0000"+
		"9\u000b\u0001\u0000\u0000\u0000:;\u0005\u000e\u0000\u0000;<\u0005\u0019"+
		"\u0000\u0000<\r\u0001\u0000\u0000\u0000=>\u0005\u000f\u0000\u0000>?\u0005"+
		"\u0019\u0000\u0000?@\u0005\u0010\u0000\u0000@A\u0003\u0014\n\u0000A\u000f"+
		"\u0001\u0000\u0000\u0000BC\u0005\u0014\u0000\u0000CD\u0003\u0014\n\u0000"+
		"DE\u0003\u0004\u0002\u0000EF\u0005\u0015\u0000\u0000FG\u0003\u0004\u0002"+
		"\u0000GH\u0005\u0016\u0000\u0000HO\u0001\u0000\u0000\u0000IJ\u0005\u0014"+
		"\u0000\u0000JK\u0003\u0014\n\u0000KL\u0003\u0004\u0002\u0000LM\u0005\u0016"+
		"\u0000\u0000MO\u0001\u0000\u0000\u0000NB\u0001\u0000\u0000\u0000NI\u0001"+
		"\u0000\u0000\u0000O\u0011\u0001\u0000\u0000\u0000PQ\u0005\u0017\u0000"+
		"\u0000QR\u0003\u0014\n\u0000RS\u0003\u0004\u0002\u0000ST\u0005\u0018\u0000"+
		"\u0000T\u0013\u0001\u0000\u0000\u0000U\\\u0005\u0019\u0000\u0000V\\\u0005"+
		"\u001a\u0000\u0000WX\u0005\u0003\u0000\u0000X\\\u0005\u0004\u0000\u0000"+
		"YZ\u0005\u0003\u0000\u0000Z\\\u0005\u0005\u0000\u0000[U\u0001\u0000\u0000"+
		"\u0000[V\u0001\u0000\u0000\u0000[W\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000\\\u0015\u0001\u0000\u0000\u0000]^\u0005\u0011\u0000\u0000"+
		"^_\u0005\u0019\u0000\u0000_`\u0005\u0012\u0000\u0000`a\u0003\u0014\n\u0000"+
		"ab\u0003\u0018\f\u0000bc\u0005\u0013\u0000\u0000c\u0017\u0001\u0000\u0000"+
		"\u0000de\u0006\f\uffff\uffff\u0000ef\u0003\u001a\r\u0000fk\u0001\u0000"+
		"\u0000\u0000gh\n\u0001\u0000\u0000hj\u0003\u001a\r\u0000ig\u0001\u0000"+
		"\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000l\u0019\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000no\u0005\u0006\u0000\u0000o\u007f\u0003\u0014\n\u0000pq\u0005\u0007"+
		"\u0000\u0000q\u007f\u0003\u0014\n\u0000rs\u0005\b\u0000\u0000s\u007f\u0003"+
		"\u0014\n\u0000tu\u0005\t\u0000\u0000u\u007f\u0003\u0014\n\u0000vw\u0005"+
		"\n\u0000\u0000w\u007f\u0003\u0014\n\u0000xy\u0005\u000b\u0000\u0000y\u007f"+
		"\u0003\u0014\n\u0000z{\u0005\f\u0000\u0000{\u007f\u0003\u0014\n\u0000"+
		"|}\u0005\r\u0000\u0000}\u007f\u0003\u0014\n\u0000~n\u0001\u0000\u0000"+
		"\u0000~p\u0001\u0000\u0000\u0000~r\u0001\u0000\u0000\u0000~t\u0001\u0000"+
		"\u0000\u0000~v\u0001\u0000\u0000\u0000~x\u0001\u0000\u0000\u0000~z\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u001b\u0001\u0000\u0000"+
		"\u0000\b$)15N[k~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}