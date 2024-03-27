// Arithmetic.g4

grammar Arithmetic;

prog: (expr NEWLINE)* ;

expr: '(' operation ')'
    | '(' number number '+' ')'
    | '(' number number '-' ')'
    | '(' number number '*' ')'
    | '(' integer nonZeroInt '|' ')'
    | '(' rational nonZeroFloat '|' ')'
    | '(' rational nonZeroInt '|' ')'
    | '(' integer nonZeroFloat '|' ')'
    | '(' integer nonZeroInt '/' ')'
    | '(' nonZeroInt nonZeroInt '/' ')'
    | '(' integer integer '%' ')'
    | '(' nonZeroInt nonZeroInt '%' ')'
    | '(' number integer '^' ')'
    | '(' number MEM ')'
    | '(' number MEM expr operator')'
    | '(' MEM ')'
    | '(' expr MEM ')'
    | '(' MEM expr ')'
    | '(' MEM expr operator')'
    | '(' integer RES ')'
    | '(' integer RES expr')'
    | '(' expr RES ')'
    | '(' expr RES expr')'
    | '(' number expr operator ')'
    | '(' expr* ')'
    ;

operation: expr expr operator ;
operator: ('+' | '-' | '*' | '/' | '|' | '^' | '%') ;
number: FLOAT | INT | NEGATIVE_INT | NEGATIVE_FLOAT | ZERO ;
rational: FLOAT | ZERO ;
nonZeroFloat: FLOAT | NEGATIVE_FLOAT ;
integer: INT | ZERO ;
nonZeroInt: INT | NEGATIVE_INT ;

INT: [1-9] [0-9]* ;
NEGATIVE_INT: '-' INT ;
ZERO: '0' ;
FLOAT: [0-9]+ '.' [0-9]+ ;
NEGATIVE_FLOAT: '-' FLOAT ;
MEM: 'MEM' ;
RES: 'RES' ;
NEWLINE: [\r\n]+ ;
WS: [ \t]+ -> skip ;
