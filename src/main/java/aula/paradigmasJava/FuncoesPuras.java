package aula.paradigmasJava;

import java.util.function.BiPredicate;

/*
*   Paradigma Funcional:
*       verifica se x é maior que y
*       se sim :: true
*       se não :: false
*/
public class FuncoesPuras {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> verificarSeEMaior =
                (parametro, valorComparacao) -> parametro > valorComparacao;

        System.out.println(verificarSeEMaior.test(13, 12));
        // true
        System.out.println(verificarSeEMaior.test(13, 12));
        // true
    }
}
