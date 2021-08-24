package aula.trabalhandoComDatas.LocalDate;

import java.time.LocalDateTime;

/*
 *  Exemplo de como manipular LocalDateTime
 */
public class Exemplo005 {
    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);
        //2021-08-24T16:23:10.468294200

        //*** horas + 1
        //*** dia + 2
        //*** segundos + 12
        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);

        System.out.println(futuro);
        //2021-08-26T17:23:22.468294200
    }
}
