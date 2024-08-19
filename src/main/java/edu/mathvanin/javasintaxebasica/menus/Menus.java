package edu.mathvanin.javasintaxebasica.menus;

import java.util.Scanner;

import static edu.mathvanin.javasintaxebasica.utils.Utils.validarOperacao;

public class Menus {
    static Scanner scanner = new Scanner(System.in);

    public static int solicitarOperacao() {
        try {
            exibirMenuPrincipal();
            int operacao = Integer.parseInt(scanner.nextLine());
            validarOperacao(operacao);
            return operacao;
        } catch (NumberFormatException e) {
            System.out.println("Opção inválida");
            return solicitarOperacao();
        }
    }

    private static void exibirMenuPrincipal() {
        System.out.println("""
                Digite a operação desejada:
                1 - Soma
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                5 - Sair
                """);
    }
}
