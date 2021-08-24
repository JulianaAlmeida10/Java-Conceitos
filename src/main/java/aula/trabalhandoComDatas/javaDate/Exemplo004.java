package aula.trabalhandoComDatas.javaDate;

import java.util.Date;

public class Exemplo004 {
    public static void main(String[] args){

        Date dataNoPassado = new Date(1513124807691L);
        //Tue Dec 12 22:26:47 BRST 2017
        Date dataNoFuturo = new Date(1613124807691L);
        //Fri Feb 12 07:13:27 BRT 2021
        Date mesmaDataNoFuturo = new Date(1613124807691L);
        //Fri Feb 12 07:13:27 BRT 2021

        /** Comparando se as datas são iguais */
        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);

        System.out.println(isEquals);
        //true

        /** Comparando uma data com a outra */
        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo);
        //passado == futuro  -> false
        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado);
        //futuro == passado  -> false
        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo);
        //futuro == mesmaDataFuturo   -> true

        System.out.println(compareCase1);
        // -1 (está no tempo anterior do que está sendo comparado)
        System.out.println(compareCase2);
        // 1 (a data que está comparando esta na frente/no futuro)
        System.out.println(compareCase3);
        // 0 (as datas são iguais)

    }
}
