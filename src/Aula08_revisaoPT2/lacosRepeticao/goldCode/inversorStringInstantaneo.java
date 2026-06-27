package Aula08_revisaoPT2.lacosRepeticao.goldCode;

import java.util.Scanner;

public class inversorStringInstantaneo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("        MAQUINA DE CODAGEM - REVISAO 02          ");
        System.out.println("          INVERSOR DE STRINGS INSTANTANEO        ");
        System.out.println("=================================================");

        // Teste base rápido de demonstração
        String testeBase = "Java";
        System.out.println("\nTeste Base Rapido:");
        System.out.println("Entrada: " + testeBase);
        System.out.println("Invertido: " + inverterTextoInline(testeBase));

        // Entrada dinâmica para os alunos testarem em aula
        System.out.println("\n-------------------------------------------------");
        System.out.print("Digite uma palavra ou frase para inverter: ");
        String entrada = teclado.nextLine();

        System.out.println("\nResultado obtido via StringBuilder (.reverse):");
        System.out.println("\"" + inverterTextoInline(entrada) + "\"");
        
        System.out.println("-------------------------------------------------");
        teclado.close();
    }

    /**
     * DESAFIO CUMPRIDO: Inverte a string instantaneamente sem usar loops
     * manuais, aproveitando a API nativa e otimizada do StringBuilder.
     */
    public static String inverterTextoInline(String texto) {
        if (texto == null) return "";
        return new StringBuilder(texto).reverse().toString();
    }
}