package Aula03_estruturasCondicionais;

import java.util.Scanner;

public class desafioPratico02 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        
        int saldo = 1000;
        int limiteExtra = 200;
        String cliente = "VIP"; 
        
        System.out.println("=== SISTEMA BANCARIO ===");
        System.out.println("Qual e o seu nome? ");
        String nome = entrada.nextLine();
        
        System.out.println("Que tipo de cliente voce e? ");
        if (cliente.equals("VIP")){
            System.out.println("Voce tem um limite extra de " + limiteExtra);
        } else {
            System.out.println("Voce nao possui limite extra");
        }
        
        System.out.println("O seu saldo atual e de R$ " + saldo);
        
        System.out.println("Quanto voce quer sacar? ");
        double sacar = entrada.nextDouble();
     
        if (saldo <= 1000){
            System.out.println("Saque realizado com sucesso!");
            saldo -= sacar;
        } else {
            System.out.println("Saldo insuficiente...");
        }
        System.out.println("O seu saldo atual e de R$ " + saldo);
        entrada.close();
    }
}
