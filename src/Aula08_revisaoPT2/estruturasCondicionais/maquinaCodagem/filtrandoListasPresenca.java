package Aula08_revisaoPT2.estruturasCondicionais.maquinaCodagem;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class filtrandoListasPresenca {

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("        MAQUINA DE CODAGEM - REVISAO 02          ");
        System.out.println("          FILTRANDO A LISTA DE PRESENCA          ");
        System.out.println("=================================================");

        // Array de testes baseado no exemplo do slide + duplicatas para testar o bônus
        String[] alunosOriginal = {"Ana", "Carlos", "amanda", "Bruno", "Ana", "Alexandre", "amanda"};

        System.out.println("\n Lista Original de Alunos:");
        System.out.println(Arrays.toString(alunosOriginal));

        // 🚀 Executando a filtragem com as regras do Bônus
        List<String> listaFiltrada = filtrarEOrdenarAlunos(alunosOriginal);

        System.out.println("\n Lista Filtrada (Apenas 'A', Maiusculas, Sem Duplicatas e Ordenada):");
        System.out.println(listaFiltrada);
        System.out.println("-------------------------------------------------");
    }

    /**
     * REQUISITO: Recebe um array de Strings e aplica as regras do enunciado e do bônus.
     * Retorna uma lista com os nomes transformados, sem repetições e em ordem alfabética.
     */
    public static List<String> filtrarEOrdenarAlunos(String[] arrayOriginal) {
        if (arrayOriginal == null || arrayOriginal.length == 0) {
            return List.of();
        }

        // Corrigido: Removida a chamada inválida .trimToNullSafe()
        return Arrays.stream(arrayOriginal)
                .filter(nome -> nome != null && !nome.trim().isEmpty()) // Garante que não vai quebrar com nulos ou vazios
                .map(String::toUpperCase)                               // REQUISITO: Converter para maiúsculas
                .filter(nome -> nome.startsWith("A"))                   // REQUISITO: Filtrar apenas os que começam com "A"
                .distinct()                                             // REQUISITO BÔNUS: Remover duplicatas
                .sorted()                                               // REQUISITO BÔNUS: Ordem alfabética
                .collect(Collectors.toList());                          // Coleta de volta para uma Lista
    }
}