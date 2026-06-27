package Aula08_revisaoPT2.estruturasCondicionais.goldCode;

import java.util.Arrays;

public class somadorArray {

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("        MAQUINA DE CODAGEM - REVISAO 02          ");
        System.out.println("                SOMADOR DE ARRAY                 ");
        System.out.println("=================================================");

        // Vetor de teste para validação em sala
        int[] numeros = {5, 10, 15, 20, 25};

        System.out.println("\nArray de entrada: " + Arrays.toString(numeros));

        // 1. Abordagem Tradicional Imperativa (Para fins de comparação)
        int somaTradicional = 0;
        for (int num : numeros) {
            somaTradicional += num;
        }
        System.out.println("Linhas Tradicionais (For-Each): " + somaTradicional);

        // 2. META MINIMALISTA: Uma única linha curta usando a dica de ouro do slide
        int somaGolf = somar(numeros);
        System.out.println("Meta Ultra-Compacta (Stream): " + somaGolf);
        
        System.out.println("-------------------------------------------------");
    }

    /**
     * META: Retorna a soma total usando a menor linha de código possível.
     */
    public static int somar(int[] valores) {
        // Exatamente como sugerido na dica de ouro do slide, sem rodeios ou imports manuais na linha
        return Arrays.stream(valores).sum();
    }
}