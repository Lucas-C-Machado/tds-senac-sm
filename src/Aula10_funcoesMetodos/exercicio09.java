package Aula10_funcoesMetodos;

public class exercicio09 {
    public static void executarSistema() {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU DO SISTEMA ===");
            System.out.println("1 - Nova Validação de Matrícula");
            System.out.println("2 - Registrar Novo Acesso");
            System.out.println("3 - Exibir Relatório Geral");
            System.out.println("0 - Sair do Sistema");
            System.out.print("Digite a opção desejada: ");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("[Sistema] Executando validação...");
                    break;
                case 2:
                    System.out.println("[Sistema] Registrando acesso...");
                    break;
                case 3:
                    System.out.println("[Sistema] Gerando relatório...");
                    break;
                case 0:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }
}
