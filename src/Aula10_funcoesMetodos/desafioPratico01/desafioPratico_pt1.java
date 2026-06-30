package Aula10_funcoesMetodos.desafioPratico01;

import java.util.Scanner;

public class desafioPratico_pt1 {

    // Scanner global para leitura dos dados de forma limpa
    static Scanner teclado = new Scanner(System.in);

    // Controle do fluxo principal do programa
    public static void executarSistema() {
        int opcao;
        do {
            // Invoca a função exigida no Desafio Parte 1
            exibirMenuBiblioteca();
            
            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa o buffer do teclado após ler o número

            switch (opcao) {
                case 1:
                    System.out.println("\n[Sistema] Entrando na rotina de: Cadastrar livro...");
                    // Próxima parte: invocar o método de cadastro aqui
                    break;
                case 2:
                    System.out.println("\n[Sistema] Entrando na rotina de: Consultar livro...");
                    break;
                case 3:
                    System.out.println("\n[Sistema] Entrando na rotina de: Emprestar livro...");
                    break;
                case 4:
                    System.out.println("\n[Sistema] Entrando na rotina de: Devolver livro...");
                    break;
                case 5:
                    System.out.println("\n[Sistema] Gerando Relatório Geral...");
                    break;
                case 6:
                    System.out.println("\nEncerrando o Sistema Bibliotecário. Até logo! 📚");
                    break;
                default:
                    System.out.println("\n⚠️ Opção inválida! Selecione um número de 1 a 6.");
            }
        } while (opcao != 6);
    }

    /**
     * DESAFIO 01 - PARTE 1
     * Método responsável exclusivamente pela renderização das opções do menu.
     */
    public static void exibirMenuBiblioteca() {
        System.out.println("\n=================================================");
        System.out.println("          DESAFIO 01 - SISTEMA BIBLIOTECÁRIO     ");
        System.out.println("=================================================");
        System.out.printf(" %-25s %-25s %n", "1. Cadastrar livro", "4. Devolver livro");
        System.out.printf(" %-25s %-25s %n", "2. Consultar livro", "5. Relatório");
        System.out.printf(" %-25s %-25s %n", "3. Emprestar livro", "6. Sair");
        System.out.println("=================================================");
        System.out.print("Escolha uma opção: ");
    }
}