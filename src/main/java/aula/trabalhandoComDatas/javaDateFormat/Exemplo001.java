package aula.trabalhandoComDatas.javaDateFormat;

import java.text.DateFormat;
import java.util.Date;

public class Exemplo001 {
    public static void main(String[] args) {

        Date agora = new Date();

        String dateToStr = DateFormat.getDateInstance().format(agora);
        System.out.println(dateToStr);
        // 13 de ago. de 2021

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);
        // 13 de agosto de 2021 21:03

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(agora);
        System.out.println(dateToStr);
        // 13 de agosto de 2021 21:03:26 BRT

    }
}
