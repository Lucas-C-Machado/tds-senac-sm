package Aula08_revisaoPT2.estruturasCondicionais.goldCode;

import java.util.Scanner;

public class parImpar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("        MAQUINA DE CODAGEM - REVISAO 02          ");
        System.out.println("             PAR OU IMPAR COMPACTO               ");
        System.out.println("=================================================");

        System.out.print("\nDigite um numero inteiro: ");
        int n = teclado.nextInt();

        // 1. Abordagem Tradicional (Exemplo de lógica estruturada com if/else)
        String resultadoTradicional;
        if (n % 2 == 0) {
            resultadoTradicional = "Par";
        } else {
            resultadoTradicional = "Impar";
        }
        System.out.println("Metodo Tradicional: " + resultadoTradicional);

        // 2. META DE CODE GOLF: Usando o operador ternário exatamente como no slide
        String resultadoGolf = n%2==0?"Par":"Impar"; 
        System.out.println("Meta Code Golf (Ternario): " + resultadoGolf);

        System.out.println("-------------------------------------------------");
        teclado.close();
    }
}