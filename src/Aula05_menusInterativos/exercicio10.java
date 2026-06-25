package Aula05_menusInterativos;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        double totalCompra = 0.0;

        System.out.println("=================================================");
        System.out.println("          SISTEMA DE CAIXA - MERCADO             ");
        System.out.println("=================================================");

        // REQUISITO: Permitir vários produtos até que a compra seja finalizada (Opção 2)
        while (opcao != 2) {
            System.out.println("\n--- MENU DO CAIXA ---");
            System.out.println("1 - Registrar produto");
            System.out.println("2 - Finalizar compra");
            System.out.print("Escolha uma opcao: ");

            // CORREÇÃO DO PROBLEMA: Proteção contra opções inválidas de texto no menu
            if (!teclado.hasNextInt()) {
                System.out.println("\n ERRO: Opcao invalida! Digite apenas o numero 1 ou 2.");
                teclado.next(); // Limpa o valor incorreto do buffer
                continue;
            }

            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.println("\n--- REGISTRO DE ITEM ---");
                    System.out.print("Nome do produto: ");
                    String nomeProduto = teclado.nextLine();

                    System.out.print("Preco do produto: R$ ");
                    // CORREÇÃO DO PROBLEMA: Validação contra valores inválidos (texto no preço)
                    while (!teclado.hasNextDouble()) {
                        System.out.println("Preco invalido! Por favor, digite um valor numerico valido.");
                        System.out.print("Preco do produto: R$ ");
                        teclado.next(); // Limpa a entrada de texto do buffer
                    }
                    double preco = teclado.nextDouble();
                    teclado.nextLine(); // Limpa o buffer pós-double

                    // REQUISITO / CORREÇÃO DO PROBLEMA: Impedir preços negativos
                    if (preco < 0) {
                        System.out.println("\n OPERACAO RECUSADA: O preco do produto nao pode ser negativo!");
                        System.out.println("O item [" + nomeProduto + "] nao foi adicionado ao carrinho.");
                    } else {
                        // REQUISITO: Calcular o total somando os preços (Atribuição cumulativa)
                        totalCompra += preco;
                        System.out.printf("\n [%s] registrado por R$ %.2f com sucesso!\n", nomeProduto, preco);
                        System.out.printf("Subtotal atual do carrinho: R$ %.2f\n", totalCompra);
                    }
                    break;

                case 2:
                    // REQUISITO: Finalizar compra e exibir o total calculado
                    System.out.println("\n=========================================");
                    System.out.println("           CUPOM FISCAL EMITIDO          ");
                    System.out.println("=========================================");
                    System.out.printf("VALOR TOTAL DA COMPRA: R$ %.2f\n", totalCompra);
                    System.out.println("Caixa fechado com sucesso. Pronto para o proximo cliente.");
                    System.out.println("=========================================");
                    break;

                default:
                    System.out.println("\n Opcao inexistente! Digite 1 para registrar um produto ou 2 para fechar o caixa.");
                    break;
            }
        }

        teclado.close();
    }
}