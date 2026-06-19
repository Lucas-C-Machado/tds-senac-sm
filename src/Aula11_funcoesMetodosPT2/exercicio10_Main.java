package Aula11_funcoesMetodosPT2;

public class exercicio10_Main {
    public static void main(String[] args) {
        
        // Passo 1: Inicializa e desenha a tela (Ex 01)
        exercicio01.exibirMenu();
        
        // Passo 2: Valida o acesso do operador do sistema (Ex 02)
        // O sistema só avança se a função de autenticação retornar 'true'
        if (exercicio02.autenticarOperador()) {
            
            // Passo 3: Começa a captura encadeada de informações do estudante (Ex 03, Ex 04 e Ex 05)
            // Cada função roda seu próprio Scanner e traz o dado limpo para a Main armazenar
            String alunoNome = exercicio03.coletarNome();
            int alunoMatricula = exercicio04.coletarMatricula();
            double alunoNota = exercicio05.coletarNotaVestibular();
            
            // Passo 4: Processamento lógico dos dados coletados (Ex 06)
            // Pegamos a nota armazenada na Main e jogamos para a função de cálculo financeiro
            String situacaoFinalVaga = exercicio06.definirCategoria(alunoNota);
            
            // Passo 5: Geração dos parâmetros de segurança (Ex 07)
            long tokenGerado = exercicio07.gerarTokenProcesso();
            
            // Passo 6: Auditoria de fatiamento de texto (Ex 08)
            exercicio08.validarRegionalMatriz(tokenGerado);
            
            // Passo 7: Emissão e consolidação do sistema completo (Ex 09)
            // Unificamos todas as respostas coletadas na jornada em um único relatório
            exercicio09.emitirContratoFinal(alunoNome, alunoMatricula, situacaoFinalVaga, tokenGerado);
            
        } else {
            System.out.println("\n[SISTEMA ENCERRADO] Nao foi possivel prosseguir com as matrículas.");
        }
    }
}