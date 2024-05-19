// Generated from C:/Users/rafae/Ambiente de Trabalho/uni/2Ano_2semestre/LPROG/ANTLR/antlr4/src/expressions/antlrGrammar.g4 by ANTLR 4.13.1
package expressions;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class antlrGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, END=3, NEWLINE=4, TYPE=5, NUMERICALSCALEANSWER=6, DATEANSWER=7, 
		DECIMALANSWER=8, TIMEHOURANSWER=9, INTEGERANSWER=10, TRUEFALSEANSWER=11, 
		SINGLECHOISEANSWER=12, MULTIPLECHOISEANSWER=13, STRINGPHRASE=14, STRING=15, 
		WS=16;
	public static final int
		RULE_start = 0, RULE_listOfQQuestionsAns = 1, RULE_questionAnswer = 2, 
		RULE_question = 3, RULE_answer = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "listOfQQuestionsAns", "questionAnswer", "question", "answer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'?'", "'END'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "END", "NEWLINE", "TYPE", "NUMERICALSCALEANSWER", "DATEANSWER", 
			"DECIMALANSWER", "TIMEHOURANSWER", "INTEGERANSWER", "TRUEFALSEANSWER", 
			"SINGLECHOISEANSWER", "MULTIPLECHOISEANSWER", "STRINGPHRASE", "STRING", 
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
	public String getGrammarFileName() { return "antlrGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public antlrGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ListOfQQuestionsAnsContext listOfQQuestionsAns() {
			return getRuleContext(ListOfQQuestionsAnsContext.class,0);
		}
		public TerminalNode END() { return getToken(antlrGrammarParser.END, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			listOfQQuestionsAns();
			setState(11);
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
	public static class ListOfQQuestionsAnsContext extends ParserRuleContext {
		public List<QuestionAnswerContext> questionAnswer() {
			return getRuleContexts(QuestionAnswerContext.class);
		}
		public QuestionAnswerContext questionAnswer(int i) {
			return getRuleContext(QuestionAnswerContext.class,i);
		}
		public ListOfQQuestionsAnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listOfQQuestionsAns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterListOfQQuestionsAns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitListOfQQuestionsAns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitListOfQQuestionsAns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListOfQQuestionsAnsContext listOfQQuestionsAns() throws RecognitionException {
		ListOfQQuestionsAnsContext _localctx = new ListOfQQuestionsAnsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listOfQQuestionsAns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(13);
				questionAnswer();
				}
				}
				setState(16); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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
	public static class QuestionAnswerContext extends ParserRuleContext {
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public AnswerContext answer() {
			return getRuleContext(AnswerContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(antlrGrammarParser.NEWLINE, 0); }
		public QuestionAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterQuestionAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitQuestionAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitQuestionAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionAnswerContext questionAnswer() throws RecognitionException {
		QuestionAnswerContext _localctx = new QuestionAnswerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_questionAnswer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			question();
			setState(19);
			answer();
			setState(20);
			match(NEWLINE);
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
	public static class QuestionContext extends ParserRuleContext {
		public TerminalNode STRINGPHRASE() { return getToken(antlrGrammarParser.STRINGPHRASE, 0); }
		public TerminalNode TYPE() { return getToken(antlrGrammarParser.TYPE, 0); }
		public TerminalNode NEWLINE() { return getToken(antlrGrammarParser.NEWLINE, 0); }
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(23);
			match(STRINGPHRASE);
			setState(24);
			match(T__1);
			setState(25);
			match(TYPE);
			setState(26);
			match(NEWLINE);
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
	public static class AnswerContext extends ParserRuleContext {
		public Token TRUEFALSEANSWER;
		public Token TIMEHOURANSWER;
		public Token DATEANSWER;
		public Token MULTIPLECHOISEANSWER;
		public Token SINGLECHOISEANSWER;
		public Token NUMERICALSCALEANSWER;
		public Token DECIMALANSWER;
		public Token INTEGERANSWER;
		public Token STRINGPHRASE;
		public TerminalNode TRUEFALSEANSWER() { return getToken(antlrGrammarParser.TRUEFALSEANSWER, 0); }
		public TerminalNode TIMEHOURANSWER() { return getToken(antlrGrammarParser.TIMEHOURANSWER, 0); }
		public TerminalNode DATEANSWER() { return getToken(antlrGrammarParser.DATEANSWER, 0); }
		public TerminalNode MULTIPLECHOISEANSWER() { return getToken(antlrGrammarParser.MULTIPLECHOISEANSWER, 0); }
		public TerminalNode SINGLECHOISEANSWER() { return getToken(antlrGrammarParser.SINGLECHOISEANSWER, 0); }
		public TerminalNode NUMERICALSCALEANSWER() { return getToken(antlrGrammarParser.NUMERICALSCALEANSWER, 0); }
		public TerminalNode DECIMALANSWER() { return getToken(antlrGrammarParser.DECIMALANSWER, 0); }
		public TerminalNode INTEGERANSWER() { return getToken(antlrGrammarParser.INTEGERANSWER, 0); }
		public TerminalNode STRINGPHRASE() { return getToken(antlrGrammarParser.STRINGPHRASE, 0); }
		public AnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).enterAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof antlrGrammarListener ) ((antlrGrammarListener)listener).exitAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerContext answer() throws RecognitionException {
		AnswerContext _localctx = new AnswerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_answer);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUEFALSEANSWER:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				((AnswerContext)_localctx).TRUEFALSEANSWER = match(TRUEFALSEANSWER);
				 /* System.out.println("Parsed TRUEFALSEANSWER: " + (((AnswerContext)_localctx).TRUEFALSEANSWER!=null?((AnswerContext)_localctx).TRUEFALSEANSWER.getText():null)); */ 
				}
				break;
			case TIMEHOURANSWER:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				((AnswerContext)_localctx).TIMEHOURANSWER = match(TIMEHOURANSWER);
				 /* System.out.println("Parsed TIMEHOURANSWER: " + (((AnswerContext)_localctx).TIMEHOURANSWER!=null?((AnswerContext)_localctx).TIMEHOURANSWER.getText():null)); */ 
				}
				break;
			case DATEANSWER:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				((AnswerContext)_localctx).DATEANSWER = match(DATEANSWER);
				 /* System.out.println("Parsed DATEANSWER: " + (((AnswerContext)_localctx).DATEANSWER!=null?((AnswerContext)_localctx).DATEANSWER.getText():null)); */ 
				}
				break;
			case MULTIPLECHOISEANSWER:
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				((AnswerContext)_localctx).MULTIPLECHOISEANSWER = match(MULTIPLECHOISEANSWER);
				 /* System.out.println("Parsed MULTIPLECHOISEANSWER: " + (((AnswerContext)_localctx).MULTIPLECHOISEANSWER!=null?((AnswerContext)_localctx).MULTIPLECHOISEANSWER.getText():null)); */ 
				}
				break;
			case SINGLECHOISEANSWER:
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				((AnswerContext)_localctx).SINGLECHOISEANSWER = match(SINGLECHOISEANSWER);
				 /* System.out.println("Parsed SINGLECHOISEANSWER: " + (((AnswerContext)_localctx).SINGLECHOISEANSWER!=null?((AnswerContext)_localctx).SINGLECHOISEANSWER.getText():null)); */ 
				}
				break;
			case NUMERICALSCALEANSWER:
				enterOuterAlt(_localctx, 6);
				{
				setState(38);
				((AnswerContext)_localctx).NUMERICALSCALEANSWER = match(NUMERICALSCALEANSWER);
				 /* System.out.println("Parsed NUMERICALSCALEANSWER: " + (((AnswerContext)_localctx).NUMERICALSCALEANSWER!=null?((AnswerContext)_localctx).NUMERICALSCALEANSWER.getText():null)); */ 
				}
				break;
			case DECIMALANSWER:
				enterOuterAlt(_localctx, 7);
				{
				setState(40);
				((AnswerContext)_localctx).DECIMALANSWER = match(DECIMALANSWER);
				 /* System.out.println("Parsed DECIMALANSWER: " + (((AnswerContext)_localctx).DECIMALANSWER!=null?((AnswerContext)_localctx).DECIMALANSWER.getText():null)); */ 
				}
				break;
			case INTEGERANSWER:
				enterOuterAlt(_localctx, 8);
				{
				setState(42);
				((AnswerContext)_localctx).INTEGERANSWER = match(INTEGERANSWER);
				 /* System.out.println("Parsed INTEGERANSWER: " + (((AnswerContext)_localctx).INTEGERANSWER!=null?((AnswerContext)_localctx).INTEGERANSWER.getText():null)); */ 
				}
				break;
			case STRINGPHRASE:
				enterOuterAlt(_localctx, 9);
				{
				setState(44);
				((AnswerContext)_localctx).STRINGPHRASE = match(STRINGPHRASE);
				 /* System.out.println("Parsed STRINGPHRASE: " + (((AnswerContext)_localctx).STRINGPHRASE!=null?((AnswerContext)_localctx).STRINGPHRASE.getText():null)); */ 
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
		"\u0004\u0001\u00101\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u000f\b\u0001\u000b"+
		"\u0001\f\u0001\u0010\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004/\b\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006"+
		"\b\u0000\u00004\u0000\n\u0001\u0000\u0000\u0000\u0002\u000e\u0001\u0000"+
		"\u0000\u0000\u0004\u0012\u0001\u0000\u0000\u0000\u0006\u0016\u0001\u0000"+
		"\u0000\u0000\b.\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000"+
		"\u000b\f\u0005\u0003\u0000\u0000\f\u0001\u0001\u0000\u0000\u0000\r\u000f"+
		"\u0003\u0004\u0002\u0000\u000e\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001"+
		"\u0000\u0000\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0010\u0011\u0001"+
		"\u0000\u0000\u0000\u0011\u0003\u0001\u0000\u0000\u0000\u0012\u0013\u0003"+
		"\u0006\u0003\u0000\u0013\u0014\u0003\b\u0004\u0000\u0014\u0015\u0005\u0004"+
		"\u0000\u0000\u0015\u0005\u0001\u0000\u0000\u0000\u0016\u0017\u0005\u0001"+
		"\u0000\u0000\u0017\u0018\u0005\u000e\u0000\u0000\u0018\u0019\u0005\u0002"+
		"\u0000\u0000\u0019\u001a\u0005\u0005\u0000\u0000\u001a\u001b\u0005\u0004"+
		"\u0000\u0000\u001b\u0007\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u000b"+
		"\u0000\u0000\u001d/\u0006\u0004\uffff\uffff\u0000\u001e\u001f\u0005\t"+
		"\u0000\u0000\u001f/\u0006\u0004\uffff\uffff\u0000 !\u0005\u0007\u0000"+
		"\u0000!/\u0006\u0004\uffff\uffff\u0000\"#\u0005\r\u0000\u0000#/\u0006"+
		"\u0004\uffff\uffff\u0000$%\u0005\f\u0000\u0000%/\u0006\u0004\uffff\uffff"+
		"\u0000&\'\u0005\u0006\u0000\u0000\'/\u0006\u0004\uffff\uffff\u0000()\u0005"+
		"\b\u0000\u0000)/\u0006\u0004\uffff\uffff\u0000*+\u0005\n\u0000\u0000+"+
		"/\u0006\u0004\uffff\uffff\u0000,-\u0005\u000e\u0000\u0000-/\u0006\u0004"+
		"\uffff\uffff\u0000.\u001c\u0001\u0000\u0000\u0000.\u001e\u0001\u0000\u0000"+
		"\u0000. \u0001\u0000\u0000\u0000.\"\u0001\u0000\u0000\u0000.$\u0001\u0000"+
		"\u0000\u0000.&\u0001\u0000\u0000\u0000.(\u0001\u0000\u0000\u0000.*\u0001"+
		"\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/\t\u0001\u0000\u0000\u0000"+
		"\u0002\u0010.";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}