package estruturasCondicionais;

/**
  documentação
 */

public class exercicio04 {
    public static void main(String[] args) {
        
        String vaga = "VP";
        
        System.out.println("======================");
        System.out.println("SISTEMA ESTACIONAMENTO");
        System.out.println("======================");

        if (vaga.equals("VIP")){
            System.out.println("O valor da sua vaga e R$ 20.00!");
        } else {
            System.out.println("O valor da sua vaga e R$ 10.00!");
        }
    }
}
