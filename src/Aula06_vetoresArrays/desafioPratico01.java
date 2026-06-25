package Aula06_vetoresArrays;

import java.util.Scanner;

public class desafioPratico01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Configuração do tamanho do sistema (limite de 10 alunos para fins didáticos)
        int limiteAlunos = 10;
        String[] nomes = new String[limiteAlunos];
        int[] idades = new int[limiteAlunos];
        
        int opcao = 0;

        System.out.println("=================================================");
        System.out.println("        DESAFIO 01 - CADASTRO ESCOLAR SENAC       ");
        System.out.println("=================================================");

        // REQUISITO: O sistema deve continuar funcionando continuamente até a opção 5
        do {
            System.out.println("\n=== PAINEL DE CONTROLE ===");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Buscar aluno");
            System.out.println("4 - Mostrar quantidade cadastrada");
            System.out.println("5 - Encerra");
            System.out.print("Escolha uma opcao: ");

            // VALIDAÇÃO: Protege o menu contra entradas de texto acidentais
            if (!teclado.hasNextInt()) {
                System.out.println("\n ERRO: Opcao invalida! Digite apenas numeros de 1 a 5.");
                teclado.next(); 
                continue;
            }

            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.println("\n--- NOVO CADASTRO DE ALUNO ---");
                    
                    // Passo 1: Achar uma vaga livre no vetor
                    int indiceLivre = -1;
                    for (int i = 0; i < nomes.length; i++) {
                        if (nomes[i] == null) {
                            indiceLivre = i;
                            break;
                        }
                    }

                    if (indiceLivre == -1) {
                        System.out.println("[SISTEMA LOTADO] - Limite maximo de alunos atingido.");
                        break;
                    }

                    // Passo 2: Coleta e validação do nome
                    System.out.print("Digite o nome do aluno: ");
                    String nomeInput = teclado.nextLine().trim();

                    // REQUISITO: Não aceitar nome vazio
                    if (nomeInput.isEmpty()) {
                        System.out.println("ERRO: O nome do aluno nao pode ser deixado em branco.");
                        break;
                    }

                    // REQUISITO: Evitar cadastros duplicados (Lógica de busca prévia)
                    boolean duplicado = false;
                    for (int i = 0; i < nomes.length; i++) {
                        if (nomes[i] != null && nomes[i].equalsIgnoreCase(nomeInput)) {
                            duplicado = true;
                            break;
                        }
                    }

                    if (duplicado) {
                        System.out.println("AVISO: Este aluno ja se encontra cadastrado no sistema.");
                        break;
                    }

                    // Passo 3: Coleta e validação da idade
                    System.out.print("Digite a idade do aluno: ");
                    
                    // REQUISITO: Impedir números inválidos ou letras no campo idade
                    if (!teclado.hasNextInt()) {
                        System.out.println("ERRO: A idade deve conter apenas caracteres numericos inteiros.");
                        teclado.next(); // Limpa o token inválido
                        break;
                    }

                    int idadeInput = teclado.nextInt();
                    teclado.nextLine(); // Limpa buffer

                    // REQUISITO: A idade deve ser estritamente positiva
                    if (idadeInput <= 0) {
                        System.out.println("ERRO: Cadastro abortado. A idade deve ser maior do que zero.");
                        break;
                    }

                    // Conclusão do cadastro nos vetores paralelos
                    nomes[indiceLivre] = nomeInput;
                    idades[indiceLivre] = idadeInput;
                    System.out.println("Aluno cadastrado com absoluto sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE ALUNOS CADASTRADOS ---");
                    boolean possuiAlunos = false;

                    for (int i = 0; i < nomes.length; i++) {
                        if (nomes[i] != null) {
                            System.out.printf("Matricula #%02d | Nome: %-15s | Idade: %d anos\n", (i + 1), nomes[i], idades[i]);
                            possuiAlunos = true;
                        }
                    }

                    if (!possuiAlunos) {
                        System.out.println("ℹ️ Nao existem alunos registrados no sistema ate o momento.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- BUSCAR ALUNO ---");
                    System.out.print("Digite o nome exato para pesquisa: ");
                    String buscaNome = teclado.nextLine().trim();

                    boolean achou = false;
                    for (int i = 0; i < nomes.length; i++) {
                        if (nomes[i] != null && nomes[i].equalsIgnoreCase(buscaNome)) {
                            System.out.printf("Registro Encontrado! Posicao: %d | Idade correspondente: %d anos\n", (i + 1), idades[i]);
                            achou = true;
                            break;
                        }
                    }

                    if (!achou) {
                        System.out.println("Aluno nao localizado nos registros.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- QUANTIDADE TOTAL DE CADASTRADOS ---");
                    int contadorTotal = 0;

                    for (int i = 0; i < nomes.length; i++) {
                        if (nomes[i] != null) {
                            contadorTotal++;
                        }
                    }

                    System.out.printf("Total de alunos ativos: %d de %d vagas preenchidas.\n", contadorTotal, nomes.length);
                    break;

                case 5:
                    System.out.println("\nEncerrando o Sistema de Cadastro Escolar. Banco de dados salvo com sucesso!");
                    break;

                default:
                    System.out.println("\n Opcao fora do escopo! Escolha de 1 a 5.");
                    break;
            }

        } while (opcao != 5);

        teclado.close();
    }
}