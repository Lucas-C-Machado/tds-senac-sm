package Aula08_revisaoPT2.estruturasCondicionais.maquinaCodagem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class frequenciaCaracteres {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("        MAQUINA DE CODAGEM - REVISAO 02          ");
        System.out.println("            FREQUENCIA DE CARACTERES             ");
        System.out.println("=================================================");

        // Teste base automático baseado no slide ("banana", 'a')
        String textoExemplo = "banana";
        char alvoExemplo = 'a';
        System.out.println("\n🚀 Teste Base do Slide:");
        System.out.println("Texto: \"" + textoExemplo + "\" | Caractere alvo: '" + alvoExemplo + "'");
        System.out.println("Resultado da contagem simples: " + contarCaractereSimples(textoExemplo, alvoExemplo));

        // Interação com o usuário/aluno
        System.out.println("\n-------------------------------------------------");
        System.out.print("Digite uma palavra ou frase para testar o BÔNUS: ");
        String textoUsuario = teclado.nextLine();

        System.out.println("\n📊 Processando Mapa de Frequência Ordenado (Decrescente):");
        Map<Character, Integer> mapaFrequencia = gerarMapaFrequenciaOrdenado(textoUsuario);

        // Exibição formatada do mapa gerado pelo bônus
        mapaFrequencia.forEach((caractere, qtd) -> {
            // Ajuste visual para que o espaço em branco não fique invisível na impressão
            String exibicaoKey = (caractere == ' ') ? "[Espaço]" : "'" + caractere + "'";
            System.out.printf("👉 Caractere %-9s : %d vez(es)\n", exibicaoKey, qtd);
        });

        System.out.println("-------------------------------------------------");
        teclado.close();
    }

    /**
     * ENUNCIADO BASE: Conta de forma simples quantas vezes um caractere específico aparece.
     */
    public static int contarCaractereSimples(String texto, char alvo) {
        if (texto == null || texto.isEmpty()) {
            return 0;
        }

        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == alvo) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * REQUISITO BÔNUS: Analisa toda a String e mapeia a frequência de cada caractere.
     * Retorna um mapa ordenado do caractere com MAIOR frequência para o de MENOR frequência.
     */
    public static Map<Character, Integer> gerarMapaFrequenciaOrdenado(String texto) {
        if (texto == null || texto.isEmpty()) {
            return Map.of();
        }

        // 1. Passo: Alimentar um mapa tradicional com a contagem crua
        Map<Character, Integer> contagemCrua = new HashMap<>();
        for (char c : texto.toCharArray()) {
            // O método getOrDefault ajuda a incrementar o contador de forma limpa e segura
            contagemCrua.put(c, contagemCrua.getOrDefault(c, 0) + 1);
        }

        // 2. Passo: Ordenar o mapa com base nos valores (frequência) de forma decrescente
        // Usamos Streams e LinkedHashMap para fixar e preservar a ordem da ordenação
        return contagemCrua.entrySet()
                .stream()
                .sorted((item1, item2) -> item2.getValue().compareTo(item1.getValue())) // Compara de forma invertida para decrescente
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (valorAntigo, valorNovo) -> valorAntigo,
                        LinkedHashMap::new // Mantém a ordem estrita da ordenação no mapa de retorno
                ));
    }
}