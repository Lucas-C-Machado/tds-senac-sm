package Aula04_estruturasRepeticao;

import java.util.Scanner;

public class exercicio08 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        
        int opcao;
        double saldoInicial = 1000;
        
        do {
            System.out.println("=== CAIXA ELETRONICO ===");
            System.out.println("|| 1 -   Ver saldo    ||");
            System.out.println("|| 2 -     Sacar      ||");
            System.out.println("|| 3 -   Depositar    ||");
            System.out.println("|| 4 -     Sair       ||");
            System.out.println("========================");
            
            System.out.println("Escolha uma das opcoes acima: ");
            opcao = entrada.nextInt();
            
            if (opcao == 1){
                System.out.println("Seu saldo atual e de: R$ " + saldoInicial);
            } else if (opcao == 2){
                System.out.println("Quanto voce deseja sacar? ");
                int sacar = entrada.nextInt();
                    while (sacar > saldoInicial) {
                        System.out.println("[ERRO] Saldo insuficiente!");
                        System.out.println("Seu saldo maximo para saque e de: R$ " + saldoInicial);
                        System.out.println("Por favor, digite um valor valido: ");
                        sacar = entrada.nextInt(); 
                    }
                    saldoInicial -= sacar;
                    System.out.println("Saque realizado com sucesso!");
                    System.out.println("Seu saldo atual e de: R$ " + saldoInicial);
            } else if (opcao == 3){
                System.out.println("Seu saldo atual e de: R$ " + saldoInicial);
                System.out.println("Quanto voce deseja depositar? ");
                int depositar = entrada.nextInt();
                saldoInicial += depositar;
                System.out.println("Seu saldo atual e de: R$ " + saldoInicial);
            } else if (opcao == 4){
                System.out.println("Saindo do sistema...");
            } else {
                System.out.println("Opcao invalida!");
            }
            
        } while(opcao != 4);
            System.out.println("Obrigado por ter utilizado o CAIXA ELETRONICO do Luscas");
        entrada.close();
    }
}
