package Aula05_menusInterativos;

import java.util.Scanner;

public class desafioPratico01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        // Variáveis para simular o armazenamento simples do último painel de triagem
        String painelPrioritario = "";
        String painelComum = "";

        System.out.println("=================================================");
        System.out.println("       DESAFIO 01 - TRIAGEM HOSPITALAR SENAC     ");
        System.out.println("=================================================");

        // REQUISITO: O sistema deve permitir o menu interativo até encerrar (Opção 3)
        while (opcao != 3) {
            System.out.println("\n--- MENU DE ATENDIMENTO ---");
            System.out.println("1 - Novo paciente");
            System.out.println("2 - Consultar prioridade");
            System.out.println("3 - Encerra sistema");
            System.out.print("Escolha uma opcao: ");

            // CORREÇÃO DO PROBLEMA: Trava com entradas inválidas (texto no menu)
            if (!teclado.hasNextInt()) {
                System.out.println("\n ERRO: Entrada invalida! Digite apenas números (1, 2 ou 3).");
                teclado.next(); // Descarta a entrada inválida do buffer
                continue;
            }

            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.println("\n--- COLETAR INFORMACOES DO PACIENTE ---");
                    
                    System.out.print("Nome do paciente: ");
                    String nome = teclado.nextLine();

                    // CORREÇÃO DO PROBLEMA: Evitar idades negativas e entradas de texto
                    int idade = -1;
                    while (idade < 0) {
                        System.out.print("Idade: ");
                        try {
                            if (!teclado.hasNextInt()) {
                                System.out.println("Erro: Por favor, digite um numero inteiro para a idade.");
                                teclado.next(); // Limpa buffer
                                continue;
                            }
                            idade = teclado.nextInt();
                            teclado.nextLine(); // Limpa buffer

                            if (idade < 0) {
                                System.out.println("ERRO RELATADO: O sistema nao aceita idades negativas!");
                            }
                        } catch (Exception e) {
                            System.out.println("Erro ao processar dado. Tente novamente.");
                            teclado.nextLine();
                        }
                    }

                    // CORREÇÃO DO PROBLEMA: Evitar dor negativa, acima de 10 e entradas de texto
                    int dor = -1;
                    while (dor < 0 || dor > 10) {
                        System.out.print("Nivel da dor (0 a 10): ");
                        try {
                            if (!teclado.hasNextInt()) {
                                System.out.println("Erro: O nivel da dor deve ser um numero inteiro.");
                                teclado.next(); // Limpa buffer
                                continue;
                            }
                            dor = teclado.nextInt();
                            teclado.nextLine(); // Limpa buffer

                            if (dor < 0 || dor > 10) {
                                System.out.println("ERRO RELATADO: O nivel de dor deve estar estritamente entre 0 e 10!");
                            }
                        } catch (Exception e) {
                            System.out.println("Erro ao processar dado. Tente novamente.");
                            teclado.nextLine();
                        }
                    }

                    // REQUISITO: Regras do hospital para PRIORITÁRIO (idade >= 60 OU dor >= 8)
                    boolean ehPrioritario = (idade >= 60) || (dor >= 8);

                    System.out.println("\n-------------------------------------------------");
                    System.out.println("Triagem salva com sucesso!");
                    System.out.println("Paciente: " + nome + " | Idade: " + idade + " anos | Dor: " + dor);
                    
                    if (ehPrioritario) {
                        System.out.println("Encaminhamento: IMEDIATO (Fila de Prioridade)");
                        painelPrioritario += "[Paciente: " + nome + " | Idade: " + idade + " | Dor: " + dor + "]\n";
                    } else {
                        System.out.println("Encaminhamento: RESTRITO (Fila Comum)");
                        painelComum += "[Paciente: " + nome + " | Idade: " + idade + " | Dor: " + dor + "]\n";
                    }
                    System.out.println("-------------------------------------------------");
                    break;

                case 2:
                    System.out.println("\n--- CONSULTAR PAINEL DE PRIORIDADES ---");
                    System.out.println("\n PACIENTES DE ALTA PRIORIDADE:");
                    if (painelPrioritario.isEmpty()) {
                        System.out.println("(Nenhum paciente critico no momento)");
                    } else {
                        System.out.print(painelPrioritario);
                    }

                    System.out.println("\n PACIENTES CLASSIFICACAO COMUM:");
                    if (painelComum.isEmpty()) {
                        System.out.println("(Nenhum paciente aguardando na fila comum)");
                    } else {
                        System.out.print(painelComum);
                    }
                    System.out.println("---------------------------------------");
                    break;

                case 3:
                    System.out.println("\n Encerrando o sistema do hospital. Painel de triagem desligado!");
                    break;

                default:
                    System.out.println("\n Opcao incorreta! Escolha entre 1, 2 ou 3.");
                    break;
            }
        }

        teclado.close();
    }
}