package aula.interfacesFuncionais;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        //** Nome ao Contrario
        Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();

        System.out.println(retornarNomeAoContrario.apply("juliana"));
        // anailuj

        //** Tranformando String em Inteiro e dobrar o valor
        Function<String, Integer> converterStringParaInteiroECalcularODobro = string -> Integer.valueOf(string) * 2;

        System.out.println(converterStringParaInteiroECalcularODobro.apply("20"));
        // 40
    }
}
