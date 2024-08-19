package edu.mathvanin.javasintaxebasica.utils;

import java.util.Scanner;

public class Utils {
    static Scanner scanner = new Scanner(System.in);

    public static Double[] pegarValores(int quantidade) {
        Double[] valores = new Double[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            valores[i] = Double.valueOf(scanner.nextLine());
        }
        return valores;
    }

    public static void validarOperacao(int operacao) {
        if (operacao < 1 || operacao > 5) {
            throw new NumberFormatException();
        }
    }
}
