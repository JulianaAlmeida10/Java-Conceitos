package aula.interfacesFuncionais;

import java.util.function.Consumer;

/**
 * Consumer é uma Interface
 * */
public class Consumidores {
    public static void main(String[] args) {
        // Method Reference
        // Consumer<String> imprimirUmaFrase = System.out::println;
        // @FunctionalInterface

        // utilizar o parametro na forma que foi recebido

        // Lambda (quando executado exibira na tela a frase passada)
        Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello Word");
        // Hello Word

        Consumer<String> imprimirUmaFrase2 = System.out::println;
        imprimirUmaFrase2.accept("Hello Word da frase 2");
        // Hello Word da frase 2
    }
}
