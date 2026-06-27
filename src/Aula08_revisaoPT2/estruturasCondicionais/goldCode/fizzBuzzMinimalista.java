package Aula08_revisaoPT2.estruturasCondicionais.goldCode;

import java.util.Scanner;

public class fizzBuzzMinimalista {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("        MAQUINA DE CODAGEM - REVISAO 02          ");
        System.out.println("              FIZZBUZZ MINIMALISTA               ");
        System.out.println("=================================================");

        // Teste rápido simulando uma sequência no console
        System.out.println("\n Executando Teste de Sequencia (1 a 15):");
        for (int i = 1; i <= 15; i++) {
            System.out.print(fizzBuzzGolf(i) + (i == 15 ? "" : ", "));
        }
        System.out.println();

        // Interação com o aluno
        System.out.println("\n-------------------------------------------------");
        System.out.print("Digite um numero especifico para testar: ");
        int n = teclado.nextInt();

        System.out.println("Retorno: " + fizzBuzzGolf(n));
        System.out.println("-------------------------------------------------");

        teclado.close();
    }

    /**
     * META CODE GOLF: Menor quantidade de caracteres possível.
     * Avalia múltiplos de 3, 5, ambos (15) ou retorna o número convertido em String.
     */
    public static String fizzBuzzGolf(int n) {
        // Encadeamento inteligente de ternários sem espaços para economizar caracteres.
        // Se for múltiplo de 15 (3 e 5), retorna "FizzBuzz".
        // Se não, testa o 3 ("Fizz"), o 5 ("Buzz") ou faz o fallback para o número.
        return n%15==0?"FizzBuzz":n%3==0?"Fizz":n%5==0?"Buzz":n+"";
    }
}