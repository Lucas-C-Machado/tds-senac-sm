package Aula11_funcoesMetodosPT2;

public class exercicio09 {
    // Objetivo: Montar a certidão final recebendo todas as variáveis construídas na caminhada
    public static void emitirContratoFinal(String nome, int matricula, String resultadoVaga, long tokenConfirmacao) {
        System.out.println("\n=================================================");
        System.out.println("          CONTRATO DE MATRICULA EMITIDO          ");
        System.out.println("=================================================");
        System.out.println("Estudante: " + nome.toUpperCase());
        System.out.println("Matricula RA: " + matricula);
        System.out.println("Situacao Financeira: " + resultadoVaga);
        System.out.println("Codigo Verificador (13 Digitos): " + tokenConfirmacao);
        System.out.println("-------------------------------------------------");
        System.out.println("Status: PRONTO PARA INICIO DAS AULAS.");
        System.out.println("=================================================");
    }
}