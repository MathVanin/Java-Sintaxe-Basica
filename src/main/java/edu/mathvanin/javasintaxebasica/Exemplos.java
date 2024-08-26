package edu.mathvanin.javasintaxebasica;

import java.util.Scanner;

public class Exemplos {
    // Exemplos de tipos de váriaveis e operadores
    private static void variaveisOperadores(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ========= Variáveis e Operadores =========");

        // Exemplo de declaração de variáveis e atribuição de valores
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a nota da prova 1: ");
        int notaProva1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite a nota da prova 2: ");
        int notaProva2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite a nota da prova 3: ");
        int notaProva3 = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite a nota da prova 4: ");
        int notaProva4 = Integer.parseInt(scanner.nextLine());
        boolean aprovado = false;

        // Exemplo de calculo aritimético
        int media = (notaProva1 + notaProva2 + notaProva3 + notaProva4) / 4;

        // Exemplo de operador lógico
        if (media >= 5)
            aprovado = true;

        // Exemplo de operador ternário
        System.out.println(aprovado ? "O aluno " + nome + " foi aprovado" : "O aluno " + nome + " foi reprovado");

    }

    // Identeção
    // Exemplo de criação de método
    private static void identacao() {
        System.out.println(" ========= Identação =========");
        System.out.println("Esse é um exemplo de código identado");
        if (true) {
            System.out.println("Quando abrimos um novo bloco de código");
            System.out.println("Devemos identar com 4 espaços");
        }
        System.out.println("Ao fechar o bloco recuamos novamente 4 espaços");
        System.out.println("===============================");
    }

    // Nome de classes
    // Exemplo de criação de método
    private static void nomeDeClasses() {
        System.out.println(" ========= Nome de classes =========");
        System.out.println("O nome de uma classe deve ser um substantivo");
        System.out.println("Deve começar com letra maiúscula");
        System.out.println("Se for composto, cada palavra deve começar com letra maiúscula");
        System.out.println("Exemplo: ConvencaoDeCodigo");
        System.out.println("Exemplo: ClasseDeExemplo");
        System.out.println("================================");
    }

    //Nome de métodos e variáveis
    // Exemplo de criação de método
    private static void nomeDeMetodosEVariaveis() {
        System.out.println(" ========= Nome de métodos e variáveis =========");
        System.out.println("O nome de um método deve ser um verbo");
        System.out.println("O nome de uma variável deve ser um substantivo");
        System.out.println("Ambos devem ser cammelCase");
        System.out.println("Por tanto, caso seja composto, cada palavra deve começar com letra maiúscula");
        System.out.println("Exemplo de método: buscarAluno");
        System.out.println("Exemplo de método: calcularMedia");
        System.out.println("Exemplo de variável: media");
        System.out.println("Exemplo de variável: numeroDeAlunos");
        System.out.println("====================================");
    }

    // Constantes
    // Exemplo de criação de método
    private static void constantes() {
        System.out.println(" ========= Constantes =========");
        System.out.println("O nome de uma constante deve ser em maiúsculo");
        System.out.println("Caso seja composto, as palavras devem ser separadas por underline");
        System.out.println("Exemplo: VALOR_MAXIMO");
        System.out.println("Exemplo: PI");
        System.out.println("================================");
    }

    // Exemplo de criação do método main
    public static void main(String[] args) {
        System.out.println("\n");
        identacao();
        System.out.println("\n");
        nomeDeClasses();
        System.out.println("\n");
        nomeDeMetodosEVariaveis();
        System.out.println("\n");
        constantes();
        System.out.println("\n");
        variaveisOperadores();
    }
}
