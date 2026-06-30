package Aula10_funcoesMetodos.desafioPratico01;

public class desafioPratico_pt3 {
    /**
     * PARTE 3 — Criar: consultarLivro()
     * Recebe as informações do livro por parâmetro e mostra na tela.
     */
    public static void consultarLivro(String titulo, String autor, String codigo) {
        System.out.println("\n--- INFORMAÇÕES DO LIVRO ---");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + (autor.trim().isEmpty() ? "Não informado" : autor));
        System.out.println("Código: " + codigo);
    }
}