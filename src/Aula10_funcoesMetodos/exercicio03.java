package Aula10_funcoesMetodos;

import java.util.Scanner;

public class exercicio03 {
    public static void cadastrarAluno(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("=== CADASTRAR ALUNO ===");
        System.out.println("=======================");
        
        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.println("Digite a sua matricula: ");
        int matricula = entrada.nextInt();
        
        System.out.println("Aluno " + nome + "(Matricula: " + matricula + " cadastrado com sucesso!");
    }
}
