grammar antlrGrammar;

start: listOfQQuestionsAns END ;

listOfQQuestionsAns: questionAnswer+ ;

questionAnswer: question  answer NEWLINE;

question: '#' STRINGPHRASE '?'  TYPE NEWLINE;

answer: TRUEFALSEANSWER { /* System.out.println("Parsed TRUEFALSEANSWER: " + $TRUEFALSEANSWER.text); */ }
      | TIMEHOURANSWER { /* System.out.println("Parsed TIMEHOURANSWER: " + $TIMEHOURANSWER.text); */ }
      | DATEANSWER { /* System.out.println("Parsed DATEANSWER: " + $DATEANSWER.text); */ }
      | MULTIPLECHOISEANSWER { /* System.out.println("Parsed MULTIPLECHOISEANSWER: " + $MULTIPLECHOISEANSWER.text); */ }
      | SINGLECHOISEANSWER { /* System.out.println("Parsed SINGLECHOISEANSWER: " + $SINGLECHOISEANSWER.text); */ }
      | NUMERICALSCALEANSWER { /* System.out.println("Parsed NUMERICALSCALEANSWER: " + $NUMERICALSCALEANSWER.text); */ }
      | DECIMALANSWER { /* System.out.println("Parsed DECIMALANSWER: " + $DECIMALANSWER.text); */ }
      | INTEGERANSWER { /* System.out.println("Parsed INTEGERANSWER: " + $INTEGERANSWER.text); */ }
      | STRINGPHRASE { /* System.out.println("Parsed STRINGPHRASE: " + $STRINGPHRASE.text); */ }
      ;

END: 'END';
NEWLINE: '\n'+;
TYPE: '(Short Text)' | '(Decimal Number)' | '(HH:MM)' | '(Single Choice)' | '(True/False)' | '(Integer Number)' | '(Multiple Choice)' | '(Date:dd/mm/yyyy)';
NUMERICALSCALEANSWER : [1-5];
DATEANSWER: ('0'[1-9] | [1-2][0-9] | '3'[0-1]) '/' ('0'[1-9] | '1'[0-2]) '/'[0-9][0-9][0-9][0-9];
DECIMALANSWER : [0-9]+'.'[0-9]+ | [0-9]+','[0-9]+;
TIMEHOURANSWER: ('0' | '1' [0-9] | '2' [0-3]) ':' [0-5] [0-9];
INTEGERANSWER : [0-9]+;
TRUEFALSEANSWER: 'True' |'False'|'true'|'false';
SINGLECHOISEANSWER: STRING;
MULTIPLECHOISEANSWER : STRING (',' STRING)*;
STRINGPHRASE : (STRING | ' ' | ':' | ',' | '(' | ')')+;
STRING: [a-zA-Z0-9]+;
WS : [ \t\r]+ -> skip;