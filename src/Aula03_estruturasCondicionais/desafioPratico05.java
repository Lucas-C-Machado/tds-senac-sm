package Aula03_estruturasCondicionais;

import java.util.Scanner;

public class desafioPratico05 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("=== SISTEMA DE LOGIN EMPRESARIAL ===");
        System.out.println(" ---           ADMIN             ---");
        System.out.println(" ---          GERENTE            ---");
        System.out.println(" ---        FUNCIONARIO          ---");
        
        System.out.println("Selecione uma das opcoes acima: ");
        String resposta = entrada.nextLine();
        
        if (resposta.equalsIgnoreCase("ADMIN")){
            System.out.println("Acesso total!");
        } else if (resposta.equalsIgnoreCase("GERENTE")){
            System.out.println("Acesso intermediario!");
        } else if (resposta.equalsIgnoreCase("FUNCIONARIO")){
            System.out.println("Acesso basico!");
        } else {
            System.out.println("Acesso invalido!");
        }
        entrada.close();
    }
}
