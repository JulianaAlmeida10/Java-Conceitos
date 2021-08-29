package aula.paradigmasJava;

/*
*    5 * 4
*   20 * 3
*   60 * 2
*  120 * 1
*  => 120
*/

public class FatorialRecursividadeCauda {
    public static void main(String[] args) {
        System.out.println(fatorialA(5));
        // 120.0
    }

    public static double fatorialA (double valor) {
        return  fatorialRecursividadeCauda(valor,1);
    }

    public static double fatorialRecursividadeCauda(double valor, double numero){
        if (valor == 0){
            return numero;
        }
        return fatorialRecursividadeCauda(valor-1, numero * valor);
    }
}
