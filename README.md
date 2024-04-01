# Creating a grammar with antlr

[Portuguese version here](README_pt.md)

<br> The following work was carried out by the students Aline Belomo de Mattos and Amanda Bressam Martins.

## Introduction

The work carried out below aimed to study the Antlr language and generate lexical and syntactic analyzers in order to analyze the language we previously used in another project titled "Calculator".

In the previous project, we used some rules to create expressions in the format of Reverse Polish Notation (RPN) and, from test files, perform calculations of the expressions. The calculator had test expressions that were calculated following the following format for operations:

* Addition: +, in the format (A B +);
* Subtraction: - in the format (A B -);
* Multiplication: * in the format (A B *);
* Real Division: | in the format (A B |);
* Integer Division: / in the format (A B /);
* Integer Division Remainder: % in the format (A B%);
* Exponentiation: ^ in the format (A B ^);

Here, A and B represent real numbers or integers, not variables. A period was used to indicate the decimal comma. Expressions can be assembled as follows:

* (A (C D *) +)
* ((A B %) (D E *) /)

In other words, they can be nested to create composite expressions, with no limit to the nesting of expressions. In addition to the expressions defined earlier, we also have three special commands:

* (N RES): returns the result of the expression N lines before, where N is a non-negative integer;
* (V MEM): stores a value, V, in a memory space called MEM, capable of storing a real value;
* (MEM): returns the value stored in memory. If the memory has not been used, it returns the real number zero.

Unlike the previous work, where we were supposed to program a "functional" calculator, i.e., one that displayed the results of the operations, here it was not necessary to present the results related to the operations of the test files, only the syntactic trees.

## Development

### I. The Grammar

The work was developed in antlr4 and compiled using the Java language. The grammar was defined as follows:

![image](https://github.com/abressam/antlr-RA1/assets/77062126/841839ae-af1f-4bcc-9912-84bf6b1470f4)

Figure 1. Grammar named "Arithmetic".

The grammar was named "Arithmetic". Right at the beginning, we defined the rule "prog," which represents a valid program in the language and indicates the start of execution. This rule allows for one or more expressions (expr) followed by a newline (NEWLINE). The asterisk (*) indicates that zero or more occurrences can occur.

### II. Rules and Expressions

Below, we define the rule "expr," which represents an expression. From there, this rule describes all possible forms that an expression can take in the language, including memory references, operations, etc., as demonstrated in:

* **'(' operation ')'**: when we have an operation between two numbers;
* **'(' number number '+' ')'**: addition operation;
* **'(' number number '-' ')'**: subtraction operation;
* **'(' number number '*' ')'**: multiplication operation;
* **'(' integer nonZeroInt '|' ')'**, **'(' rational nonZeroFloat '|' ')'**, **'(' rational nonZeroInt '|' ')''**, and **'(' integer nonZeroFloat '|' ')'**: define rules for division operations between real numbers and prevent division by zero;
* **'(' integer nonZeroInt '/' ')'** and **'(' nonZeroInt nonZeroInt '/' ')'**: define rules for integer division operations and prevent division by zero;
* **'(' integer integer '%' ')'** and **'(' nonZeroInt nonZeroInt '%' ')'**: define rules for remainder operations of integer division and prevent division by zero;
* **'(' number integer '^' ')'**: exponentiation operation that prevents negative exponent;
* **'(' number MEM ')'**: when a number is "saved" in memory;
* **'(' number MEM expr operator')'**: when a number is "saved" in memory and we have an expression and/or operator immediately following;
* **'(' MEM ')'**: when a number is "retrieved" from memory storage;
* **'(' expr MEM ')'**: when an expression is "saved/stored" in memory;
* **'(' MEM expr ')'**: when an expression is alongside a "search" for the stored value in memory;
* **'(' MEM expr operator')'**: when an expression and/or operation is alongside a "search" for the stored value in memory
* **'(' integer RES ')'**: when we retrieve the integer value of the result from a line;
* **'(' integer RES expr')'** and **'(' expr RES ')'**: when we retrieve the integer value of the result from a line, followed by an expression or with an expression preceding it;
* **'(' expr RES expr')'**: when we retrieve the integer value of the result from a line and it can be preceded and/or followed by expressions;
* **'(' number expr operator ')'**: we can have numbers followed by expressions and operators;
* '**(' expr* ')'**: we can have zero or more expressions;

For rules related to operations and numbers:

1. **operation: expr expr operator**: this rule indicates that an operation consists of two expressions (expr) separated by an operator (operator).
2. **operator: ('+' | '-' | '*' | '/' | '|' | '^' | '%')**: specifies the valid operators in the language (already explained above);
3. **number: FLOAT | INT | NEGATIVE_INT | NEGATIVE_FLOAT | ZERO**: defines the "number" rule, which represents a number in the language. It can be an integer number (INT), a floating-point number (FLOAT), or a negative floating-point or integer number (NEGATIVE) or zero;
4. **rational: FLOAT | ZERO**: defines what a "rational" number is, in this case, floating-point numbers or zero;
5. **nonZeroFloat: FLOAT | NEGATIVE_FLOAT**: defines floating-point numbers that are not zero.
6. **integer: INT | ZERO**: defines integer numbers and zero.
7. **nonZeroInt: INT | NEGATIVE_INT**: defines integer numbers, positive and negative, that are not zero.

And last but not least, the definitions of "types" and keywords:

1. INT: [1-9] [0-9]*: specifies an integer number that starts with a digit between 1 and 9 ([1-9]) followed by zero or more digits ([0-9]*), matches any positive integer greater than zero.
2. NEGATIVE_INT: '-' INT: defines a negative integer number
3. ZERO: '0': defines the integer number zero.
4. FLOAT: [0-9]+ '.' [0-9]+: specifies a floating-point number, consisting of one or more digits ([0-9]+) followed by a period ('.') and again one or more digits ([0-9]+). This matches any positive floating-point number.
5. NEGATIVE: '-' (FLOAT | INT): specifies a negative number as a minus sign (-) followed by an integer number or a floating-point number.  
6. MEM: 'MEM': specifies the keyword "MEM".
7. RES: 'RES': specifies the keyword "RES".
8. NEWLINE: [\r\n]+: specifies a newline as one or more occurrences of carriage return (\r) or newline (\n).
9. WS: [ \t]+ -> skip: specifies whitespace (space or tab) as characters to be ignored during analysis. The -> skip indicates that these characters will be ignored by the lexer.