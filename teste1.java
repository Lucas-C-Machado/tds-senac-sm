package arrays;

public class teste1 {
   public static void main (String[]args){
       
       // 1. Declaramos o vetor de Strings com tamanho 5
       String[] placas = new String[5];
       
       // CORREÇÃO: Atribuímos os valores direto no vetor, sem colocar "int" ou "String" na frente
       placas[0] = "ABC123";
       placas[1] = "XYZ987";
       placas[2] = "MNO456";
       placas[3] = "KJG789";
       placas[4] = "DEF111";
       
       // 2. O laço percorre o vetor de 0 a 4 e mostra cada placa na tela
       System.out.println("--- LISTAGEM DE PLACAS ---");
       for (int i = 0; i < 5; i++){
            System.out.println("Posicao [" + i + "] = " + placas[i]);
       }
   } 
}