package Aula08_revisaoPT2.lacosRepeticao.goldCode;

import java.util.Arrays;

public class somadorEnxuto {

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("        MAQUINA DE CODAGEM - REVISAO 02          ");
        System.out.println("               O SOMADOR ENXUTO                  ");
        System.out.println("=================================================");

        int[] numeros = {5, 10, 15, 20};
        System.out.println("\nArray de Entrada: " + Arrays.toString(numeros));

        // 1. Abordagem Funcional / Inline (Meta do Slide)
        System.out.println("\nExecutando Abordagem Inline (Streams):");
        System.out.println("Soma Total: " + somarInline(numeros));

        // 2. Abordagem Tradicional (Para fins de comparação)
        System.out.println("\nExecutando Abordagem Tradicional (For-Each):");
        System.out.println("Soma Total: " + somarTradicional(numeros));
        System.out.println("-------------------------------------------------");
    }

    /**
     * DESAFIO CUMPRIDO: Menor número de caracteres possível usando a API de Streams.
     */
    public static int somarInline(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    /**
     * ALTERNATIVA: Paradigma imperativo tradicional.
     */
    public static int somarTradicional(int[] arr) {
        int s = 0;
        for (int n : arr) s += n;
        return s;
    }
}