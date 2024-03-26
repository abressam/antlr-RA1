// Arithmetic.g4

grammar Arithmetic;

prog: (expr NEWLINE)* ;

expr: '(' operation ')'
    | '(' number number '+' ')'
    | '(' number number '-' ')'
    | '(' number number '*' ')'
    | '(' number number '|' ')'
    | '(' integer nonzero '/' ')'
    | '(' nonzero nonzero '/' ')'
    | '(' integer integer '%' ')'
    | '(' nonzero nonzero '%' ')'
    | '(' number integer '^' ')'
    | '(' number MEM ')'
    | '(' number MEM expr operator')'
    | '(' MEM ')'
    | '(' expr MEM ')'
    | '(' MEM expr ')'
    | '(' MEM expr operator')'
    | '(' integer RES ')'
    | '(' integer RES expr')'
    | '(' number expr operator ')'
    | '(' expr* ')'
    ;

operation: expr expr operator ;
operator: ('+' | '-' | '*' | '/' | '|' | '^' | '%') ;
number: FLOAT | INT | ZERO ;
integer: INT | ZERO ;
nonzero: INT ;

INT: [1-9] [0-9]* | '-' INT;
ZERO: '0' ;
FLOAT: [0-9]+ '.' [0-9]* | '-' FLOAT;
MEM: 'MEM' ;
RES: 'RES' ;
NEWLINE: [\r\n]+ ;
WS: [ \t]+ -> skip ;
