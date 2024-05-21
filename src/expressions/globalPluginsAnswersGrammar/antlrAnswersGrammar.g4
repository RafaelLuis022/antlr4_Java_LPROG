grammar antlrAnswersGrammar;

start: listOfQuestions END;

listOfQuestions: questions+;

questions: ctx_question=QUESTION type NEWLINE answers+;

answers: ctx_answer=STRING BEFORE_VALUE_TOKEN ctx_value=STRING ENDOFLINE NEWLINE;

type: TYPE_TRUEFALSE
    | TYPE_TIMEHOUR
    | TYPE_DATE
    | TYPE_MULTIPLECHOICE
    | TYPE_SINGLECHOICE
    | TYPE_NUMERICALSCALE
    | TYPE_DECIMAL
    | TYPE_INTEGER
    | TYPE_SHORTTEXT;

ENDOFLINE: ';';
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
BEFORE_VALUE_TOKEN: '->';
QUESTION: '#' (STRING | EMPTY | ':' | ',' | '(' | ')' | '+' | '[' | ']' | '-')+ '?';
EMPTY: ' ';
STRING: (CHAR | ' ')+;
CHAR: [a-zA-Z] | NUMERIC;
NUMERIC : [0-9];
WS: [ \t\r]+ -> skip;
