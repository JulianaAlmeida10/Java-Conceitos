package aula.trabalhandoComDatas.javaDate;

import java.util.Date;

public class Desafio {
    public static void main(String[] args){
        Date dataDeNascimento = new Date(942028129786L);
        //Mon Nov 08 00:28:49 BRST 1999
        Date dataComparacao = new Date(1273894308520L);
        //Sat May 15 00:31:48 BRT 2010
        System.out.println(dataComparacao);

        /** Comparando uma data com a outra */
        int compareCase1 = dataDeNascimento.compareTo(dataComparacao);
        //passado(dataDeNascimento) == futuro(dataComparacao)  -> false

        System.out.println(compareCase1);
        // -1 (está no tempo anterior do que está sendo comparado, ou seja, a dataDeNascimento é anterio a data dataComparada)

    }
}
