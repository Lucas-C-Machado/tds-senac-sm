package Aula05_menusInterativos;

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        
        // REQUISITO: Saldo inicial de R$ 1000,00
        double saldo = 1000.00;

        System.out.println("=================================================");
        System.out.println("                CAIXA ELETRONICO BANCO           ");
        System.out.println("=================================================");

        // REQUISITO: O sistema deve continuar funcionando até sair (Opção 4)
        while (opcao != 4) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma operacao: ");

            // CORREÇÃO DO PROBLEMA: Impede falhas se o usuário digitar textos/letras
            if (!teclado.hasNextInt()) {
                System.out.println("\n Entrada invalida! Use apenas os numeros de 1 a 4 para selecionar a opcao.");
                teclado.next(); // Limpa a entrada inválida do buffer
                continue; // Volta para o início do menu
            }

            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    // REQUISITO: Ver saldo / Mensagens amigáveis
                    System.out.println("\n-----------------------------------------");
                    System.out.printf("Ola! Seu saldo atual esta em: R$ %.2f\n", saldo);
                    System.out.println("-----------------------------------------");
                    break;

                case 2:
                    System.out.println("\n--- OPERACAO DE SAQUE ---");
                    System.out.print("Digite o valor que deseja sacar: R$ ");
                    
                    while (!teclado.hasNextDouble()) {
                        System.out.println("Valor invalido! Por favor, digite um valor numerico.");
                        System.out.print("Digite o valor que deseja sacar: R$ ");
                        teclado.next();
                    }
                    double valorSaque = teclado.nextDouble();
                    teclado.nextLine(); // Limpa buffer

                    // Validação para evitar saques negativos ou zerados
                    if (valorSaque <= 0) {
                        System.out.println("\n Operacao cancelada: O valor do saque deve ser maior que zero.");
                    } 
                    // CORREÇÃO DO PROBLEMA: Saque não pode ultrapassar o saldo
                    else if (valorSaque > saldo) {
                        System.out.println("\n Saque Recusado: Saldo insuficiente.");
                        System.out.printf("Voce tentou sacar R$ %.2f, mas seu saldo disponivel e de R$ %.2f.\n", valorSaque, saldo);
                    } else {
                        saldo -= valorSaque; // Deduz do saldo total
                        System.out.println("\n Saque realizado com sucesso! Retire seu dinheiro na boca do caixa.");
                        System.out.printf("Saldo atual remanescente: R$ %.2f\n", saldo);
                    }
                    break;

                case 3:
                    System.out.println("\n--- OPERACAO DE DEPOSITO ---");
                    System.out.print("Digite o valor do depósito: R$ ");
                    
                    while (!teclado.hasNextDouble()) {
                        System.out.println("Valor invalido! Por favor, digite um valor numerico.");
                        System.out.print("Digite o valor do deposito: R$ ");
                        teclado.next();
                    }
                    double valorDeposito = teclado.nextDouble();
                    teclado.nextLine(); // Limpa buffer

                    // REQUISITO: Depósito aumenta saldo (deve ser um valor positivo)
                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        System.out.println("\n Deposito processado! O envelope foi recebido e creditado.");
                        System.out.printf("Seu novo saldo atualizado e: R$ %.2f\n", saldo);
                    } else {
                        System.out.println("\n Operacao invalida: O valor do deposito precisa ser maior que zero.");
                    }
                    break;

                case 4:
                    // Opção de saída limpa
                    System.out.println("\n=========================================");
                    System.out.println("   Sessao encerrada de forma segura.     ");
                    System.out.println("   Obrigado por utilizar nossos servicos! ");
                    System.out.println("=========================================");
                    break;

                default:
                    // CORREÇÃO DO PROBLEMA: Tratamento para opções numéricas inválidas fora do menu (ex: 9 ou -1)
                    System.out.println("\n Opcao incorreta! Por favor, escolha uma opcao existente entre 1 e 4.");
                    break;
            }
        }

        teclado.close();
    }
}