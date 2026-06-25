package Aula05_menusInterativos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // REQUISITO: Credenciais corretas definidas pelo enunciado
        final String LOGIN_CORRETO = "admin";
        final String SENHA_CORRETA = "1234";
        
        // REQUISITO: Máximo de 3 tentativas
        int tentativasRestantes = 3;
        boolean acessoLiberado = false;

        System.out.println("=================================================");
        System.out.println("          SISTEMA DE AUTENTICACAO SEGURA         ");
        System.out.println("=================================================");

        while (tentativasRestantes > 0 && !acessoLiberado) {
            // REQUISITO: Impedir quebra do sistema usando blocos estruturados
            try {
                System.out.println("\n--- TENTATIVA " + (4 - tentativasRestantes) + " DE 3 ---");
                
                System.out.print("Digite o login: ");
                String loginDigitado = teclado.nextLine();

                // Simulamos uma validação extra: se o login contiver apenas caracteres inválidos ou estiver vazio
                if (loginDigitado.trim().isEmpty()) {
                    throw new IllegalArgumentException("O campo de login nao pode estar vazio.");
                }

                System.out.print("Digite a senha: ");
                String senhaDigitada = teclado.nextLine();
                
                // REQUISITO: Verificar correspondência de credenciais
                if (loginDigitado.equals(LOGIN_CORRETO) && senhaDigitada.equals(SENHA_CORRETA)) {
                    acessoLiberado = true;
                    // REQUISITO: Mostrar mensagens amigáveis
                    System.out.println("\n [ACESSO AUTORIZADO] - Bem-vindo ao painel de controle.");
                } else {
                    tentativasRestantes--;
                    System.out.println("\n ERRO: Login ou senha incorretos!");
                    
                    if (tentativasRestantes > 0) {
                        System.out.println("Aviso: Voce ainda possui " + tentativasRestantes + " tentativa(s).");
                    }
                }

            } catch (IllegalArgumentException e) {
                // Captura falhas de regras de preenchimento (ex: campos vazios)
                System.out.println("\n ERRO DE ENTRADA: " + e.getMessage());
                System.out.println("Por favor, digite os dados corretos.");
                
            } catch (Exception e) {
                // Captura qualquer outro comportamento inesperado ou erro de input
                System.out.println("\n ERRO CRITICO: Ocorreu uma falha inesperada ao processar o input.");
                System.out.println("O sistema impediu a quebra fisica da aplicacao.");
                teclado.nextLine(); // Garante a limpeza do fluxo do scanner
            }
        }

        // Bloqueio final se esgotar as tentativas
        if (!acessoLiberado && tentativasRestantes == 0) {
            System.out.println("\n=========================================");
            System.out.println("[SISTEMA BLOQUEADO PREDITIVAMENTE]    ");
            System.out.println("Numero maximo de tentativas excedido.");
            System.out.println("Tentativas de invasao registradas na auditoria.");
            System.out.println("=========================================");
        }

        teclado.close();
    }
}