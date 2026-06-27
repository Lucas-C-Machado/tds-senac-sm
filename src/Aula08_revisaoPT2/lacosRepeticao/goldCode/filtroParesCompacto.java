package Aula08_revisaoPT2.lacosRepeticao.goldCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class filtroParesCompacto {

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("        MAQUINA DE CODAGEM - REVISAO 02          ");
        System.out.println("            FILTRO DE PARES COMPACTO             ");
        System.out.println("=================================================");

        // Criando uma lista mutável para permitir a remoção direta
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        
        System.out.println("\nLista Original: " + numeros);

        // EXECUTANDO O DESAFIO: Filtragem in-place com menor sintaxe
        filtrarImparesInline(numeros);

        System.out.println("\nApos Filtro Compacto (.removeIf):");
        System.out.println("Lista de Pares Resultante: " + numeros);
        System.out.println("-------------------------------------------------");
    }

    /**
     * DESAFIO CUMPRIDO: Modifica a lista original removendo os ímpares
     * em apenas uma linha usando predicados e expressões lambda.
     */
    public static void filtrarImparesInline(List<Integer> lista) {
        lista.removeIf(n -> n % 2 != 0);
    }
}