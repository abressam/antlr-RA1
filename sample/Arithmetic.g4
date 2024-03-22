// Arithmetic.g4

grammar Arithmetic;

prog: (expr NEWLINE)* ;
expr: number
    | '(' expr* ')' operator?
    | number number operator
    ;

operator: ('+' | '-' | '*' | '/' | '^' | '|' | '%') ;
number: NUMBER | NEGATIVE ;

NEWLINE : [\r\n]+ ;
NUMBER  : FLOAT | INT ;
INT     : [0-9]+ ;
FLOAT   : [0-9]+ '.' [0-9]+ ;
NEGATIVE: '-' NUMBER ;
WS      : [ \t]+ -> skip ; // Espaços em branco são ignorados