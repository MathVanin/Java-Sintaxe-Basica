package edu.mathvanin.javasintaxebasica.Exercicio01;

/**
 * <h1>SmartTv</h1>
 * Classe para ilustrar uma televisão inteligente
 * com métodos para ligar, desligar, mudar volume e canal
 *
 * @author Matheus Vanin
 * @version 1.0
 * @since 26/08/2024
 */
public class SmartTV {
    // Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
    // 1 - Ela tenha as caracteristicas: ligada (boolean), canal (int), volume (int)
    // 2 - Nossa TV poderá ligar e desligar e assim mudar o estado ligada
    // 3 - Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
    // 4 - Nossa TV poderá mudar de canal de 1 em 1 ou definindo número correspondente

    // Variaveis de escopo de classe
    boolean ligada;
    int canal = 5;
    int volume = 25;

    /**
     * Método para ligar e desligar a TV
     * Caso esteja ligada altera para desligada e vice-versa
     * @return void
     */
    protected void botaoLiga() {
        ligada = !ligada;
    }

    /**
     * Método para alterar o volume da TV
     * @param valor int - Valor para aumentar ou diminuir o volume
     *              Se valor for positivo aumenta o volume
     *              Se valor for negativo diminui o volume
     * @return void
     */
    protected void mudarVolume(int valor) {
        // Valor é uma váriavel de escopo de método
        volume += valor;
    }

    /**
     * Método para alterar o canal da TV
     * @param valor int - Valor para aumentar ou diminuir o volume
     *              Se valor for positivo aumenta o volume
     *              Se valor for negativo diminui o volume
     * @return void
     */
    protected void mudarCanal(int valor) {
        canal += valor;
    }

    /**
     * Método para exibir informações da TV
     * @return void
     */
    protected void exibirInformacoes(){
        System.out.println(" ========= SmartTV =========");
        System.out.println("TV Ligada: " + ligada);
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
    }
}

