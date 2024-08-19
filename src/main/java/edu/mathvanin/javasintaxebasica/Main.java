package edu.mathvanin.javasintaxebasica;

import static edu.mathvanin.javasintaxebasica.menus.Menus.solicitarOperacao;
import static edu.mathvanin.javasintaxebasica.operacoes.OperacoesBasicas.*;
import static edu.mathvanin.javasintaxebasica.utils.Utils.pegarValores;

public class Main {

    public static void main(String[] args) {
        int operacao = solicitarOperacao();
        Double resultado = 0.0;
        switch (operacao) {
            case 1 -> resultado = somar(pegarValores(2));
            case 2 -> resultado = subtrair(pegarValores(2));
            case 3 -> resultado = multiplicar(pegarValores(2));
            case 4 -> resultado = dividir(pegarValores(2));
            case 5 -> {
                break;
            }
        }
            System.out.println("Resultado: " + resultado);
    }
}