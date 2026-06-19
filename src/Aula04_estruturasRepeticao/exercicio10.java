package Aula04_estruturasRepeticao;

import java.util.Scanner;

public class exercicio10 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        
        int opcao = 0;
        int valorTotal = 0;
        boolean loginSucesso = false; // Variável para controlar se o login deu certo
        
        do {
            System.out.println("Bem-vindo ao Restaurante do Lucas! Antes de prosseguirmos, nos informe o seu Usuario: ");
            String usuario = entrada.nextLine();
            
            System.out.println("Agora a senha: ");
            int senha = entrada.nextInt();
            entrada.nextLine(); //buffer
            
            if (usuario.equals("admin") && senha == 123){
                loginSucesso = true;
                
                while (opcao != 4) {
                    System.out.println("=== SISTEMA COMPLETO DE PEDIDOS ===");
                    System.out.println("|| 1 -  Hamburguer -> R$ 25,00   ||");
                    System.out.println("|| 2 -    Pizza -> R$ 40,00      ||");
                    System.out.println("|| 3 - Refrigerante -> R$ 8,00   ||");
                    System.out.println("|| 4 -      Encerrar pedido       ||");
                    System.out.println("===================================");

                    System.out.println("Escolha uma das opcoes acima: ");
                    opcao = entrada.nextInt();
                    entrada.nextLine(); // Limpa o buffer

                    if (opcao == 1){
                        System.out.println("-> HAMBURGUER adicionado! (R$ 25,00)");
                        valorTotal += 25;
                        System.out.println("Valor total acumulado: R$ " + valorTotal);
                    } else if (opcao == 2){
                        System.out.println("-> PIZZA adicionada! (R$ 40,00)");
                        valorTotal += 40;
                        System.out.println("Valor total acumulado: R$ " + valorTotal);
                    } else if (opcao == 3){
                        System.out.println("-> REFRIGERANTE adicionado! (R$ 8,00)");
                        valorTotal += 8;
                        System.out.println("Valor total acumulado: R$ " + valorTotal);
                    } else if (opcao == 4){
                        System.out.println("Pedido encerrado com sucesso!");
                        System.out.println("O valor total da sua conta ficou em: R$ " + valorTotal);
                    } else {
                        System.out.println("Sem estoque! Por favor, escolha um item valido no menu.");
                    }
                }
                
            } else {
                System.out.println("Nao vai poder comer hoje fio, fazer o que ne. Tente o login novamente.");
            }
            
        } while (!loginSucesso); 
        
        System.out.println("Obrigado por ter realizado o pedido no restaurante do Luscas, volte sempre!");
        entrada.close();
    }
}