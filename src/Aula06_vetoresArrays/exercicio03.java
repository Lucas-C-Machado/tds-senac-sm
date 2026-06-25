package Aula06_vetoresArrays;

import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Vetor previamente populado com exemplos para otimizar o teste da turma
        String[] alunos = {"Lucas", "Maria", "Pedro", "Ana", "Joao"};

        System.out.println("=================================================");
        System.out.println("          SISTEMA DE BUSCA DE ALUNOS             ");
        System.out.println("=================================================");
        System.out.println();

        // REQUISITO: Perguntar o nome procurado
        System.out.print("Digite o nome: ");
        String nomeProcurado = teclado.nextLine();

        // LÓGICA DE PESQUISA: Variável flag para rastrear o estado da busca
        boolean encontrado = false;

        // REQUISITO: Verificar se existe no vetor usando percorrimento
        for (int i = 0; i < alunos.length; i++) {
            // REQUISITO CRÍTICO: Utilizar .equals() para comparação de Strings
            if (alunos[i].equalsIgnoreCase(nomeProcurado)) {
                encontrado = true;
                break; // Interrompe o laço assim que encontra, poupando processamento
            }
        }

        // REQUISITO: Exibição do resultado esperado com mensagens limpas
        System.out.println();
        if (encontrado) {
            System.out.println("Aluno encontrado.");
        } else {
            System.out.println("Aluno nao encontrado.");
        }
        System.out.println("-------------------------------------------------");

        teclado.close();
    }
}