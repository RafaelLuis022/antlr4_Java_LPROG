// Generated from C:/Users/rafae/Ambiente de Trabalho/uni/2Ano_2semestre/LPROG/ANTLR/antlr4/src/expressions/globalPluginsAnswersGrammar/antlrAnswersGrammar.g4 by ANTLR 4.13.1
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
		ENDOFLINE=1, END=2, NEWLINE=3, TYPE_TRUEFALSE=4, TYPE_TIMEHOUR=5, TYPE_DATE=6, 
		TYPE_MULTIPLECHOICE=7, TYPE_SINGLECHOICE=8, TYPE_NUMERICALSCALE=9, TYPE_DECIMAL=10, 
		TYPE_INTEGER=11, TYPE_SHORTTEXT=12, BEFORE_VALUE_TOKEN=13, QUESTION=14, 
		EMPTY=15, STRING=16, CHAR=17, NUMERIC=18, WS=19;
	public static final int
		RULE_start = 0, RULE_listOfQuestions = 1, RULE_questions = 2, RULE_answers = 3, 
		RULE_type = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "listOfQuestions", "questions", "answers", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'END'", null, "'(True/False)'", "'(HH:MM)'", "'(Date:dd/mm/yyyy)'", 
			"'(Multiple Choice)'", "'(Single Choice)'", "'(Range 1-5)'", "'(Decimal Number)'", 
			"'(Integer Number)'", "'(Short Text)'", "'->'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ENDOFLINE", "END", "NEWLINE", "TYPE_TRUEFALSE", "TYPE_TIMEHOUR", 
			"TYPE_DATE", "TYPE_MULTIPLECHOICE", "TYPE_SINGLECHOICE", "TYPE_NUMERICALSCALE", 
			"TYPE_DECIMAL", "TYPE_INTEGER", "TYPE_SHORTTEXT", "BEFORE_VALUE_TOKEN", 
			"QUESTION", "EMPTY", "STRING", "CHAR", "NUMERIC", "WS"
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
			setState(10);
			listOfQuestions();
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
			setState(14); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(13);
				questions();
				}
				}
				setState(16); 
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
		public Token ctx_question;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(antlrAnswersGrammarParser.NEWLINE, 0); }
		public TerminalNode QUESTION() { return getToken(antlrAnswersGrammarParser.QUESTION, 0); }
		public List<AnswersContext> answers() {
			return getRuleContexts(AnswersContext.class);
		}
		public AnswersContext answers(int i) {
			return getRuleContext(AnswersContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			((QuestionsContext)_localctx).ctx_question = match(QUESTION);
			setState(19);
			type();
			setState(20);
			match(NEWLINE);
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				answers();
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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
	public static class AnswersContext extends ParserRuleContext {
		public Token ctx_answer;
		public Token ctx_value;
		public TerminalNode BEFORE_VALUE_TOKEN() { return getToken(antlrAnswersGrammarParser.BEFORE_VALUE_TOKEN, 0); }
		public TerminalNode ENDOFLINE() { return getToken(antlrAnswersGrammarParser.ENDOFLINE, 0); }
		public TerminalNode NEWLINE() { return getToken(antlrAnswersGrammarParser.NEWLINE, 0); }
		public List<TerminalNode> STRING() { return getTokens(antlrAnswersGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(antlrAnswersGrammarParser.STRING, i);
		}
		public AnswersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrAnswersGrammarVisitor ) return ((antlrAnswersGrammarVisitor<? extends T>)visitor).visitAnswers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswersContext answers() throws RecognitionException {
		AnswersContext _localctx = new AnswersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_answers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			((AnswersContext)_localctx).ctx_answer = match(STRING);
			setState(27);
			match(BEFORE_VALUE_TOKEN);
			setState(28);
			((AnswersContext)_localctx).ctx_value = match(STRING);
			setState(29);
			match(ENDOFLINE);
			setState(30);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE_TRUEFALSE() { return getToken(antlrAnswersGrammarParser.TYPE_TRUEFALSE, 0); }
		public TerminalNode TYPE_TIMEHOUR() { return getToken(antlrAnswersGrammarParser.TYPE_TIMEHOUR, 0); }
		public TerminalNode TYPE_DATE() { return getToken(antlrAnswersGrammarParser.TYPE_DATE, 0); }
		public TerminalNode TYPE_MULTIPLECHOICE() { return getToken(antlrAnswersGrammarParser.TYPE_MULTIPLECHOICE, 0); }
		public TerminalNode TYPE_SINGLECHOICE() { return getToken(antlrAnswersGrammarParser.TYPE_SINGLECHOICE, 0); }
		public TerminalNode TYPE_NUMERICALSCALE() { return getToken(antlrAnswersGrammarParser.TYPE_NUMERICALSCALE, 0); }
		public TerminalNode TYPE_DECIMAL() { return getToken(antlrAnswersGrammarParser.TYPE_DECIMAL, 0); }
		public TerminalNode TYPE_INTEGER() { return getToken(antlrAnswersGrammarParser.TYPE_INTEGER, 0); }
		public TerminalNode TYPE_SHORTTEXT() { return getToken(antlrAnswersGrammarParser.TYPE_SHORTTEXT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof antlrAnswersGrammarVisitor ) return ((antlrAnswersGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8176L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0013#\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u000f\b\u0001\u000b"+
		"\u0001\f\u0001\u0010\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004"+
		"\u0002\u0017\b\u0002\u000b\u0002\f\u0002\u0018\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0001\u0001"+
		"\u0000\u0004\f\u001f\u0000\n\u0001\u0000\u0000\u0000\u0002\u000e\u0001"+
		"\u0000\u0000\u0000\u0004\u0012\u0001\u0000\u0000\u0000\u0006\u001a\u0001"+
		"\u0000\u0000\u0000\b \u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001"+
		"\u0000\u000b\f\u0005\u0002\u0000\u0000\f\u0001\u0001\u0000\u0000\u0000"+
		"\r\u000f\u0003\u0004\u0002\u0000\u000e\r\u0001\u0000\u0000\u0000\u000f"+
		"\u0010\u0001\u0000\u0000\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0010"+
		"\u0011\u0001\u0000\u0000\u0000\u0011\u0003\u0001\u0000\u0000\u0000\u0012"+
		"\u0013\u0005\u000e\u0000\u0000\u0013\u0014\u0003\b\u0004\u0000\u0014\u0016"+
		"\u0005\u0003\u0000\u0000\u0015\u0017\u0003\u0006\u0003\u0000\u0016\u0015"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0016"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0005"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0010\u0000\u0000\u001b\u001c"+
		"\u0005\r\u0000\u0000\u001c\u001d\u0005\u0010\u0000\u0000\u001d\u001e\u0005"+
		"\u0001\u0000\u0000\u001e\u001f\u0005\u0003\u0000\u0000\u001f\u0007\u0001"+
		"\u0000\u0000\u0000 !\u0007\u0000\u0000\u0000!\t\u0001\u0000\u0000\u0000"+
		"\u0002\u0010\u0018";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}