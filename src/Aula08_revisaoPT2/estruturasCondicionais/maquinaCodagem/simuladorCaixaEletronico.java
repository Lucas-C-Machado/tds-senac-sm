package Aula08_revisaoPT2.estruturasCondicionais.maquinaCodagem;

import java.util.Scanner;

public class simuladorCaixaEletronico {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("        MAQUINA DE CODAGEM - REVISAO 02          ");
        System.out.println("          SIMULADOR DE CAIXA ELETRONICO          ");
        System.out.println("=================================================");

        // Teste automático rápido com o exemplo do slide (R$ 130)
        System.out.println("\n Executando Teste Base do Slide:");
        processarSaque(130);

        // Interação direta com o usuário/aluno
        System.out.println("\n-------------------------------------------------");
        System.out.print("Digite o valor que deseja sacar: R$ ");
        
        // VALIDAÇÃO: Impede a entrada de textos ou caracteres inválidos
        if (!teclado.hasNextInt()) {
            System.out.println("ERRO CRITICO: O valor do saque deve ser um numero inteiro.");
            teclado.close();
            return;
        }

        int valorSaque = teclado.nextInt();
        processarSaque(valorSaque);

        teclado.close();
    }

    /**
     * Realiza a lógica de decomposição de cédulas e valida as regras de negócio.
     */
    public static void processarSaque(int valor) {
        System.out.println("Analisando solicitacao de saque de: R$ " + valor);

        // REQUISITO BÔNUS: Validação rígida de consistência de cédulas
        // Como as notas disponíveis são de 50, 20 e 10, qualquer valor que não seja 
        // múltiplo de 10 (ex: R$ 135 ou R$ 8) é impossível de sacar sem truncar.
        if (valor <= 0 || valor % 10 != 0) {
            System.out.println("OPERACAO ABORTADA: Valor indisponivel para os valores de cedulas vigentes.");
            System.out.println("Nota: Este caixa disponibiliza apenas notas de R$ 50, R$ 20 e R$ 10.");
            return;
        }

        // Variável de controle do saldo restante a ser processado
        int restante = valor;

        // Algoritmo Ganancioso: Processa da maior nota para a menor
        int notas50 = restante / 50;
        restante = restante % 50; // O que sobrou passa para a próxima cédula

        int notas20 = restante / 20;
        restante = restante % 20;

        int notas10 = restante / 10;
        restante = restante % 10;

        // Exibição formatada do resultado (Apenas as notas que de fato serão entregues)
        System.out.println("Saque autorizado! Retire suas cedulas:");
        
        boolean entregouNota = false;
        if (notas50 > 0) {
            System.out.printf("%d nota(s) de R$ 50\n", notas50);
            entregouNota = true;
        }
        if (notas20 > 0) {
            System.out.printf("%d nota(s) de R$ 20\n", notas20);
            entregouNota = true;
        }
        if (notas10 > 0) {
            System.out.printf("%d nota(s) de R$ 10\n", notas10);
            entregouNota = true;
        }

        System.out.println("-------------------------------------------------");
    }
}