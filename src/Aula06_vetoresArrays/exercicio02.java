package Aula06_vetoresArrays;

import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] alunos = new String[5];

        System.out.println("=================================================");
        System.out.println("          SISTEMA DE LISTAGEM DE ALUNOS          ");
        System.out.println("=================================================");
        System.out.println();

        // Fase de Entrada (Requisito do Exercício 01 para popular o vetor)
        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            alunos[i] = teclado.nextLine();
        }

        System.out.println("\n-------------------------------------------------");
        System.out.println("               ALUNOS CADASTRADOS                ");
        System.out.println("-------------------------------------------------");

        // REQUISITO: Utilizar o for para percorrimento e exibição organizada
        for (int i = 0; i < alunos.length; i++) {
            // "i + 1" garante a exibição amigável (Aluno 1, Aluno 2...) sem alterar o índice real 0, 1...
            System.out.printf("Aluno %d: %s\n", (i + 1), alunos[i]);
        }
        
        System.out.println("-------------------------------------------------");

        teclado.close();
    }
}