package Aula03_estruturasCondicionais;

import java.util.Scanner;

public class exercicioScanner02 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual a sua idade?");
        int resposta = entrada.nextInt();
        
        System.out.println("A minha idade e " + resposta);
    }
}
