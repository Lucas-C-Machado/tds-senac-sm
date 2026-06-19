package Aula11_funcoesMetodosPT2;

import java.util.Scanner;

public class exercicio05 {
    // Objetivo: Garantir a entrada de uma nota válida e retorná-la
    public static double coletarNotaVestibular() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a nota final obtida no Vestibular (0.0 a 10.0): ");
        double nota = entrada.nextDouble();
        entrada.nextLine(); // Limpa o buffer
        
        // Bloqueio de segurança
        while (nota < 0.0 || nota > 10.0) {
            System.out.println("[ERRO] Nota impossivel detectada no sistema.");
            System.out.print("Por favor, digite a nota real (0.0 a 10.0): ");
            nota = entrada.nextDouble();
            entrada.nextLine();
        }
        return nota;
    }
}