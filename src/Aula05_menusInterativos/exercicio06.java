package Aula05_menusInterativos;

import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcaoMenu = 0;

        System.out.println("=================================================");
        System.out.println("          SISTEMA DE BILHETERIA - CINEMA         ");
        System.out.println("=================================================");

        // REQUISITO: Continuar funcionando até encerrar (Opção 4 simulada para sair)
        while (opcaoMenu != 2) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1 - Vender Ingresso");
            System.out.println("2 - Fechar Sistema");
            System.out.print("Escolha uma opcao: ");

            if (!teclado.hasNextInt()) {
                System.out.println("\n ERRO: Opcao invalida! Use apenas numeros.");
                teclado.next();
                continue;
            }
            opcaoMenu = teclado.nextInt();
            teclado.nextLine(); // Limpa buffer

            if (opcaoMenu == 2) {
                System.out.println("\nEncerrando sistema da bilheteria. Bom filme!");
                break;
            } else if (opcaoMenu != 1) {
                System.out.println("\n Opcao inexistente! Escolha 1 ou 2.");
                continue;
            }

            // REQUISITO: O sistema deve perguntar Nome, Idade e Filme Escolhido
            System.out.println("\n--- NOVA VENDA ---");
            System.out.print("Nome do cliente: ");
            String nome = teclado.nextLine();

            System.out.print("Idade do cliente: ");
            while (!teclado.hasNextInt()) {
                System.out.println("Erro: Digite uma idade valida (numero inteiro).");
                System.out.print("Idade do cliente: ");
                teclado.next();
            }
            int idade = teclado.nextInt();
            teclado.nextLine(); // Limpa buffer

            System.out.println("\nFILMES DISPONIVEIS (CLASSIFICACAO):");
            System.out.println("1 - Filme A (Classificacao: Livre)");
            System.out.println("2 - Filme B (Classificacao: 14 anos)");
            System.out.println("3 - Filme C (Classificacao: 18 anos)");
            System.out.print("Selecione o número do filme desejado: ");

            while (!teclado.hasNextInt()) {
                System.out.println("Erro: Escolha o filme digitando 1, 2 ou 3.");
                System.out.print("Selecione o número do filme desejado: ");
                teclado.next();
            }
            int filmeEscolhido = teclado.nextInt();
            teclado.nextLine(); // Limpa buffer

            boolean acessoPermitido = false;
            String nomeFilme = "";
            String classificacaoText = "";

            // REQUISITO: Impedir compra para idade incompatível
            switch (filmeEscolhido) {
                case 1:
                    nomeFilme = "Filme A";
                    classificacaoText = "Livre";
                    acessoPermitido = true; // Livre: qualquer idade pode assistir
                    break;
                case 2:
                    nomeFilme = "Filme B";
                    classificacaoText = "14 anos";
                    acessoPermitido = (idade >= 14);
                    break;
                case 3:
                    nomeFilme = "Filme C";
                    classificacaoText = "18 anos";
                    acessoPermitido = (idade >= 18);
                    break;
                default:
                    System.out.println("\n ERRO: Codigo de filme invalido! Operacao abortada.");
                    continue;
            }

            // REQUISITO: Mostrar mensagens claras
            System.out.println("\n-------------------------------------------------");
            System.out.println("PROCESSANDO EMISSAO DE INGRESSO...");
            System.out.println("Cliente: " + nome + " (" + idade + " anos)");
            System.out.println("Filme: " + nomeFilme + " [Classificacao: " + classificacaoText + "]");
            System.out.println("-------------------------------------------------");

            if (acessoPermitido) {
                System.out.println("[VENDA AUTORIZADA] - Imprimindo ingresso...");
                System.out.println("Tenha uma excelente sessao!");
            } else {
                // CORREÇÃO DO PROBLEMA: Crianças tentando comprar filmes proibidos são barradas aqui
                System.out.println("[VENDA BARRADA] - Idade incompativel!");
                System.out.println("Motivo: O cliente não possui a idade minima de " + classificacaoText + ".");
            }
            System.out.println("-------------------------------------------------");
        }

        teclado.close();
    }
}