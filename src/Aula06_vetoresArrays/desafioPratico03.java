package Aula06_vetoresArrays;

import java.util.Scanner;

public class desafioPratico03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // REQUISITO: O estacionamento possui 5 vagas VIP e 10 vagas comuns
        String[] vagasVip = new String[5];
        String[] vagasComuns = new String[10];
        
        int opcao = 0;

        System.out.println("=================================================");
        System.out.println("     DESAFIO 03 - CONTROLE DE ESTACIONAMENTO     ");
        System.out.println("=================================================");

        do {
            System.out.println("\n=== CONTROLE DE ACESSO ===");
            System.out.println("1 - Entrada VIP");
            System.out.println("2 - Entrada Comum");
            System.out.println("3 - Consultar Vagas");
            System.out.println("4 - Encerrar Sistema");
            System.out.print("Escolha uma opcao: ");

            // VALIDAÇÃO: Impede que o sistema trave com entradas de texto no menu
            if (!teclado.hasNextInt()) {
                System.out.println("\n ERRO: Entrada invalida! Digite uma opcao de 1 a 4.");
                teclado.next();
                continue;
            }

            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.println("\n--- SOLICITACAO DE ENTRADA SETOR VIP ---");
                    
                    // Passo 1: Verificar se há vaga física disponível no setor VIP
                    int indiceVipLivre = -1;
                    for (int i = 0; i < vagasVip.length; i++) {
                        if (vagasVip[i] == null) {
                            indiceVipLivre = i;
                            break;
                        }
                    }

                    // REGRA: Impedir entrada caso as vagas tenham acabado (Garante que não fiquem negativas)
                    if (indiceVipLivre == -1) {
                        System.out.println("[SETOR VIP LOTADO] - Nao ha espaco livre neste momento.");
                        break;
                    }

                    // Passo 2: Coleta e validação da placa do veículo
                    System.out.print("Digite a placa do veiculo: ");
                    String placaVip = teclado.nextLine().trim().toUpperCase();

                    // REQUISITO: Sistema não pode aceitar placas vazias
                    if (placaVip.isEmpty()) {
                        System.out.println("ERRO: Operacao cancelada. A placa nao pode ser nula ou vazia.");
                        break;
                    }

                    // REQUISITO: Impedir entrada de veículos duplicados (Busca em AMBOS os setores)
                    boolean duplicadoVip = false;
                    for (String v : vagasVip) {
                        if (v != null && v.equals(placaVip)) { duplicadoVip = true; break; }
                    }
                    for (String v : vagasComuns) {
                        if (v != null && v.equals(placaVip)) { duplicadoVip = true; break; }
                    }

                    if (duplicadoVip) {
                        System.out.println("ALERTA: Este veículo ja se encontra registrado no interior do patio.");
                        break;
                    }

                    // Efetivação da ocupação da vaga VIP
                    vagasVip[indiceVipLivre] = placaVip;
                    System.out.printf("Acesso liberado! Veiculo posicionado na vaga VIP #%d.\n", (indiceVipLivre + 1));
                    break;

                case 2:
                    System.out.println("\n--- SOLICITACAO DE ENTRADA SETOR COMUM ---");
                    
                    // Passo 1: Verificar se há vaga física disponível no setor comum
                    int indiceComumLivre = -1;
                    for (int i = 0; i < vagasComuns.length; i++) {
                        if (vagasComuns[i] == null) {
                            indiceComumLivre = i;
                            break;
                        }
                    }

                    // REGRA: Impedir entrada caso as vagas tenham acabado
                    if (indiceComumLivre == -1) {
                        System.out.println("[SETOR COMUM LOTADO] - Nao ha espaco livre neste momento.");
                        break;
                    }

                    // Passo 2: Coleta e validação da placa
                    System.out.print("Digite a placa do veiculo: ");
                    String placaComum = teclado.nextLine().trim().toUpperCase();

                    // REQUISITO: Sistema não pode aceitar placas vazias
                    if (placaComum.isEmpty()) {
                        System.out.println("ERRO: Operacao cancelada. A placa não pode ser nula ou vazia.");
                        break;
                    }

                    // REQUISITO: Impedir entrada de veículos duplicados (Busca em AMBOS os setores)
                    boolean duplicadoComum = false;
                    for (String v : vagasVip) {
                        if (v != null && v.equals(placaComum)) { duplicadoComum = true; break; }
                    }
                    for (String v : vagasComuns) {
                        if (v != null && v.equals(placaComum)) { duplicadoComum = true; break; }
                    }

                    if (duplicadoComum) {
                        System.out.println("ALERTA: Este veiculo ja se encontra registrado no interior do patio.");
                        break;
                    }

                    // Efetivação da ocupação da vaga Comum
                    vagasComuns[indiceComumLivre] = placaComum;
                    System.out.printf("Acesso liberado! Veiculo posicionado na vaga Comum #%d.\n", (indiceComumLivre + 1));
                    break;

                case 3:
                    System.out.println("\n--- MAPA ATUAL DE OCUPACAO DE VAGAS ---");
                    
                    // Contadores de vagas livres
                    int livresVip = 0;
                    int livresComum = 0;

                    System.out.println("\n [SETOR VIP]");
                    for (int i = 0; i < vagasVip.length; i++) {
                        if (vagasVip[i] == null) {
                            System.out.printf("  Vaga V%02d: [Livre]\n", (i + 1));
                            livresVip++;
                        } else {
                            System.out.printf("  Vaga V%02d: %s\n", (i + 1), vagasVip[i]);
                        }
                    }

                    System.out.println("\n [SETOR COMUM]");
                    for (int i = 0; i < vagasComuns.length; i++) {
                        if (vagasComuns[i] == null) {
                            System.out.printf("  Vaga C%02d: [Livre]\n", (i + 1));
                            livresComum++;
                        } else {
                            System.out.printf("  Vaga C%02d: %s\n", (i + 1), vagasComuns[i]);
                        }
                    }

                    // Painel de Indicadores de pátio para o gestor
                    System.out.println("\n-------------------------------------------------");
                    System.out.printf("RESUMO TOTAL: VIP: %d/%d Livres | COMUM: %d/%d Livres\n", 
                            livresVip, vagasVip.length, livresComum, vagasComuns.length);
                    
                    // Alerta opcional de pátio quase cheio (Gatilho preventivo extra)
                    if (livresVip == 1 || livresComum == 1) {
                        System.out.println("AVISO: Atencao operacional, vagas criticas atingindo o limite!");
                    }
                    System.out.println("-------------------------------------------------");
                    break;

                case 4:
                    System.out.println("\nEncerrando o modulo de Controle de Estacionamento. Cancelas travadas.");
                    break;

                default:
                    System.out.println("\n ERRO: Comando invalido. Selecione de 1 a 4.");
                    break;
            }

        } while (opcao != 4);

        teclado.close();
    }
}