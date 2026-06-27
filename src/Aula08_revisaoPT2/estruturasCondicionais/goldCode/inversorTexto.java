package Aula08_revisaoPT2.estruturasCondicionais.goldCode;

import java.util.Scanner;

public class inversorTexto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("        MAQUINA DE CODAGEM - REVISAO 02          ");
        System.out.println("                INVERSOR DE TEXTO                ");
        System.out.println("=================================================");

        // Teste rápido automático
        String exemplo = "Senac";
        System.out.println("\nTeste Base de Entrada: \"" + exemplo + "\"");
        System.out.println("Invertido (Nativo): \"" + inverterTextoNativo(exemplo) + "\"");

        // Entrada dinâmica do aluno
        System.out.println("\n-------------------------------------------------");
        System.out.print("Digite uma palavra ou frase para inverter: ");
        String textoUsuario = teclado.nextLine();

        // 1. Abordagem Minimalista utilizando a Dica de Ouro
        String resultadoNativo = inverterTextoNativo(textoUsuario);
        System.out.println("Resultado Ultra-Compacto (StringBuilder): \"" + resultadoNativo + "\"");

        // 2. Abordagem Estruturada Algorítmica (Para comparação em lógica)
        String resultadoManual = inverterTextoManual(textoUsuario);
        System.out.println("Resultado Manual (Laco For):             \"" + resultadoManual + "\"");

        System.out.println("-------------------------------------------------");
        teclado.close();
    }

    /**
     * META: Inverte uma String na menor linha de código possível usando a dica do slide.
     */
    public static String inverterTextoNativo(String texto) {
        if (texto == null) return null;
        
        // Cria o StringBuilder, chama o método nativo .reverse() e converte de volta para String
        return new StringBuilder(texto).reverse().toString();
    }

    /**
     * ALTERNATIVA: Algoritmo estruturado tradicional usando decremento de índice.
     */
    public static String inverterTextoManual(String texto) {
        if (texto == null) return null;

        String acumulador = "";
        // Varre a string de trás para frente preenchendo o novo texto
        for (int i = texto.length() - 1; i >= 0; i--) {
            acumulador += texto.charAt(i);
        }
        return acumulador;
    }
}