package Aula06_vetoresArrays;

import java.util.Scanner;

public class desafioPratico02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Definição de capacidade do estoque (limite de 10 produtos para fins didáticos)
        int limiteProdutos = 10;
        
        // REQUISITO: Armazenar nome, preço e quantidade em vetores paralelos
        String[] nomes = new String[limiteProdutos];
        double[] precos = new double[limiteProdutos];
        int[] quantidades = new int[limiteProdutos];

        int opcao = 0;

        System.out.println("=================================================");
        System.out.println("       DESAFIO 02 - CONTROLE DE ESTOQUE          ");
        System.out.println("=================================================");

        // REQUISITO: O sistema deve continuar funcionando continuamente até a opção 5
        do {
            System.out.println("\n=== PAINEL DE PRODUTOS ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Buscar produto");
            System.out.println("4 - Mostrar valor total do estoque");
            System.out.println("5 - Encerra");
            System.out.print("Escolha uma opcao: ");

            // VALIDAÇÃO: Impede que o menu quebre com caracteres textuais
            if (!teclado.hasNextInt()) {
                System.out.println("\n ERRO: Opcao invalida! Digite um numero de 1 a 5.");
                teclado.next();
                continue;
            }

            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa buffer pós-int

            switch (opcao) {
                case 1:
                    System.out.println("\n--- NOVO CADASTRO DE PRODUTO ---");

                    // Encontra a primeira posição livre no vetor de nomes
                    int indiceLivre = -1;
                    for (int i = 0; i < nomes.length; i++) {
                        if (nomes[i] == null) {
                            indiceLivre = i;
                            break;
                        }
                    }

                    if (indiceLivre == -1) {
                        System.out.println("[ESTOQUE CHEIO] - Limite de variedade de produtos atingido.");
                        break;
                    }

                    // Coleta do nome do produto
                    System.out.print("Digite o nome do produto: ");
                    String nomeInput = teclado.nextLine().trim();

                    if (nomeInput.isEmpty()) {
                        System.out.println("ERRO: O nome do produto nao pode ser vazio.");
                        break;
                    }

                    // REQUISITO: Impedir texto em campos numéricos (Preço)
                    System.out.print("Digite o preco do produto: R$ ");
                    if (!teclado.hasNextDouble()) {
                        System.out.println("ERRO: O preco deve ser um valor numerico valido.");
                        teclado.next();
                        break;
                    }
                    double precoInput = teclado.nextDouble();

                    // REQUISITO: Preço não pode ser negativo
                    if (precoInput < 0) {
                        System.out.println("ERRO: O preco do produto nao pode ser um valor negativo.");
                        break;
                    }

                    // REQUISITO: Impedir texto em campos numéricos (Quantidade)
                    System.out.print("Digite a quantidade em estoque: ");
                    if (!teclado.hasNextInt()) {
                        System.out.println("ERRO: A quantidade deve ser um numero inteiro valido.");
                        teclado.next();
                        break;
                    }
                    int qtdInput = teclado.nextInt();
                    teclado.nextLine(); // Limpa buffer

                    // REQUISITO: Quantidade mínima = 1
                    if (qtdInput < 1) {
                        System.out.println("ERRO: A quantidade inicial minima para cadastro deve ser 1.");
                        break;
                    }

                    // Gravação nos vetores paralelos vinculados pelo mesmo índice
                    nomes[indiceLivre] = nomeInput;
                    precos[indiceLivre] = precoInput;
                    quantidades[indiceLivre] = qtdInput;
                    System.out.println("Produto cadastrado com absoluto sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE PRODUTOS EM ESTOQUE ---");
                    boolean temProdutos = false;

                    for (int i = 0; i < nomes.length; i++) {
                        if (nomes[i] != null) {
                            // DESAFIO EXTRA: Mostrar alerta se a quantidade for menor que 5
                            String statusAlerta = "";
                            if (quantidades[i] < 5) {
                                statusAlerta = "[ESTOQUE BAIXO]";
                            }

                            System.out.printf("Cod: %02d | Nome: %-15s | Preco: R$ %-7.2f | Qtd: %-3d %s\n", 
                                    (i + 1), nomes[i], precos[i], quantidades[i], statusAlerta);
                            temProdutos = true;
                        }
                    }

                    if (!temProdutos) {
                        System.out.println("ℹ️ Nenhum produto registrado ate o momento.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- BUSCAR PRODUTO ---");
                    System.out.print("Digite o nome do produto para pesquisa: ");
                    String buscaNome = teclado.nextLine().trim();

                    boolean achou = false;
                    for (int i = 0; i < nomes.length; i++) {
                        if (nomes[i] != null && nomes[i].equalsIgnoreCase(buscaNome)) {
                            String statusAlerta = (quantidades[i] < 5) ? " [ESTOQUE BAIXO]" : "Normal";
                            System.out.println("\n Registro Encontrado!");
                            System.out.printf("Posicao no Patio: %d\n", (i + 1));
                            System.out.printf("Preco Unitario: R$ %.2f\n", precos[i]);
                            System.out.printf("Quantidade Atual: %d unidades (%s)\n", quantidades[i], statusAlerta);
                            achou = true;
                            break;
                        }
                    }

                    if (!achou) {
                        System.out.println("Produto nao localizado em nossos registros.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- VALOR TOTAL DO ESTOQUE PATRIMONIAL ---");
                    double valorTotalAcumulado = 0;
                    int totalItens = 0;

                    // REQUISITO: Calcular o total somando (preço * quantidade) de cada item populado
                    for (int i = 0; i < nomes.length; i++) {
                        if (nomes[i] != null) {
                            valorTotalAcumulado += (precos[i] * quantidades[i]);
                            totalItens += quantidades[i];
                        }
                    }

                    System.out.printf("Total de variedades ativas: %d\n", totalItens);
                    System.out.printf("Valor total investido em mercadoria: R$ %.2f\n", valorTotalAcumulado);
                    System.out.println("-------------------------------------------------");
                    break;

                case 5:
                    System.out.println("\nEncerrando o Sistema de Controle de Estoque. Ate logo!");
                    break;

                default:
                    System.out.println("\n ERRO: Opcao inexistente. Escolha de 1 a 5.");
                    break;
            }

        } while (opcao != 5);

        teclado.close();
    }
}