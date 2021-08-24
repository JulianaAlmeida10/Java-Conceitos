package aula.trabalhandoComDatas.javaDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Converta a Data atual no formato DD/MM/YYYY   HH:MM:SS:MMM
 */

/*
 * d  -> Day in month
 * M  -> Month in year (context sensitive)
 * y  -> Year
 * h  -> Hour in am/pm (1-12)
 * m  -> Minute in hour
 * s  -> Second in minute
 * S  -> Millisecond
 * referência: https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
 */

public class Desafio {
    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:SSS");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
        // 13/08/2021 09:20:34:181
    }
}
