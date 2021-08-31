package aula.interfacesFuncionais;

import java.util.function.Supplier;

/*
   Suppliers -> não recebe parametro
*            -> retorna alguma coisa  get()
*/
public class Supridores {
    public static void main(String[] args) {
        //** retorna a instancia de uma pessoa
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
        System.out.println(instanciaPessoa.get());
        // nome: juliana, idade: 21

        /* ou */

        //** retorna a instancia de uma pessoa
        Supplier<Pessoa> instanciaPessoa2 = Pessoa::new;
        System.out.println(instanciaPessoa2.get());
        // nome: juliana, idade: 21
    }
}

//** Classe
class Pessoa {
    private String nome;
    private Integer idade;

    //** construtor
    public Pessoa() {
        nome = "juliana";
        idade = 21;
    }

    //** Ver os dados do objeto de forma mais clara
    @Override
    public String toString() {
        return  String.format("nome: %s, idade: %d", nome,idade);
    }
}

