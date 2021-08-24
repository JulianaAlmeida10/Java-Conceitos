package aula.trabalhandoComDatas.javaCalendar;

import java.util.Calendar;

public class Exemplo002 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);
        // sex. ago. 13 20:46:39 BRT 2021

        System.out.printf("%tF\n", agora);
        // 2021-08-13

        System.out.printf("%tD\n", agora);
        // 08/13/21

        System.out.printf("%tr\n", agora);
        // 08:46:39 PM

        System.out.printf("%tT", agora);
        // 20:47:33
    }
}
