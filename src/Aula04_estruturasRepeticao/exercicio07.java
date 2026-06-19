package Aula04_estruturasRepeticao;

import java.util.Scanner;

public class exercicio07 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        
        int opcao;
        
        do{
            System.out.println("=== SISTEMA DE ESTACIONAMNETO ===");
            System.out.println("|| 1 -   Cadastrar veiculo     ||");
            System.out.println("|| 2 -   Encerrar sistema      ||");
            System.out.println("=================================");

            System.out.println("Escolha uma opcao acima: ");
            opcao = entrada.nextInt();
            entrada.nextLine(); //buffer

            if (opcao == 1){
                System.out.println("Digite a sua placa: ");
                String placa = entrada.nextLine();

                System.out.println("Qual o seu nome? ");
                String nome = entrada.nextLine();

                System.out.println("Dados cadastrados com sucesso!");
                System.out.println("Placa: " + placa);
                System.out.println("Nome: " + nome);
            } else if (opcao == 2){
                System.out.println("Sistema encerrado...");
            } else {
                System.out.println("Opcao invalida!");
            }
        } while(opcao != 2);
            System.out.println("Obrigado por utilizar o SISTEMA DE ESTACIONAMENTO DO LUSCAS");
        entrada.close();
    }
}
