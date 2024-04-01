# Criando uma gramática com antlr

[English version here](README.md)

<br> O trabalho a seguir foi realizado pelas estudantes Aline Belomo de Mattos and Amanda Bressam Martins.

## Introdução

O trabalho a seguir teve por objetivo estudar a linguagem do Antlr e gerar os analisadores léxico e sintático a fim de analisar a linguagem que utilizamos anteriormente em outro trabalho anterior, intitulado “Calculadora”. Ambos trabalhos foram desenvolvidos para a disciplina de Construção de Interpretadores, do 5o período do curso de Bacharelado em Sistemas de Informação da Pontifícia Universidade Católica do Paraná (PUCPR).

No trabalho anterior, Calculadora, utilizamos algumas regras para criar expressões em formato de notação polonesa reversa (RPN) e, a partir de arquivos de testes, realizar o cálculo das expressões. A calculadora tinha expressões de teste que eram calculadas seguindo o formato a seguir, para operações:

* Adição:+, no formato (A B +);
* Subtração: - no formato (A B -) ;
* Multiplicação: * no formato (A B *);
* Divisão Real: | no formato (A B |);
* Divisão de inteiros: / no formato (A B /);
* Resto da Divisão de Inteiros: % no formato (A B %);
* Potenciação:^ no formato (A B ^);

Aqui, A e B representam números reais, ou inteiros, e não variáveis. Foi utilizado o ponto para indicar a vírgula decimal. As expressões podem ser montadas conforme os exemplos:

* (A (C D *) +)
* ((A B %) (D E *) /)

Ou seja, podem ser aninhadas para a criação de expressões compostas, não existindo limite de aninhamento de expressões. Ademais às expressões definidas anteriormente, também temos três comandos especiais:

* (N RES): devolve o resultado da expressão que está N linhas antes, onde N é um número inteiro não negativo;
* (V MEM): armazena um valor, V, em um espaço de memória chamado de MEM, capaz de armazenar um valor real;
* (MEM): devolve o valor armazenado na memória. Se a memória não tiver sido usada devolve o número real zero

Diferentemente do que foi feito no trabalho anterior, em que deveríamos programar uma calculadora “funcional”, ou seja, que mostrava os resultados das operações, aqui não foi necessário apresentar os resultados referentes às operações dos arquivos de teste, apenas as árvores sintáticas.

## Desenvolvimento

### I. A Gramática

O trabalho foi desenvolvido em antlr4 e compilado com a linguagem Java. A gramática foi definida como:

