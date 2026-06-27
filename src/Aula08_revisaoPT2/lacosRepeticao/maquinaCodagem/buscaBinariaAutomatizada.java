package Aula08_revisaoPT2.lacosRepeticao.maquinaCodagem;

import java.util.Random;

public class buscaBinariaAutomatizada {

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("        MAQUINA DE CODAGEM - REVISAO 02          ");
        System.out.println("           BUSCA BINARIA AUTOMATIZADA            ");
        System.out.println("=================================================");

        // Gerando o número secreto aleatório entre 1 e 100
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;

        System.out.println("\nNumero Secreto Gerado pela Maquina: " + numeroSecreto);
        System.out.println("-------------------------------------------------");
        
        // EXECUTANDO O DESAFIO BÔNUS: A máquina adivinhando de forma inteligente
        System.out.println("Iniciando IA de Busca Binaria (Meta: Máx 7 tentativas)...");
        executarBuscaBinariaAutomatica(numeroSecreto);
        System.out.println("-------------------------------------------------");
    }

    /**
     * REQUISITO BASE & BÔNUS: Usa while(true) e estratégia de Busca Binária
     * para encontrar o número dividindo o espaço de busca ao meio a cada erro.
     */
    public static void executarBuscaBinariaAutomatica(int segredo) {
        int limiteInferior = 1;
        int limiteSuperior = 100;
        int tentativas = 0;

        // REQUISITO: Uso estrito do laço estruturado while(true)
        while (true) {
            tentativas++;

            // ESTRATÉGIA BÔNUS: Divide o espaço de busca exatamente ao meio
            int palpite = limiteInferior + (limiteSuperior - limiteInferior) / 2;
            
            System.out.printf("Tentativa #%d | Espaco: [%d - %d] | Palpite da Maquina: %d\n", 
                    tentativas, limiteInferior, limiteSuperior, palpite);

            // Validação de acerto ou direcionamento (Maior / Menor)
            if (palpite == segredo) {
                System.out.println("\nACERTOU! O numero secreto realmente era " + palpite);
                System.out.println("Total de tentativas utilizadas: " + tentativas);
                
                // REQUISITO: Uso obrigatório do break ao encontrar a resposta
                break; 
            } else if (palpite < segredo) {
                System.out.println("Errou! O numero secreto e MAIOR.");
                // Ajusta o limite inferior para eliminar a metade menor do espaço
                limiteInferior = palpite + 1;
            } else {
                System.out.println("Errou! O numero secreto e MENOR.");
                // Ajusta o limite superior para eliminar a metade maior do espaço
                limiteSuperior = palpite - 1;
            }
            System.out.println(".................................................");
        }
    }
}