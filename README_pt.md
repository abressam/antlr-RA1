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

📷 *Figura 1. Gramática denominada “Arithmetic”*.

A gramática teve seu nome definido como “Arithmetic”. Logo no começo já definimos a regra “prog” que representa um programa válido na linguagem e indica que ali começa a execução. Esta regra permite que haja uma ou mais expressões (expr) seguidas por uma quebra de linha (NEWLINE). O asterisco (*) indica que zero ou mais ocorrências podem ocorrer.

###  II. As regras e expressões

A seguir, definimos a regra “expr”, que representa uma expressão, a partir daí essa regra descreve todas as possíveis formas que uma expressão pode ter na linguagem, incluindo referências de memória, operações, etc, como demonstrado em:

* **'(' operation ')'**: quando temos uma operação entre dois números;
* **'(' number number '+' ')'**: operação de adição;
* **'(' number number '-' ')'**:  operação de subtração;
* **'(' number number '*' ')'**:  operação de multiplicação;
* **'(' integer nonZeroInt '|' ')'**, **'(' rational nonZeroFloat '|' ')'**, **'(' rational nonZeroInt '|' ')''** e **(' integer nonZeroFloat '|' ')'**: definem as regras para operações de divisão entre números reais e previnem a divisão por zero;
* **'(' integer nonZeroInt '/' ')'** e **'(' nonZeroInt nonZeroInt '/' ')'**: definem as regras para operações de divisão de números inteiros e previnem a divisão por zero;
* **'(' integer integer '%' ')'** e **'(' nonZeroInt nonZeroInt '%' ')'**: definem as regras para operações de resto da divisão de números inteiros e previnem a divisão por zero;
* **'(' number integer '^' ')'**: operação de potenciação que previne expoente negativo;
* **'(' number MEM ')'**: quando um número é “salvo” na memória;
* **'(' number MEM expr operator')'**: quando um número é “salvo” na memória e temos uma expressão e/ou operador logo a seguir;
* **'(' MEM ')'**: quando um número é “recuperado” do armazenamento na memória;
* **'(' expr MEM ')'**: quando uma expressão é “salva/armazenada” na memória;
* **'(' MEM expr ')'**: quando uma expressão está ao lado de uma “busca” do valor armazenado na memória;
* **'(' MEM expr operator')'**: quando uma expressão e/ou operação está ao lado de uma “busca” do valor armazenado na memória
* **'(' integer RES ')'**: quando buscamos o valor em número inteiro do resultado de uma linha;
* **'(' integer RES expr')'** e **'(' expr RES ')'**: quando buscamos o valor em número inteiro do resultado de uma linha, seguido por uma expressão ou com uma expressão anterior a ele;
* **'(' expr RES expr')'**: quando buscamos o valor em número inteiro do resultado de uma linha e ele pode ser antecedido e/ou precedido por expressões;
* **'(' number expr operator ')'**: podemos ter números seguidos de expressões e operadores;
* **'(' expr* ')'**: podemos ter zero ou mais expressões;

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

## Discussão e Resultados

A partir da definição da gramática "Arithmetic", foram elaborados três arquivos de teste contendo uma variedade de expressões para avaliação e subsequente construção de suas árvores sintáticas correspondentes.

Para executar o programa e fazer com que a árvore sintática apareça numa interface, a execução de alguns comandos é necessária. Abaixo se encontra uma imagem da disposição dos diretórios do repositório no GitHub desse trabalho, contendo as pastas “_lib_”, “_bin_” e “_sample_”. 

