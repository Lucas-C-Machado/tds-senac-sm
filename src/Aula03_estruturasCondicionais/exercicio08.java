package Aula03_estruturasCondicionais;

public class exercicio08 {
    public static void main (String[]args){
        int idade = 18;
        
        if (idade <= 12){
            System.out.println("Sou uma CRIANCA");
        } else if (idade >= 13 && idade <= 17){
            System.out.println("Sou um ADOLESCENTE");
        } else {
            System.out.println("Sou um ADULTO");
        }
    }
}
