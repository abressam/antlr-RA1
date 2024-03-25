// Arithmetic.g4

grammar Arithmetic;

prog: (expr NEWLINE)* ;

expr: '(' operation ')'
    | '(' number number '+' ')'
    | '(' number number '-' ')'
    | '(' number number '*' ')'
    | '(' number number '|' ')'
    | '(' INT INT '/' ')'
    | '(' INT INT '%' ')'
    | '(' number INT '^' ')'
    | '(' number MEM ')'
    | '(' number MEM expr operator')'
    | '(' MEM ')'
    | '(' expr MEM ')'
    | '(' MEM expr ')'
    | '(' MEM expr operator')'
    | '(' INT RES ')'
    | '(' INT RES expr')'
    | '(' number expr operator ')'
    | '(' expr* ')'
    ;

operation: expr expr operator ;
operator: ('+' | '-' | '*' | '/' | '|' | '^' | '%') ;
number: FLOAT | INT | NEGATIVE ;

INT: [0-9]+ ;
FLOAT: [0-9]+ '.' [0-9]* ;
NEGATIVE: '-' (FLOAT | INT) ;
MEM: 'MEM' ;
RES: 'RES' ;
NEWLINE: [\r\n]+ ;
WS: [ \t]+ -> skip ;
