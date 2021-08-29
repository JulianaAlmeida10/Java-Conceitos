package aula.paradigmasJava;

import java.util.HashMap;
import java.util.Map;

/*
*  Utilizando a tecnica de mapeamento na recursividade, para ser mais rapido
*
*   Funcionamento: Processa o fatorial (15!), guarda o resultado em um MAPA
*   realiza varios fatoriais ....
*   Quando o mesmo fatorial for solicitado, o resultado já esta arquivado na memoria (MAPA)
*   Vantagem o processamento é mais rapido, pois ele só busca no MAPA o resultado, não tendo que calcular novamente
*/
public class FatorialMemoization {
    static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();

    public static void main(String[] args) {
        long I = System.nanoTime(); //calcula tempo em segundos atuais (tempo INICIO)
        System.out.println(fatorialComMemorizacao(15)); //calculando o fatorial
        // 2004310016
        long F = System.nanoTime(); // tempo FINAL
        System.out.println("FATORIAL 1:  "+(F-I)); // tempo_FINAL - tempo_INICIO
        // FATORIAL 1 215601      (resultado -> quanto tempo gastei para processar ele)

        // fazendo a chamada novamente, verificando quanto tempo foi gasto para processar o mesmo valor
        I = System.nanoTime();
        System.out.println(fatorialComMemorizacao(15));
        // 2004310016
        F = System.nanoTime();
        System.out.println("FATORIAL 2:  "+(F-I));
        // FATORIAL 2 69000
    }

    public static Integer fatorialComMemorizacao( Integer valor) {
        if (valor == 1){
            return valor;
        } else {
            // valor existe dentro do mapa
            if (MAPA_FATORIAL.containsKey(valor)){
                return MAPA_FATORIAL.get(valor);
            } else { //se não -> fazer o fatorial do valor e retornar para chave do parametro
                Integer resultado = valor * fatorialComMemorizacao(valor - 1);
                MAPA_FATORIAL.put(valor, resultado);
                return resultado;
            }
        }
    }
}

