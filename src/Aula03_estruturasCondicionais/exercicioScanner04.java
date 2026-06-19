package Aula03_estruturasCondicionais;

import java.util.Scanner;

public class exercicioScanner04 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== SISTEMA ESCOLAR ===");
        System.out.println("Qual o seu nome? ");
        String resposta = entrada.nextLine();
        
        System.out.println("Qual e a sua idade? ");
        int resposta1 = entrada.nextInt();
        entrada.nextLine(); //buffer
        
        System.out.println("Qual e a sua turma? ");
        resposta = entrada.nextLine();
        
        System.out.println("Cadastro realizado com sucesso!");
        
        entrada.close();
    }
}
