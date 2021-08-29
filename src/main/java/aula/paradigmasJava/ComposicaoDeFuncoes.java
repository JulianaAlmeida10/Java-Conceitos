package aula.paradigmasJava;

import java.util.Arrays;

public class ComposicaoDeFuncoes {
    public static void main(String[] args) {

        int[] valores = {1,2,3,4};

        //** paradigma funcional
        // se o numero for par, pega o valor e multiplica por 2
        Arrays.stream(valores)
                .filter(numero -> numero % 2 == 0) //para cada numero verificar se o resto da divisão é igual a zero
                .map(numero -> numero * 2) // se o resto for igual a zero, pegar o numero e mutiplicar por 2
                .forEach(numero -> System.out.println(numero)); //exibir o resultado da mutiplicação



        /*
            MESMO CODIGO A CIMA, SÓ QUE NA FORMA IMPERATIVA
            //** paradigma imperativo
            for (int i = 0; i < valores.length; i++){
                int numero = 0;
                if (valores[i] % 2 == 0){
                    numero = valores[i] * 2;

                    if (numero != 0){
                        System.out.println(numero);
                    }
                }
            }
        */

    }
}
