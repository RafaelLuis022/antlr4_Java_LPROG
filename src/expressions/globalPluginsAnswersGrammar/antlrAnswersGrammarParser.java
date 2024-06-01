// Generated from C:/Users/HP/Desktop/lapr4/lprog/antlr4_Java_LPROG/src/expressions/globalPluginsAnswersGrammar/antlrAnswersGrammar.g4 by ANTLR 4.13.1
package expressions.globalPluginsAnswersGrammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class antlrAnswersGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NA=3, END=4, ENDOFLINE=5, NUMERICALSCALEANSWER=6, NUMERIC_VALUE=7, 
		BEFORE_VALUE_TOKEN=8, NEWLINE=9, TYPE_TRUEFALSE=10, TYPE_TIMEHOUR=11, 
		TYPE_DATE=12, TYPE_MULTIPLECHOICE=13, TYPE_SINGLECHOICE=14, TYPE_NUMERICALSCALE=15, 
		TYPE_DECIMAL=16, TYPE_INTEGER=17, TYPE_SHORTTEXT=18, DATEANSWER=19, DECIMALANSWER=20, 
		TIMEHOURANSWER=21, INTEGERANSWER=22, TRUEFALSEANSWER=23, QUESTION=24, 
		SINGLECHOISEANSWER=25, SHORTTEXTANSWER=26, MULTIPLECHOISEANSWER=27, EMPTY=28, 
		STRING=29, CHAR=30, WS=31;
	public static final int
		RULE_start = 0, RULE_listOfQuestions = 1, RULE_questions = 2, RULE_criteria = 3, 
		RULE_question_tf = 4, RULE_question_timehour = 5, RULE_question_date = 6, 
		RULE_question_numericalscale = 7, RULE_question_decimal = 8, RULE_question_integer = 9, 
		RULE_question_shorttext = 10, RULE_question_multiplechoice = 11, RULE_question_singlechoice = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "listOfQuestions", "questions", "criteria", "question_tf", "question_timehour", 
			"question_date", "question_numericalscale", "question_decimal", "question_integer", 
			"question_shorttext", "question_multiplechoice", "question_singlechoice"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#Criteria:q='", "';grade_min='", "'n/a'", "'END'", "';'", null, 
			null, "'->'", null, "'(True/False)'", "'(HH:MM)'", "'(Date:dd/mm/yyyy)'", 
			"'(Multiple Choice)'", "'(Single Choice)'", "'(Range n1-n5)'", "'(Decimal Number)'", 
			"'(Integer Number)'", "'(Short Text)'", null, null, null, null, null, 
			null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NA", "END", "ENDOFLINE", "NUMERICALSCALEANSWER", "NUMERIC_VALUE", 
			"BEFORE_VALUE_TOKEN", "NEWLINE", "TYPE_TRUEFALSE", "TYPE_TIMEHOUR", "TYPE_DATE", 
			"TYPE_MULTIPLECHOICE", "TYPE_SINGLECHOICE", "TYPE_NUMERICALSCALE", "TYPE_DECIMAL", 
			"TYPE_INTEGER", "TYPE_SHORTTEXT", "DATEANSWER", "DECIMALANSWER", "TIMEHOURANSWER", 
			"INTEGERANSWER", "TRUEFALSEANSWER", "QUESTION", "SINGLECHOISEANSWER", 
			"SHORTTEXTANSWER", "MULTIPLECHOISEANSWER", "EMPTY", "STRING", "CHAR", 
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
	public String getGrammarFileName() { return "antlrAnswersGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public antlrAnswersGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ListOfQuestionsContext listOfQuestions() {
			return getRuleContext(ListOfQuestionsContext.class,0);
		}
		public TerminalNode END() { return getToken(antlrAnswersGrammarParser.END, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrAnswersGrammarVisitor ) return ((antlrAnswersGrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			listOfQuestions();
			setState(27);
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
		public CriteriaContext criteria() {
			return getRuleContext(CriteriaContext.class,0);
		}
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
			if ( visitor instanceof antlrAnswersGrammarVisitor ) return ((antlrAnswersGrammarVisitor<? extends T>)visitor).visitListOfQuestions(this);
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
			setState(29);
			criteria();
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				questions();
				}
				}
				setState(33); 
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
			if ( visitor instanceof antlrAnswersGrammarVisitor ) return ((antlrAnswersGrammarVisitor<? extends T>)visitor).visitQuestions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionsContext questions() throws RecognitionException {
		QuestionsContext _localctx = new QuestionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_questions);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				question_tf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				question_timehour();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				question_date();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				question_multiplechoice();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				question_singlechoice();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				question_numericalscale();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(41);
				question_decimal();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(42);
				question_integer();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(43);
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
	public static class CriteriaContext extends ParserRuleContext {
		public Token ctx_q;
		public Token ctx_gm;
		public TerminalNode NEWLINE() { return getToken(antlrAnswersGrammarParser.NEWLINE, 0); }
		public List<TerminalNode> NA() { return getTokens(antlrAnswersGrammarParser.NA); }
		public TerminalNode NA(int i) {
			return getToken(antlrAnswersGrammarParser.NA, i);
		}
		public List<TerminalNode> NUMERIC_VALUE() { return getTokens(antlrAnswersGrammarParser.NUMERIC_VALUE); }
		public TerminalNode NUMERIC_VALUE(int i) {
			return getToken(antlrAnswersGrammarParser.NUMERIC_VALUE, i);
		}
		public CriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criteria; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrAnswersGrammarVisitor ) return ((antlrAnswersGrammarVisitor<? extends T>)visitor).visitCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CriteriaContext criteria() throws RecognitionException {
		CriteriaContext _localctx = new CriteriaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_criteria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__0);
			setState(47);
			((CriteriaContext)_localctx).ctx_q = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==NA || _la==NUMERIC_VALUE) ) {
				((CriteriaContext)_localctx).ctx_q = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(48);
			match(T__1);
			setState(49);
			((CriteriaContext)_localctx).ctx_gm = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==NA || _la==NUMERIC_VALUE) ) {
				((CriteriaContext)_localctx).ctx_gm = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(50);
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
	public static class Question_tfContext extends ParserRuleContext {
		public Token ctx_question;
		public Token ctx_type;
		public Token ctx_answer;
		public Token ctx_value;
		public List<TerminalNode> NEWLINE() { return getTokens(antlrAnswersGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrAnswersGrammarParser.NEWLINE, i);
		}
		public TerminalNode BEFORE_VALUE_TOKEN() { return getToken(antlrAnswersGrammarParser.BEFORE_VALUE_TOKEN, 0); }
		public TerminalNode ENDOFLINE() { return getToken(antlrAnswersGrammarParser.ENDOFLINE, 0); }
		public TerminalNode QUESTION() { return getToken(antlrAnswersGrammarParser.QUESTION, 0); }
		public TerminalNode TYPE_TRUEFALSE() { return getToken(antlrAnswersGrammarParser.TYPE_TRUEFALSE, 0); }
		public TerminalNode TRUEFALSEANSWER() { return getToken(antlrAnswersGrammarParser.TRUEFALSEANSWER, 0); }
		public TerminalNode NUMERIC_VALUE() { return getToken(antlrAnswersGrammarParser.NUMERIC_VALUE, 0); }
		public Question_tfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_tf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrAnswersGrammarVisitor ) return ((antlrAnswersGrammarVisitor<? extends T>)visitor).visitQuestion_tf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_tfContext question_tf() throws RecognitionException {
		Question_tfContext _localctx = new Question_tfContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_question_tf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			((Question_tfContext)_localctx).ctx_question = match(QUESTION);
			setState(53);
			((Question_tfContext)_localctx).ctx_type = match(TYPE_TRUEFALSE);
			setState(54);
			match(NEWLINE);
			setState(55);
			((Question_tfContext)_localctx).ctx_answer = match(TRUEFALSEANSWER);
			setState(56);
			match(BEFORE_VALUE_TOKEN);
			setState(57);
			((Question_tfContext)_localctx).ctx_value = match(NUMERIC_VALUE);
			setState(58);
			match(ENDOFLINE);
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
	public static class Question_timehourContext extends ParserRuleContext {
		public Token ctx_question;
		public Token ctx_type;
		public Token ctx_answer;
		public Token ctx_value;
		public List<TerminalNode> NEWLINE() { return getTokens(antlrAnswersGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrAnswersGrammarParser.NEWLINE, i);
		}
		public TerminalNode BEFORE_VALUE_TOKEN() { return getToken(antlrAnswersGrammarParser.BEFORE_VALUE_TOKEN, 0); }
		public TerminalNode ENDOFLINE() { return getToken(antlrAnswersGrammarParser.ENDOFLINE, 0); }
		public TerminalNode QUESTION() { return getToken(antlrAnswersGrammarParser.QUESTION, 0); }
		public TerminalNode TYPE_TIMEHOUR() { return getToken(antlrAnswersGrammarParser.TYPE_TIMEHOUR, 0); }
		public TerminalNode TIMEHOURANSWER() { return getToken(antlrAnswersGrammarParser.TIMEHOURANSWER, 0); }
		public TerminalNode NUMERIC_VALUE() { return getToken(antlrAnswersGrammarParser.NUMERIC_VALUE, 0); }
		public Question_timehourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_timehour; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrAnswersGrammarVisitor ) return ((antlrAnswersGrammarVisitor<? extends T>)visitor).visitQuestion_timehour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_timehourContext question_timehour() throws RecognitionException {
		Question_timehourContext _localctx = new Question_timehourContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_question_timehour);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			((Question_timehourContext)_localctx).ctx_question = match(QUESTION);
			setState(62);
			((Question_timehourContext)_localctx).ctx_type = match(TYPE_TIMEHOUR);
			setState(63);
			match(NEWLINE);
			setState(64);
			((Question_timehourContext)_localctx).ctx_answer = match(TIMEHOURANSWER);
			setState(65);
			match(BEFORE_VALUE_TOKEN);
			setState(66);
			((Question_timehourContext)_localctx).ctx_value = match(NUMERIC_VALUE);
			setState(67);
			match(ENDOFLINE);
			setState(68);
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
		public Token ctx_value;
		public List<TerminalNode> NEWLINE() { return getTokens(antlrAnswersGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrAnswersGrammarParser.NEWLINE, i);
		}
		public TerminalNode BEFORE_VALUE_TOKEN() { return getToken(antlrAnswersGrammarParser.BEFORE_VALUE_TOKEN, 0); }
		public TerminalNode ENDOFLINE() { return getToken(antlrAnswersGrammarParser.ENDOFLINE, 0); }
		public TerminalNode QUESTION() { return getToken(antlrAnswersGrammarParser.QUESTION, 0); }
		public TerminalNode TYPE_DATE() { return getToken(antlrAnswersGrammarParser.TYPE_DATE, 0); }
		public TerminalNode DATEANSWER() { return getToken(antlrAnswersGrammarParser.DATEANSWER, 0); }
		public TerminalNode NUMERIC_VALUE() { return getToken(antlrAnswersGrammarParser.NUMERIC_VALUE, 0); }
		public Question_dateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_date; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrAnswersGrammarVisitor ) return ((antlrAnswersGrammarVisitor<? extends T>)visitor).visitQuestion_date(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_dateContext question_date() throws RecognitionException {
		Question_dateContext _localctx = new Question_dateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_question_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			((Question_dateContext)_localctx).ctx_question = match(QUESTION);
			setState(71);
			((Question_dateContext)_localctx).ctx_type = match(TYPE_DATE);
			setState(72);
			match(NEWLINE);
			setState(73);
			((Question_dateContext)_localctx).ctx_answer = match(DATEANSWER);
			setState(74);
			match(BEFORE_VALUE_TOKEN);
			setState(75);
			((Question_dateContext)_localctx).ctx_value = match(NUMERIC_VALUE);
			setState(76);
			match(ENDOFLINE);
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
	public static class Question_numericalscaleContext extends ParserRuleContext {
		public Token ctx_question;
		public Token ctx_type;
		public Token ctx_answer;
		public Token ctx_value;
		public List<TerminalNode> NEWLINE() { return getTokens(antlrAnswersGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrAnswersGrammarParser.NEWLINE, i);
		}
		public TerminalNode BEFORE_VALUE_TOKEN() { return getToken(antlrAnswersGrammarParser.BEFORE_VALUE_TOKEN, 0); }
		public TerminalNode ENDOFLINE() { return getToken(antlrAnswersGrammarParser.ENDOFLINE, 0); }
		public TerminalNode QUESTION() { return getToken(antlrAnswersGrammarParser.QUESTION, 0); }
		public TerminalNode TYPE_NUMERICALSCALE() { return getToken(antlrAnswersGrammarParser.TYPE_NUMERICALSCALE, 0); }
		public TerminalNode NUMERICALSCALEANSWER() { return getToken(antlrAnswersGrammarParser.NUMERICALSCALEANSWER, 0); }
		public TerminalNode NUMERIC_VALUE() { return getToken(antlrAnswersGrammarParser.NUMERIC_VALUE, 0); }
		public Question_numericalscaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_numericalscale; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrAnswersGrammarVisitor ) return ((antlrAnswersGrammarVisitor<? extends T>)visitor).visitQuestion_numericalscale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_numericalscaleContext question_numericalscale() throws RecognitionException {
		Question_numericalscaleContext _localctx = new Question_numericalscaleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_question_numericalscale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			((Question_numericalscaleContext)_localctx).ctx_question = match(QUESTION);
			setState(80);
			((Question_numericalscaleContext)_localctx).ctx_type = match(TYPE_NUMERICALSCALE);
			setState(81);
			match(NEWLINE);
			setState(82);
			((Question_numericalscaleContext)_localctx).ctx_answer = match(NUMERICALSCALEANSWER);
			setState(83);
			match(BEFORE_VALUE_TOKEN);
			setState(84);
			((Question_numericalscaleContext)_localctx).ctx_value = match(NUMERIC_VALUE);
			setState(85);
			match(ENDOFLINE);
			setState(86);
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
		public Token ctx_value;
		public List<TerminalNode> NEWLINE() { return getTokens(antlrAnswersGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrAnswersGrammarParser.NEWLINE, i);
		}
		public TerminalNode BEFORE_VALUE_TOKEN() { return getToken(antlrAnswersGrammarParser.BEFORE_VALUE_TOKEN, 0); }
		public TerminalNode ENDOFLINE() { return getToken(antlrAnswersGrammarParser.ENDOFLINE, 0); }
		public TerminalNode QUESTION() { return getToken(antlrAnswersGrammarParser.QUESTION, 0); }
		public TerminalNode TYPE_DECIMAL() { return getToken(antlrAnswersGrammarParser.TYPE_DECIMAL, 0); }
		public TerminalNode DECIMALANSWER() { return getToken(antlrAnswersGrammarParser.DECIMALANSWER, 0); }
		public TerminalNode NUMERIC_VALUE() { return getToken(antlrAnswersGrammarParser.NUMERIC_VALUE, 0); }
		public Question_decimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_decimal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrAnswersGrammarVisitor ) return ((antlrAnswersGrammarVisitor<? extends T>)visitor).visitQuestion_decimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_decimalContext question_decimal() throws RecognitionException {
		Question_decimalContext _localctx = new Question_decimalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_question_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			((Question_decimalContext)_localctx).ctx_question = match(QUESTION);
			setState(89);
			((Question_decimalContext)_localctx).ctx_type = match(TYPE_DECIMAL);
			setState(90);
			match(NEWLINE);
			setState(91);
			((Question_decimalContext)_localctx).ctx_answer = match(DECIMALANSWER);
			setState(92);
			match(BEFORE_VALUE_TOKEN);
			setState(93);
			((Question_decimalContext)_localctx).ctx_value = match(NUMERIC_VALUE);
			setState(94);
			match(ENDOFLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Question_integerContext extends ParserRuleContext {
		public Token ctx_question;
		public Token ctx_type;
		public Token ctx_answer;
		public Token ctx_value;
		public List<TerminalNode> NEWLINE() { return getTokens(antlrAnswersGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrAnswersGrammarParser.NEWLINE, i);
		}
		public TerminalNode BEFORE_VALUE_TOKEN() { return getToken(antlrAnswersGrammarParser.BEFORE_VALUE_TOKEN, 0); }
		public TerminalNode ENDOFLINE() { return getToken(antlrAnswersGrammarParser.ENDOFLINE, 0); }
		public TerminalNode QUESTION() { return getToken(antlrAnswersGrammarParser.QUESTION, 0); }
		public TerminalNode TYPE_INTEGER() { return getToken(antlrAnswersGrammarParser.TYPE_INTEGER, 0); }
		public TerminalNode INTEGERANSWER() { return getToken(antlrAnswersGrammarParser.INTEGERANSWER, 0); }
		public TerminalNode NUMERIC_VALUE() { return getToken(antlrAnswersGrammarParser.NUMERIC_VALUE, 0); }
		public Question_integerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_integer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrAnswersGrammarVisitor ) return ((antlrAnswersGrammarVisitor<? extends T>)visitor).visitQuestion_integer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_integerContext question_integer() throws RecognitionException {
		Question_integerContext _localctx = new Question_integerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_question_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			((Question_integerContext)_localctx).ctx_question = match(QUESTION);
			setState(98);
			((Question_integerContext)_localctx).ctx_type = match(TYPE_INTEGER);
			setState(99);
			match(NEWLINE);
			setState(100);
			((Question_integerContext)_localctx).ctx_answer = match(INTEGERANSWER);
			setState(101);
			match(BEFORE_VALUE_TOKEN);
			setState(102);
			((Question_integerContext)_localctx).ctx_value = match(NUMERIC_VALUE);
			setState(103);
			match(ENDOFLINE);
			setState(104);
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
		public Token ctx_value;
		public List<TerminalNode> NEWLINE() { return getTokens(antlrAnswersGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrAnswersGrammarParser.NEWLINE, i);
		}
		public TerminalNode BEFORE_VALUE_TOKEN() { return getToken(antlrAnswersGrammarParser.BEFORE_VALUE_TOKEN, 0); }
		public TerminalNode ENDOFLINE() { return getToken(antlrAnswersGrammarParser.ENDOFLINE, 0); }
		public TerminalNode QUESTION() { return getToken(antlrAnswersGrammarParser.QUESTION, 0); }
		public TerminalNode TYPE_SHORTTEXT() { return getToken(antlrAnswersGrammarParser.TYPE_SHORTTEXT, 0); }
		public TerminalNode SHORTTEXTANSWER() { return getToken(antlrAnswersGrammarParser.SHORTTEXTANSWER, 0); }
		public TerminalNode NUMERIC_VALUE() { return getToken(antlrAnswersGrammarParser.NUMERIC_VALUE, 0); }
		public Question_shorttextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_shorttext; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrAnswersGrammarVisitor ) return ((antlrAnswersGrammarVisitor<? extends T>)visitor).visitQuestion_shorttext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_shorttextContext question_shorttext() throws RecognitionException {
		Question_shorttextContext _localctx = new Question_shorttextContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_question_shorttext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((Question_shorttextContext)_localctx).ctx_question = match(QUESTION);
			setState(107);
			((Question_shorttextContext)_localctx).ctx_type = match(TYPE_SHORTTEXT);
			setState(108);
			match(NEWLINE);
			setState(109);
			((Question_shorttextContext)_localctx).ctx_answer = match(SHORTTEXTANSWER);
			setState(110);
			match(BEFORE_VALUE_TOKEN);
			setState(111);
			((Question_shorttextContext)_localctx).ctx_value = match(NUMERIC_VALUE);
			setState(112);
			match(ENDOFLINE);
			setState(113);
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
		public Token ctx_value;
		public List<TerminalNode> NEWLINE() { return getTokens(antlrAnswersGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrAnswersGrammarParser.NEWLINE, i);
		}
		public TerminalNode BEFORE_VALUE_TOKEN() { return getToken(antlrAnswersGrammarParser.BEFORE_VALUE_TOKEN, 0); }
		public TerminalNode ENDOFLINE() { return getToken(antlrAnswersGrammarParser.ENDOFLINE, 0); }
		public TerminalNode QUESTION() { return getToken(antlrAnswersGrammarParser.QUESTION, 0); }
		public TerminalNode TYPE_MULTIPLECHOICE() { return getToken(antlrAnswersGrammarParser.TYPE_MULTIPLECHOICE, 0); }
		public TerminalNode NUMERIC_VALUE() { return getToken(antlrAnswersGrammarParser.NUMERIC_VALUE, 0); }
		public TerminalNode MULTIPLECHOISEANSWER() { return getToken(antlrAnswersGrammarParser.MULTIPLECHOISEANSWER, 0); }
		public TerminalNode SINGLECHOISEANSWER() { return getToken(antlrAnswersGrammarParser.SINGLECHOISEANSWER, 0); }
		public Question_multiplechoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_multiplechoice; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrAnswersGrammarVisitor ) return ((antlrAnswersGrammarVisitor<? extends T>)visitor).visitQuestion_multiplechoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_multiplechoiceContext question_multiplechoice() throws RecognitionException {
		Question_multiplechoiceContext _localctx = new Question_multiplechoiceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_question_multiplechoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((Question_multiplechoiceContext)_localctx).ctx_question = match(QUESTION);
			setState(116);
			((Question_multiplechoiceContext)_localctx).ctx_type = match(TYPE_MULTIPLECHOICE);
			setState(117);
			match(NEWLINE);
			setState(118);
			((Question_multiplechoiceContext)_localctx).ctx_answer = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==SINGLECHOISEANSWER || _la==MULTIPLECHOISEANSWER) ) {
				((Question_multiplechoiceContext)_localctx).ctx_answer = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(119);
			match(BEFORE_VALUE_TOKEN);
			setState(120);
			((Question_multiplechoiceContext)_localctx).ctx_value = match(NUMERIC_VALUE);
			setState(121);
			match(ENDOFLINE);
			setState(122);
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
		public Token ctx_value;
		public List<TerminalNode> NEWLINE() { return getTokens(antlrAnswersGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(antlrAnswersGrammarParser.NEWLINE, i);
		}
		public TerminalNode BEFORE_VALUE_TOKEN() { return getToken(antlrAnswersGrammarParser.BEFORE_VALUE_TOKEN, 0); }
		public TerminalNode ENDOFLINE() { return getToken(antlrAnswersGrammarParser.ENDOFLINE, 0); }
		public TerminalNode QUESTION() { return getToken(antlrAnswersGrammarParser.QUESTION, 0); }
		public TerminalNode TYPE_SINGLECHOICE() { return getToken(antlrAnswersGrammarParser.TYPE_SINGLECHOICE, 0); }
		public TerminalNode SINGLECHOISEANSWER() { return getToken(antlrAnswersGrammarParser.SINGLECHOISEANSWER, 0); }
		public TerminalNode NUMERIC_VALUE() { return getToken(antlrAnswersGrammarParser.NUMERIC_VALUE, 0); }
		public Question_singlechoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_singlechoice; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrAnswersGrammarVisitor ) return ((antlrAnswersGrammarVisitor<? extends T>)visitor).visitQuestion_singlechoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_singlechoiceContext question_singlechoice() throws RecognitionException {
		Question_singlechoiceContext _localctx = new Question_singlechoiceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_question_singlechoice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			((Question_singlechoiceContext)_localctx).ctx_question = match(QUESTION);
			setState(125);
			((Question_singlechoiceContext)_localctx).ctx_type = match(TYPE_SINGLECHOICE);
			setState(126);
			match(NEWLINE);
			setState(127);
			((Question_singlechoiceContext)_localctx).ctx_answer = match(SINGLECHOISEANSWER);
			setState(128);
			match(BEFORE_VALUE_TOKEN);
			setState(129);
			((Question_singlechoiceContext)_localctx).ctx_value = match(NUMERIC_VALUE);
			setState(130);
			match(ENDOFLINE);
			setState(131);
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
		"\u0004\u0001\u001f\u0086\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0004\u0001 \b\u0001\u000b\u0001\f\u0001!\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002-\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u0000\u0002\u0002\u0000\u0003\u0003\u0007\u0007\u0002"+
		"\u0000\u0019\u0019\u001b\u001b\u0081\u0000\u001a\u0001\u0000\u0000\u0000"+
		"\u0002\u001d\u0001\u0000\u0000\u0000\u0004,\u0001\u0000\u0000\u0000\u0006"+
		".\u0001\u0000\u0000\u0000\b4\u0001\u0000\u0000\u0000\n=\u0001\u0000\u0000"+
		"\u0000\fF\u0001\u0000\u0000\u0000\u000eO\u0001\u0000\u0000\u0000\u0010"+
		"X\u0001\u0000\u0000\u0000\u0012a\u0001\u0000\u0000\u0000\u0014j\u0001"+
		"\u0000\u0000\u0000\u0016s\u0001\u0000\u0000\u0000\u0018|\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0003\u0002\u0001\u0000\u001b\u001c\u0005\u0004\u0000"+
		"\u0000\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001f\u0003\u0006\u0003"+
		"\u0000\u001e \u0003\u0004\u0002\u0000\u001f\u001e\u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000#-\u0003\b\u0004\u0000$-\u0003"+
		"\n\u0005\u0000%-\u0003\f\u0006\u0000&-\u0003\u0016\u000b\u0000\'-\u0003"+
		"\u0018\f\u0000(-\u0003\u000e\u0007\u0000)-\u0003\u0010\b\u0000*-\u0003"+
		"\u0012\t\u0000+-\u0003\u0014\n\u0000,#\u0001\u0000\u0000\u0000,$\u0001"+
		"\u0000\u0000\u0000,%\u0001\u0000\u0000\u0000,&\u0001\u0000\u0000\u0000"+
		",\'\u0001\u0000\u0000\u0000,(\u0001\u0000\u0000\u0000,)\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-\u0005\u0001"+
		"\u0000\u0000\u0000./\u0005\u0001\u0000\u0000/0\u0007\u0000\u0000\u0000"+
		"01\u0005\u0002\u0000\u000012\u0007\u0000\u0000\u000023\u0005\t\u0000\u0000"+
		"3\u0007\u0001\u0000\u0000\u000045\u0005\u0018\u0000\u000056\u0005\n\u0000"+
		"\u000067\u0005\t\u0000\u000078\u0005\u0017\u0000\u000089\u0005\b\u0000"+
		"\u00009:\u0005\u0007\u0000\u0000:;\u0005\u0005\u0000\u0000;<\u0005\t\u0000"+
		"\u0000<\t\u0001\u0000\u0000\u0000=>\u0005\u0018\u0000\u0000>?\u0005\u000b"+
		"\u0000\u0000?@\u0005\t\u0000\u0000@A\u0005\u0015\u0000\u0000AB\u0005\b"+
		"\u0000\u0000BC\u0005\u0007\u0000\u0000CD\u0005\u0005\u0000\u0000DE\u0005"+
		"\t\u0000\u0000E\u000b\u0001\u0000\u0000\u0000FG\u0005\u0018\u0000\u0000"+
		"GH\u0005\f\u0000\u0000HI\u0005\t\u0000\u0000IJ\u0005\u0013\u0000\u0000"+
		"JK\u0005\b\u0000\u0000KL\u0005\u0007\u0000\u0000LM\u0005\u0005\u0000\u0000"+
		"MN\u0005\t\u0000\u0000N\r\u0001\u0000\u0000\u0000OP\u0005\u0018\u0000"+
		"\u0000PQ\u0005\u000f\u0000\u0000QR\u0005\t\u0000\u0000RS\u0005\u0006\u0000"+
		"\u0000ST\u0005\b\u0000\u0000TU\u0005\u0007\u0000\u0000UV\u0005\u0005\u0000"+
		"\u0000VW\u0005\t\u0000\u0000W\u000f\u0001\u0000\u0000\u0000XY\u0005\u0018"+
		"\u0000\u0000YZ\u0005\u0010\u0000\u0000Z[\u0005\t\u0000\u0000[\\\u0005"+
		"\u0014\u0000\u0000\\]\u0005\b\u0000\u0000]^\u0005\u0007\u0000\u0000^_"+
		"\u0005\u0005\u0000\u0000_`\u0005\t\u0000\u0000`\u0011\u0001\u0000\u0000"+
		"\u0000ab\u0005\u0018\u0000\u0000bc\u0005\u0011\u0000\u0000cd\u0005\t\u0000"+
		"\u0000de\u0005\u0016\u0000\u0000ef\u0005\b\u0000\u0000fg\u0005\u0007\u0000"+
		"\u0000gh\u0005\u0005\u0000\u0000hi\u0005\t\u0000\u0000i\u0013\u0001\u0000"+
		"\u0000\u0000jk\u0005\u0018\u0000\u0000kl\u0005\u0012\u0000\u0000lm\u0005"+
		"\t\u0000\u0000mn\u0005\u001a\u0000\u0000no\u0005\b\u0000\u0000op\u0005"+
		"\u0007\u0000\u0000pq\u0005\u0005\u0000\u0000qr\u0005\t\u0000\u0000r\u0015"+
		"\u0001\u0000\u0000\u0000st\u0005\u0018\u0000\u0000tu\u0005\r\u0000\u0000"+
		"uv\u0005\t\u0000\u0000vw\u0007\u0001\u0000\u0000wx\u0005\b\u0000\u0000"+
		"xy\u0005\u0007\u0000\u0000yz\u0005\u0005\u0000\u0000z{\u0005\t\u0000\u0000"+
		"{\u0017\u0001\u0000\u0000\u0000|}\u0005\u0018\u0000\u0000}~\u0005\u000e"+
		"\u0000\u0000~\u007f\u0005\t\u0000\u0000\u007f\u0080\u0005\u0019\u0000"+
		"\u0000\u0080\u0081\u0005\b\u0000\u0000\u0081\u0082\u0005\u0007\u0000\u0000"+
		"\u0082\u0083\u0005\u0005\u0000\u0000\u0083\u0084\u0005\t\u0000\u0000\u0084"+
		"\u0019\u0001\u0000\u0000\u0000\u0002!,";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}