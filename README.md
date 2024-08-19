
# ✍🏽 Resumo sobre sintaxe java básica

Este repositório tem como objetivo anotar e exemplificar informações sobre a sintaxe básica de java, como fonte para os conhecimentos aqui elencados estarei utilizando a trilha _"Aprendendo a Sintaxe Java"_ do bootcamp [Claro - Java com Spring Boot](https://web.dio.me/track/coding-the-future-claro-java-spring-boot) oferecido pela [DIO](web.dio.m)
>Ao apresentar valores a serem substituidos nos códigos, eles serão exibidos entre [ ]

# 📝 Convenção de código
Por padrão na linguagem java utilizamos alguns padrões de nomenclatura para facilitar a leitura e compreensão do código, são eles:
- **Identação:** Utilizar 4 espaços (ou tecla TAB) para identar o código, para cada nível hierarquico devemos adicionar mais 4 espaços.
  ~~~
  Exemplo:
  --------------------
  Texto    | Texto
  Não      |    Identado
  Identado |        Corretamente
  ~~~
- **Nome de classes:** Primeira letra de cada palavra deve ser maiúscula.
  >Exemplos: `Classe`, `ClasseExemplo` ou `ClasseDeExemplo`
- **Nome de métodos e variáveis:** Primeira letra de cada palavra deve ser maiuscula, exceto a primeira palavra (CamelCase).
  >Exemplos: `metodo`, `metodoExemplo` ou `metodoDeExemplo`
- **Nome de constantes (variaveis de valor fixo):** Todas as letras devem ser maiúsculas, separadas por underline.
  >Exemplos: `CONSTANTE`, `CONSTANTE_EXEMPLO` ou `CONSTANTE_DE_EXEMPLO`
- **Nome de pacotes:** Todas as letras devem ser minúsculas.
  >Exemplos: `pacote`, `pacoteexemplo` ou `pacotedeexemplo`
- **Nome do pacote principal:** Existem empresas que utilizam o padrão do seu domínio ao contrário, porém outra convenção é utilizar um prefixo para identificar o tipo de projeto, seguido por ponto(.), nome da empresa seguido por ponto(.) e o nome do projeto
  >| Tipo do projeto | Descrição                                         | Prefixo                |
  > |-----------------|---------------------------------------------------|------------------------|
  > | Comercial       | Projeto comercial, com fins lucrativos            | `com`                  |
  > | Organizacional  | Projeto pessoal, para fins diversos, como estudos | `org`                  |
  > | OpenSource      | Projeto OpenSource, de codigo aberto              | `org`  ou `opensource` |
  > | Educacional     | Projeto educacional, para fins de aprendizado     | `edu`                  |
   
  >Exemplos: `com.empresa.projeto`, `org.empresa.projeto` ou `opensource.empresa.projeto` 



# 💻 Anatomia das classes
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
- Declarar váriavel
    ~~~java
    [TipoDaVariavel] [NomeDaVariavel] = [ValorDaVariavel];
  
  -------------------------------
  Exemplo:
  
    int numero = 10;
    String TEXTO_HELLO_WORLD = "Hello world!";
    ~~~
- Declarar métodos
    ~~~java
   public static [TipoDeRetorno] [NomeDoMetodo] ([Parametros]){
        [Código a ser implementado]
    }
  
  -------------------------------
  Exemplo:
    private statc main(String[] args){
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
