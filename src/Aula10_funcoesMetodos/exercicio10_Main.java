package Aula10_funcoesMetodos;

import java.util.Scanner;

public class exercicio10_Main {

    static String nomeAluno = "";
    static String matriculaAluno = "";
    static String statusMatricula = "Invalida";
    static int contadorAcessos = 0;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        executarSistema();
    }

    // EXERCÍCIO 09
    public static void executarSistema() {
        int opcao;
        do {
            System.out.println("\n=== MENU DO SISTEMA ===");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Consultar Aluno");
            System.out.println("3 - Validar Matricula");
            System.out.println("4 - Liberar Entrada e Registrar Acesso");
            System.out.println("5 - Gerar Relatorio");
            System.out.println("0 - Encerrar Sistema");
            System.out.print("Escolha uma opcao: ");
            
            opcao = teclado.nextInt();
            teclado.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    consultarAluno(nomeAluno, matriculaAluno);
                    break;
                case 3:
                    statusMatricula = validarMatricula(matriculaAluno);
                    System.out.println("[Sistema] Status: " + statusMatricula);
                    break;
                case 4:
                    String resultadoEntrada = liberarEntrada(statusMatricula);
                    System.out.println("[Catraca] " + resultadoEntrada);
                    if ("Entrada liberada".equalsIgnoreCase(resultadoEntrada)) {
                        contadorAcessos = registrarAcesso(contadorAcessos);
                    }
                    break;
                case 5:
                    exibirRelatorio(nomeAluno, matriculaAluno, contadorAcessos);
                    break;
                case 0:
                    System.out.println("Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);
    }

    // EXERCÍCIO 03
    public static void cadastrarAluno() {
        System.out.print("Digite o nome do aluno: ");
        nomeAluno = teclado.nextLine();
        System.out.print("Digite a matricula do aluno: ");
        matriculaAluno = teclado.nextLine();
        statusMatricula = "Nao Validada";
        System.out.println("[Sistema] Aluno cadastrado com sucesso!");
    }

    // EXERCÍCIO 04
    public static void consultarAluno(String nome, String matricula) {
        System.out.println("\n=== CONSULTA DE ALUNO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
    }

    // EXERCÍCIO 05
    public static String validarMatricula(String matricula) {
        if (matricula == null || matricula.trim().isEmpty()) {
            return "Matricula invalida";
        }
        return "Valida";
    }

    // EXERCÍCIO 06
    public static String liberarEntrada(String statusMatricula) {
        if ("Valida".equalsIgnoreCase(statusMatricula)) {
            return "Entrada liberada";
        }
        return "Entrada negada";
    }

    // EXERCÍCIO 07
    public static int registrarAcesso(int acessos) {
        return ++acessos;
    }

    // EXERCÍCIO 08
    public static void exibirRelatorio(String aluno, String matricula, int quantidadeAcessos) {
        System.out.println("\n=== RELATORIO DE ACESSO ===");
        System.out.println("Aluno cadastrado: " + aluno);
        System.out.println("Matricula: " + matricula);
        System.out.println("Quantidade de acessos: " + quantidadeAcessos);
    }
}