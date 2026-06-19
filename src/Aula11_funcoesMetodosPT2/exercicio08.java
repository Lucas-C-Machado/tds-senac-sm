package Aula11_funcoesMetodosPT2;

public class exercicio08 {
    // Objetivo: Analisar se o token gerado pertence à matriz regional através do fatiamento do texto
    public static void validarRegionalMatriz(long token) {
        String tokenTexto = Long.toString(token);
        
        // Captura os 3 primeiros dígitos do código de 13 dígitos
        String prefixo = tokenTexto.substring(0, 3);
        
        System.out.println("\n--- AUDITORIA DE SEGURANCA INTERNA ---");
        System.out.println("Token Analisado: " + tokenTexto);
        System.out.println("Prefixo da Unidade: " + prefixo);
        
        // Simulação: se o token gerado aleatoriamente começar com números pares/específicos, homologa
        if (prefixo.startsWith("1") || prefixo.startsWith("2") || prefixo.startsWith("3")) {
            System.out.println("[AUDITORIA] Unidade Matriz Confirmada. Processo Seguro.");
        } else {
            System.out.println("[AUDITORIA] Unidade Conveniada/Polo Externo Detectado.");
        }
    }
}