package Aula06_vetoresArrays;

public class exercicio04 {

    public static void main(String[] args) {
        
        // REQUISITO: O vetor pode possuir "null" em posições vazias (Simulando 5 vagas)
        String[] placas = {"ABC-1234", null, "XYZ-9876", null, "MNO-5555"};

        System.out.println("=================================================");
        System.out.println("          SISTEMA DE OCUPACAO DE VAGAS           ");
        System.out.println("=================================================");
        System.out.println();

        // REQUISITO: Inicialização do contador
        int vagasOcupadas = 0;

        // REQUISITO: Uso do laço for para percorrimento completo do vetor
        for (int i = 0; i < placas.length; i++) {
            
            // DICA DO SLIDE: Verificar se a posição não está vazia (diferente de null)
            if (placas[i] != null) {
                vagasOcupadas++; // Incrementa o contador de vagas preenchidas
            }
        }

        // REQUISITO: Exibição do resultado esperado limpo e direto
        System.out.println("-------------------------------------------------");
        System.out.println("Vagas ocupadas: " + vagasOcupadas);
        System.out.println("-------------------------------------------------");
    }
}