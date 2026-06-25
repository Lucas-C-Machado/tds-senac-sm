package Aula05_menusInterativos;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        // Variáveis simples para demonstrar os dados armazenados do último atendimento
        // (Pode ser expandido usando Arrays ou Listas futuramente)
        String filaPrioritaria = "";
        String filaNormal = "";

        System.out.println("=================================================");
        System.out.println("    SISTEMA DE ATENDIMENTO VETERINARIO SENAC    ");
        System.out.println("=================================================");

        // REQUISITO: Continuar funcionando até o usuário escolher sair (Opção 3)
        while (opcao != 3) {
            System.out.println("\n--- MENU DE OPCOES ---");
            System.out.println("1 - Novo atendimento");
            System.out.println("2 - Consultar fila");
            System.out.println("3 - Encerrar sistema");
            System.out.print("Escolha uma opcao: ");
            
            // Validação inicial para evitar que o sistema quebre se o usuário digitar letras
            if (!teclado.hasNextInt()) {
                System.out.println("\nERRO: Por favor, digite um numero valido (1, 2 ou 3).");
                teclado.next(); // Limpa o buffer do erro
                continue;
            }
            
            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.println("\n--- NOVO ATENDIMENTO ---");
                    
                    System.out.print("Nome do animal: ");
                    String nomeAnimal = teclado.nextLine();
                    
                    System.out.print("Idade do tutor: ");
                    while (!teclado.hasNextInt()) {
                        System.out.println("Erro: Digite uma idade valida (numero inteiro).");
                        System.out.print("Idade do tutor: ");
                        teclado.next();
                    }
                    int idadeTutor = teclado.nextInt();
                    teclado.nextLine(); // Limpa buffer
                    
                    System.out.print("O caso e grave? (SIM ou NAO): ");
                    String casoGrave = teclado.nextLine().trim().toUpperCase();
                    
                    // REQUISITO: Impedir opções inválidas na gravidade
                    while (!casoGrave.equals("SIM") && !casoGrave.equals("NAO")) {
                        System.out.println("Opcao invalida! Responda apenas com 'SIM' ou 'NAO'.");
                        System.out.print("O caso e grave? (SIM ou NAO): ");
                        casoGrave = teclado.nextLine().trim().toUpperCase();
                    }

                    // REQUISITO: Regras da clínica para PRIORITÁRIO (Caso grave OU tutor >= 60 anos)
                    boolean ehPrioritario = casoGrave.equals("SIM") || idadeTutor >= 60;

                    // REQUISITO: Mostrar mensagens claras
                    System.out.println("\n-------------------------------------------------");
                    System.out.println("Triagem concluida com sucesso!");
                    System.out.println("Animal: " + nomeAnimal);
                    
                    if (ehPrioritario) {
                        System.out.println("Classificacao: PRIORITARIO");
                        filaPrioritaria += "[Pet: " + nomeAnimal + " | Tutor: " + idadeTutor + " anos] \n";
                    } else {
                        System.out.println("Classificacao: NORMAL");
                        filaNormal += "[Pet: " + nomeAnimal + " | Tutor: " + idadeTutor + " anos] \n";
                    }
                    System.out.println("-------------------------------------------------");
                    break;

                case 2:
                    System.out.println("\n--- FILA DE ATENDIMENTO ATUAL ---");
                    
                    System.out.println("\nPACIENTES PRIORITARIOS:");
                    if (filaPrioritaria.isEmpty()) {
                        System.out.println("(Nenhum paciente prioritario aguardando)");
                    } else {
                        System.out.print(filaPrioritaria);
                    }

                    System.out.println("\nPACIENTES NORMAIS:");
                    if (filaNormal.isEmpty()) {
                        System.out.println("(Nenhum paciente normal aguardando)");
                    } else {
                        System.out.print(filaNormal);
                    }
                    System.out.println("---------------------------------");
                    break;

                case 3:
                    System.out.println("\nEncerrando o sistema de triagem. Ate logo!");
                    break;

                default:
                    // REQUISITO: Impedir opções inválidas no menu principal
                    System.out.println("\nOpcao incorreta! Escolha entre 1, 2 ou 3.");
                    break;
            }
        }

        teclado.close();
    }
}