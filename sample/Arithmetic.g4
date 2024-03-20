// Arithmetic.g4

grammar Arithmetic;

prog: (expr NEWLINE)* ;
expr: NUMBER
    | NEGATIVE
    | '(' expr* ')'
    | expr expr ('*'|'/')
    | expr expr ('+'|'-')
    | expr expr ('|'|'^')
    ;

NEWLINE : [\r\n]+ ;
NUMBER  : FLOAT | INT ;
INT     : [0-9]+ ;
FLOAT   : [0-9]+ '.' [0-9]+ ;
NEGATIVE: '-' NUMBER ;
WS      : [ \t]+ -> skip ; // Espaços em branco são ignorados
