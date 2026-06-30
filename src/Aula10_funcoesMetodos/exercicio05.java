package Aula10_funcoesMetodos;

public class exercicio05 {

    public static String validarMatricula(String matricula) {
        // Cláusula de Guarda: Trata o pior cenário primeiro (Nulo ou Vazio)
        // O método .trim() garante que espaços em branco não passem como preenchidos
        if (matricula == null || matricula.trim().isEmpty()) {
            return "Matricula invalida";
        }

        // Se passou da guarda, o fluxo está limpo e preenchido
        return "Valida";
    }
}