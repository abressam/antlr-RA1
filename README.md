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

📷 *Image 1. Grammar named "Arithmetic"*.

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

1. __INT: [1-9] [0-9]*__ : specifies an integer number that starts with a digit between 1 and 9 ([1-9]) followed by zero or more digits ([0-9]*), matches any positive integer greater than zero.
2. __NEGATIVE_INT: '-' INT__: defines a negative integer number
3. __ZERO: '0'__: defines the integer number zero.
4. __FLOAT: [0-9]+ '.' [0-9]+__: specifies a floating-point number, consisting of one or more digits ([0-9]+) followed by a period ('.') and again one or more digits ([0-9]+). This matches any positive floating-point number.
5. __NEGATIVE: '-' (FLOAT | INT)__: specifies a negative number as a minus sign (-) followed by an integer number or a floating-point number.  
6. __MEM: 'MEM'__: specifies the keyword "MEM".
7. __RES: 'RES'__: specifies the keyword "RES".
8. __NEWLINE: [\r\n]+__: specifies a newline as one or more occurrences of carriage return (\r) or newline (\n).
9. __WS: [ \t]+ -> skip__: specifies whitespace (space or tab) as characters to be ignored during analysis. The -> skip indicates that these characters will be ignored by the lexer.

## Discussion and Results

From the definition of the "Arithmetic" grammar, three test files were created containing a variety of expressions for evaluation and subsequent construction of their corresponding syntax trees.

To execute the program and display the syntax tree in an interface, the execution of some commands is necessary. Below is an image showing the arrangement of directories in the GitHub repository of this work, containing the folders "_lib_", "_bin_" and "_sample_".

