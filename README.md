## *Maratona Java*

### Overview

Esse projeto tem como objetivo principal documentar meu aprendizado em Java, estou seguindo o roadmap do Dev Magro com o objetivo de obter uma vaga como desenvolvedor.

### Dev Dojo

Estou seguindo a playlist do Dev Dojo que é gratuita

### Introdução - Aula 2 a Aula 8

Foi explicado que o Java é um app que precisa ser compilado para ser executado, ou seja construimos o algoritmo, o compilamos e o executamos com JVM(Java Virtual Machine) que instalamos na nossa máquina através da instalação do próprio Java, que também vem com JDK(Java Development Kit), o JVM interpreta a compilação e executa o que foi programado. Temos diferentes tipos de versão do Java que tem funcionalidades que foram adicionadas em versões específica, considerando as versões de suporte a longo prazo que é o que as empresas usam, devemos conhecer quais funcionalidades foram adicionadas naquelas versões específicas dependendo com qual versão trabalharemos, é necessário realizar a configuração do Java no nosso ambiente de trabalho definindo um path para conseguirmos acessar o Java de todo o nosso sistema. Para executarmos um programa Java manualmente, construimos o algoritmo, o compilamos com o comando `javac <nome_programa.java>` e o executamos com o comando `java (<nome_programa>)`. Chamamos as pastas de pacotes(packages) e por padrão defimos o nome da pasta com o nome do projeto/site invertendo o nome da esquerda para direita, EX: Hack-Ban.com escrevemos assim com.hackban que fica com/Hack-Ban.

### Tipos primitivos - Aula 9 a  Aula 14

Antes de começarmos temos a aula de comentários que nos ensina como devemos comentar em um código, mesmo não sendo aconselhável pois se o seu código está bem escrito não é necessário fazer comentários sendo de fácil compreensão para todos. Aprendemos os tipos de variáveis primitivas que no caso são: int, double, float, char, byte, short, long e boolean, e convenções de código como nome de variáveis em camelCase, não utilizar palavras reservadas, que tipos primitivos armazenam valores simples na mémoria sendo possivel recuperar aquele dado, adicionar ou modifica-lo. É nos aprensentado o tamanho máximo dos tipos primitivos por uma tabela que especifica o tipo de dado, tamanho, alcance e como podem ser armazenados, e seus valores padrão. Casting é forçar um tipo de dado a ser outro quando o mesmo não tem tamanho o suficiente para aquele tipo de variável, então forçamos a variável a se encaixar em um tipo menor do que a variável, muitas vezes quebra o código e não é aconselhável como se forçassemos um objeto grande a caber em um espaço pequeno. Strings são uma classe no java, quando a declaramos diferente de char é necessário cobrirmos nosso valor com aspas duplas

### Operadores aritméticos - Aula 15 a Aula 19

É possível realizar atribuições a variáveis, ou soma-las muitas vezes utilizando o operador de + entre os valores e fazendo armazenando dentro da variável, entretanto é possível fazer essa operação de forma mais eficiente utilizando += e somente declarando o valor que seja adicionado(é possível realizar essa mesma atribuição utilizando os operadores restantes), acrescentar +1 com variavel_exemplo++, entretanto somente quando é uma variável se formos realizar uma concatenação o valor não é lido se estver a direita, pois o java le o algoritmo da esquerda para direita, não tendo chance de ler o ++ e exibindo a valor da variável primeiro e somente depois realziando a soma, para quando concatenamos utilizamos o ++variavel-exemplo na esquerda para ocorrer a adição antes da execução incrementando o valor primeiro e depois adiciona o valor da variável e exibindo o valor atualizado logo em seguida.

### Estruturas Condicionais - Aula 20 a Aula 26

O Java exige que inicializemos as variáveis antes do programa ser executado. Podemos utilizar condições para executar blocos de códigos dependendo das condições, as condições tem que retornar um valor booleano, sem exceção. Utilizamos o if para isso que seria se(if) tal condição for atendida execute o bloco de código abaixo, é possível utilizar o senão se(else if) para adicionar mais condições e se aquela condição for atendida executar o bloco de código também é necessário atribuir um valor padrão se nenhuma das condições for atendida com o else. As condições que são falsas são puladas e o programa procura aquela que for verdadeira para o bloco ser executado, se nenhuma delas for o programa passa por elas sem executar e executa o else que seria o comando padrão, utilizamos dentro das condições o E e o Ou sendo o E(AND) necessário todas as condições dentro da condição serem verdadeiras para retornar verdadeiro e se todas forem menos uma ele retorna falsa, enquanto o Ou(or) só exige que uma condição dentro das condições seja verdadeira para executar o bloco de código, temos também a negação !(não) que nega aquela condição e inverte o valor da condição, se for true é convertido para false e vice-versa. Operador ternário que funciona como o if, mas essa é sua estrutura (condição) ? true : false seria um se a condição for true execute o da esquerda se for false a da direita, é possível aninhar ternários mas não é uma boa prática.


