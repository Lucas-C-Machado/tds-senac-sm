package Aula05_menusInterativos;

import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String continuar = "SIM";

        System.out.println("=================================================");
        System.out.println("          SISTEMA DE NOTAS ESCOLAR SENAC         ");
        System.out.println("=================================================");

        // Laço para permitir calcular a média de múltiplos alunos em sequência
        while (continuar.equals("SIM")) {
            System.out.println("\n--- REGISTRO DE AVALIACAO ---");
            
            System.out.print("Nome do aluno: ");
            String nomeAluno = teclado.nextLine();

            // Entrada e validação da Nota 1
            double nota1 = -1;
            while (nota1 < 0 || nota1 > 10) {
                System.out.print("Digite a Nota 1 (0.0 a 10.0): ");
                if (!teclado.hasNextDouble()) {
                    System.out.println("Erro: Digite um numero valido.");
                    teclado.next(); // Limpa buffer
                    continue;
                }
                nota1 = teclado.nextDouble();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Erro: A nota deve estar entre 0.0 e 10.0.");
                }
            }

            // Entrada e validação da Nota 2
            double nota2 = -1;
            while (nota2 < 0 || nota2 > 10) {
                System.out.print("Digite a Nota 2 (0.0 a 10.0): ");
                if (!teclado.hasNextDouble()) {
                    System.out.println("Erro: Digite um numero valido.");
                    teclado.next(); // Limpa buffer
                    continue;
                }
                nota2 = teclado.nextDouble();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Erro: A nota deve estar entre 0.0 e 10.0.");
                }
            }
            teclado.nextLine(); // Limpa o buffer do teclado pós-double

            // REQUISITO: O sistema deve calcular a média
            double media = (nota1 + nota2) / 2.0;

            System.out.println("\n-------------------------------------------------");
            System.out.println("BOLETIM DO ALUNO:");
            System.out.println("Aluno(a): " + nomeAluno);
            System.out.printf("Notas: [N1: %.1f] | [N2: %.1f]\n", nota1, nota2);
            System.out.printf("MEDIA FINAL: %.2f\n", media);
            System.out.println("-------------------------------------------------");

            // REQUISITO: Regras da escola para o Resultado
            System.out.print("SITUACAO: ");
            if (media >= 7.0) {
                // Média >= 7 -> Aprovado
                System.out.println("APROVADO! Parabens!");
            } else if (media >= 5.0) {
                // Média >= 5 e < 7 -> Recuperação
                System.out.println("RECUPERACAO. Precisa estudar mais.");
            } else {
                // Média < 5 -> Reprovado
                System.out.println("REPROVADO. Retido na disciplina.");
            }
            System.out.println("-------------------------------------------------");

            // Pergunta para controle do loop principal
            System.out.print("\nDeseja calcular a media de outro aluno? (SIM ou NAO): ");
            continuar = teclado.nextLine().trim().toUpperCase();
            
            while (!continuar.equals("SIM") && !continuar.equals("NAO")) {
                System.out.print("Por favor, responda apenas com 'SIM' ou 'NAO': ");
                continuar = teclado.nextLine().trim().toUpperCase();
            }
        }

        System.out.println("\nSistema escolar encerrado. Boas ferias!");
        teclado.close();
    }
}