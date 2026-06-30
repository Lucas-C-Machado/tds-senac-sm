package testes;

import java.util.Scanner;

public class systemPrintf {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        //%d = Números inteiros
        //%s = Para textos
        //%f = float / "double"
        //%.1f = O float vai pegar um número após a vírgula
        
        System.out.println("Coloque o PRIMEIRO numero: ");
        var resposta = entrada.nextDouble();
        
        System.out.println("Coloque o SEGUNDO numero: ");
        var resposta1 = entrada.nextDouble();
        
        var resposta2 = resposta / resposta1;
        
        System.out.printf("A divisao entre %.0f e %.0f e = %.1f\n", resposta, resposta1, resposta2);
    }
}
