package Aula06_vetoresArrays;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        // REQUISITO: Configuração inicial das vagas informadas no slide
        int vagasVip = 5;
        int vagasComuns = 10;

        System.out.println("=================================================");
        System.out.println("       DESAFIO 03 - ESTACIONAMENTO SENAC        ");
        System.out.println("=================================================");

        // REQUISITO: O sistema deve continuar funcionando até a opção 4 (Encerrar)
        while (opcao != 4) {
            System.out.println("\n--- PAINEL DE CONTROLE DE VAGAS ---");
            System.out.println("1 - Registrar Entrada VIP");
            System.out.println("2 - Registrar Entrada Comum");
            System.out.println("3 - Consultar Vagas Restantes");
            System.out.println("4 - Encerra sistema");
            System.out.print("Escolha uma opcao: ");

            // CORREÇÃO: Proteção para evitar travamento se digitarem texto no menu
            if (!teclado.hasNextInt()) {
                System.out.println("\n ERRO: Opcao invalida! Digite apenas numeros de 1 a 4.");
                teclado.next(); // Limpa buffer
                continue;
            }

            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa buffer pós-int

            switch (opcao) {
                case 1:
                    System.out.println("\n--- SOLICITACAO: VAGA VIP ---");
                    // REQUISITO: Impedir entrada quando as vagas acabarem
                    if (vagasVip <= 0) {
                        System.out.println("[ENTRADA NEGADA] - Setor VIP completamente lotado!");
                    } else {
                        vagasVip--; // Deduz uma vaga
                        System.out.println("[ENTRADA LIBERADA] - Cancelado VIP aberta.");
                        
                        // REQUISITO: Avisar quando estiver acabando (2 ou menos)
                        if (vagasVip > 0 && vagasVip <= 2) {
                            System.out.printf("ATENCAO: O setor VIP esta com poucas vagas disponiveis! Restam apenas: %d\n", vagasVip);
                        } else if (vagasVip == 0) {
                            System.out.println("ALERTA: Ultima vaga VIP preenchida! Setor agora esta esgotado.");
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n--- SOLICITACAO: VAGA COMUM ---");
                    // REQUISITO: Impedir entrada quando as vagas acabarem
                    if (vagasComuns <= 0) {
                        System.out.println("[ENTRADA NEGADA] - Estacionamento Comum completamente lotado!");
                    } else {
                        vagasComuns--; // Deduz uma vaga
                        System.out.println("[ENTRADA LIBERADA] - Cancela Comum aberta.");
                        
                        // REQUISITO: Avisar quando estiver acabando (2 ou menos)
                        if (vagasComuns > 0 && vagasComuns <= 2) {
                            System.out.printf("ATENCAO: O setor Comum esta operando no limite! Restam apenas: %d\n", vagasComuns);
                        } else if (vagasComuns == 0) {
                            System.out.println("ALERTA: Todas as vagas comuns foram ocupadas!");
                        }
                    }
                    break;

                case 3:
                    // REQUISITO: Mostrar a quantidade restante em tempo real
                    System.out.println("\n-----------------------------------------");
                    System.out.println("         RELATORIO DE DISPONIBILIDADE    ");
                    System.out.println("-----------------------------------------");
                    System.out.println("Vagas VIP Disponiveis   : " + vagasVip + " / 5");
                    System.out.println("Vagas Comuns Disponiveis: " + vagasComuns + " / 10");
                    System.out.println("-----------------------------------------");
                    break;

                case 4:
                    System.out.println("\nEncerrando o sistema de controle de vagas. Cancelas travadas em modo de seguranca!");
                    break;

                default:
                    System.out.println("\n Comando inexistente! Escolha uma opcao valida (1 a 4).");
                    break;
            }
        }

        teclado.close();
    }
}