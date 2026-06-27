package Aula10_funcoesMetodos;

import java.util.Scanner;

public class exercicio03 {
    public static void cadastrarAluno() {
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = teclado.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        String matriculaAluno = teclado.nextLine();

        // Indica que os dados foram capturados e estão prontos no escopo do sistema
        System.out.println("[Sistema] Aluno cadastrado com sucesso!");
    }
}
