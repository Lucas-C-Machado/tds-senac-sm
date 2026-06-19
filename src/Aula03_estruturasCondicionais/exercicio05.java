package Aula03_estruturasCondicionais;

public class exercicio05 {
    public static void main (String[]args){
        String login  = "admin";
        int senha = 1234;
        
        if (login == "admin" && senha == 1234){
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Usuario ou senha invalidos");
        }
    }
}
