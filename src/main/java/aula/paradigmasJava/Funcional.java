package aula.paradigmasJava;

import java.util.function.UnaryOperator;

/*
*   O comportamento é declarado antes de usá-lo
*/
public class Funcional {
    public static void main(String[] args) {

        // o que valor deve faz (OBS: no momento valor, não está sendo executado)
        UnaryOperator<Integer> calcularValorVezes3 = valor -> valor*3;
        int valor = 10;

        System.out.println("O resultado é :"+calcularValorVezes3.apply(10));
        // O resultado é :30
    }
}
