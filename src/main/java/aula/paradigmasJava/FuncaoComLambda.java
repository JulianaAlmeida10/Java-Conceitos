package aula.paradigmasJava;

/*
* É o mesmo codigo da class 'FuncaoComClasseAnonima'
*   A diferença é que utiliza-se Lambda com a interface 'Funcao'
*   OBS: o codigo ficou muito melhor
*/
public class FuncaoComLambda {
    public static void main(String[] args) {
        Funcao colocarPrefixoSenhorNaString =  valor -> "Sr. "+valor;
        System.out.println(colocarPrefixoSenhorNaString.gerar("Joao"));
        // Sr. Joao
    }
}

