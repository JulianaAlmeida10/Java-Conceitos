package aula.paradigmasJava;

/*
*  Na recursividade, uma função chama a si mesma repetidamente, até atingir uma condição de parada.
*
*   fatorial de 5:
*       5 * 4 * 3 * 2 * 1 => 120
*/
public class FatorialRecursivo {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
        // 120
    }

    // multiplica o valor pelo antecesor
    public static int fatorial(int valor){
        if (valor == 1){
            return valor;
        } else {
            return valor * fatorial((valor -1));
        }
    }
}
