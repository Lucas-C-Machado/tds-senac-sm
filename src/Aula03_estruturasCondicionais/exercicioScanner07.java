package Aula03_estruturasCondicionais;

import java.util.Scanner;

public class exercicioScanner07 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int saldo = 500;
        
        System.out.println("=== CADASTRO DE VEICULOS ===");
        System.out.println("Qual e a sua placa? ");
        String resposta = entrada.nextLine();
        
        System.out.println("Qual e o seu nome? ");
        String resposta1 = entrada.nextLine();
        
        System.out.println("Qual e o numero da sua vaga? ");
        resposta = entrada.nextLine();
        
        System.out.println("Parabens! " + resposta1 + " os seus dados foram registrados com sucesso!");
        
        entrada.close();
    }
}
