package Aula03_estruturasCondicionais;

import java.util.Scanner;

public class desafioPratico01 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== SISTEMA DE APROVACAO ESCOLAR ===");
        System.out.println("Qual e o seu nome? ");
        String nome = entrada.nextLine();
        
        System.out.println("Informe a N1 (Nota 1): ");
        double nota1 = entrada.nextDouble();
        
        System.out.println("Informe a N2 (Nota 2): ");
        double nota2 = entrada.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        if (media >= 7){
            System.out.println("Parabens! " + nome + " voce foi APROVADO!");
        } else if (media >= 5 && media <= 6.9){
            System.out.println(nome + " voce ficou em RECUPERACAO...");
        } else {
            System.out.println(nome + " voce tinha que ter se esforcado mais... Voce foi REPROVADO...");
        }
        entrada.close();
    }
}
