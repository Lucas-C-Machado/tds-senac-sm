package AulasReforco;

import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //Exemplo do Funcionamento do for
        
        //Exemplo de incrementação de contador
//        for (int i = 0; i <= 10; i++){
//            System.out.println("O contador atual esta em: " + i);
//        }
          
          //Exemplo de decrementação
//          for (int granada = 5; granada >= 0; granada--){
//              System.out.println("A granada vai explodir em: " + granada);
//          }
//          
//          System.out.println("BOOOM!!!");

          //Exemplo de validação de senhas

          int senhaCorreta = 123;
          boolean acessoLiberado = false;
          
          for (int tentativa = 1; tentativa <= 3; tentativa++) {
              System.out.print("Digite a sua senha (Tentativa " + tentativa + " de 3): ");
              int resposta = entrada.nextInt();
              
              if (resposta == senhaCorreta) {
                  System.out.println("Acesso liberado ao sistema!");
                  acessoLiberado = true;
                  break; // O 'break' interrompe o for imediatamente, pois a senha já está certa
              } else {
                  System.out.println("Senha incorreta!");
              }
          }
          
          // Mensagem final caso o usuário erre as 3 vezes
          if (!acessoLiberado) {
              System.out.println("Numero maximo de tentativas excedido. Acesso bloqueado!");
          }
          
          entrada.close();
          
          
    }
}
