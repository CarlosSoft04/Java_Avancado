package Generics;

public class Generics_em_Metodos {


    /**
     * Nesta classe voce vera o uso do Genercis em metodos
     * @param array informando que o parametro esperado é um array generico, ou seja, aceita qualqur tipo de dado
     * @param index variavel que armazenara o indice do meu array
     * @return
     * @param <T> operador diamente definindo dentro <> é generico
     */
    public static<T> T getElemento(T[] array, int index) {
        if (index >= array.length || index < 0) {
            return null; //Possivel breakpoint para inspecionar o indice e o array

        }
        return array[index];

    }



    public static void main(String[] args) {
        Integer[] numeros = {1,2,3,4,5};
        String[] strings = {"Carlos","Lucas","Pedro","Joao"};

        Object primeiroNumero = getElemento(numeros,0);  //Possivel breakpoint para ver a chamada e o valor de retorno
        System.out.println("Numero no indice 0 = " + primeiroNumero);

        Object primeiraString = getElemento(strings,0);
        System.out.println("Palavra no indice = 0 : " +primeiraString);

    }
}
