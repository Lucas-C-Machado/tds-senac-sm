package Aula04_estruturasRepeticao;

import java.util.Scanner;

public class exercicio04 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        
        int opcao;
        
        do {
            System.out.println("==== CADASTRO DE NOMES ====");
            System.out.println("|| 1-  Cadastrar um nome ||");
            System.out.println("|| 2-  Encerrar sistema  ||");
            System.out.println("===========================");
            
            System.out.println("Escolha uma das opcoes acima: ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            if (opcao == 1){
                System.out.println("Digite um nome: ");
                String nome = entrada.nextLine();
                System.out.println(nome + " voce foi cadastrado(a) com sucesso!");
            } else if (opcao == 2){
                System.out.println("Encerrando o sistema...");
            } else {
                System.out.println("Opcao invalida!");
            }
            
        } while(opcao != 2);
            System.out.println("Obrigado por ter utilizado o Sistema de Cadastramento do Luscas, volte sempre!");
        entrada.close();
    }
}
