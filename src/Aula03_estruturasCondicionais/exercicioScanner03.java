package Aula03_estruturasCondicionais;

import java.util.Scanner;

public class exercicioScanner03 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual a sua idade?");
        double resposta = entrada.nextDouble();
        
        System.out.println("A minha altura e " + resposta);
    }
}
