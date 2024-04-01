// Arithmetic.g4

//Students: Aline Mattos & Amanda Bressam

// Grammar for arithmetic expressions

grammar Arithmetic;

// Define the main program rule
prog: (expr NEWLINE)* ;

// Define the expression rule
expr: '(' operation ')' // Expression with an operation
    | '(' number number '+' ')' // Addition operation
    | '(' number number '-' ')' // Subtraction operation
    | '(' number number '*' ')' // Multiplication operation
    | '(' integer nonZeroInt '|' ')' // all the rules for '/', define the rules for division operations between real numbers and prevent division by zero;
    | '(' rational nonZeroFloat '|' ')' // Division operation, 
    | '(' rational nonZeroInt '|' ')' // Division operation
    | '(' integer nonZeroFloat '|' ')' // Division operation
    | '(' integer nonZeroInt '/' ')' // Division operation
    | '(' nonZeroInt nonZeroInt '/' ')' // Division operation
    | '(' integer integer '%' ')'// Modulus operation
    | '(' nonZeroInt nonZeroInt '%' ')' // Modulus operation
    | '(' number integer '^' ')' //exponentiation operation that prevents negative exponent
    | '(' number MEM ')' //a number is "saved" in memory
    | '(' number MEM expr operator')' //a number is "saved" in memory and we have an expression and/or operator immediately following
    | '(' MEM ')' //a number is "retrieved" from memory storage
    | '(' expr MEM ')' //an expression is "saved/stored" in memory
    | '(' MEM expr ')' // an expression is alongside a "search" for the stored value in memory
    | '(' MEM expr operator')' //when an expression and/or operation is alongside a "search" for the stored value in memory
    | '(' integer RES ')' //we retrieve the integer value of the result from a line
    | '(' integer RES expr')' //we retrieve the integer value of the result from a line, followed by an expression or with an expression preceding it
    | '(' expr RES ')' //we retrieve the integer value of the result from a line, followed by an expression or with an expression preceding it
    | '(' expr RES expr')' //we retrieve the integer value of the result from a line and it can be preceded and/or followed by expressions
    | '(' number expr operator ')' //we can have numbers followed by expressions and operators
    | '(' expr* ')' //we can have zero or more expressions
    ;

// Define the operation rule
operation: expr expr operator ;

// Define the operator rule
operator: ('+' | '-' | '*' | '/' | '|' | '^' | '%') ;

// Define the number rule
number: FLOAT | INT | NEGATIVE_INT | NEGATIVE_FLOAT | ZERO ;

// Define the rational number rule
rational: FLOAT | ZERO ;

// Define the non-zero float rule
nonZeroFloat: FLOAT | NEGATIVE_FLOAT ;

// Define the integer rule
integer: INT | ZERO ;

// Define the non-zero integer rule
nonZeroInt: INT | NEGATIVE_INT ;

// Define token rules
INT: [1-9] [0-9]* ;
NEGATIVE_INT: '-' INT ;
ZERO: '0' ;
FLOAT: [0-9]+ '.' [0-9]+ ;
NEGATIVE_FLOAT: '-' FLOAT ;
MEM: 'MEM' ;
RES: 'RES' ;
NEWLINE: [\r\n]+ ;
WS: [ \t]+ -> skip ;
