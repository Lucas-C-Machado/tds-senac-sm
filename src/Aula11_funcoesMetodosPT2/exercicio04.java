package Aula11_funcoesMetodosPT2;

import java.util.Scanner;

public class exercicio04 {
    // Objetivo: Coletar e retornar o número identificador do aluno
    public static int coletarMatricula() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o numero de matricula gerado pelo vestibular: ");
        int matricula = entrada.nextInt();
        entrada.nextLine(); // Limpa o buffer do Enter para os próximos arquivos de texto
        return matricula;
    }
}