![image](https://github.com/abressam/antlr-RA1/assets/77062126/8b4cf304-34d7-40a7-a470-ad7a67bf4914)

📷 *Figura 2. Disposição dos diretórios do repositório no GitHub*

É necessário estar dentro da pasta “sample” para executar os comandos.

![image](https://github.com/abressam/antlr-RA1/assets/77062126/2d03ef2e-cd77-4e41-8c63-722d600b3b9d)

📷 *Figura 3. Exemplo de path até a pasta onde está o antlr e o arquivo da gramática (sample)*.

Dentro da pasta "_sample_" encontra-se tanto o arquivo da nossa gramática (Arithmetic.g4) quanto outros arquivos que são gerados ao usar o compilador do Java.

![image](https://github.com/abressam/antlr-RA1/assets/77062126/8cce7a79-2022-4bc4-84f9-439d8d9757ac)

📷 *Figura 4. Conteúdo do diretório “sample”*.

A partir disso, é necessário utilizar os comandos (utilize também sempre que for feita uma atualização no arquivo Arithmetic.g4):

```
antlr4 Arithmetic.g4
```

```
compile Arithmetic*.java
```

Por fim, informe no terminal o comando abaixo, seguido do nome do arquivo de teste (ex: data.txt) para mostrar o gráfico criado:

```
grun Arithmetic prog -gui data.txt
```

###  I. Arquivo 1: data.txt

O conteúdo do arquivo foi escrito como especificado abaixo, a fim de testar diferentes composições e operações com os mesmos números, ou números próximos (de ponto flutuante):

![image](https://github.com/abressam/antlr-RA1/assets/77062126/6908cf8c-6d1c-42ac-b252-3010f5d967e3)

📷 *Figura 5. conteúdo do primeiro arquivo de testes.*

Ao executar os comandos, geramos a árvore sintática deste arquivo de testes. Mas antes, recebemos avisos (warnings) que aconteceram ao gerar a árvore. No caso abaixo, estamos fazendo operações que não atendem às regras especificadas na gramática, isso não chega a “quebrar” o programa, mas não é aceito.

![image](https://github.com/abressam/antlr-RA1/assets/77062126/1cd95cb7-3aeb-4d74-b05a-b9a03fcea2bd)

📷 *Figura 6. Avisos do primeiro arquivo de teste.*

Os avisos que encontramos são devido a tentativas de operações que são tratadas como incorretas, por exemplo:

* (3.1 2 /): como temos um número de ponto flutuante (3.1) fazendo uma divisão de números inteiros, não podemos aceitar, pois não corresponde a nenhuma regra;
* (3 2.4 ^) e (3 -2 ^): o mesmo se aplica para potenciação, que no caso da nossa gramática só considera correta a potenciação de números inteiros positivos, sendo 3.2 e -2 números não aceitos.

Abaixo podemos a árvore sintática gerada:

![data](https://github.com/abressam/antlr-RA1/assets/77062126/18bbf36a-a05d-438a-98eb-e1440d86706c)

📷 *Figura 7. Árvore sintática do arquivo data.txt.*

Levando em consideração que a árvore ficou muito comprida e difícil de ler, separamos em duas partes para melhor entendimento:

![image](https://github.com/abressam/antlr-RA1/assets/77062126/fe427e2e-d19f-4511-a9a0-dd8c85e8b1ec)

📷 *Figura 8. Árvore sintática do arquivo data.txt sem avisos.*

Abaixo temos outra parte da árvore sintática do primeiro arquivo de teste, porém, podemos ver que os avisos explicados anteriormente aparecem na árvore destacados em rosa.

![image](https://github.com/abressam/antlr-RA1/assets/77062126/33d45cef-a2e8-45d1-9af3-d51a9fe0f245)

📷 *Figura 9. Árvore sintática com avisos.*

###  II. Arquivo 2: data2.txt

O conteúdo do arquivo foi escrito como especificado abaixo, a fim de testar diferentes composições e a concatenação de expressões, além de expressões proibidas.

![image](https://github.com/abressam/antlr-RA1/assets/77062126/0f2b3751-07ef-4ebd-8751-f06dca17777b)

📷 *Figura 10. Conteúdo do segundo arquivo de testes.*

A árvore sintática gerada:

![data2](https://github.com/abressam/antlr-RA1/assets/77062126/d50bcdc5-3ea6-49e9-a1a2-3135c13b95c3)

📷 *Figura 11. Árvore sintática do arquivo data2.txt.*

E parte da árvore sintática gerada, sem nenhum aviso ou erro:

![image](https://github.com/abressam/antlr-RA1/assets/77062126/f591d39a-5ea5-47ee-9fd0-25dc2f58a9dd)

📷 *Figura 12. Árvore sintática do arquivo data2.txt sem avisos.*

Perceba que a primeira expressão do arquivo é “(2. 1 +)”, porém o 2 com o ponto logo após, que indicaria um número flutuante não finalizado, é tratado pela gramática e impresso na árvore como um número inteiro.

![image](https://github.com/abressam/antlr-RA1/assets/77062126/618ae05b-cf4d-4ed1-9bd1-3116983128b3)

📷 *Figura 12. Tratamento do erro de entrada.*

Ao testar a concatenação de uma expressão maior, podemos ver que obtemos sucesso e ela é impressa corretamente na árvore:

![image](https://github.com/abressam/antlr-RA1/assets/77062126/40f49701-c27f-4c92-8b08-4c2b179dedbf)

📷 *Figura 13. Expressão ((((2 3 +)(4 1 -) /)(1 MEM) *)(2 7 |) +) funcionando corretamente.*

Abaixo podemos ver outra parte da árvore sintática gerada, com um aviso, pois deixamos no arquivo de teste algumas expressões incorretas:

![image](https://github.com/abressam/antlr-RA1/assets/77062126/a74ecb90-6315-4b4a-aa41-bc8cbd51c847)

📷 *Figura 14. Aviso no terminal do segundo arquivo de teste.*

1. (2 0 /): não é possível fazer a divisão por zero e, por ser uma entrada incorreta, gera um aviso;
2. (2 (2 2 -) /): perceba que a expressão destacada em laranja “(2 (2 2 -) /)” resultaria em zero, porém, como estamos lidando com uma gramática, não acusa erro.
3. (% (1 2 -) ^): essa expressão está incorreta, pois conta com dois operadores a mais e que não correspondem a nenhuma operação (% e ^ não têm números resultantes o suficiente para serem “calculados”).

![image](https://github.com/abressam/antlr-RA1/assets/77062126/c8b0844e-9c56-44f5-8d9a-a4329a20cfc8)

📷 *Figura 15. Árvore sintática com avisos do arquivo data2.txt.*

## O modo pânico

A árvore sintática termina de ser impressa aí, pois a próxima expressão do arquivo de teste é “_/(4 (7 2 -) ^)_” e esse padrão não é reconhecido pela gramática (é obrigatório que expressões, operadores e etc estejam envoltos por parênteses) por estar incorreta. Isso acarreta em erro.

Este erro faz com que entre o "modo de pânico", que nada mais é que uma técnica usada em analisadores sintáticos para lidar com erros de sintaxe em um código fonte. Quando o analisador encontra um erro de sintaxe, em vez de simplesmente parar a análise, ele tenta recuperar o máximo possível para continuar a análise e identificar mais erros e lidar com a situação de erro da melhor maneira possível, mesmo que o código fonte possa estar em um estado incoerente, quando não consegue, para a execução.

---

### III. Arquivo 3: data3.txt

O conteúdo do arquivo foi escrito como especificado abaixo, a fim de testar diferentes composições, operações, concatenações e avisos:

![image](https://github.com/abressam/antlr-RA1/assets/77062126/c9a23345-b666-4951-b871-441eca031b82)

📷 *Figura 16. Conteúdo do terceiro arquivo de testes.*

A árvore sintática gerada:

![data3](https://github.com/abressam/antlr-RA1/assets/77062126/5c99e547-f2a3-4cd7-a4fc-04a547042e0a)

📷 *Figura 17. Árvore sintática do terceiro arquivo de testes.*

Abaixo podemos ver outra parte da árvore sintática gerada, com um aviso, pois deixamos no arquivo de teste algumas expressões incorretas:

![image](https://github.com/abressam/antlr-RA1/assets/77062126/e0548578-8c61-4be6-94b6-256da56d2f0d)

📷 *Figura 18. Aviso da expressão incorreta.*

![image](https://github.com/abressam/antlr-RA1/assets/77062126/4abb5d10-19aa-4e96-9177-0bf6687a04d1)

📷 *Figura 19. Impressão na árvore da expressão incorreta.*

Perceba aqui que, mesmo que tivéssemos 6 linhas quando “chamamos” a expressão “_(6 RES)_”, não faria diferença o número que colocássemos, pois por enquanto, a gramática apenas avalia se essa expressão é aceita e não possui lógica ainda.

![image](https://github.com/abressam/antlr-RA1/assets/77062126/407c135f-a377-4531-baf0-4fc10b6e850c)

📷 *Figura 20. Impressão da expressão “(6 RES)” na árvore sintática.*

Aqui, temos a última expressão na árvore como sendo “(4.3 MEM (3 1 |) +)”, por mais que tenhamos outras expressões.

![image](https://github.com/abressam/antlr-RA1/assets/77062126/86f887a4-32d7-403d-b25f-9befbd66e025)

📷 *Figura 21. Impressão da expressão “(4.3 MEM (3 1 |) +)” na árvore sintática.*

Devido ao modo pânico, ao encontrar a próxima expressão sendo “_/(1 2 +)_” a árvore simplesmente para de ser executada, mesmo que a última expressão do arquivo de teste “_(3 (4 5 -) ^)_” seja uma expressão correta.

![image](https://github.com/abressam/antlr-RA1/assets/77062126/ef5d825b-60fa-48e4-a65d-ba3e6e881a57)

📷 *Figura 22. Uma sequência de expressões incorretas que causam o modo pânico e finalizam a execução. Não sendo possível avaliar o que vem a seguir, inclusive a última linha, que é uma expressão correta.*

# Conclusão

Neste trabalho, exploramos o uso do ANTLR para criar analisadores léxicos e sintáticos para a linguagem da calculadora desenvolvida anteriormente. Ao analisar e compreender as regras da linguagem, pudemos construir gramáticas adequadas para identificar corretamente as expressões e comandos definidos. Através do ANTLR, conseguimos gerar árvores sintáticas que representam a estrutura das expressões e comandos, facilitando a compreensão e verificação da correção sintática do código. Este trabalho demonstrou a utilidade e eficácia do ANTLR na criação de analisadores para linguagens específicas, bem como a importância da correta definição das regras gramaticais para garantir a precisão na análise.



