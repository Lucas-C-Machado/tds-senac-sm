package Aula05_menusInterativos;

import java.util.Scanner;

public class desafioPratico03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        System.out.println("=================================================");
        System.out.println("          SISTEMA DE TRIAGEM VETERINARIA         ");
        System.out.println("=================================================");

        // REQUISITO: Continuar funcionando até o usuário escolher sair (Opção 3)
        while (opcao != 3) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1 - Novo atendimento");
            System.out.println("2 - Consultar fila");
            System.out.println("3 - Encerrar sistema");
            System.out.print("Escolha uma opcao: ");

            // REQUISITO: Impedir opções inválidas (como textos ou símbolos)
            if (!teclado.hasNextInt()) {
                System.out.println("\n ERRO: Entrada invalida! Digite um numero correspondente ao menu.");
                teclado.next(); // Limpa o buffer
                continue;
            }

            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa buffer pós-int

            switch (opcao) {
                case 1:
                    System.out.println("\n--- REGISTRO DE ANIMAL ---");
                    System.out.print("Nome do animal: ");
                    String nomeAnimal = teclado.nextLine();

                    // Validação para idade do tutor (não aceitar números negativos ou textos)
                    int idadeTutor = -1;
                    while (idadeTutor < 0) {
                        System.out.print("Idade do tutor: ");
                        if (!teclado.hasNextInt()) {
                            System.out.println(" Erro: Digite uma idade valida (numero inteiro).");
                            teclado.next();
                            continue;
                        }
                        idadeTutor = teclado.nextInt();
                        teclado.nextLine(); // Limpa buffer
                        if (idadeTutor < 0) {
                            System.out.println("Erro: A idade nao pode ser um numero negativo.");
                        }
                    }

                    // Validação para o estado de gravidade (Apenas SIM ou NAO)
                    String estadoGrave = "";
                    while (!estadoGrave.equals("SIM") && !estadoGrave.equals("NAO")) {
                        System.out.print("O caso e grave? (SIM ou NAO): ");
                        estadoGrave = teclado.nextLine().trim().toUpperCase();
                        if (!estadoGrave.equals("SIM") && !estadoGrave.equals("NAO")) {
                            System.out.println("Erro: Responda estritamente com 'SIM' ou 'NAO'.");
                        }
                    }

                    // REQUISITO/REGRA: Prioritário se caso for grave OU tutor >= 60 anos
                    boolean ehPrioritario = estadoGrave.equals("SIM") || (idadeTutor >= 60);

                    // REQUISITO: Mostrar mensagens claras
                    System.out.println("\n-------------------------------------------------");
                    System.out.println("PACIENTE REGISTRADO COM SUCESSO!");
                    System.out.println("Animal: " + nomeAnimal + " | Idade do Tutor: " + idadeTutor + " anos");
                    System.out.print("CLASSIFICACAO DO ATENDIMENTO: ");
                    if (ehPrioritario) {
                        System.out.println("PRIORITARIO (Encaminhar ao inicio da fila)");
                    } else {
                        System.out.println("NORMAL (Fila convencional)");
                    }
                    System.out.println("-------------------------------------------------");
                    break;

                case 2:
                    System.out.println("\n[INFO] Fila atualizada no painel da recepcao.");
                    break;

                case 3:
                    System.out.println("\nEncerrando o sistema veterinario. Ate logo!");
                    break;

                default:
                    System.out.println("\nERRO: Opcao inexistente. Digite 1, 2 ou 3.");
                    break;
            }
        }
        teclado.close();
    }
}