package Aula05_menusInterativos;

import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        double totalPedido = 0.0;

        System.out.println("=================================================");
        System.out.println("          SISTEMA DE DELIVERY - HAMBURGUERIA     ");
        System.out.println("=================================================");

        // REQUISITO: Permitir múltiplos pedidos até escolher a opção 4 (Finalizar)
        while (opcao != 4) {
            System.out.println("\n--- CARDAPIO / MENU ---");
            System.out.println("1 - Hamburguer  -> R$ 25,00");
            System.out.println("2 - Pizza       -> R$ 40,00");
            System.out.println("3 - Refrigerante -> R$ 8,00");
            System.out.println("4 - Finalizar pedido");
            System.out.print("Escolha uma opcao: ");

            // PROTEÇÃO CONTRA PROBLEMA: Impede travamento se o usuário digitar TEXTO
            if (!teclado.hasNextInt()) {
                System.out.println("\nERRO: Entrada invalida! Digite apenas os numeros do menu (1 a 4).");
                teclado.next(); // Descarta a entrada incorreta (o texto) do buffer
                continue; // Reinicia o laço do menu
            }

            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa o buffer do teclado

            // PROCESSAMENTO DAS OPÇÕES
            switch (opcao) {
                case 1:
                    totalPedido += 25.00;
                    System.out.println("\n Hamburguer adicionado com sucesso!");
                    // REQUISITO: Mostrar valor parcial após cada pedido
                    System.out.printf("Valor parcial do pedido: R$ %.2f\n", totalPedido);
                    break;

                case 2:
                    totalPedido += 40.00;
                    System.out.println("\n Pizza adicionada com sucesso!");
                    System.out.printf("Valor parcial do pedido: R$ %.2f\n", totalPedido);
                    break;

                case 3:
                    totalPedido += 8.00;
                    System.out.println("\n Refrigerante adicionado com sucesso!");
                    System.out.printf("Valor parcial do pedido: R$ %.2f\n", totalPedido);
                    break;

                case 4:
                    // REQUISITO: Calcular total da compra ao finalizar
                    System.out.println("\n=========================================");
                    System.out.println("           PEDIDO FINALIZADO             ");
                    System.out.println("=========================================");
                    System.out.printf("TOTAL DA COMPRA: R$ %.2f\n", totalPedido);
                    System.out.println("Obrigado pela preferencia e bom apetite!");
                    System.out.println("=========================================");
                    break;

                default:
                    // PROTEÇÃO CONTRA PROBLEMA: Impede números inválidos como 9 ou -1
                    System.out.println("\n ERRO: Opcao inexistente! Escolha um numero de 1 a 4.");
                    break;
            }
        }

        teclado.close();
    }
}