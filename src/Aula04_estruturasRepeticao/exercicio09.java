package Aula04_estruturasRepeticao;

import java.util.Scanner;

public class exercicio09 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        
        int opcao;
        
        do {
            System.out.println("=== SISTEMA DE NOTAS ESCOLARES ===");
            System.out.println("|| 1 -    Cadastrar nota        ||");
            System.out.println("|| 2 -    Sair do sistema       ||");
            System.out.println("==================================");
            
            System.out.println("Escolha uma das opcoes acima: ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            if (opcao == 1){
                System.out.println("Digite uma nota: ");
                double nota = entrada.nextDouble();
                if (nota >= 7){
                    System.out.println("APROVADO!");
                } else if(nota >= 5 && nota <= 7.9){
                    System.out.println("RECUPERACAO");
                } else{
                    System.out.println("REPROVADO");
                }
            } else if (opcao == 2){
                System.out.println("Encerrando sistema...");
            } else {
                System.out.println("Opcao invalida!");
            }
        } while(opcao != 2);
            System.out.println("Obrigado por ter utilizado o SISTEMA DE NOTAS ESCOLARES do Luscas!");
        entrada.close();
    }
}
