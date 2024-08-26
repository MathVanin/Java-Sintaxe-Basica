package edu.mathvanin.javasintaxebasica.Exercicio01;

public class SmartTV {
    // Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
    // 1 - Ela tenha as caracteristicas: ligada (boolean), canal (int), volume (int)
    // 2 - Nossa TV poderá ligar e desligar e assim mudar o estado ligada
    // 3 - Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
    // 4 - Nossa TV poderá mudar de canal de 1 em 1 ou definindo número correspondente

    boolean ligada;
    int canal = 5;
    int volume = 25;

    protected void botaoLiga() {
        ligada = !ligada;
    }

    protected void mudarVolume(int valor) {
        volume += valor;
    }

    protected void mudarCanal(int valor) {
        canal += valor;
    }

    protected void exibirInformacoes(){
        System.out.println(" ========= SmartTV =========");
        System.out.println("TV Ligada: " + ligada);
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
    }
}