![image](https://github.com/abressam/antlr-RA1/assets/77062126/841839ae-af1f-4bcc-9912-84bf6b1470f4)

Figura 1. Gramática denominada “Arithmetic”.

A gramática teve seu nome definido como “Arithmetic”. Logo no começo já definimos a regra “prog” que representa um programa válido na linguagem e indica que ali começa a execução. Esta regra permite que haja uma ou mais expressões (expr) seguidas por uma quebra de linha (NEWLINE). O asterisco (*) indica que zero ou mais ocorrências podem ocorrer.

###  II. As regras e expressões

A seguir, definimos a regra “expr”, que representa uma expressão, a partir daí essa regra descreve todas as possíveis formas que uma expressão pode ter na linguagem, incluindo referências de memória, operações, etc, como demonstrado em:

* '(' operation ')': quando temos uma operação entre dois números;
* '(' number number '+' ')': operação de adição;
* '(' number number '-' ')':  operação de subtração;
* '(' number number '*' ')':  operação de multiplicação;
* '(' integer nonZeroInt '|' ')', '(' rational nonZeroFloat '|' ')', '(' rational nonZeroInt '|' ')'' e (' integer nonZeroFloat '|' ')': definem as regras para operações de divisão entre números reais e previnem a divisão por zero;
* '(' integer nonZeroInt '/' ')' e '(' nonZeroInt nonZeroInt '/' ')': definem as regras para operações de divisão de números inteiros e previnem a divisão por zero;
* '(' integer integer '%' ')' e '(' nonZeroInt nonZeroInt '%' ')': definem as regras para operações de resto da divisão de números inteiros e previnem a divisão por zero;
* '(' number integer '^' ')': operação de potenciação que previne expoente negativo;
* '(' number MEM ')': quando um número é “salvo” na memória;
'(' number MEM expr operator')': quando um número é “salvo” na memória e temos uma expressão e/ou operador logo a seguir;
* '(' MEM ')': quando um número é “recuperado” do armazenamento na memória;
* '(' expr MEM ')': quando uma expressão é “salva/armazenada” na memória;
* '(' MEM expr ')': quando uma expressão está ao lado de uma “busca” do valor armazenado na memória;
* '(' MEM expr operator')': quando uma expressão e/ou operação está ao lado de uma “busca” do valor armazenado na memória
* '(' integer RES ')': quando buscamos o valor em número inteiro do resultado de uma linha;
* '(' integer RES expr')' e '(' expr RES ')': quando buscamos o valor em número inteiro do resultado de uma linha, seguido por uma expressão ou com uma expressão anterior a ele;
* '(' expr RES expr')': quando buscamos o valor em número inteiro do resultado de uma linha e ele pode ser antecedido e/ou precedido por expressões;
* '(' number expr operator ')': podemos ter números seguidos de expressões e operadores;
* '(' expr* ')': podemos ter zero ou mais expressões;

Já para as regras relacionadas a operações e números:

1. __operation: expr expr operator__: esta regra indica que uma operação é composta por duas expressões (expr) separadas por um operador (operator).
2. __operator: ('+' | '-' | '*' | '/' | '|' | '^' | '%')__:  especifica os operadores válidos na linguagem (já explicados anteriormente);
3. __number: FLOAT | INT | NEGATIVE_INT | NEGATIVE_FLOAT | ZERO__: define a regra “number”, que representa um número na linguagem. Pode ser um número inteiro (INT), um número de ponto flutuante (FLOAT), ou um número negativo de ponto flutuante ou inteiro (NEGATIVE) ou zero;
4. __rational: FLOAT | ZERO__: define o que é um número “racional”, nesse caso os números de ponto flutuante ou zero;
5. __nonZeroFloat: FLOAT | NEGATIVE_FLOAT__: define os números de ponto flutuante que não são zero.
6. __integer: INT | ZERO__: define os números inteiros e zero.
7. __nonZeroInt: INT | NEGATIVE_INT__: define os números inteiros, positivos e negativos, que não são zero.

E, por último, mas não menos importante, as definições de “tipos” e palavras-chave:

1. __INT: [1-9] [0-9]*__: especifica um número inteiro que começa com um dígito entre 1 e 9 ([1-9]) seguido de zero ou mais dígitos ([0-9]*), corresponde a qualquer número inteiro positivo maior que zero.
2. __NEGATIVE_INT: '-' INT__: define um número inteiro negativo
3. __ZERO: '0'__: define o número inteiro zero.
4. __FLOAT: [0-9]+ '.' [0-9]+__: especifica um número de ponto flutuante, que consiste em um ou mais dígitos ([0-9]+) seguidos por um ponto ('.') e novamente um ou mais dígitos ([0-9]+). Isso corresponde a qualquer número de ponto flutuante positivo.
5. __NEGATIVE: '-' (FLOAT | INT)__: especifica um número negativo como um sinal de menos (-) seguido de um número inteiro ou um número de ponto flutuante.  
6. __MEM: 'MEM'__: especifica a palavra-chave "MEM".
7. __RES: 'RES'__: especifica a palavra-chave "RES".
8. __NEWLINE: [\r\n]+__: especifica uma quebra de linha como uma ou mais ocorrências de retorno (\r) ou nova linha (\n).
9. __WS: [ \t]+ -> skip__: especifica espaços em branco (espaço ou tabulação) como caracteres a serem ignorados durante a análise. O -> skip indica que esses caracteres serão ignorados pelo analisador léxico.
