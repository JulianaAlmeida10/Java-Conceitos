package aula.interfacesFuncionais;

/* Predicate -> faz validação
    Recebe um parametro e retorna um boolean (true / false)
*/

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
        // valida se está vizio
        Predicate<String> estaVazio = valor -> valor.isEmpty();

        System.out.println(estaVazio.test(""));
        // true
        System.out.println(estaVazio.test("Joao"));
        // false
    }
}
