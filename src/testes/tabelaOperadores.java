package testes;

public class tabelaOperadores {
    public static void main(String[] args) {
        
        System.out.println("=================================");
        System.out.println("===== TABELA DOS OPERADORES =====");
        System.out.println("=================================\n");
        
        System.out.println("OPERADORES LOGICOS - &&");
        System.out.printf("true  && true = %s\n", true);
        System.out.printf("false && false = %s\n", false);
        System.out.printf("true  && false = %s\n", false);
        System.out.printf("false && true = %s\n", false);
        System.out.println("----------------------------------\n");
        
        System.out.println("OPERADORES LOGICOS - ||");
        System.out.printf("true  || true = %s\n", true);
        System.out.printf("false || false = %s\n", false);
        System.out.printf("true  || false = %s\n", true);
        System.out.printf("false || true = %s\n", true);
        System.out.println("----------------------------------\n");
        
        System.out.println("OPERADORES LOGICOS - !");
        System.out.printf("!true  && !true = %s\n", false);
        System.out.printf("!false && !false = %s\n", true);
        System.out.printf("!true  && !false = %s\n", false);
        System.out.printf("!false && !true = %s\n", false);
        System.out.println("----------------------------------\n");
        
    }
}
