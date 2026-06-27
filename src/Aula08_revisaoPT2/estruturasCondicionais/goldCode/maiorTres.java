package Aula08_revisaoPT2.estruturasCondicionais.goldCode;

import java.util.Scanner;

public class maiorTres {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("        MAQUINA DE CODAGEM - REVISAO 02          ");
        System.out.println("                O MAIOR DE TRES                  ");
        System.out.println("=================================================");

        System.out.print("\nDigite o primeiro numero (a): ");
        int a = teclado.nextInt();
        
        System.out.print("Digite o segundo numero (b): ");
        int b = teclado.nextInt();
        
        System.out.print("Digite o terceiro numero (c): ");
        int c = teclado.nextInt();

        // Execução da expressão curta utilizando a dica de ouro do slide
        int maior = encontrarMaior(a, b, c);

        System.out.println("\n-------------------------------------------------");
        System.out.printf("Dos numeros digitados (%d, %d, %d), o maior e: %d\n", a, b, c, maior);
        System.out.println("-------------------------------------------------");
        
        teclado.close();
    }

    /**
     * REQUISITO: Retorna o maior de três números sem usar estruturas if/else tradicionais.
     */
    public static int encontrarMaior(int a, int b, int c) {
        // Encadeamento de Math.max: primeiro acha o maior entre b e c, 
        // e depois compara o resultado com a.
        return Math.max(a, Math.max(b, c));
    }
}