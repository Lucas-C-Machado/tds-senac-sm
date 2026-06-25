package Aula05_menusInterativos;

import java.util.Scanner;

public class exercicio07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        // Limites máximos definidos pelo contexto
        final int MAX_VIP = 5;
        final int MAX_COMUM = 10;

        // Contadores de vagas ocupadas atualmente
        int vagasVipOcupadas = 0;
        int vagasComunsOcupadas = 0;

        System.out.println("=================================================");
        System.out.println("          SISTEMA DE GESTAO DE ESTACIONAMENTO    ");
        System.out.println("=================================================");

        // REQUISITO: O sistema deve continuar funcionando até encerrar (Opção 4)
        while (opcao != 4) {
            System.out.println("\n--- PAINEL PRINCIPAL ---");
            System.out.println("1. Entrada VIP");
            System.out.println("2. Entrada Comum");
            System.out.println("3. Consultar vagas");
            System.out.println("4. Encerra sistema");
            System.out.print("Escolha uma opcao: ");

            if (!teclado.hasNextInt()) {
                System.out.println("\n ERRO: Entrada invalida! Digite um numero de 1 a 4.");
                teclado.next(); // Limpa o buffer
                continue;
            }

            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa o buffer do teclado

            // Calculando a quantidade restante dinamicamente
            int restanteVip = MAX_VIP - vagasVipOcupadas;
            int restanteComum = MAX_COMUM - vagasComunsOcupadas;

            switch (opcao) {
                case 1:
                    System.out.println("\n--- PROCESSANDO ENTRADA VIP ---");
                    // CORREÇÃO DO PROBLEMA: Impedir entrada quando as vagas acabarem
                    if (restanteVip <= 0) {
                        System.out.println("ACESSO NEGADO: Setor VIP esta completamente LOTADO!");
                    } else {
                        vagasVipOcupadas++;
                        restanteVip--; // Atualiza o saldo local para exibição imediata
                        System.out.println("Cancela liberada! Seja bem-vindo ao setor VIP.");
                        
                        // REQUISITO: Mostrar quantidade restante
                        System.out.println("Vagas VIP restantes: " + restanteVip);

                        // REQUISITO: Avisar quando estiver acabando (definido aqui como última vaga)
                        if (restanteVip == 1) {
                            System.out.println("ALERTA: Resta apenas 1 vaga no setor VIP!");
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n--- PROCESSANDO ENTRADA COMUM ---");
                    // CORREÇÃO DO PROBLEMA: Impedir entrada quando as vagas acabarem
                    if (restanteComum <= 0) {
                        System.out.println("ACESSO NEGADO: Setor Comum esta completamente LOTADO!");
                    } else {
                        vagasComunsOcupadas++;
                        restanteComum--; // Atualiza o saldo local para exibição imediata
                        System.out.println("Cancela liberada! Tenha um bom estacionamento.");
                        
                        // REQUISITO: Mostrar quantidade restante
                        System.out.println("Vagas comuns restantes: " + restanteComum);

                        // REQUISITO: Avisar quando estiver acabando
                        if (restanteComum == 1) {
                            System.out.println("ALERTA: Resta apenas 1 vaga no setor Comum!");
                        }
                    }
                    break;

                case 3:
                    // REQUISITO: Consultar vagas / Mostrar quantidade restante
                    System.out.println("\n-----------------------------------------");
                    System.out.println("          SITUACAO DO PATIO             ");
                    System.out.println("-----------------------------------------");
                    System.out.printf("SETOR VIP:   %02d/%02d ocupadas | [%d VAGAS LIVRES]\n", 
                            vagasVipOcupadas, MAX_VIP, restanteVip);
                    System.out.printf("SETOR COMUM: %02d/%02d ocupadas | [%d VAGAS LIVRES]\n", 
                            vagasComunsOcupadas, MAX_COMUM, restanteComum);
                    System.out.println("-----------------------------------------");
                    break;

                case 4:
                    System.out.println("\nDesligando os sensores das cancelas. Sistema encerrado!");
                    break;

                default:
                    System.out.println("\n ERRO: Opcao inexistente! Escolha um numero entre 1 e 4.");
                    break;
            }
        }

        teclado.close();
    }
}