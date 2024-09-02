# ✍🏽 Resumo sobre sintaxe java básica

Este repositório tem como objetivo anotar e exemplificar informações sobre a sintaxe básica de java, como fonte para os
conhecimentos aqui elencados estarei utilizando a trilha _"Aprendendo a Sintaxe Java"_ do
bootcamp [Claro - Java com Spring Boot](https://web.dio.me/track/coding-the-future-claro-java-spring-boot) oferecido
pela [DIO](web.dio.m)

Além disso, este repositório armazenará um projeto desenvolvido durante o curso, algo simples para exemplificar a
prática do que podemos ler aqui, boa leitura e otimos estudos!
> Ao apresentar valores a serem substituidos nos códigos, eles serão exibidos entre [ ]

## 📚 Sumário

1. [📝 Convenção de código](#-convenção-de-código)
2. [💻 Anatomia das classes](#-anatomia-das-classes)
3. [🔢 Tipos e variáveis](#-tipos-e-variáveis)

## 📝 Convenção de código

Por padrão na linguagem java utilizamos alguns padrões de nomenclatura para facilitar a leitura e compreensão do código,
são eles:

- **Identação:** Utilizar 4 espaços (ou tecla TAB) para identar o código, para cada nível hierarquico devemos adicionar
  mais 4 espaços.
  ~~~
  Exemplo:
  --------------------
  Texto    | Texto
  Não      |    Identado
  Identado |        Corretamente
  ~~~
- **Nome de classes:** Primeira letra de cada palavra deve ser maiúscula, substantivo, caso tenha nome composto a
  primeira letra de cada palavra deve ser maiúscula.
  > Exemplos: `Classe`, `ClasseExemplo` ou `ClasseDeExemplo`
- **Nome de métodos e variáveis:** Primeira letra de cada palavra deve ser maiuscula, exceto a primeira palavra (
  CamelCase).
  > Exemplos: `metodo`, `metodoExemplo` ou `metodoDeExemplo`
- **Nome de constantes (variaveis de valor fixo):** Todas as letras devem ser maiúsculas, separadas por underline.
  > Exemplos: `CONSTANTE`, `CONSTANTE_EXEMPLO` ou `CONSTANTE_DE_EXEMPLO`
- **Nome de pacotes:** Todas as letras devem ser minúsculas.
  > Exemplos: `pacote`, `pacoteexemplo` ou `pacotedeexemplo`
- **Nome do pacote principal:** Existem empresas que utilizam o padrão do seu domínio ao contrário, porém outra
  convenção é utilizar um prefixo para identificar o tipo de projeto, seguido por ponto(.), nome da empresa seguido por
  ponto(.) e o nome do projeto
  > | Tipo do projeto | Descrição                                         | Prefixo                |
      > |-----------------|---------------------------------------------------|------------------------|
  > | Comercial       | Projeto comercial, com fins lucrativos            | `com`                  |
  > | Organizacional  | Projeto pessoal, para fins diversos, como estudos | `org`                  |
  > | OpenSource      | Projeto OpenSource, de codigo aberto              | `org`  ou `opensource` |
  > | Educacional     | Projeto educacional, para fins de aprendizado     | `edu`                  |

  > Exemplos: `com.empresa.projeto`, `org.empresa.projeto` ou `opensource.empresa.projeto`

## 💻 Anatomia das classes

- Criar classes
    ~~~java
    public class [NomeDaClasse] {   
        [Código a ser implementado]
    }
  
  -------------------------------
  Exemplo:
  
  public class Main {
      public static void main(String[] args) {
        System.out.println("Hello world!");
      }
  }  
    ~~~
- Criar classe main
    ~~~java
    public static void main(String [] args){
        [Código a ser implementado]
    }
  
  -------------------------------
  Exemplo:
  
    public static void main(String[] args) {
      System.out.println("Hello world!");
    }
    ~~~

## 🔢 Tipos e variáveis

- **Tipos primitivos:** A linguagem java possui oito tipos primitivos sendo eles:
  > | Tipo    | Descrição           | Tamanho | Valor padrão | Valor mínimo               | Valor máximo              |
      > |---------|---------------------|---------|--------------|----------------------------|---------------------------|
  > | byte    | Número inteiro      | 8 bits  | 0            | -128                       | 127                       |
  > | short   | Número inteiro      | 16 bits | 0            | -32.768                    | 32.767                    |
  > | int     | Número inteiro      | 32 bits | 0            | -2.147.483.648             | 2.147.483.647             |
  > | long    | Número inteiro      | 64 bits | 0L           | -9.223.372.036.854.775.808 | 9.223.372.036.854.775.807 |
  > | float   | Número decimal      | 32 bits | 0.0f         | 1.4E-45f                   | 3.4028235E38f             |
  > | double  | Número decimal      | 64 bits | 0.0d         | 4.9E-324                   | 1.7976931348623157E308    |
  > | char    | Caractere           | 16 bits | '\u0000'     | '\u0000'                   | '\uffff'                  |
  > | boolean | Verdadeiro ou falso | 1 bit   | false        | false                      | true                      |
- Declarar váriavel
    ~~~java
    [TipoDaVariavel] [NomeDaVariavel] = [ValorDaVariavel];
  
  -------------------------------
  Exemplo:
  
  int numero = 10;
  double decimal = 10.5;
  String TEXTO_HELLO_WORLD = "Hello world!";
  ~~~
- **Constantes:** Constantes são variaveis que nunca tem seu valor alterado durante a execução do código, para declarar
  uma constante devemos utilizar a palavra reservada `final` antes do tipo da variável.
  ~~~java
  final [TipoDaVariavel] [NomeDaVariavel] = [ValorDaVariavel];
  
  -------------------------------
  Exemplo:
  
  final int NUMERO = 10;
  final double DECIMAL = 10.5;
  final String TEXTO_HELLO_WORLD = "Hello world!";
  ~~~

## 🧮️ Operadores

### **Operadores aritméticos**

- São utilizados para realizar operações matemáticas
  > | Operador | Descrição     | Exemplo | Resultado |
      > |----------|---------------|---------|-|
  > | +        | Adição        | 10 + 3  | 13 | 
  > | -        | Subtração     | 15 - 7  | 8  |
  > | *        | Multiplicação | 2 * 4   | 8  |
  > | /        | Divisão       | 10 / 2  | 5  |
  > | %        | Módulo        | 16 % 3  | 1  | 

### Operadores unários

- São utilizados para realizar algumas tarefas básicas de forma simples, como incrementar, decrementar, inverter valores
  númericos e booleanos
  > | Operador | Descrição     | Exemplo | Resultado |
    > |----------|---------------|---------|-|
  > | +        | Sinal         | +a      | a        |
  > | -        | Negativo      | -a      | -a       |
  > | ++       | Incremento    | a++     | a = a + 1 | 
  > | --       | Decremento    | a--     | a = a - 1 |

### Operadores de atribuição

- São utilizados para atribuir valores a variáveis
  > | Operador | Descrição     | Exemplo | Resultado |
    > |----------|---------------|---------|-|
  > | =        | Atribuição    | a = 10  | a = 10    |
  > | +=       | Adição        | a += 5  | a = a + 5 |
  > | -=       | Subtração     | a -= 5  | a = a - 5 |
  > | *=       | Multiplicação | a *= 5  | a = a * 5 |
  > | /=       | Divisão       | a /= 5  | a = a / 5 |
  > | %=       | Módulo        | a %= 5  | a = a % 5 |

### Operadores lógicos

- São utilizados para realizar operações lógicas entre valores booleanos
  > | Operador | Descrição     | Exemplo        | Resultado |
    > |----------|---------------|----------------|-----------|
  > | ==       | Igual a       | 10 == 5        | false     |
  > | !=       | Diferente de  | 10 != 5        | true      |
  > | &&       | E             | true && false  | false     |
  > | \|\|     | OU            | true \|\| true | true      |
  > | \>       | Maior que | 10 > 5         | true      |
  > | <        | Menor que | 10 < 5         | false     |
  > | \>=      | Maior ou igual a | 10 >= 10       | true      |
  > | <=       | Menor ou igual a | 10 <= 5        | false     |
  > | !        | Negação       | !true          | false     |

## 🛞 Métodos

São blocos de código que podem ser chamados para realizar uma tarefa específica, utilizados para
organizar o código e reutilizar trechos de código. De forma resumida métodos são as ações da classe

### Visibilidade dos métodos

> | Visibilidade | Descrição                                                                 |
  > |--------------|---------------------------------------------------------------------------|
> | public       | Pode ser acessado por qualquer classe                                     |
> | protected    | Pode ser acessado pela classe e suas subclasses                            |
> | private      | Pode ser acessado apenas pela classe que o contém                         |
> | default      | Pode ser acessado apenas por classes do mesmo pacote                      |

- Declarar métodos
    ~~~java
   [visibilidade] [TipoDeRetorno] [NomeDoMetodo] ([Parametros]){
        [Código a ser implementado]
    }
  
  -------------------------------
  Exemplo:
  
    private static main(String[] args){
        Double[] valores = pegarValores();
        Double resultado = somar(valores[0], valores[1]);
        System.out.println("A soma dos valores é: " + resultado);
    }
  
    private Double[] pegarValores(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        Double a = Double.valueOf(scanner.nextLine());
        System.out.println("Digite o segundo número:");
        Double b = Double.valueOf(scanner.nextLine());
        return new Double[] {a, b};
    }
  
    public static Double somar(Double numeroUm, Double numeroDois){
        return numeroUm + numeroDois;
    }
    ~~~

## 🧾 Escopo

É o local onde a variável é visível, ou seja, onde ela pode ser acessada. Existem 3 tipos de escopo:
> | Tipo de Escopo | Descrição | Exemplo                                                                                                                                |
  >| --- | --- |----------------------------------------------------------------------------------------------------------------------------------------|
>| Escopo de classe | Variáveis declaradas fora de métodos, são visíveis em toda a classe. | `public class Main { int numero = 10; }`                                                                                               |
>| Escopo de método | Variáveis declaradas dentro de métodos, são visíveis apenas dentro do método. | `private double somar(double numeroUm, double numeroDois) { double resultado = numeroUm + numeroDois; System.out.println(resultado) }` |
>| Escopo de bloco | Variáveis declaradas dentro de blocos de código, são visíveis apenas dentro do bloco. | `for(int x=1; x<= 5; x++) {double valor;}`                                                                                             |

## 📦️ Palavras reservadas

São identificadores de uma linguagem que já possuem finalidade específica e não podem ser utilizadas para nomear
variáveis, métodos, classes, etc.

Em java todas as palavras reservadas são minúsculas, existem 52 palavras, para facilitar a visualização separaremos elas de acordo com a finalidade, algumas já foram abordadas em outros tópicos, porém iremos revisa-las
  - Controle de pacotes
    > | Palavra reservada | Descrição                       |
    > |-------------------|---------------------------------|
    > | import            | Importa um pacote para o código |
    > | package           | Define o pacote do código       |
  - Modificadores de acesso
    > | Palavra reservada | Descrição                                 |
    > |-------------------|-------------------------------------------|
    > | private           | Acessível apenas pela classe que o contém |
    > | protected         | Acessível pela classe e suas subclasses   |
    > | public            | Acessível por qualquer classe             |
  - Primitivos
    > | Palavra reservada | Descrição                                     |
    > |-------------------|-----------------------------------------------|
    > | boolean           | um valor indicando verdadeiro ou false        |
    > | byte              | inteiro de 8 bits                             |
    > | char              | caractere Unicode de 16 bits                  |
    > | double            | número decimal de 64 bits                     |
    > | float             | número decimal de 32 bits                     |
    > | int               | inteiro de 32 bits                            |
    > | long              | inteiro de 64 bits                            |
    > | short             | inteiro de 16 bits                            |
    > | void              | indica que um método não tem valor de retorno |
  - Modificadores de clases, váriaveis ou métodos
    > | Palavra reservada | Descrição                                                                                                            |
    > |-------------------|----------------------------------------------------------------------------------------------------------------------|
    > | abstract          | Classe abstrata, não pode ser instanciada ou método que precisa ser implementado por uma subclasse não abstrata      |
    > | class             | Define uma classe                                                                                                    |
    > | extends           | Indica que uma classe herda de outra classe                                                                          |
    > | final             | Indica que uma classe não pode ser herdada, um método não pode ser sobrescrito ou uma variável não pode ser alterada |
    > | implements        | Indica que uma classe implementa uma interface                                                                       |
    > | interface         | Define uma interface                                                                                                 |
    > | native            | Indica que um método está escrito em uma linguagem dependete de plataforma, como C e C++                             |
    > | new               | Instancia um novo objeto chamando seu construtor                                                                     |
    > | static            | Indica que um método ou variável pertence a classe, não a instância                                                  |
    > | strictfp          | Restringe a precisão de ponto flutuante para garantir a portabilidade entre diferentes plataformas                   |
    > | synchronized      | Indica que um método só pode ser acessado por uma thread por vez                                                     |
    > | transient         | Indica que uma variável não deve ser serializada                                                                     |
    > | volatile          | Indica que uma variável pode ser alterada por diferentes threads simultaneamente                                     |
  - Controle de fluxo
    > | Palavra reservada | Descrição                                                                      |
    > |-------------------|--------------------------------------------------------------------------------|
    > | break             | Sai do bloco de código no qual está                                            |
    > | case              | Executa um bloco de código dependendo do teste de um switch                    |
    > | continue          | Pula o resto do bloco de código e continua o loop                              | 
    > | default           | Executa um bloco de código se nenhum case for verdadeiro                       |
    > | do                | Cria um loop que executa um bloco de código                                    |
    > | else              | Executa um bloco de código se a condição de um if for falsa                    |
    > | for               | Cria um loop que consiste em três expressões                                   |
    > | if                | Executa um bloco de código se a condição for verdadeira                        |
    > | instanceof        | Testa se um objeto é uma instância de uma classe                               |
    > | return            | Retorna um valor de um método                                                  |
    > | switch            | Executa um bloco de código dependendo do teste                                 |
    > | while             | Cria um loop que executa um bloco de código enquanto a condição for verdadeira |
  - Tratamento de erros
     > | Palavra reservada | Descrição                                                        |
     > |-------------------|------------------------------------------------------------------|
     > | assert            | Testa uma condição para garantir que é verdadeira                |
     > | catch             | Captura uma exceção e cria um bloco de código para lidar com ela |
     > | finally           | Cria um bloco de código que é executado após um bloco try-catch  |
     > | throw             | Cria uma exceção personalizada e a lança                         |
     > | throws            | Indica que um método pode lançar uma exceção                     |
     > | try               | Cria um bloco de código que pode gerar exceções                  |
  - Variáveis de referência
     > | Palavra reservada | Descrição                                                                 |
     > |-------------------|---------------------------------------------------------------------------|
     > | super             | Refere-se a um objeto da classe pai                                       |
     > | this              | Refere-se a um objeto da classe atual                                     |
    
## 📖 [Java Documentation](https://docs.oracle.com/en/java/)