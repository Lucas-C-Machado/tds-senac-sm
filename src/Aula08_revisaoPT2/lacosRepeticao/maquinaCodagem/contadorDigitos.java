package Aula08_revisaoPT2.lacosRepeticao.maquinaCodagem;

import java.util.Scanner;

public class contadorDigitos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("        MAQUINA DE CODAGEM - REVISAO 02          ");
        System.out.println("             O CONTADOR DE DIGITOS               ");
        System.out.println("=================================================");

        // Teste base automático extraído diretamente do slide (14258)
        int exemploSlide = 14258;
        System.out.println("\nTeste Base do Slide (Exemplo: " + exemploSlide + "):");
        int resultadoBase = somarEContarDigitos(exemploSlide);
        System.out.println("Soma Total dos Digitos: " + resultadoBase);

        // Entrada dinâmica para testar o bônus (incluindo números negativos)
        System.out.println("\n-------------------------------------------------");
        System.out.print("Digite um numero inteiro qualquer (positivo ou negativo): ");
        int numeroUsuario = teclado.nextInt();

        System.out.println("\nProcessando informacoes...");
        int somaTotal = somarEContarDigitos(numeroUsuario);
        System.out.println("Soma Total dos Digitos: " + somaTotal);
        System.out.println("-------------------------------------------------");

        teclado.close();
    }

    /**
     * REQUISITO E BÔNUS: Recebe um inteiro, trata o sinal, extrai individualmente
     * os dígitos com 'while', conta pares/ímpares e retorna a soma total.
     */
    public static int somarEContarDigitos(int numero) {
        // REQUISITO BÔNUS: Tratar números negativos transformando-os em positivos
        // para que a operação matemática de resto (%) funcione corretamente.
        int numeroProcessado = Math.abs(numero);

        int soma = 0;
        int pares = 0;
        int impares = 0;

        // Caso especial se o número digitado for exatamente 0
        if (numeroProcessado == 0) {
            pares++;
            System.out.println("Digitos Pares:   " + pares);
            System.out.println("Digitos Impares: " + impares);
            return 0;
        }

        // REQUISITO: Uso estrito do laço while para destrinchar o número
        while (numeroProcessado > 0) {
            int digito = numeroProcessado % 10; // Extrai o último dígito (resto da divisão por 10)
            soma += digito;                     // Acumula na soma total

            // REQUISITO BÔNUS: Identificar e separar pares de ímpares
            if (digito % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            numeroProcessado /= 10; // Remove o último dígito (divisão inteira por 10)
        }

        // REQUISITO BÔNUS: Exibir a contagem no console antes de retornar a soma
        System.out.println("Digitos Pares:   " + pares);
        System.out.println("Digitos Impares: " + impares);

        return soma;
    }
}