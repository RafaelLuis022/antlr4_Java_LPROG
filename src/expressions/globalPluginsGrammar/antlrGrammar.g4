grammar antlrGrammar;

start: listOfQuestions END;

listOfQuestions: questions+;

questions: question_tf
        | question_timehour
        | question_date
        | question_multiplechoice
        | question_singlechoice
        | question_numericalscale
        | question_decimal
        | question_integer
        | question_shorttext
        ;

question_tf: ctx_question=QUESTION  ctx_type=TYPE_TRUEFALSE NEWLINE ctx_answer= (TRUEFALSEANSWER | EMPTY ) NEWLINE;
question_timehour: ctx_question=QUESTION  ctx_type=TYPE_TIMEHOUR NEWLINE ctx_answer=(TIMEHOURANSWER| EMPTY ) NEWLINE;
question_date: ctx_question=QUESTION  ctx_type=TYPE_DATE NEWLINE ctx_answer=(DATEANSWER| EMPTY) NEWLINE;
question_numericalscale: ctx_question=QUESTION  ctx_type=TYPE_NUMERICALSCALE NEWLINE ctx_answer=(NUMERICALSCALEANSWER| EMPTY ) NEWLINE;
question_decimal: ctx_question=QUESTION  ctx_type=TYPE_DECIMAL NEWLINE ctx_answer=(DECIMALANSWER| EMPTY ) NEWLINE;
question_integer: ctx_question=QUESTION  ctx_type=TYPE_INTEGER NEWLINE ctx_answer=(INTEGERANSWER| EMPTY) NEWLINE;
question_shorttext: ctx_question=QUESTION  ctx_type=TYPE_SHORTTEXT NEWLINE ctx_answer=(SHORTTEXTANSWER | EMPTY) NEWLINE;
question_multiplechoice:  ctx_question=QUESTION  ctx_type=TYPE_MULTIPLECHOICE NEWLINE ctx_answer=( MULTIPLECHOISEANSWER| SINGLECHOISEANSWER| EMPTY ) NEWLINE;
question_singlechoice: ctx_question=QUESTION  ctx_type=TYPE_SINGLECHOICE NEWLINE ctx_answer= (SINGLECHOISEANSWER | EMPTY )NEWLINE;

END: 'END';
NEWLINE: '\n'+;
TYPE_TRUEFALSE: '(True/False)';
TYPE_TIMEHOUR: '(HH:MM)';
TYPE_DATE: '(Date:dd/mm/yyyy)';
TYPE_MULTIPLECHOICE: '(Multiple Choice)';
TYPE_SINGLECHOICE: '(Single Choice)';
TYPE_NUMERICALSCALE: '(Range 1-5)';
TYPE_DECIMAL: '(Decimal Number)';
TYPE_INTEGER: '(Integer Number)';
TYPE_SHORTTEXT: '(Short Text)';
MAX_SHORT_TEXT_LENGHT: '10';
NUMERICALSCALEANSWER: [1-5];
DATEANSWER: ('0'[1-9] | [1-2][0-9] | '3'[0-1]) '/' ('0'[1-9] | '1'[0-2]) '/' [0-9][0-9][0-9][0-9];
DECIMALANSWER: [0-9]+'.'[0-9]+ | [0-9]+','[0-9]+;
TIMEHOURANSWER: ('0' | '1' [0-9] | '2' [0-3]) ':' [0-5] [0-9];
INTEGERANSWER: [0-9]+;
TRUEFALSEANSWER: 'True' | 'False' | 'true' | 'false';
QUESTION: '#' (STRING | EMPTY | ':' | ',' | '(' | ')' | '+' | '[' | ']' | '-')+ '?';
SINGLECHOISEANSWER: CHAR;
SHORTTEXTANSWER: (STRING | EMPTY)+;
MULTIPLECHOISEANSWER: SINGLECHOISEANSWER ( ',' SINGLECHOISEANSWER)+;
EMPTY: ' ';
STRING: CHAR+;
CHAR : [a-zA-Z0-9];
WS: [ \t\r]+ -> skip;