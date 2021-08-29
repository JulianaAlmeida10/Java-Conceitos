package aula.paradigmasJava;

/*
*  Faz a mesma coisa que a class 'FuncaoComLambda'
* só que para usala tem que criar um metodo, para chamar a interface
*
*   @Está pegando a interface 'Funcao' e criando um corpo pra ela
*/
public class FuncaoComClasseAnonima {
    public static void main(String[] args) {
        Funcao colocarPrefixoSenhorNaString = new Funcao(){
            @Override
            public  String gerar(String valor){
                return  "Sr. "+valor;
            }
        };
        System.out.print(colocarPrefixoSenhorNaString.gerar("Joao"));
        // Sr. Joao
    }
}
