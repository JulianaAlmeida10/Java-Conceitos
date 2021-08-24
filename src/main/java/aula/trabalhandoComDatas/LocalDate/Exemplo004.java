package aula.trabalhandoComDatas.LocalDate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Exemplo004 {
    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();

        System.out.println(agora);
        //16:19:34.876166900

        //*** horaAtual + 1 Hora
        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(maisUmaHora);
        //17:19:34.876166900
    }
}
