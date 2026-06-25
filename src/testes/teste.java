package testes;

public class teste {
    public static void main(String[] args) {
        
        int idade = 8;
        
        //Primeira tentativa (se a condição for atendida, faça isso)
        if (idade <= 4){
            System.out.println("Sou um bebe");
        } 
        
        //Segunda tentativa (caso a primeira tentativa não der certo faça isso)
        else if (idade >= 5 && idade <= 10){
            System.out.println("Sou uma crianca");
        } 
        
        //Terceira tentativa (caso a segunda tentativa não der certo faça isso)
        else if(idade >= 11 && idade <= 13){
            System.out.println("Sou um pre-adolescente");
        } 
        
        //Quarta tentativa (caso a terceira tentativa não der certo faça isso)
        else if(idade >= 14 && idade <= 17){
            System.out.println("Sou um adolescente");
        } 
        
        //Quinta tentativa (caso a quarta tentativa não der certo faça isso)
        else if(idade >= 18 && idade <= 59){
            System.out.println("Sou um adulto");
        } 
        
        //Sexta e última tentativa (caso nada der certo, faça isso)
        else {
            System.out.println("Sou um senhor");
        }
        
    }
}
