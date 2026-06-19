package Aula03_estruturasCondicionais;

import java.util.Scanner;

public class exercicioScanner06 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int saldo = 500;
        
        System.out.println("=== SISTEMA BANCARIO ===");
        System.out.println("Qual o seu nome? ");
        String resposta = entrada.nextLine();
        
        System.out.println("Voce tem R$ " + saldo + " disponivel " + resposta + "!");
        
        entrada.close();
    }
}
