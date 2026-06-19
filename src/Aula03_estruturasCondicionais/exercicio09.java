package Aula03_estruturasCondicionais;

public class exercicio09 {
    public static void main (String[]args){
        String login = "ADMIN";
        
        if (login == "ADMIN"){
            System.out.println("Acesso total!");
        } else if (login == "GERENTE"){
            System.out.println("Acesso intermediario");
        } else if (login == "FUNCIONARIO"){
            System.out.println("Acesso basico");
        } else {
            System.out.println("Acesso negado(Outros)");
        }
    }
}
