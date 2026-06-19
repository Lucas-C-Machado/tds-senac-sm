package Aula03_estruturasCondicionais;

import java.util.Scanner;

public class exercicioScanner01 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual o seu nome?");
        String resposta = entrada.nextLine();
        
        System.out.println("O meu nome e " + resposta);
    }
}
