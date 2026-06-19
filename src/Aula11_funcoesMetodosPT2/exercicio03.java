package Aula11_funcoesMetodosPT2;

import java.util.Scanner;

public class exercicio03 {
    // Objetivo: Coletar e retornar o nome limpo do estudante
    public static String coletarNome() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n--- PASSO 1: DADOS CADASTRAIS ---");
        System.out.print("Digite o nome completo do candidato: ");
        String nomeCompleto = entrada.nextLine();
        return nomeCompleto;
    }
}