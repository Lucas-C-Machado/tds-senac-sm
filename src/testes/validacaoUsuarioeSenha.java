package testes;

import java.util.Scanner;

public class validacaoUsuarioeSenha {
    public static void main(String[] args) {
        
        //Validação de Usuário e Senha - Utilizando o Scanner
        
//        Scanner entrada = new Scanner(System.in);
//        
//        String usuario = "admin123";
//        String senha = "Lucas1";
//        
//        System.out.println("=== BEM VINDO AO SISTEMA DO LUSCAS ===");
//        
//        System.out.println("Digite o seu usuario: ");
//        String respostaUsuario = entrada.nextLine();
//        
//        System.out.println("Digite a sua senha: ");
//        String respostaSenha = entrada.nextLine();
//        
//        if (respostaUsuario.equals(usuario) && respostaSenha.equals(senha)){
//            System.out.println("Acesso liberado! Bem vindo " + respostaUsuario);
//            System.out.println("O seu usuario e: admin123" );
//            System.out.println("A sua senha e: Lucas1" );
//        } else{
//            System.out.println("Usuario ou senha invalidos!");
//        }
        
        //Validação de Usuário e Senha - Simplificado
        
        String usuario = "admin23";
        int senha = 123;
        
        if (usuario.equals("admin123") && senha == 123){
            System.out.println("Acesso liberado! Bem vindo!");
        } else{
            System.out.println("Usuario ou senha invalidos");
        }
        
    }
}
