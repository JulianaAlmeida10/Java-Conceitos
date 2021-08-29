package aula.paradigmasJava;

import java.util.function.UnaryOperator;

/*
*   Imultabilidade: uma vez que uma variável recebe um valor, vai possuir esse valor para sempre,
*       ou quando criarmos um objeto ele não pode ser modificado.
*/
public class Imultabilidade {
    public static void main(String[] args) {

        int valor = 20; // imultabilidade
        UnaryOperator<Integer> retornaDobro = numero -> numero * 2; // pegar o valor e multiplicar por 2

        System.out.println(retornaDobro.apply(valor)); // retorna o dobro do valor
        // 40
        System.out.println(valor); // valor não será alterado
        // 20
    }
}
