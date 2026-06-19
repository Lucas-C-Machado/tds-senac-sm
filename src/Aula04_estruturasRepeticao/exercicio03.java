package Aula04_estruturasRepeticao;

import java.util.Scanner;

public class exercicio03 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        String senha = "admin123";
        
        System.out.println("Digite a sua senha para ter acesso ao sistema: ");
        String resposta = entrada.nextLine();
        
        while (!resposta.equals ("admin123")){
            System.out.println("A sua senha esta invalida! Digite novamente: ");
            resposta = entrada.nextLine();
        }
        System.out.println("Acesso autorizado!");
    }
}
