package Aula08_revisaoPT2.lacosRepeticao.maquinaCodagem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mediaMovel {

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("        MAQUINA DE CODAGEM - REVISAO 02          ");
        System.out.println("                   MEDIA MOVEL                   ");
        System.out.println("=================================================");

        // Dados de teste (Simulando, por exemplo, temperaturas ou preços)
        double[] dados = {10.0, 20.0, 30.0, 40.0, 50.0};
        int janelaK = 3;

        System.out.println("\nArray de Entrada: " + Arrays.toString(dados));
        
        // 1. REQUISITO BASE: Média Aritmética Simples
        double mediaSimples = calcularMediaSimples(dados);
        System.out.printf("Media Simples Geral: %.2f\n", mediaSimples);

        // 2. REQUISITO BÔNUS: Média Móvel com Janela K
        System.out.println("\nExecutando Desafio Bonus (Media Movel com K = " + janelaK + "):");
        List<Double> resultadoMediaMovel = calcularMediaMovel(dados, janelaK);
        System.out.println("Lista de Medias Gerada: " + resultadoMediaMovel);
        System.out.println("-------------------------------------------------");
    }

    /**
     * REQUISITO BASE: Calcula a média aritmética simples de todo o array.
     */
    public static double calcularMediaSimples(double[] array) {
        if (array == null || array.length == 0) return 0.0;
        
        double soma = 0.0;
        for (double valor : array) {
            soma += valor;
        }
        return soma / array.length;
    }

    /**
     * REQUISITO BÔNUS: Percorre o array gerando subgrupos de tamanho K 
     * e calcula a média móvel de cada janela.
     */
    public static List<Double> calcularMediaMovel(double[] array, int k) {
        List<Double> medias = new ArrayList<>();

        // Validação de segurança básica para evitar exceções ou loops infinitos
        if (array == null || k <= 0 || array.length < k) {
            System.out.println("⚠️ Parâmetros inválidos para o cálculo da Média Móvel.");
            return medias;
        }

        // O limite do loop externo garante que a janela não passe do fim do array.
        // Se o array tem tamanho 5 e K é 3, faremos (5 - 3 + 1) = 3 iterações.
        for (int i = 0; i <= array.length - k; i++) {
            double somatorioJanela = 0.0;

            // Loop interno para somar os K elementos a partir do índice atual 'i'
            for (int j = 0; j < k; j++) {
                somatorioJanela += array[i + j];
            }

            // Calcula a média do subgrupo atual e adiciona na lista de retorno
            double mediaJanela = somatorioJanela / k;
            medias.add(mediaJanela);
        }

        return medias;
    }
}