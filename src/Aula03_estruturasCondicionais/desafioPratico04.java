package Aula03_estruturasCondicionais;

import java.util.Scanner;

public class desafioPratico04 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
                
        double valorTotal = 0.0;
        
        System.out.println("=== SISTEMA DE ESTACIONAMENTO ===");
        System.out.println("||     Vaga VIP -> R$ 30,00    ||");
        System.out.println("||     Vaga COMUM -> R$ 15,00  ||");
        System.out.println("||Taxa extra pos 3h -> R$ 15,00||");
        System.out.println("=================================");
        
        System.out.println("Qual e o tipo da sua vaga? ");
        String resposta = entrada.nextLine();
        
        if (resposta.equalsIgnoreCase("VIP")){
            System.out.println("O valor e: R$ 30,00");
            valorTotal += 30;
        } else {
            System.out.println("O valor e: R$ 15,00");
            valorTotal += 15;
        }
        
        System.out.println("Voce e mensalista? ");
        String ehMensalista = entrada.nextLine();
        
        if (ehMensalista.equalsIgnoreCase("Sim")){
            System.out.println("E gratuito! Voce nao precisa pagar! ");
            valorTotal = 0;
        } else {
            System.out.println("Neste caso o valor se mantem em R$ 15,00");
        
            System.out.println("Quanto tempo voce ficou fora? ");
            int horas = entrada.nextInt();

            if (horas >= 3){
                System.out.println("Voce tera que pagar uma taxa extra de R$ 5,00");
                valorTotal += 15;
            } else {
                System.out.println("Sem taxas extras adicionais...");
            }
        }
        System.out.println("Valor total e de: R$ " + valorTotal);
        entrada.close();
    }
}
