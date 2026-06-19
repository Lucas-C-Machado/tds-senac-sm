package Aula11_funcoesMetodosPT2;

import java.util.Scanner;

public class exercicio01_sistemaAcademicoEscolar_P1 {
    public static double notaAluno(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("====================");
        System.out.println("=== NOTA DO ALUNO===");
        System.out.println("====================");
        
        System.out.println("Qual e a sua nota? ");
        double notaDigitada = entrada.nextDouble();
        
        System.out.println(); //pula uma linha
        
        return notaDigitada;
    }
}
