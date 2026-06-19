package Aula11_funcoesMetodosPT2;

import java.util.Scanner;

public class exercicio02 {
    // Objetivo: Trava de segurança que retorna verdadeiro ou falso
    public static boolean autenticarOperador() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n[SEGURANCA] Identifique-se para liberar o sistema.");
        System.out.print("Usuario do Operador: ");
        String usuario = entrada.nextLine();
        
        System.out.print("Senha Numerica: ");
        int senha = entrada.nextInt();
        entrada.nextLine(); // Limpeza preventiva do buffer
        
        // Validação estrita
        if (usuario.equals("admin") && senha == 2026) {
            System.out.println("[OK] Acesso concedido. Iniciando modulos acoplados...");
            return true;
        } else {
            System.out.println("[ALERTA] Credenciais invalidas. Operacao abortada.");
            return false;
        }
    }
}