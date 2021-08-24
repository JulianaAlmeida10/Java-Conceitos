package aula.trabalhandoComDatas.javaDate;

import java.util.Date;

public class Exemplo002 {
    public static void main(String[] args){
        Long currentTimeMillis = System.currentTimeMillis();//buscou no sistema operacional
        System.out.println(currentTimeMillis);
        //1628822327932

        Date novaData = new Date(currentTimeMillis);

        System.out.println(novaData);
        //Thu Aug 12 23:38:47 BRT 2021
    }
}
