package Aula11_funcoesMetodosPT2;

public class exercicio01_sistemaAcademicoEscolar_P2 {
    public static String notaCorte(double notaDigitada){
        
        if (notaDigitada >= 7.0){
            return "APROVADO";
        } else{
            return "REPROVADO";
        }
    }
}
