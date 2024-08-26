package edu.mathvanin.javasintaxebasica.Exercicio01;

public class Usuario {
    public static void main(String[] args){
        SmartTV smartTV = new SmartTV();
        smartTV.exibirInformacoes();
        smartTV.botaoLiga();
        smartTV.exibirInformacoes();
        smartTV.mudarCanal(-1);
        smartTV.exibirInformacoes();
        smartTV.mudarVolume(-1);
        smartTV.mudarVolume(-1);
        smartTV.mudarVolume(-1);
        smartTV.exibirInformacoes();
    }
}
