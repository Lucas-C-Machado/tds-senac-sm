package Aula05_menusInterativos;

import java.util.Scanner;

public class desafioPratico02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        double totalGeral = 0.0;
        String extratoItens = ""; // Armazena a listagem de itens para o cupom fiscal

        System.out.println("=================================================");
        System.out.println("       DESAFIO 02 - CAIXA DE MERCADO SENAC       ");
        System.out.println("=================================================");

        // REQUISITO: Menu dinâmico (1 - Registrar, 2 - Ver Total, 3 - Finalizar)
        while (opcao != 3) {
            System.out.println("\n--- OPERACAO DE CAIXA ---");
            System.out.println("1 - Registrar produto");
            System.out.println("2 - Ver total");
            System.out.println("3 - Finalizar compra");
            System.out.print("Escolha uma opcao: ");

            // Validação de entrada do menu contra textos/caracteres inválidos
            if (!teclado.hasNextInt()) {
                System.out.println("\n ERRO: Opcao invalida! Selecione um numero de 1 a 3.");
                teclado.next(); // Limpa buffer
                continue;
            }

            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.println("\n--- REGISTRO DE MERCADORIA ---");
                    System.out.print("Nome do produto: ");
                    String nomeProduto = teclado.nextLine();

                    // CORREÇÃO DO PROBLEMA: Impedir preços negativos ou textos
                    double preco = -1.0;
                    while (preco < 0) {
                        System.out.print("Preco unitario: R$ ");
                        if (!teclado.hasNextDouble()) {
                            System.out.println("Erro: Insira um valor numerico valido para o preco.");
                            teclado.next(); // Limpa buffer
                            continue;
                        }
                        preco = teclado.nextDouble();
                        if (preco < 0) {
                            System.out.println("REGRA DE NEGOCIO: O preco nao pode ser negativo!");
                        }
                    }

                    // REQUISITO: Quantidade mínima = 1 (impede zero ou negativos)
                    int quantidade = 0;
                    while (quantidade < 1) {
                        System.out.print("Quantidade: ");
                        if (!teclado.hasNextInt()) {
                            System.out.println("Erro: A quantidade deve ser um numero inteiro.");
                            teclado.next(); // Limpa buffer
                            continue;
                        }
                        quantidade = teclado.nextInt();
                        if (quantidade < 1) {
                            System.out.println("REGRA DE NEGOCIO: A quantidade minima deve ser de pelo menos 1 item!");
                        }
                    }
                    teclado.nextLine(); // Limpa buffer pós-leitura numérica

                    // Cálculo do subtotal do item registrado
                    double subtotalItem = preco * quantidade;
                    totalGeral += subtotalItem;

                    // Salva o produto na string de histórico do cupom
                    extratoItens += String.format("- %s x%d (Un: R$ %.2f) -> Subtotal: R$ %.2f\n", 
                            nomeProduto, quantidade, preco, subtotalItem);

                    System.out.printf("\n %d unidade(s) de [%s] adicionada(s) com sucesso!\n", quantidade, nomeProduto);
                    break;

                case 2:
                    // REQUISITO: Opção de visualizar o total parcial acumulado
                    System.out.println("\n-----------------------------------------");
                    System.out.println("          SALDO PARCIAL DO CAIXA         ");
                    System.out.println("-----------------------------------------");
                    System.out.printf("Valor acumulado ate o momento: R$ %.2f\n", totalGeral);
                    System.out.println("-----------------------------------------");
                    break;

                case 3:
                    // REQUISITO: Finalizar compra e exibir os dados finais calculados automaticamente
                    System.out.println("\n=========================================");
                    System.out.println("         CUPOM FISCAL ENVIADO           ");
                    System.out.println("=========================================");
                    if (extratoItens.isEmpty()) {
                        System.out.println("(Nenhum produto foi registrado nesta venda)");
                    } else {
                        System.out.print(extratoItens);
                    }
                    System.out.println("-----------------------------------------");
                    System.out.printf("VALOR TOTAL FINALIZADO: R$ %.2f\n", totalGeral);
                    System.out.println("=========================================");
                    System.out.println("Caixa fechado de forma estavel.");
                    break;

                default:
                    System.out.println("\n Erro: Comando inexistente. Escolha 1, 2 ou 3.");
                    break;
            }
        }

        teclado.close();
    }
}