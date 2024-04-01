# Creating a grammar with antlr

[Portuguese version here](README_pt.md)

<br> The following work was carried out by the students Aline Belomo de Mattos and Amanda Bressam Martins

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

* *'(' operation ')'*: when we have an operation between two numbers;
* *'(' number number '+' ')'*: addition operation;
*'(' number number '-' ')'*: subtraction operation;

