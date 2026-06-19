package Aula11_funcoesMetodosPT2;

import java.util.Random;

public class exercicio07 {
    // Objetivo: Gerar um token de autenticidade de 13 dígitos para o processo
    public static long gerarTokenProcesso() {
        Random gerador = new Random();
        long minimo = 1_000_000_000_000L;
        long amplitude = 9_000_000_000_000L;
        
        // Garante que o número gerado será estritamente positivo e terá 13 dígitos
        long token = minimo + (Math.abs(gerador.nextLong()) % amplitude);
        return token;
    }
}