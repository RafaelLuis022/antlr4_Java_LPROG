// Generated from C:/Users/rafae/Ambiente de Trabalho/uni/2Ano_2semestre/LPROG/ANTLR/antlr4/src/expressions/globalPluginsGrammar/antlrGrammar.g4 by ANTLR 4.13.1
package expressions.globalPluginsGrammar;
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
		NA=1, END=2, NEWLINE=3, TYPE_TRUEFALSE=4, TYPE_TIMEHOUR=5, TYPE_DATE=6, 
		TYPE_MULTIPLECHOICE=7, TYPE_SINGLECHOICE=8, TYPE_NUMERICALSCALE=9, TYPE_DECIMAL=10, 
		TYPE_INTEGER=11, TYPE_SHORTTEXT=12, MAX_SHORT_TEXT_LENGHT=13, NUMERICALSCALEANSWER=14, 
		DATEANSWER=15, DECIMALANSWER=16, TIMEHOURANSWER=17, INTEGERANSWER=18, 
		TRUEFALSEANSWER=19, QUESTION=20, SINGLECHOISEANSWER=21, SHORTTEXTANSWER=22, 
		EMPTY=23, MULTIPLECHOISEANSWER=24, STRING=25, CHAR=26, WS=27;
	public static final int
		RULE_start = 0, RULE_listOfQuestions = 1, RULE_questions = 2, RULE_question_tf = 3, 
		RULE_question_timehour = 4, RULE_question_date = 5, RULE_question_numericalscale = 6, 
		RULE_question_decimal = 7, RULE_question_integer = 8, RULE_question_shorttext = 9, 
		RULE_question_multiplechoice = 10, RULE_question_singlechoice = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "listOfQuestions", "questions", "question_tf", "question_timehour", 
			"question_date", "question_numericalscale", "question_decimal", "question_integer", 
			"question_shorttext", "question_multiplechoice", "question_singlechoice"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'n/a'", "'END'", null, "'(True/False)'", "'(HH:MM)'", "'(Date:dd/mm/yyyy)'", 
			"'(Multiple Choice)'", "'(Single Choice)'", "'(Range n1-n5)'", "'(Decimal Number)'", 
			"'(Integer Number)'", "'(Short Text)'", "'10'", null, null, null, null, 
			null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NA", "END", "NEWLINE", "TYPE_TRUEFALSE", "TYPE_TIMEHOUR", "TYPE_DATE", 
			"TYPE_MULTIPLECHOICE", "TYPE_SINGLECHOICE", "TYPE_NUMERICALSCALE", "TYPE_DECIMAL", 
			"TYPE_INTEGER", "TYPE_SHORTTEXT", "MAX_SHORT_TEXT_LENGHT", "NUMERICALSCALEANSWER", 
			"DATEANSWER", "DECIMALANSWER", "TIMEHOURANSWER", "INTEGERANSWER", "TRUEFALSEANSWER", 
			"QUESTION", "SINGLECHOISEANSWER", "SHORTTEXTANSWER", "EMPTY", "MULTIPLECHOISEANSWER", 
			"STRING", "CHAR", "WS"
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
		public ListOfQuestionsContext listOfQuestions() {
			return getRuleContext(ListOfQuestionsContext.class,0);
		}
		public TerminalNode END() { return getToken(antlrGrammarParser.END, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
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
			setState(24);
			listOfQuestions();
			setState(25);
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
	public static class ListOfQuestionsContext extends ParserRuleContext {
		public List<QuestionsContext> questions() {
			return getRuleContexts(QuestionsContext.class);
		}
		public QuestionsContext questions(int i) {
			return getRuleContext(QuestionsContext.class,i);
		}
		public ListOfQuestionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listOfQuestions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitListOfQuestions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListOfQuestionsContext listOfQuestions() throws RecognitionException {
		ListOfQuestionsContext _localctx = new ListOfQuestionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listOfQuestions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				questions();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==QUESTION );
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
	public static class QuestionsContext extends ParserRuleContext {
		public Question_tfContext question_tf() {
			return getRuleContext(Question_tfContext.class,0);
		}
		public Question_timehourContext question_timehour() {
			return getRuleContext(Question_timehourContext.class,0);
		}
		public Question_dateContext question_date() {
			return getRuleContext(Question_dateContext.class,0);
		}
		public Question_multiplechoiceContext question_multiplechoice() {
			return getRuleContext(Question_multiplechoiceContext.class,0);
		}
		public Question_singlechoiceContext question_singlechoice() {
			return getRuleContext(Question_singlechoiceContext.class,0);
		}
		public Question_numericalscaleContext question_numericalscale() {
			return getRuleContext(Question_numericalscaleContext.class,0);
		}
		public Question_decimalContext question_decimal() {
			return getRuleContext(Question_decimalContext.class,0);
		}
		public Question_integerContext question_integer() {
			return getRuleContext(Question_integerContext.class,0);
		}
		public Question_shorttextContext question_shorttext() {
			return getRuleContext(Question_shorttextContext.class,0);
		}
		public QuestionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitQuestions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionsContext questions() throws RecognitionException {
		QuestionsContext _localctx = new QuestionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_questions);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				question_tf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				question_timehour();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				question_date();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				question_multiplechoice();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				question_singlechoice();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(37);
				question_numericalscale();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(38);
				question_decimal();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(39);
				question_integer();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(40);
				question_shorttext();
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
	public static class Question_tfContext extends ParserRuleContext {
		public Token ctx_question;
		public Token ctx_type;
		public Token ctx_answer;
		public List<TerminalNode> NEWLINE() { return getTokens(antlrGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrGrammarParser.NEWLINE, i);
		}
		public TerminalNode QUESTION() { return getToken(antlrGrammarParser.QUESTION, 0); }
		public TerminalNode TYPE_TRUEFALSE() { return getToken(antlrGrammarParser.TYPE_TRUEFALSE, 0); }
		public TerminalNode TRUEFALSEANSWER() { return getToken(antlrGrammarParser.TRUEFALSEANSWER, 0); }
		public TerminalNode NA() { return getToken(antlrGrammarParser.NA, 0); }
		public Question_tfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_tf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitQuestion_tf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_tfContext question_tf() throws RecognitionException {
		Question_tfContext _localctx = new Question_tfContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_question_tf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			((Question_tfContext)_localctx).ctx_question = match(QUESTION);
			setState(44);
			((Question_tfContext)_localctx).ctx_type = match(TYPE_TRUEFALSE);
			setState(45);
			match(NEWLINE);
			setState(46);
			((Question_tfContext)_localctx).ctx_answer = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==NA || _la==TRUEFALSEANSWER) ) {
				((Question_tfContext)_localctx).ctx_answer = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(47);
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
	public static class Question_timehourContext extends ParserRuleContext {
		public Token ctx_question;
		public Token ctx_type;
		public Token ctx_answer;
		public List<TerminalNode> NEWLINE() { return getTokens(antlrGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrGrammarParser.NEWLINE, i);
		}
		public TerminalNode QUESTION() { return getToken(antlrGrammarParser.QUESTION, 0); }
		public TerminalNode TYPE_TIMEHOUR() { return getToken(antlrGrammarParser.TYPE_TIMEHOUR, 0); }
		public TerminalNode TIMEHOURANSWER() { return getToken(antlrGrammarParser.TIMEHOURANSWER, 0); }
		public TerminalNode NA() { return getToken(antlrGrammarParser.NA, 0); }
		public Question_timehourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_timehour; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitQuestion_timehour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_timehourContext question_timehour() throws RecognitionException {
		Question_timehourContext _localctx = new Question_timehourContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_question_timehour);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			((Question_timehourContext)_localctx).ctx_question = match(QUESTION);
			setState(50);
			((Question_timehourContext)_localctx).ctx_type = match(TYPE_TIMEHOUR);
			setState(51);
			match(NEWLINE);
			setState(52);
			((Question_timehourContext)_localctx).ctx_answer = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==NA || _la==TIMEHOURANSWER) ) {
				((Question_timehourContext)_localctx).ctx_answer = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(53);
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
	public static class Question_dateContext extends ParserRuleContext {
		public Token ctx_question;
		public Token ctx_type;
		public Token ctx_answer;
		public List<TerminalNode> NEWLINE() { return getTokens(antlrGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrGrammarParser.NEWLINE, i);
		}
		public TerminalNode QUESTION() { return getToken(antlrGrammarParser.QUESTION, 0); }
		public TerminalNode TYPE_DATE() { return getToken(antlrGrammarParser.TYPE_DATE, 0); }
		public TerminalNode DATEANSWER() { return getToken(antlrGrammarParser.DATEANSWER, 0); }
		public TerminalNode NA() { return getToken(antlrGrammarParser.NA, 0); }
		public Question_dateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_date; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitQuestion_date(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_dateContext question_date() throws RecognitionException {
		Question_dateContext _localctx = new Question_dateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_question_date);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			((Question_dateContext)_localctx).ctx_question = match(QUESTION);
			setState(56);
			((Question_dateContext)_localctx).ctx_type = match(TYPE_DATE);
			setState(57);
			match(NEWLINE);
			setState(58);
			((Question_dateContext)_localctx).ctx_answer = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==NA || _la==DATEANSWER) ) {
				((Question_dateContext)_localctx).ctx_answer = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(59);
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
	public static class Question_numericalscaleContext extends ParserRuleContext {
		public Token ctx_question;
		public Token ctx_type;
		public Token ctx_answer;
		public List<TerminalNode> NEWLINE() { return getTokens(antlrGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrGrammarParser.NEWLINE, i);
		}
		public TerminalNode QUESTION() { return getToken(antlrGrammarParser.QUESTION, 0); }
		public TerminalNode TYPE_NUMERICALSCALE() { return getToken(antlrGrammarParser.TYPE_NUMERICALSCALE, 0); }
		public TerminalNode NUMERICALSCALEANSWER() { return getToken(antlrGrammarParser.NUMERICALSCALEANSWER, 0); }
		public TerminalNode NA() { return getToken(antlrGrammarParser.NA, 0); }
		public Question_numericalscaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_numericalscale; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitQuestion_numericalscale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_numericalscaleContext question_numericalscale() throws RecognitionException {
		Question_numericalscaleContext _localctx = new Question_numericalscaleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_question_numericalscale);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			((Question_numericalscaleContext)_localctx).ctx_question = match(QUESTION);
			setState(62);
			((Question_numericalscaleContext)_localctx).ctx_type = match(TYPE_NUMERICALSCALE);
			setState(63);
			match(NEWLINE);
			setState(64);
			((Question_numericalscaleContext)_localctx).ctx_answer = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==NA || _la==NUMERICALSCALEANSWER) ) {
				((Question_numericalscaleContext)_localctx).ctx_answer = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(65);
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
	public static class Question_decimalContext extends ParserRuleContext {
		public Token ctx_question;
		public Token ctx_type;
		public Token ctx_answer;
		public List<TerminalNode> NEWLINE() { return getTokens(antlrGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrGrammarParser.NEWLINE, i);
		}
		public TerminalNode QUESTION() { return getToken(antlrGrammarParser.QUESTION, 0); }
		public TerminalNode TYPE_DECIMAL() { return getToken(antlrGrammarParser.TYPE_DECIMAL, 0); }
		public TerminalNode DECIMALANSWER() { return getToken(antlrGrammarParser.DECIMALANSWER, 0); }
		public TerminalNode NA() { return getToken(antlrGrammarParser.NA, 0); }
		public Question_decimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_decimal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitQuestion_decimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_decimalContext question_decimal() throws RecognitionException {
		Question_decimalContext _localctx = new Question_decimalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_question_decimal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			((Question_decimalContext)_localctx).ctx_question = match(QUESTION);
			setState(68);
			((Question_decimalContext)_localctx).ctx_type = match(TYPE_DECIMAL);
			setState(69);
			match(NEWLINE);
			setState(70);
			((Question_decimalContext)_localctx).ctx_answer = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==NA || _la==DECIMALANSWER) ) {
				((Question_decimalContext)_localctx).ctx_answer = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(71);
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
	public static class Question_integerContext extends ParserRuleContext {
		public Token ctx_question;
		public Token ctx_type;
		public Token ctx_answer;
		public List<TerminalNode> NEWLINE() { return getTokens(antlrGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrGrammarParser.NEWLINE, i);
		}
		public TerminalNode QUESTION() { return getToken(antlrGrammarParser.QUESTION, 0); }
		public TerminalNode TYPE_INTEGER() { return getToken(antlrGrammarParser.TYPE_INTEGER, 0); }
		public TerminalNode INTEGERANSWER() { return getToken(antlrGrammarParser.INTEGERANSWER, 0); }
		public TerminalNode NA() { return getToken(antlrGrammarParser.NA, 0); }
		public Question_integerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_integer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitQuestion_integer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_integerContext question_integer() throws RecognitionException {
		Question_integerContext _localctx = new Question_integerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_question_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			((Question_integerContext)_localctx).ctx_question = match(QUESTION);
			setState(74);
			((Question_integerContext)_localctx).ctx_type = match(TYPE_INTEGER);
			setState(75);
			match(NEWLINE);
			setState(76);
			((Question_integerContext)_localctx).ctx_answer = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==NA || _la==INTEGERANSWER) ) {
				((Question_integerContext)_localctx).ctx_answer = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(77);
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
	public static class Question_shorttextContext extends ParserRuleContext {
		public Token ctx_question;
		public Token ctx_type;
		public Token ctx_answer;
		public List<TerminalNode> NEWLINE() { return getTokens(antlrGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrGrammarParser.NEWLINE, i);
		}
		public TerminalNode QUESTION() { return getToken(antlrGrammarParser.QUESTION, 0); }
		public TerminalNode TYPE_SHORTTEXT() { return getToken(antlrGrammarParser.TYPE_SHORTTEXT, 0); }
		public TerminalNode SHORTTEXTANSWER() { return getToken(antlrGrammarParser.SHORTTEXTANSWER, 0); }
		public TerminalNode NA() { return getToken(antlrGrammarParser.NA, 0); }
		public Question_shorttextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_shorttext; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitQuestion_shorttext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_shorttextContext question_shorttext() throws RecognitionException {
		Question_shorttextContext _localctx = new Question_shorttextContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_question_shorttext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			((Question_shorttextContext)_localctx).ctx_question = match(QUESTION);
			setState(80);
			((Question_shorttextContext)_localctx).ctx_type = match(TYPE_SHORTTEXT);
			setState(81);
			match(NEWLINE);
			setState(82);
			((Question_shorttextContext)_localctx).ctx_answer = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==NA || _la==SHORTTEXTANSWER) ) {
				((Question_shorttextContext)_localctx).ctx_answer = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(83);
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
	public static class Question_multiplechoiceContext extends ParserRuleContext {
		public Token ctx_question;
		public Token ctx_type;
		public Token ctx_answer;
		public List<TerminalNode> NEWLINE() { return getTokens(antlrGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrGrammarParser.NEWLINE, i);
		}
		public TerminalNode QUESTION() { return getToken(antlrGrammarParser.QUESTION, 0); }
		public TerminalNode TYPE_MULTIPLECHOICE() { return getToken(antlrGrammarParser.TYPE_MULTIPLECHOICE, 0); }
		public TerminalNode MULTIPLECHOISEANSWER() { return getToken(antlrGrammarParser.MULTIPLECHOISEANSWER, 0); }
		public TerminalNode SINGLECHOISEANSWER() { return getToken(antlrGrammarParser.SINGLECHOISEANSWER, 0); }
		public TerminalNode NA() { return getToken(antlrGrammarParser.NA, 0); }
		public Question_multiplechoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_multiplechoice; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitQuestion_multiplechoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_multiplechoiceContext question_multiplechoice() throws RecognitionException {
		Question_multiplechoiceContext _localctx = new Question_multiplechoiceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_question_multiplechoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			((Question_multiplechoiceContext)_localctx).ctx_question = match(QUESTION);
			setState(86);
			((Question_multiplechoiceContext)_localctx).ctx_type = match(TYPE_MULTIPLECHOICE);
			setState(87);
			match(NEWLINE);
			setState(88);
			((Question_multiplechoiceContext)_localctx).ctx_answer = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 18874370L) != 0)) ) {
				((Question_multiplechoiceContext)_localctx).ctx_answer = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(89);
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
	public static class Question_singlechoiceContext extends ParserRuleContext {
		public Token ctx_question;
		public Token ctx_type;
		public Token ctx_answer;
		public List<TerminalNode> NEWLINE() { return getTokens(antlrGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrGrammarParser.NEWLINE, i);
		}
		public TerminalNode QUESTION() { return getToken(antlrGrammarParser.QUESTION, 0); }
		public TerminalNode TYPE_SINGLECHOICE() { return getToken(antlrGrammarParser.TYPE_SINGLECHOICE, 0); }
		public TerminalNode SINGLECHOISEANSWER() { return getToken(antlrGrammarParser.SINGLECHOISEANSWER, 0); }
		public TerminalNode NA() { return getToken(antlrGrammarParser.NA, 0); }
		public Question_singlechoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_singlechoice; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrGrammarVisitor ) return ((antlrGrammarVisitor<? extends T>)visitor).visitQuestion_singlechoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_singlechoiceContext question_singlechoice() throws RecognitionException {
		Question_singlechoiceContext _localctx = new Question_singlechoiceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_question_singlechoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			((Question_singlechoiceContext)_localctx).ctx_question = match(QUESTION);
			setState(92);
			((Question_singlechoiceContext)_localctx).ctx_type = match(TYPE_SINGLECHOICE);
			setState(93);
			match(NEWLINE);
			setState(94);
			((Question_singlechoiceContext)_localctx).ctx_answer = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==NA || _la==SINGLECHOISEANSWER) ) {
				((Question_singlechoiceContext)_localctx).ctx_answer = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(95);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001bb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u001d\b\u0001\u000b"+
		"\u0001\f\u0001\u001e\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002*\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0000\t\u0002\u0000\u0001\u0001\u0013\u0013\u0002"+
		"\u0000\u0001\u0001\u0011\u0011\u0002\u0000\u0001\u0001\u000f\u000f\u0002"+
		"\u0000\u0001\u0001\u000e\u000e\u0002\u0000\u0001\u0001\u0010\u0010\u0002"+
		"\u0000\u0001\u0001\u0012\u0012\u0002\u0000\u0001\u0001\u0016\u0016\u0003"+
		"\u0000\u0001\u0001\u0015\u0015\u0018\u0018\u0002\u0000\u0001\u0001\u0015"+
		"\u0015^\u0000\u0018\u0001\u0000\u0000\u0000\u0002\u001c\u0001\u0000\u0000"+
		"\u0000\u0004)\u0001\u0000\u0000\u0000\u0006+\u0001\u0000\u0000\u0000\b"+
		"1\u0001\u0000\u0000\u0000\n7\u0001\u0000\u0000\u0000\f=\u0001\u0000\u0000"+
		"\u0000\u000eC\u0001\u0000\u0000\u0000\u0010I\u0001\u0000\u0000\u0000\u0012"+
		"O\u0001\u0000\u0000\u0000\u0014U\u0001\u0000\u0000\u0000\u0016[\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0003\u0002\u0001\u0000\u0019\u001a\u0005"+
		"\u0002\u0000\u0000\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u001d\u0003"+
		"\u0004\u0002\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001"+
		"\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001"+
		"\u0000\u0000\u0000\u001f\u0003\u0001\u0000\u0000\u0000 *\u0003\u0006\u0003"+
		"\u0000!*\u0003\b\u0004\u0000\"*\u0003\n\u0005\u0000#*\u0003\u0014\n\u0000"+
		"$*\u0003\u0016\u000b\u0000%*\u0003\f\u0006\u0000&*\u0003\u000e\u0007\u0000"+
		"\'*\u0003\u0010\b\u0000(*\u0003\u0012\t\u0000) \u0001\u0000\u0000\u0000"+
		")!\u0001\u0000\u0000\u0000)\"\u0001\u0000\u0000\u0000)#\u0001\u0000\u0000"+
		"\u0000)$\u0001\u0000\u0000\u0000)%\u0001\u0000\u0000\u0000)&\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*\u0005"+
		"\u0001\u0000\u0000\u0000+,\u0005\u0014\u0000\u0000,-\u0005\u0004\u0000"+
		"\u0000-.\u0005\u0003\u0000\u0000./\u0007\u0000\u0000\u0000/0\u0005\u0003"+
		"\u0000\u00000\u0007\u0001\u0000\u0000\u000012\u0005\u0014\u0000\u0000"+
		"23\u0005\u0005\u0000\u000034\u0005\u0003\u0000\u000045\u0007\u0001\u0000"+
		"\u000056\u0005\u0003\u0000\u00006\t\u0001\u0000\u0000\u000078\u0005\u0014"+
		"\u0000\u000089\u0005\u0006\u0000\u00009:\u0005\u0003\u0000\u0000:;\u0007"+
		"\u0002\u0000\u0000;<\u0005\u0003\u0000\u0000<\u000b\u0001\u0000\u0000"+
		"\u0000=>\u0005\u0014\u0000\u0000>?\u0005\t\u0000\u0000?@\u0005\u0003\u0000"+
		"\u0000@A\u0007\u0003\u0000\u0000AB\u0005\u0003\u0000\u0000B\r\u0001\u0000"+
		"\u0000\u0000CD\u0005\u0014\u0000\u0000DE\u0005\n\u0000\u0000EF\u0005\u0003"+
		"\u0000\u0000FG\u0007\u0004\u0000\u0000GH\u0005\u0003\u0000\u0000H\u000f"+
		"\u0001\u0000\u0000\u0000IJ\u0005\u0014\u0000\u0000JK\u0005\u000b\u0000"+
		"\u0000KL\u0005\u0003\u0000\u0000LM\u0007\u0005\u0000\u0000MN\u0005\u0003"+
		"\u0000\u0000N\u0011\u0001\u0000\u0000\u0000OP\u0005\u0014\u0000\u0000"+
		"PQ\u0005\f\u0000\u0000QR\u0005\u0003\u0000\u0000RS\u0007\u0006\u0000\u0000"+
		"ST\u0005\u0003\u0000\u0000T\u0013\u0001\u0000\u0000\u0000UV\u0005\u0014"+
		"\u0000\u0000VW\u0005\u0007\u0000\u0000WX\u0005\u0003\u0000\u0000XY\u0007"+
		"\u0007\u0000\u0000YZ\u0005\u0003\u0000\u0000Z\u0015\u0001\u0000\u0000"+
		"\u0000[\\\u0005\u0014\u0000\u0000\\]\u0005\b\u0000\u0000]^\u0005\u0003"+
		"\u0000\u0000^_\u0007\b\u0000\u0000_`\u0005\u0003\u0000\u0000`\u0017\u0001"+
		"\u0000\u0000\u0000\u0002\u001e)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}