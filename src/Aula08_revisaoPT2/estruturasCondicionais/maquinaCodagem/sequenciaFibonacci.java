package Aula08_revisaoPT2.estruturasCondicionais.maquinaCodagem;

import java.util.Arrays;
import java.util.Scanner;

public class sequenciaFibonacci {

    // Vetor de cache para o Memoization (Requisito do Bônus)
    // Usamos 'long' para suportar números grandes sem estourar o limite de tamanho do int
    private static long[] cache;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("        MAQUINA DE CODAGEM - REVISAO 02          ");
        System.out.println("             SEQUENCIA DE FIBONACCI              ");
        System.out.println("=================================================");

        // Teste base automático do slide (N = 6)
        System.out.println("\n Teste Base do Slide (N = 6):");
        imprimirFibonacciIterativo(6);

        // Entrada do usuário
        System.out.println("\n-------------------------------------------------");
        System.out.print("Digite a quantidade de termos (N): ");
        int n = teclado.nextInt();

        // 1. Execução da Versão Base (Iterativa)
        System.out.println("\n Resultado Versao Iterativa:");
        imprimirFibonacciIterativo(n);

        // 2. Execução da Versão Bônus (Recursiva Otimizada / Memoization)
        System.out.println("\n Resultado Versso Recursiva Otimizada (Bonus):");
        if (n <= 0) {
            System.out.println("N deve ser maior que zero.");
        } else {
            // Inicializa o cache preenchido com -1 para indicar posições não calculadas
            cache = new long[n + 1];
            Arrays.fill(cache, -1);

            for (int i = 0; i < n; i++) {
                System.out.print(fibonacciRecursivoOtimizado(i) + (i == n - 1 ? "" : ", "));
            }
            System.out.println();
        }

        teclado.close();
    }

    /**
     * ENUNCIADO BASE: Método iterativo tradicional usando laço de repetição.
     */
    public static void imprimirFibonacciIterativo(int n) {
        if (n <= 0) {
            System.out.println("Por favor, digite um numero maior que 0.");
            return;
        }

        long termo1 = 0;
        long termo2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(termo1 + (i == n - 1 ? "" : ", "));
            
            long proximoTermo = termo1 + termo2;
            termo1 = termo2;
            termo2 = proximoTermo;
        }
        System.out.println();
    }

    /**
     * REQUISITO BÔNUS: Versão recursiva utilizando Memoization.
     * Evita o estouro de pilha (StackOverflow) e o travamento por processamento redundante.
     */
    public static long fibonacciRecursivoOtimizado(int n) {
        // Casos base
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Se o valor já foi calculado anteriormente, retorna direto do cache
        if (cache[n] != -1) {
            return cache[n];
        }

        // Caso contrário, calcula e salva no cache antes de retornar
        cache[n] = fibonacciRecursivoOtimizado(n - 1) + fibonacciRecursivoOtimizado(n - 2);
        return cache[n];
    }
}