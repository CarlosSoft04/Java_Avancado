package Programacao_Funcional.Interfaces_Funcionais;


/**
 * Interface funcional signifca que a nossa classe possui apenas um metodo
 */
//Anotacao que garante que a minha interface nao ter mais que um metodo abstrato
@FunctionalInterface
public interface Interfaces_Funcionais {
    void imprimir(String msg);

}

class Main {
    public static void main(String[] args) {
        //Variavel funcao lambda
        //Lambda eh uma forma de escrever metodos e seus parametros de uma maneira curta de escrever uma implementacao de um metodo de uma interface funcinal
        Interfaces_Funcionais imprimir = (String nome) -> System.out.println("Olá " + nome);
        imprimir.imprimir("Carls");

    }
}
