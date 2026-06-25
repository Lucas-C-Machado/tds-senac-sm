package Aula06_vetoresArrays;

import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // REQUISITO: Utilizar vetor (Array estático de 5 vagas para fins didáticos)
        String[] vagas = new String[5];
        int opcao = 0;

        System.out.println("=================================================");
        System.out.println("      SISTEMA INTERATIVO DE ESTACIONAMENTO       ");
        System.out.println("=================================================");

        // REQUISITO: Utilizar a estrutura do-while para o menu principal
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar veiculo");
            System.out.println("2 - Listar veiculos");
            System.out.println("3 - Buscar placa");
            System.out.println("4 - Contar vagas");
            System.out.println("5 - Encerra");
            System.out.print("Escolha uma opcao: ");

            // REQUISITO: Validar opções do menu (impedir travamento por texto)
            if (!teclado.hasNextInt()) {
                System.out.println("\n ERRO: Entrada invalida! Digite um numero de 1 a 5.");
                teclado.next(); // Limpa buffer
                continue;
            }

            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa buffer pós-int

            switch (opcao) {
                case 1:
                    System.out.println("\n--- CADASTRAR VEICULO ---");
                    boolean cadastrado = false;
                    
                    // Busca a primeira posição disponível (que seja null) para estacionar
                    for (int i = 0; i < vagas.length; i++) {
                        if (vagas[i] == null) {
                            System.out.print("Digite a placa do veiculo para a vaga " + (i + 1) + ": ");
                            vagas[i] = teclado.nextLine().trim().toUpperCase();
                            System.out.println("Veiculo guardado na vaga " + (i + 1) + "!");
                            cadastrado = true;
                            break; // Sai do laço para não preencher as outras vagas de uma vez
                        }
                    }
                    
                    if (!cadastrado) {
                        System.out.println("[ESTACIONAMENTO LOTADO] - Nao ha vagas disponiveis.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- LISTAR VEICULOS ---");
                    // REQUISITO: Utilizar o laço for para exibição organizada
                    for (int i = 0; i < vagas.length; i++) {
                        if (vagas[i] != null) {
                            System.out.printf("Vaga %d: %s\n", (i + 1), vagas[i]);
                        } else {
                            System.out.printf("Vaga %d: [ Vazia ]\n", (i + 1));
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n--- BUSCAR PLACA ---");
                    System.out.print("Digite a placa que deseja procurar: ");
                    String placaProcurada = teclado.nextLine().trim().toUpperCase();
                    
                    boolean achou = false;
                    // REQUISITO: Busca e validação com equals()
                    for (int i = 0; i < vagas.length; i++) {
                        if (vagas[i] != null && vagas[i].equals(placaProcurada)) {
                            System.out.printf("Veiculo encontrado! Esta estacionado na vaga %d.\n", (i + 1));
                            achou = true;
                            break;
                        }
                    }
                    
                    if (!achou) {
                        System.out.println("Veiculo com esta placa nao foi localizado.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- CONTAR VAGAS OCUPADAS ---");
                    int contadorOcupadas = 0;
                    
                    // REQUISITO: Lógica de contagem percorrendo o vetor
                    for (int i = 0; i < vagas.length; i++) {
                        if (vagas[i] != null) {
                            contadorOcupadas++;
                        }
                    }
                    
                    System.out.println("Vagas ocupadas: " + contadorOcupadas);
                    System.out.println("Vagas livres  : " + (vagas.length - contadorOcupadas));
                    break;

                case 5:
                    System.out.println("\nEncerrando o sistema de controle de patio. Ate logo!");
                    break;

                default:
                    System.out.println("\nERRO: Opcao inexistente. Escolha de 1 a 5.");
                    break;
            }

        } while (opcao != 5); // O sistema roda enquanto a opção for diferente de 5

        teclado.close();
    }
}