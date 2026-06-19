package Aula03_estruturasCondicionais;

import java.util.Scanner;

public class exercicio07 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int saldo = 500;
        
        System.out.println("Quando o senhor deseja sacar?");
        int valorSaque = entrada.nextInt();
        
        if (valorSaque <= saldo){
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
        entrada.close();
    }
}
