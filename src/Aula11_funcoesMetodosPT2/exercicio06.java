package Aula11_funcoesMetodosPT2;

public class exercicio06 {
    // Objetivo: Classificar o tipo de vaga com base na nota passada por parâmetro
    public static String definirCategoria(double notaFinal) {
        // Lógica de escalonamento acadêmico
        if (notaFinal >= 9.0) {
            return "Bolsa Integral (100% de desconto)";
        } else if (notaFinal >= 7.5) {
            return "Bolsa Parcial (50% de desconto)";
        } else if (notaFinal >= 5.0) {
            return "Vaga Regular (Sem desconto)";
        } else {
            return "Lista de Espera / Classificacao: Nao Aprovada";
        }
    }
}