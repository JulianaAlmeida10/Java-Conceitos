package aula.paradigmasJava;

public class LambdaComReturn {
    public static void main(String[] args) {
        Funcao1 colocarPrefixoSenhorNaString = valor -> {
          String valorComprefixo = "Sr. "+valor;
          String valorComPrefixoEPontoFinal = valorComprefixo+".";
          return valorComPrefixoEPontoFinal;
        };

        System.out.println(colocarPrefixoSenhorNaString.gerar("Sheldon"));
        // Sr. Sheldon.
    }

    //interface
    @FunctionalInterface
    interface Funcao1 {
        String gerar(String valor);
    }
}
