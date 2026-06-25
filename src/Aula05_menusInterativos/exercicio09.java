package Aula05_menusInterativos;

import java.util.Scanner;

public class exercicio09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String continuar = "SIM";

        System.out.println("=================================================");
        System.out.println("          SISTEMA DE TRIAGEM HOSPITALAR          ");
        System.out.println("=================================================");

        while (continuar.equals("SIM")) {
            // REQUISITO: Impedir quebra do sistema se digitarem texto no lugar de números
            try {
                System.out.println("\n--- NOVA TRIAGEM ---");
                
                System.out.print("Nome do paciente: ");
                String nome = teclado.nextLine();

                System.out.print("Idade do paciente: ");
                int idade = teclado.nextInt();

                System.out.print("Nivel da dor (0 a 10): ");
                int dor = teclado.nextInt();
                teclado.nextLine(); // Limpa o buffer do teclado

                // Validação lógica do intervalo da dor
                if (dor < 0 || dor > 10) {
                    System.out.println("\n️ AVISO: O nivel da dor deve ser entre 0 e 10. Refaca a triagem.");
                    continue;
                }

                // REQUISITO: Atendimento prioritário quando idade >= 60 OU dor >= 8
                boolean ehPrioritario = (idade >= 60) || (dor >= 8);

                System.out.println("\n-------------------------------------------------");
                System.out.println("PACIENTE TRIADO:");
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade + " anos | Nivel de Dor: " + dor);
                
                if (ehPrioritario) {
                    System.out.println("CLASSIFICACAO: FAIXA VERMELHA - PRIORITARIO");
                } else {
                    System.out.println("CLASSIFICACAO: FAIXA VERDE - NORMAL");
                }
                System.out.println("-------------------------------------------------");

            } catch (Exception e) {
                // PROBLEMA RELATADO: Sistema trava quando digitam texto no lugar de número
                System.out.println("\n ERRO CRITICO: Entrada invalida detectada!");
                System.out.println("Voce digitou texto em um campo que exigia um numero inteiro.");
                System.out.println("O sistema interceptou a falha com sucesso. Tente novamente.");
                teclado.nextLine(); // Limpa completamente o buffer para evitar loop infinito
                continue;
            }

            System.out.print("\nDeseja realizar outra triagem? (SIM ou NAO): ");
            continuar = teclado.nextLine().trim().toUpperCase();
        }

        System.out.println("\nSistema hospitalar finalizado.");
        teclado.close();
    }
}