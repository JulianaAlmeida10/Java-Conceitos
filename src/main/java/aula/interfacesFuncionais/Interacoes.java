package aula.interfacesFuncionais;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interacoes {
    public static void main(String[] args) {
        String[] nomes = {"Juliana","Almeida","Juliana","Aprendendo","Linguagem","java"};
        Integer[] numeros = {1,2,3,4,5};
        imprimirNomesFiltrados(nomes);
        imprimirTodosOsNomes(nomes);
        imprimirODobroDeCadaItemDaLista(numeros);



        //** Lista
        // criando lista
        List<String> profissoes = new ArrayList<>();
        //adicionando valores na lista
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de Projeto");
        profissoes.add("Gerente de Qualidade");
        profissoes.add("Engenheiro");
        // exebindo nomes da lista, onde nome da profissao começa com 'Gerente'
        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);
        //Gerente de Projeto
        //Gerente de Qualidade

    }

//*******************************************************************************************
    public static void imprimirNomesFiltrados(String... nomes){

        String nomesParaImprimir= "";
        for (int i = 0; i < nomes.length; i++){
            if (nomes[i].equals("Juliana")){
                nomesParaImprimir+=""+nomes[i];
            }
        }

        System.out.println("Nomes do For: "+nomesParaImprimir);
        // Nomes do For: JulianaJuliana


        /*
        *  Faz o mesmo codigo a cima, de forma mais simplificada
        * */


        //** o array 'nomes' está dentro do Stream
        //** filtrando o nome Juliana
        String nomesParaImprimirDaStrem = Stream.of((nomes))
                .filter(nome  -> nome.equals("Juliana")) //para cada nome, verificar se é igual a 'Juliana'
                .collect((Collectors.joining())); // pega um array de String e transforma num arrey só

        System.out.println("Nomes do Strem: "+nomesParaImprimirDaStrem);
        // Nomes do Strem: JulianaJuliana
    }

    //***************************************************************************************************
    public static void imprimirTodosOsNomes(String... nomes){
        for (String nome : nomes){
            System.out.println("Imprimido pelo For: "+nome);
            //Imprimido pelo For: Juliana
            //Imprimido pelo For: Almeida
            //Imprimido pelo For: Juliana
            //Imprimido pelo For: Aprendendo
            //Imprimido pelo For: Linguagem
            //Imprimido pelo For: java
        }

        // ou

        Stream.of(nomes)
                .forEach(nome -> System.out.println("Imprimido pelo ForEach: "+nome));
        //Imprimido pelo ForEach: Juliana
        //Imprimido pelo ForEach: Almeida
        //Imprimido pelo ForEach: Juliana
        //Imprimido pelo ForEach: Aprendendo
        //Imprimido pelo ForEach: Linguagem
        //Imprimido pelo ForEach: java
    }


    //*******************************************************************************************************

    /*
    * (Integer... numeros)
    *  é a mesma coisa que
    * (Integer[] numeros)
    */
    public static void imprimirODobroDeCadaItemDaLista(Integer... numeros){
        for (Integer numero : numeros){
            System.out.println("Imprimido pelo For: "+numero * 2);
            //Imprimido pelo For: 2
            //Imprimido pelo For: 4
            //Imprimido pelo For: 6
            //Imprimido pelo For: 8
            //Imprimido pelo For: 10
        }

        //ou

        Stream.of(numeros)
                .map(numero -> numero * 2)
                .forEach(System.out::println);
        //2
        //4
        //6
        //8
        //10
    }
}
