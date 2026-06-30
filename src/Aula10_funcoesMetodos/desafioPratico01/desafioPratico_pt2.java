package Aula10_funcoesMetodos.desafioPratico01;

import java.util.Scanner;

public class desafioPratico_pt2 {

    // Variáveis globais necessárias para a persistência dos dados da Parte 2
    static String titulo = "";
    static String autor = "";
    static String codigo = "";
    static Scanner teclado = new Scanner(System.in);

    /**
     * PARTE 2 — Criar: cadastrarLivro()
     * Receber: Título, Autor e Código.
     */
    public static void cadastrarLivro() {
        System.out.println("\n--- CADASTRO DE LIVRO ---");

        System.out.print("Digite o título do livro: ");
        titulo = teclado.nextLine();

        System.out.print("Digite o autor do livro: ");
        autor = teclado.nextLine();

        System.out.print("Digite o código do livro: ");
        codigo = teclado.nextLine();

        System.out.println("[Sistema] Dados do livro recebidos com sucesso!");
    }
}