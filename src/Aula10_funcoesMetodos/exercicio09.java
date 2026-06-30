package Aula10_funcoesMetodos;

public class exercicio09 {
    public static void executarSistema() {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU DO SISTEMA ===");
            System.out.println("1 - Nova Validacao de Matricula");
            System.out.println("2 - Registrar Novo Acesso");
            System.out.println("3 - Exibir Relatorio Geral");
            System.out.println("0 - Sair do Sistema");
            System.out.print("Digite a opcao desejada: ");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("[Sistema] Executando validacao...");
                    break;
                case 2:
                    System.out.println("[Sistema] Registrando acesso...");
                    break;
                case 3:
                    System.out.println("[Sistema] Gerando relatorio...");
                    break;
                case 0:
                    System.out.println("Encerrando o sistema. Ate logo!");
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
        } while (opcao != 0);
    }
}
