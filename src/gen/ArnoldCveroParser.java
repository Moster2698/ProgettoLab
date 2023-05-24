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
public class ArnoldCveroParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, AT=3, TRUE=4, FALSE=5, PLUSOPERATOR=6, MINUSOPERATOR=7, 
		MULTIPLICATIONOPERATOR=8, DIVISIONOPERATOR=9, EQUALTO=10, GREATERTHAN=11, 
		OR=12, AND=13, PRINT=14, DECLAREINT=15, SETINITIALVALUE=16, ASSIGNVARIABLE=17, 
		SETVALUE=18, ENDASSIGNVARIABLE=19, IF=20, ELSE=21, ENDIF=22, WHILE=23, 
		ENDWHILE=24, ID=25, NUMBER=26, STRING_LITERAL=27, WS=28;
	public static final int
		RULE_arnoldProg = 0, RULE_statements = 1, RULE_statement = 2, RULE_print_stmt = 3, 
		RULE_print_sconst_stmt = 4, RULE_print_var_stmt = 5, RULE_var_decl_stmt = 6, 
		RULE_condition_stmt = 7, RULE_while_stmt = 8, RULE_expression = 9, RULE_var_assign_stmt = 10, 
		RULE_operations = 11, RULE_operation = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"arnoldProg", "statements", "statement", "print_stmt", "print_sconst_stmt", 
			"print_var_stmt", "var_decl_stmt", "condition_stmt", "while_stmt", "expression", 
			"var_assign_stmt", "operations", "operation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'IT'S SHOWTIME'", "'YOU HAVE BEEEN TERMINATED'", "'@'", "'NO PROBLEMO'", 
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
			null, "BEGIN", "END", "AT", "TRUE", "FALSE", "PLUSOPERATOR", "MINUSOPERATOR", 
			"MULTIPLICATIONOPERATOR", "DIVISIONOPERATOR", "EQUALTO", "GREATERTHAN", 
			"OR", "AND", "PRINT", "DECLAREINT", "SETINITIALVALUE", "ASSIGNVARIABLE", 
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

	public ArnoldCveroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArnoldProgContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ArnoldCveroParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(ArnoldCveroParser.END, 0); }
		public ArnoldProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arnoldProg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterArnoldProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitArnoldProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitArnoldProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArnoldProgContext arnoldProg() throws RecognitionException {
		ArnoldProgContext _localctx = new ArnoldProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_arnoldProg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(BEGIN);
			setState(27);
			statements();
			setState(28);
			match(END);
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
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 9617408L) != 0) {
				{
				{
				setState(30);
				statement();
				}
				}
				setState(35);
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
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLAREINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				var_decl_stmt();
				}
				break;
			case ASSIGNVARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				var_assign_stmt();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				print_stmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				condition_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
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
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitPrint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print_stmt);
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				print_var_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
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
		public TerminalNode PRINT() { return getToken(ArnoldCveroParser.PRINT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ArnoldCveroParser.STRING_LITERAL, 0); }
		public Print_sconst_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_sconst_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterPrint_sconst_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitPrint_sconst_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitPrint_sconst_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_sconst_stmtContext print_sconst_stmt() throws RecognitionException {
		Print_sconst_stmtContext _localctx = new Print_sconst_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print_sconst_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(PRINT);
			setState(48);
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
		public TerminalNode PRINT() { return getToken(ArnoldCveroParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(ArnoldCveroParser.ID, 0); }
		public Print_var_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_var_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterPrint_var_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitPrint_var_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitPrint_var_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_var_stmtContext print_var_stmt() throws RecognitionException {
		Print_var_stmtContext _localctx = new Print_var_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print_var_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(PRINT);
			setState(51);
			match(ID);
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
		public TerminalNode DECLAREINT() { return getToken(ArnoldCveroParser.DECLAREINT, 0); }
		public TerminalNode ID() { return getToken(ArnoldCveroParser.ID, 0); }
		public TerminalNode SETINITIALVALUE() { return getToken(ArnoldCveroParser.SETINITIALVALUE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_decl_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterVar_decl_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitVar_decl_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitVar_decl_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_decl_stmtContext var_decl_stmt() throws RecognitionException {
		Var_decl_stmtContext _localctx = new Var_decl_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_decl_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(DECLAREINT);
			setState(54);
			match(ID);
			setState(55);
			match(SETINITIALVALUE);
			setState(56);
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
		public TerminalNode IF() { return getToken(ArnoldCveroParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ArnoldCveroParser.ELSE, 0); }
		public TerminalNode ENDIF() { return getToken(ArnoldCveroParser.ENDIF, 0); }
		public IfelseendifContext(Condition_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterIfelseendif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitIfelseendif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitIfelseendif(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfendidContext extends Condition_stmtContext {
		public TerminalNode IF() { return getToken(ArnoldCveroParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(ArnoldCveroParser.ENDIF, 0); }
		public IfendidContext(Condition_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterIfendid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitIfendid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitIfendid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_stmtContext condition_stmt() throws RecognitionException {
		Condition_stmtContext _localctx = new Condition_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition_stmt);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new IfelseendifContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(IF);
				setState(59);
				expression();
				setState(60);
				statements();
				setState(61);
				match(ELSE);
				setState(62);
				statements();
				setState(63);
				match(ENDIF);
				}
				break;
			case 2:
				_localctx = new IfendidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(IF);
				setState(66);
				expression();
				setState(67);
				statements();
				setState(68);
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
		public TerminalNode WHILE() { return getToken(ArnoldCveroParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ENDWHILE() { return getToken(ArnoldCveroParser.ENDWHILE, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(WHILE);
			setState(73);
			expression();
			setState(74);
			statements();
			setState(75);
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
		public TerminalNode ID() { return getToken(ArnoldCveroParser.ID, 0); }
		public VarexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterVarexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitVarexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitVarexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueexprContext extends ExpressionContext {
		public TerminalNode AT() { return getToken(ArnoldCveroParser.AT, 0); }
		public TerminalNode TRUE() { return getToken(ArnoldCveroParser.TRUE, 0); }
		public TrueexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterTrueexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitTrueexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitTrueexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberexprContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(ArnoldCveroParser.NUMBER, 0); }
		public NumberexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterNumberexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitNumberexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitNumberexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseexprContext extends ExpressionContext {
		public TerminalNode AT() { return getToken(ArnoldCveroParser.AT, 0); }
		public TerminalNode FALSE() { return getToken(ArnoldCveroParser.FALSE, 0); }
		public FalseexprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterFalseexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitFalseexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitFalseexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new VarexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(ID);
				}
				break;
			case 2:
				_localctx = new NumberexprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(NUMBER);
				}
				break;
			case 3:
				_localctx = new TrueexprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(AT);
				setState(80);
				match(TRUE);
				}
				break;
			case 4:
				_localctx = new FalseexprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				match(AT);
				setState(82);
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
		public TerminalNode ASSIGNVARIABLE() { return getToken(ArnoldCveroParser.ASSIGNVARIABLE, 0); }
		public TerminalNode ID() { return getToken(ArnoldCveroParser.ID, 0); }
		public TerminalNode SETVALUE() { return getToken(ArnoldCveroParser.SETVALUE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public TerminalNode ENDASSIGNVARIABLE() { return getToken(ArnoldCveroParser.ENDASSIGNVARIABLE, 0); }
		public Var_assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterVar_assign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitVar_assign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitVar_assign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assign_stmtContext var_assign_stmt() throws RecognitionException {
		Var_assign_stmtContext _localctx = new Var_assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(ASSIGNVARIABLE);
			setState(86);
			match(ID);
			setState(87);
			match(SETVALUE);
			setState(88);
			expression();
			setState(89);
			operations(0);
			setState(90);
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
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitOperations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitOperations(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_operations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(93);
			operation();
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperationsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operations);
					setState(95);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(96);
					operation();
					}
					} 
				}
				setState(101);
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
		public TerminalNode OR() { return getToken(ArnoldCveroParser.OR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OropContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterOrop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitOrop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitOrop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualopContext extends OperationContext {
		public TerminalNode EQUALTO() { return getToken(ArnoldCveroParser.EQUALTO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EqualopContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterEqualop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitEqualop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitEqualop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndopContext extends OperationContext {
		public TerminalNode AND() { return getToken(ArnoldCveroParser.AND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AndopContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterAndop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitAndop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitAndop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreateropContext extends OperationContext {
		public TerminalNode GREATERTHAN() { return getToken(ArnoldCveroParser.GREATERTHAN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GreateropContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterGreaterop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitGreaterop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitGreaterop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusopContext extends OperationContext {
		public TerminalNode MINUSOPERATOR() { return getToken(ArnoldCveroParser.MINUSOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MinusopContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterMinusop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitMinusop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitMinusop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusopContext extends OperationContext {
		public TerminalNode PLUSOPERATOR() { return getToken(ArnoldCveroParser.PLUSOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PlusopContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterPlusop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitPlusop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitPlusop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicationopContext extends OperationContext {
		public TerminalNode MULTIPLICATIONOPERATOR() { return getToken(ArnoldCveroParser.MULTIPLICATIONOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MultiplicationopContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterMultiplicationop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitMultiplicationop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitMultiplicationop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisionopContext extends OperationContext {
		public TerminalNode DIVISIONOPERATOR() { return getToken(ArnoldCveroParser.DIVISIONOPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DivisionopContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).enterDivisionop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArnoldCveroListener ) ((ArnoldCveroListener)listener).exitDivisionop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArnoldCveroVisitor ) return ((ArnoldCveroVisitor<? extends T>)visitor).visitDivisionop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operation);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUSOPERATOR:
				_localctx = new PlusopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(PLUSOPERATOR);
				setState(103);
				expression();
				}
				break;
			case MINUSOPERATOR:
				_localctx = new MinusopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(MINUSOPERATOR);
				setState(105);
				expression();
				}
				break;
			case MULTIPLICATIONOPERATOR:
				_localctx = new MultiplicationopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(MULTIPLICATIONOPERATOR);
				setState(107);
				expression();
				}
				break;
			case DIVISIONOPERATOR:
				_localctx = new DivisionopContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				match(DIVISIONOPERATOR);
				setState(109);
				expression();
				}
				break;
			case EQUALTO:
				_localctx = new EqualopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				match(EQUALTO);
				setState(111);
				expression();
				}
				break;
			case GREATERTHAN:
				_localctx = new GreateropContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(112);
				match(GREATERTHAN);
				setState(113);
				expression();
				}
				break;
			case OR:
				_localctx = new OropContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(114);
				match(OR);
				setState(115);
				expression();
				}
				break;
			case AND:
				_localctx = new AndopContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(116);
				match(AND);
				setState(117);
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
		case 11:
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
		"\u0004\u0001\u001cy\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002*\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003.\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007G\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\tT\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bb\b"+
		"\u000b\n\u000b\f\u000be\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\fw\b\f\u0001\f\u0000\u0001\u0016\r\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0000}\u0000"+
		"\u001a\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u0004)\u0001"+
		"\u0000\u0000\u0000\u0006-\u0001\u0000\u0000\u0000\b/\u0001\u0000\u0000"+
		"\u0000\n2\u0001\u0000\u0000\u0000\f5\u0001\u0000\u0000\u0000\u000eF\u0001"+
		"\u0000\u0000\u0000\u0010H\u0001\u0000\u0000\u0000\u0012S\u0001\u0000\u0000"+
		"\u0000\u0014U\u0001\u0000\u0000\u0000\u0016\\\u0001\u0000\u0000\u0000"+
		"\u0018v\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0001\u0000\u0000\u001b"+
		"\u001c\u0003\u0002\u0001\u0000\u001c\u001d\u0005\u0002\u0000\u0000\u001d"+
		"\u0001\u0001\u0000\u0000\u0000\u001e \u0003\u0004\u0002\u0000\u001f\u001e"+
		"\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000"+
		"#!\u0001\u0000\u0000\u0000$*\u0003\f\u0006\u0000%*\u0003\u0014\n\u0000"+
		"&*\u0003\u0006\u0003\u0000\'*\u0003\u000e\u0007\u0000(*\u0003\u0010\b"+
		"\u0000)$\u0001\u0000\u0000\u0000)%\u0001\u0000\u0000\u0000)&\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*\u0005"+
		"\u0001\u0000\u0000\u0000+.\u0003\n\u0005\u0000,.\u0003\b\u0004\u0000-"+
		"+\u0001\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000.\u0007\u0001\u0000"+
		"\u0000\u0000/0\u0005\u000e\u0000\u000001\u0005\u001b\u0000\u00001\t\u0001"+
		"\u0000\u0000\u000023\u0005\u000e\u0000\u000034\u0005\u0019\u0000\u0000"+
		"4\u000b\u0001\u0000\u0000\u000056\u0005\u000f\u0000\u000067\u0005\u0019"+
		"\u0000\u000078\u0005\u0010\u0000\u000089\u0003\u0012\t\u00009\r\u0001"+
		"\u0000\u0000\u0000:;\u0005\u0014\u0000\u0000;<\u0003\u0012\t\u0000<=\u0003"+
		"\u0002\u0001\u0000=>\u0005\u0015\u0000\u0000>?\u0003\u0002\u0001\u0000"+
		"?@\u0005\u0016\u0000\u0000@G\u0001\u0000\u0000\u0000AB\u0005\u0014\u0000"+
		"\u0000BC\u0003\u0012\t\u0000CD\u0003\u0002\u0001\u0000DE\u0005\u0016\u0000"+
		"\u0000EG\u0001\u0000\u0000\u0000F:\u0001\u0000\u0000\u0000FA\u0001\u0000"+
		"\u0000\u0000G\u000f\u0001\u0000\u0000\u0000HI\u0005\u0017\u0000\u0000"+
		"IJ\u0003\u0012\t\u0000JK\u0003\u0002\u0001\u0000KL\u0005\u0018\u0000\u0000"+
		"L\u0011\u0001\u0000\u0000\u0000MT\u0005\u0019\u0000\u0000NT\u0005\u001a"+
		"\u0000\u0000OP\u0005\u0003\u0000\u0000PT\u0005\u0004\u0000\u0000QR\u0005"+
		"\u0003\u0000\u0000RT\u0005\u0005\u0000\u0000SM\u0001\u0000\u0000\u0000"+
		"SN\u0001\u0000\u0000\u0000SO\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000"+
		"\u0000T\u0013\u0001\u0000\u0000\u0000UV\u0005\u0011\u0000\u0000VW\u0005"+
		"\u0019\u0000\u0000WX\u0005\u0012\u0000\u0000XY\u0003\u0012\t\u0000YZ\u0003"+
		"\u0016\u000b\u0000Z[\u0005\u0013\u0000\u0000[\u0015\u0001\u0000\u0000"+
		"\u0000\\]\u0006\u000b\uffff\uffff\u0000]^\u0003\u0018\f\u0000^c\u0001"+
		"\u0000\u0000\u0000_`\n\u0001\u0000\u0000`b\u0003\u0018\f\u0000a_\u0001"+
		"\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000d\u0017\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000fg\u0005\u0006\u0000\u0000gw\u0003\u0012\t\u0000hi\u0005\u0007"+
		"\u0000\u0000iw\u0003\u0012\t\u0000jk\u0005\b\u0000\u0000kw\u0003\u0012"+
		"\t\u0000lm\u0005\t\u0000\u0000mw\u0003\u0012\t\u0000no\u0005\n\u0000\u0000"+
		"ow\u0003\u0012\t\u0000pq\u0005\u000b\u0000\u0000qw\u0003\u0012\t\u0000"+
		"rs\u0005\f\u0000\u0000sw\u0003\u0012\t\u0000tu\u0005\r\u0000\u0000uw\u0003"+
		"\u0012\t\u0000vf\u0001\u0000\u0000\u0000vh\u0001\u0000\u0000\u0000vj\u0001"+
		"\u0000\u0000\u0000vl\u0001\u0000\u0000\u0000vn\u0001\u0000\u0000\u0000"+
		"vp\u0001\u0000\u0000\u0000vr\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000w\u0019\u0001\u0000\u0000\u0000\u0007!)-FScv";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}