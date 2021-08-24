package aula.trabalhandoComDatas.LocalDate;

import java.time.LocalDate;

public class Exemplo002 {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        // a data atual menos 1
        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);
        //2021-08-24

        System.out.println(ontem);
        //2021-08-23
    }
}
