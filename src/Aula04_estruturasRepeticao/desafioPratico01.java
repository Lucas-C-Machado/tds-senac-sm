package Aula04_estruturasRepeticao;

import java.util.Scanner;

public class desafioPratico01 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        var login = "admin";
        var senha = "1234";
        
        System.out.println("=========================================");
        System.out.println("DESAFIO 01 - SISTEMA DE LOGIN INTELIGENTE");
        System.out.println("=========================================");

        System.out.println("Digite o seu login: ");
        var loginScanner = entrada.nextLine();
        
        System.out.println("Digite a sua senha: ");
        var senhaScanner = entrada.nextLine();
        
        if(loginScanner.equalsIgnoreCase("admin") && senhaScanner.equals("1234")){
            System.out.println("Bem-vindo " + login);
        } else{
            for(var nTentativas = 1; nTentativas <= 3; nTentativas++){
                if (nTentativas <= 2){                    
                    System.out.println("Login ou senha invalidos!\nTentativa atual " + nTentativas + " de 3");
                    
                    System.out.println("Digite o seu login: ");
                    loginScanner = entrada.nextLine();
                    
                    System.out.println("Digite a sua senha: ");
                    senhaScanner = entrada.nextLine();
                                   
                    if(loginScanner.equalsIgnoreCase("admin") && senhaScanner.equals("1234")){
                        System.out.println("Bem-vindo " + login);
                        break;
                    }

                }else if(nTentativas == 3){
                    System.out.println("Login ou senha invalidos!\nTentativa atual " + nTentativas + " de 3");
                    System.out.println("Cuidado! Voce esta na ultima tentativa!");
                    
                    System.out.println("Digite o seu login: ");
                    loginScanner = entrada.nextLine();

                    System.out.println("Digite a sua senha: ");
                    senhaScanner = entrada.nextLine();
                } else {
                    System.out.println("Voce alcancou o numero maximo de tentativas, a sua conta foi bloqueada!");
                }
            }
        }
        entrada.close();
    }
}
