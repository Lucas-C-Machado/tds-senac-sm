package Aula11_funcoesMetodosPT2;

public class exercicio01_sistemaAcademicoEscolar_Main {
    
    public static void main(String[]args) {
        double notaColetada = exercicio01_sistemaAcademicoEscolar_P1.notaAluno();
        
        String statusAluno = exercicio01_sistemaAcademicoEscolar_P2.notaCorte(notaColetada);
        
        exercicio01_sistemaAcademicoEscolar_P3.exibirBoletim(statusAluno);
    }
}