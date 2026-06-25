package Aula05_menusInterativos;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String continuar = "SIM";

        System.out.println("=================================================");
        System.out.println("       SISTEMA DE CONTROLE DE ACESSO - ACADEMIA  ");
        System.out.println("=================================================");

        // Laço para permitir testar múltiplos alunos consecutivamente
        while (continuar.equals("SIM")) {
            System.out.println("\n--- CONTROLE DE PORTARIA ---");
            
            System.out.print("Nome do aluno: ");
            String nome = teclado.nextLine();

            System.out.print("Idade do aluno: ");
            // Validação para garantir que a idade seja um número inteiro
            while (!teclado.hasNextInt()) {
                System.out.println("Erro: Digite uma idade valida (numero inteiro).");
                System.out.print("Idade do aluno: ");
                teclado.next();
            }
            int idade = teclado.nextInt();
            teclado.nextLine(); // Limpa o buffer do teclado

            System.out.print("Mensalidade paga? (SIM ou NAO): ");
            String mensalidadePaga = teclado.nextLine().trim().toUpperCase();

            // Validação para aceitar apenas SIM ou NAO
            while (!mensalidadePaga.equals("SIM") && !mensalidadePaga.equals("NAO")) {
                System.out.println("Opcao invalida! Responda apenas com 'SIM' ou 'NAO'.");
                System.out.print("Mensalidade paga? (SIM ou NAO): ");
                mensalidadePaga = teclado.nextLine().trim().toUpperCase();
            }

            // CORREÇÃO DO PROBLEMA: O uso do operador && garante que 
            // NINGUÉM entra sem pagar E nem menores de idade (menores de 16).
            boolean temIdadePermitida = idade >= 16;
            boolean temMensalidadeEmDia = mensalidadePaga.equals("SIM");

            System.out.println("\n-------------------------------------------------");
            System.out.println("RESULTADO DA VERIFICACAO:");
            System.out.println("Aluno(a): " + nome);

            if (temIdadePermitida && temMensalidadeEmDia) {
                // ✅ REQUISITO: Entrada liberada
                System.out.println("[ACESSO LIBERADO] - Seja bem-vindo a academia!");
            } else {
                // ❌ REQUISITO: Entrada negada
                System.out.println("[ACESSO NEGADO] - Motivo(s):");
                
                if (!temIdadePermitida) {
                    System.out.println("   -> Aluno possui menos de 16 anos (Idade atual: " + idade + ")");
                }
                if (!temMensalidadeEmDia) {
                    System.out.println("   -> Pendencia financeira (Mensalidade em aberto)");
                }
            }
            System.out.println("-------------------------------------------------");

            // Pergunta se deseja continuar o loop de testes
            System.out.print("\nDeseja verificar outro aluno? (SIM ou NAO): ");
            continuar = teclado.nextLine().trim().toUpperCase();
            
            while (!continuar.equals("SIM") && !continuar.equals("NAO")) {
                System.out.print("Por favor, responda apenas com 'SIM' ou 'NAO': ");
                continuar = teclado.nextLine().trim().toUpperCase();
            }
        }

        System.out.println("\nSistema de portaria encerrado. Ate mais!");
        teclado.close();
    }
}