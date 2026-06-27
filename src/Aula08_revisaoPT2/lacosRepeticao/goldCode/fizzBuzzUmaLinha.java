package Aula08_revisaoPT2.lacosRepeticao.goldCode;

import java.util.stream.IntStream;

public class fizzBuzzUmaLinha {

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("        MAQUINA DE CODAGEM - REVISAO 02          ");
        System.out.println("             FIZZBUZZ DE UMA LINHA               ");
        System.out.println("=================================================");

        // ABORDAGEM 1: O laço enxuto com ternários encadeados (Foco do Slide)
        System.out.println("\nExecutando Abordagem Imperativa Compacta:");
        for (int i = 1; i <= 100; i++)
            System.out.print((i % 15 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : i) + " ");

        System.out.println("\n\n-------------------------------------------------");

        // ABORDAGEM 2: O verdadeiro "One-Liner" funcional (Usando Streams)
        System.out.println("Executando Abordagem Funcional (IntStream):");
        IntStream.rangeClosed(1, 100)
                .mapToObj(i -> i % 15 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : String.valueOf(i))
                .forEach(res -> System.out.print(res + " "));
                
        System.out.println("\n-------------------------------------------------");
    }
}