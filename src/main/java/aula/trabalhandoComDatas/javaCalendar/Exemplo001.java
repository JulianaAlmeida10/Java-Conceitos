package aula.trabalhandoComDatas.javaCalendar;

import java.util.Calendar;

public class Exemplo001 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        System.out.println("A data corrente é : " + agora.getTime());
        // A data corrente é : Fri Aug 13 20:23:14 BRT 2021

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + agora.getTime());
        // 15 dias atrás: Thu Jul 29 20:23:14 BRT 2021

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + agora.getTime());
        // 4 meses depois: Mon Nov 29 20:23:14 BRT 2021

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime());
        // 2 anos depois: Wed Nov 29 20:23:14 BRT 2023
    }
}
