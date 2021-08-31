package aula.interfacesFuncionais;

/*
*  Função de Alta Ordem
*   É uma função que retorna uma função ou que recebe uma função como parâmetro
*/
public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        //o que irá fazer, quando mandar executar o comando
        Calculo soma = (a, b) -> a+b;
        Calculo subtracao = (a, b) -> a-b;
        Calculo multiplicacao = (a, b) -> a*b;
        Calculo divisao = (a, b) -> a/b;

        // exibindo resultados
        System.out.println(executarOperacao(soma, 1, 3));
        // 4
        System.out.println(executarOperacao(subtracao, 4, 3));
        // 1
        System.out.println(executarOperacao(multiplicacao, 7, 3));
        // 21
        System.out.println(executarOperacao(divisao, 4, 2));
        // 2
    }

    //função de alta ordem
    public static int executarOperacao(Calculo calculo,int a,int b){
        return calculo.calcular(a,b);
    }

    @FunctionalInterface
    interface Calculo{
        public int calcular(int a, int b);
    }
}
