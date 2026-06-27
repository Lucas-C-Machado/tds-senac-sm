package Aula08_revisaoPT2.estruturasCondicionais.maquinaCodagem;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class verificadorPalindromo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=================================================");
        System.out.println("        MAQUINA DE CODAGEM - REVISAO 02          ");
        System.out.println("            VERIFICADOR DE PALINDROMOS           ");
        System.out.println("=================================================");

        // Testes rápidos automáticos para demonstração em aula (Exemplos do Slide)
        System.out.println("\n Executando Testes de Logica Base:");
        testarExemplo("Arara");
        testarExemplo("Java");
        
        // O Teste de fogo proposto na lâmina
        System.out.println("\n Executando o Teste de Fogo:");
        testarExemplo("A cara rajada da jararaca.");

        // Interação com o usuário/aluno
        System.out.println("\n-------------------------------------------------");
        System.out.print("Sua vez! Digite uma palavra ou frase para testar: ");
        String entradaUsuario = teclado.nextLine();

        if (ehPalindromo(entradaUsuario)) {
            System.out.println("E UM PALINDROMO!");
        } else {
            System.out.println("NAO E UM PALINDROMO!");
        }

        teclado.close();
    }

    /**
     * REQUISITO DO ENUNCIADO: Método que recebe uma String e retorna um boolean
     * indicando se ela é um palíndromo, tratando o bônus de acentuações e pontuações.
     */
    public static boolean ehPalindromo(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return false;
        }

        // 1. LIMPEZA DE DADOS (BÔNUS): Remove acentos usando a biblioteca padrão do Java
        String textoSemAcento = Normalizer.normalize(texto, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        String textoLimpo = pattern.matcher(textoSemAcento).replaceAll("");

        // 2. REQUISITO: Desconsiderar maiúsculas/minúsculas e espaços/pontuações
        // [^a-zA-Z0-9] remove tudo o que NÃO for letra ou número (pontuação, espaços, símbolos)
        textoLimpo = textoLimpo.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Se após a limpeza a string ficou vazia, não há o que validar
        if (textoLimpo.isEmpty()) {
            return false;
        }

        // 3. LÓGICA DE COMPARAÇÃO (De trás para frente)
        int esquerda = 0;
        int direita = textoLimpo.length() - 1;

        // Estrutura de repetição em direção ao centro da palavra
        while (esquerda < (direita)) {
            if (textoLimpo.charAt(esquerda) != textoLimpo.charAt(direita)) {
                return false; // Quebrou a regra, não é palíndromo
            }
            esquerda++;
            direita--;
        }

        return true; // Passou em todas as posições
    }

    /**
     * Método auxiliar apenas para automatizar os prints dos testes em sala de aula
     */
    private static void testarExemplo(String frase) {
        boolean resultado = ehPalindromo(frase);
        System.out.printf("Entrada: \"%-30s\" -> Retorno Esperado: %-5s | Obtido: %b\n", 
                frase, (frase.contains("Java") ? "false" : "true"), resultado);
    }
}