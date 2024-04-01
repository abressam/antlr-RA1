# Creating a grammar with antlr

[Portuguese version here](README_pt.md)

<br> The following work was carried out by the students Aline Belomo de Mattos and Amanda Bressam Martins

## Introduction

The work carried out below aimed to study the Antlr language and generate lexical and syntactic analyzers in order to analyze the language we previously used in another project titled "Calculator".

In the previous project, we used some rules to create expressions in the format of Reverse Polish Notation (RPN) and, from test files, perform calculations of the expressions. The calculator had test expressions that were calculated following the following format for operations:

A. Addition: +, in the format (A B +);
B. Subtraction: - in the format (A B -);
C. Multiplication: * in the format (A B *);
D. Real Division: | in the format (A B |);
E. Integer Division: / in the format (A B /);
F. Integer Division Remainder: % in the format (A B%);
G. Exponentiation: ^ in the format (A B ^);

Here, A and B represent real numbers or integers, not variables. A period was used to indicate the decimal comma. Expressions can be assembled as follows:

A. (A (C D *) +)
B. ((A B %) (D E *) /)

In other words, they can be nested to create composite expressions, with no limit to the nesting of expressions. In addition to the expressions defined earlier, we also have three special commands:

1. (N RES): returns the result of the expression N lines before, where N is a non-negative integer;
2. (V MEM): stores a value, V, in a memory space called MEM, capable of storing a real value;
3. (MEM): returns the value stored in memory. If the memory has not been used, it returns the real number zero.

Unlike the previous work, where we were supposed to program a "functional" calculator, i.e., one that displayed the results of the operations, here it was not necessary to present the results related to the operations of the test files, only the syntactic trees.