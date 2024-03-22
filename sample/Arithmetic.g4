// Arithmetic.g4

grammar Arithmetic;

prog: (expr NEWLINE)* ;

expr: number
    | '(' expr expr operator ')'
    ;

operator: ('+' | '-' | '*' | '/' | '^' | '|' | '%') ;

number: FLOAT | INT | NEGATIVE ;

INT: [0-9]+ ;
FLOAT: [0-9]+ '.' [0-9]+ ;
NEGATIVE: '-' (FLOAT | INT) ;

NEWLINE: [\r\n]+ ;
WS: [ \t]+ -> skip ;