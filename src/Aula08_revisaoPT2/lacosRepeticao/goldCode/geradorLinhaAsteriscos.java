package Aula08_revisaoPT2.lacosRepeticao.goldCode;

import java.util.Scanner;

public class geradorLinhaAsteriscos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("        MAQUINA DE CODAGEM - REVISAO 02          ");
        System.out.println("          GERADOR DE LINHA DE ASTERISCOS         ");
        System.out.println("=================================================");

        // Teste automático baseado no exemplo do slide (4 -> "****")
        int exemploSlide = 4;
        System.out.println("\nTeste Base do Slide (Exemplo: " + exemploSlide + "):");
        System.out.println("Linha gerada: \"" + gerarLinhaInline(exemploSlide) + "\"");

        // Entrada dinâmica do usuário para testes adicionais
        System.out.println("\n-------------------------------------------------");
        System.out.print("Digite o tamanho da linha de asteriscos (n): ");
        int n = teclado.nextInt();

        if (n < 0) {
            System.out.println("Erro: O tamanho da linha nao pode ser negativo.");
        } else {
            System.out.println("\nResultado do metodo inline (Java 11+):");
            System.out.println("\"" + gerarLinhaInline(n) + "\"");
        }
        
        System.out.println("-------------------------------------------------");
        teclado.close();
    }

    /**
     * DESAFIO CUMPRIDO: Retorna n asteriscos em uma única linha usando 
     * recursos modernos da linguagem, sem estruturas longas ou chaves.
     */
    public static String gerarLinhaInline(int n) {
        return "*".repeat(n);
    }
}