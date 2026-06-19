package Aula04_estruturasRepeticao;

import java.util.Scanner;

public class exercicio05_06 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        
        int opcao;
        int saldo = 3000;
        
        do {
            System.out.println("=== MENU SIMPLES ===");
            System.out.println("|| 1 - Ver saldo  ||");
            System.out.println("|| 2 - Depositar  ||");
            System.out.println("|| 3 -   Sair     ||");
            System.out.println("====================");
            
            System.out.println("Escolha uma das opcoes acima: ");
            opcao = entrada.nextInt();
            
            if (opcao == 1){
                System.out.println("Seu saldo atual e de: R$ " + saldo);
            } else if(opcao == 2){
                System.out.println("Quanto voce deseja depositar? ");
                opcao = entrada.nextInt();
                saldo -= opcao;
                System.out.println("Seu saldo atual e de: R$ " + saldo);
            } else if (opcao == 3){
                System.out.println("Saindo do sistema...");
            } else {
                System.out.println("Opcao invalida!");
            }
            
        } while(opcao != 3);
            System.out.println("Obrigado por ter utilizado o MENU SIMPLES do Luscas");
        entrada.close();
    }
}
