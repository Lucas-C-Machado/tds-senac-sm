package Aula03_estruturasCondicionais;

import java.util.Scanner;

public class desafioPratico03 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        
        String cliente = "PREMIUM";
        
        System.out.println("=== CONTROLE DE DELIVERY ===");
        System.out.println("Qual o seu nome? ");
        String resposta = entrada.nextLine();
        
        System.out.println("Qual o seu pedido? ");
        String pedido = entrada.nextLine();
        
        System.out.println("O valor referente ao " + pedido + " foi de: R$ " + 50 + " o seu frete e gratis!");
        System.out.println("Voce mora a onde? ");
        String moradia = entrada.nextLine();
        
        if (moradia == "KM3"){
            System.out.println("Sem taxas de entrega");
        } else if (moradia == "Santa Marta"){
            System.out.println("Voce quase teve que pagar uma taxa de entrega. UFA");
        } else {
            System.out.println("A sua taxa de entrega sera de R$ 10,00");
        }
        
        System.out.println("Voce e cliente premium? ");
        String resposta1 = entrada.nextLine();
        
        if (resposta1.equalsIgnoreCase("SIM")){
            System.out.println("Voce tem um desconto de: R$ 15,00!");
        } else {
            System.out.println("Infelizmente voce nao tem um desconto...");
        }
        entrada.close();
    }
}
