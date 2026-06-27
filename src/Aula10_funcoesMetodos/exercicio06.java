package Aula10_funcoesMetodos;

public class exercicio06 {
    public static String liberarEntrada(String statusMatricula) {
        if ("Válida".equalsIgnoreCase(statusMatricula)) {
            return "Entrada liberada";
        }
        return "Entrada negada";
    }
}