![image](https://github.com/abressam/antlr-RA1/assets/77062126/8b4cf304-34d7-40a7-a470-ad7a67bf4914)

📷 *Image 2. Directory layout of the GitHub repository*

To execute the commands, it's necessary to be within the "_sample_" directory.

![image](https://github.com/abressam/antlr-RA1/assets/77062126/2d03ef2e-cd77-4e41-8c63-722d600b3b9d)

📷 *Image 3. Example of path to the folder containing the antlr and grammar file (sample)*.

Inside the "_sample_" folder, you will find both the file of our grammar (Arithmetic.g4) and other files that are generated when using the Java compiler.

![image](https://github.com/abressam/antlr-RA1/assets/77062126/8cce7a79-2022-4bc4-84f9-439d8d9757ac)

📷 *Image 4. Contents of the "sample" directory*.

From there, it is necessary to use the commands (also use whenever an update is made to the Arithmetic.g4 file):

```
antlr4 Arithmetic.g4
```

```
compile Arithmetic*.java
```

Finally, enter the following command in the terminal, followed by the name of the test file (e.g., data.txt) to display the created graph:

```
grun Arithmetic prog -gui data.txt
```

This process will enable the visualization of the syntax tree for the provided test file.


### I. File 1: data.txt

The content of the file was written as specified below, in order to test different compositions and operations with the same numbers, or close numbers (floating point):

![image](https://github.com/abressam/antlr-RA1/assets/77062126/6908cf8c-6d1c-42ac-b252-3010f5d967e3)

📷 *Image 5. content of the first test file.*

When running the commands, we generated the syntactic tree of this test file. However, before that, we received warnings that occurred while generating the tree. In the case below, we are performing operations that do not meet the rules specified in the grammar, this doesn't "break" the program, but it's not accepted.

![image](https://github.com/abressam/antlr-RA1/assets/77062126/1cd95cb7-3aeb-4d74-b05a-b9a03fcea2bd)

📷 *Image 6. Warnings from the first test file.*

The warnings we encountered are due to attempts to perform operations that are treated as incorrect, for example:

* (3.1 2 /): since we have a floating point number (3.1) performing a division of integers, we cannot accept it, as it does not match any rule;
* (3 2.4 ^) and (3 -2 ^): the same applies to exponentiation, which in our grammar only considers exponentiation of positive integers as correct, with 3.2 and -2 being not accepted numbers.

Below we can see the syntactic tree generated:

![data](https://github.com/abressam/antlr-RA1/assets/77062126/18bbf36a-a05d-438a-98eb-e1440d86706c)

📷 *Image 7. Syntactic tree of the data.txt file.*

Taking into account that the tree became too long and difficult to read, we separated it into two parts for better understanding:

![image](https://github.com/abressam/antlr-RA1/assets/77062126/fe427e2e-d19f-4511-a9a0-dd8c85e8b1ec)

📷 *Image 8. Syntactic tree of the data.txt file without warnings.*

Below we have another part of the syntactic tree of the first test file, however, we can see that the warnings explained earlier appear in the tree highlighted in pink.

![image](https://github.com/abressam/antlr-RA1/assets/77062126/33d45cef-a2e8-45d1-9af3-d51a9fe0f245)

📷 *Image 9. Syntactic tree with warnings.*

### II. File 2: data2.txt

The content of the file was written as specified below, in order to test different compositions and concatenation of expressions, as well as prohibited expressions.

![image](https://github.com/abressam/antlr-RA1/assets/77062126/0f2b3751-07ef-4ebd-8751-f06dca17777b)

📷 *Image 10. Content of the second test file.*

The syntactic tree generated:

![data2](https://github.com/abressam/antlr-RA1/assets/77062126/d50bcdc5-3ea6-49e9-a1a2-3135c13b95c3)

📷 *Image 11. Syntactic tree of the data2.txt file.*

And part of the generated syntactic tree, without any warnings or errors:

![image](https://github.com/abressam/antlr-RA1/assets/77062126/f591d39a-5ea5-47ee-9fd0-25dc2f58a9dd)

📷 *Image 12. Syntactic tree of the data2.txt file without warnings.*

Note that the first expression of the file is "(2. 1 +)", but the 2 with the dot immediately after, which would indicate an unfinished floating-point number, is treated by the grammar and printed in the tree as an integer.

![image](https://github.com/abressam/antlr-RA1/assets/77062126/618ae05b-cf4d-4ed1-9bd1-3116983128b3)

📷 *Image 12. Handling of input error.*

When testing the concatenation of a larger expression, we can see that we succeed and it is correctly printed in the tree:

![image](https://github.com/abressam/antlr-RA1/assets/77062126/40f49701-c27f-4c92-8b08-4c2b179dedbf)

📷 *Image 13. Expression ((((2 3 +)(4 1 -) /)(1 MEM) *)(2 7 |) +) working correctly.*

Below we can see another part of the generated syntactic tree, with a warning, as we left some incorrect expressions in the test file:

![image](https://github.com/abressam/antlr-RA1/assets/77062126/a74ecb90-6315-4b4a-aa41-bc8cbd51c847)

📷 *Image 14. Warning in the terminal of the second test file.*

1. (2 0 /): it is not possible to divide by zero and, being an incorrect input, generates a warning;
2. (2 (2 2 -) /): note that the expression highlighted in orange "(2 (2 2 -) /)" would result in zero, however, as we are dealing with a grammar, it does not show an error.
3. (% (1 2 -) ^): this expression is incorrect, as it has two extra operators that do not correspond to any operation (% and ^ do not have enough resulting numbers to be "calculated").

![image](https://github.com/abressam/antlr-RA1/assets/77062126/c8b0844e-9c56-44f5-8d9a-a4329a20cfc8)

📷 *Image 15. Syntactic tree with warnings of the data2.txt file.*

## Panic mode

The syntactic tree stops being printed here, as the next expression in the test file is "_/(4 (7 2 -) ^)_", and this pattern is not recognized by the grammar (it is mandatory that expressions, operators, etc., be enclosed in parentheses) because it is incorrect. This results in an error.

This error triggers the "panic mode", which is nothing more than a technique used in syntactic analyzers to deal with syntax errors in source code. When the analyzer encounters a syntax error, instead of simply stopping the analysis, it tries to recover as much as possible to continue the analysis and identify more errors and deal with the error situation in the best possible way, even if the source code may be in an inconsistent state, when it fails to do so, it halts execution.

---

### III. File 3: data3.txt

The content of the file was written as specified below,

 in order to test different compositions, operations, concatenations, and warnings:

![image](https://github.com/abressam/antlr-RA1/assets/77062126/c9a23345-b666-4951-b871-441eca031b82)

📷 *Image 16. Content of the third test file.*

The syntactic tree generated:

![data3](https://github.com/abressam/antlr-RA1/assets/77062126/5c99e547-f2a3-4cd7-a4fc-04a547042e0a)

📷 *Image 17. Syntactic tree of the third test file.*

Below we can see another part of the generated syntactic tree, with a warning, as we left some incorrect expressions in the test file:

![image](https://github.com/abressam/antlr-RA1/assets/77062126/e0548578-8c61-4be6-94b6-256da56d2f0d)

📷 *Image 18. Warning of the incorrect expression.*

![image](https://github.com/abressam/antlr-RA1/assets/77062126/4abb5d10-19aa-4e96-9177-0bf6687a04d1)

📷 *Image 19. Print in the tree of the incorrect expression.*

Notice here that, even if we had 6 lines when we "call" the expression "_ (6 RES)_", it wouldn't make a difference what number we put, as for now, the grammar only evaluates if this expression is accepted and does not have logic yet.

![image](https://github.com/abressam/antlr-RA1/assets/77062126/407c135f-a377-4531-baf0-4fc10b6e850c)

📷 *Image 20. Print of the expression "(6 RES)" in the syntactic tree.*

Here, we have the last expression in the tree as "(4.3 MEM (3 1 |) +)", even though we have other expressions.

![image](https://github.com/abressam/antlr-RA1/assets/77062126/86f887a4-32d7-403d-b25f-9befbd66e025)

📷 *Image 21. Print of the expression "(4.3 MEM (3 1 |) +)" in the syntactic tree.*

Due to the panic mode, upon encountering the next expression as "_/(1 2 +)_", the tree simply stops being executed, even though the last expression of the test file "_ (3 (4 5 -) ^)_ is a correct expression.

![image](https://github.com/abressam/antlr-RA1/assets/77062126/ef5d825b-60fa-48e4-a65d-ba3e6e881a57)

📷 *Image 22. A sequence of incorrect expressions that trigger the panic mode and terminate execution. It is not possible to evaluate what comes next, including the last line, which is a correct expression.* 

# Conclusion

In this work, we explored the use of ANTLR to create lexical and syntactic analyzers for the calculator language developed earlier. By analyzing and understanding the rules of the language, we were able to build suitable grammars to correctly identify the defined expressions and commands. Through ANTLR, we were able to generate syntactic trees that represent the structure of expressions and commands, facilitating understanding and verification of the syntactic correctness of the code. This work demonstrated the usefulness and effectiveness of ANTLR in creating analyzers for specific languages, as well as the importance of correctly defining the grammatical rules to ensure accuracy in the analysis.
