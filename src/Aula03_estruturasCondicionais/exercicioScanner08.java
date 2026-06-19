package Aula03_estruturasCondicionais;

import java.util.Scanner;

public class exercicioScanner08 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== SISTEMA DE LOGIN ===");
        System.out.println("Digite o seu USUARIO: ");
        String resposta = entrada.nextLine();
        
        System.out.println("Digite a sua SENHA: ");
        int resposta1 = entrada.nextInt();
        
        System.out.println("Parabens! " + resposta + " os seus dados foram recebidos com sucesso!");
        
        entrada.close();
    }
}
