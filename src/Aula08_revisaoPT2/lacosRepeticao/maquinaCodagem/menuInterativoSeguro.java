package Aula08_revisaoPT2.lacosRepeticao.maquinaCodagem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class menuInterativoSeguro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        // REQUISITO: Uso estrito do do-while para garantir pelo menos a primeira exibição
        do {
            System.out.println("\n=================================================");
            System.out.println("        MAQUINA DE CODAGEM - REVISAO 02          ");
            System.out.println("             MENU INTERATIVO SEGURO              ");
            System.out.println("=================================================");
            System.out.println(" 1 - Inserir");
            System.out.println(" 2 - Deletar");
            System.out.println(" 3 - Sair");
            System.out.println("=================================================");
            System.out.print("Escolha uma opcao: ");

            // REQUISITO BÔNUS: Bloco try-catch para capturar o InputMismatchException
            try {
                opcao = teclado.nextInt();

                // Processamento seguro da opção
                switch (opcao) {
                    case 1:
                        System.out.println("\n[Acao] Executando rotina de INSERCAO de dados...");
                        break;
                    case 2:
                        System.out.println("\n[Acao] Executando rotina de DELECAO de dados...");
                        break;
                    case 3:
                        System.out.println("\nSaindo do sistema... Ate mais!");
                        break;
                    default:
                        System.out.println("\n Erro: Opcao invalida! Escolha apenas 1, 2 ou 3.");
                        break;
                }

            } catch (InputMismatchException e) {
                // REQUISITO BÔNUS: Captura o erro, exibe mensagem e mantém rodando
                System.out.println("\nErro critico: Entrada invalida! Voce deve digitar um numero inteiro.");
                
                // SACADA DE OURO: Limpa o token inválido do buffer do scanner para evitar loop infinito
                teclado.next(); 
                
                // Reseta a opção para forçar a continuidade segura do laço
                opcao = 0; 
            }

        } while (opcao != 3); // REQUISITO: Continua rodando enquanto o usuário não digitar 3

        teclado.close();
    }
}