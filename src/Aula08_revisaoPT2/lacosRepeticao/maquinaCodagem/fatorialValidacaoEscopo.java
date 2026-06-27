package Aula08_revisaoPT2.lacosRepeticao.maquinaCodagem;

import java.math.BigInteger;
import java.util.Scanner;

public class fatorialValidacaoEscopo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("        MAQUINA DE CODAGEM - REVISAO 02          ");
        System.out.println("         FATORIAL COM VALIDACAO DE ESCOPO        ");
        System.out.println("=================================================");

        // Teste base automático extraído diretamente do slide (5! = 120)
        System.out.println("\nTeste Base do Slide (Exemplo: 5):");
        System.out.println("Metodo Padrao (long): " + calcularFatorialPrimitivo(5));
        System.out.println("Metodo Bonus (BigInteger): " + calcularFatorialGigante(5));

        // Entrada dinâmica para demonstrar o estouro de escopo
        System.out.println("\n-------------------------------------------------");
        System.out.print("Digite um numero inteiro positivo (ex: 25 para testar o bonus): ");
        int n = teclado.nextInt();

        if (n < 0) {
            System.out.println("Erro: O numero precisa ser positivo!");
        } else {
            System.out.println("\nComparando os resultados na pratica:");
            System.out.println("Resultado com tipo primitivo 'long':      " + calcularFatorialPrimitivo(n));
            System.out.println("Resultado com o bonus 'BigInteger': " + calcularFatorialGigante(n));
        }
        
        System.out.println("-------------------------------------------------");
        teclado.close();
    }

    /**
     * REQUISITO BASE: Calcula o fatorial usando laço for e tipo primitivo.
     * (Apresenta estouro/overflow a partir de N = 21).
     */
    public static long calcularFatorialPrimitivo(int n) {
        long fatorial = 1;
        // Laço for tradicional exigido pelo enunciado
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    /**
     * REQUISITO BÔNUS: Calcula fatoriais gigantescos utilizando BigInteger
     * para mitigar completamente o problema de Memory/Integer Overflow.
     */
    public static BigInteger calcularFatorialGigante(int n) {
        // Inicializa o acumulador BigInteger com o valor 1
        BigInteger fatorial = BigInteger.ONE;

        // Laço for aplicando a multiplicação da classe BigInteger
        for (int i = 1; i <= n; i++) {
            // Converte o índice atual para BigInteger e multiplica pelo acumulador
            fatorial = fatorial.multiply(BigInteger.valueOf(i));
        }
        return fatorial;
    }
}