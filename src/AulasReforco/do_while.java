package AulasReforco;

import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        
        //Exemplo de menus com Do While
        
        Scanner entrada = new Scanner(System.in);
        
        int opcao = 0;
        
        do{
            System.out.println("===      MENU INTERATIVO    ===");
            System.out.println("||   1 - Cadastrar           ||");
            System.out.println("||   2 - Atualizar cadastro  ||");
            System.out.println("||   3 - Sair                ||");
            
            System.out.println("Escolha uma das opcoes acima: ");
            
            
            opcao = entrada.nextInt();
            entrada.nextLine();
            

            if (opcao == 1) {
                System.out.println("Qual o seu nome? ");
                String resposta = entrada.nextLine();
                System.out.println("Cadastrado com sucesso: " + resposta);
            } else if (opcao == 2) {
                System.out.println("Qual o seu nome atual? ");
                String resposta = entrada.nextLine();
                System.out.println("Cadastro atualizado: " + resposta);
            } else if (opcao == 3) {
                // Apenas ignora para sair do loop sem mostrar "Opção inválida"
            } else {
                System.out.println("Opcao inválida! Digite novamente");
            }
            
        }while(opcao != 3);
            System.out.println("Obrigado por ter utilizado todas as funcionalidades do nosso sistema!");
    
        entrada.close();
    }
}
