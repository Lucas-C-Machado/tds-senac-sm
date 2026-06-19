package Aula03_estruturasCondicionais;

import java.util.Scanner;

public class exercicioScanner05 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== CADASTRO DE PRODUTO ===");
        System.out.println("Qual o nome do produto? ");
        String resposta = entrada.nextLine();
        
        System.out.println("Qual e o preco? ");
        int resposta1 = entrada.nextInt();
        entrada.nextLine(); //buffer
        
        System.out.println("Qual e a quantidade? Quantos chegaram? ");
        resposta = entrada.nextLine();
        
        System.out.println("Produto cadastrado com sucesso!");
        
        entrada.close();
    }
}
