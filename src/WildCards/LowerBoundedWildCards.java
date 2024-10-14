package WildCards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Esse WildCard permite que um metodo ou estrutura aceite uma lista de uma superclasse aotipo especificado.
 * Util quando quiser modificar ou adicionar elementos em uma lista
 *
 *  Representado por <? super Integer >.
 *
 * Ex: IMgaine um sistema de pedidos onde vc deseja adicionar diferentes tipos de produto a uma lista generica de itens
 */
public class LowerBoundedWildCards {

    /**
     * Metodo para imprimir a lista.
     * @param list
     */
    public static void printApenasIntegers(List<? super Integer> list){
        System.out.println(list);

    }

    //Contrario do Upeer, ele aceita superclasses da minha subclasse
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,4,5);
        //Repare que aqui estou acessando a minha superclasse
        List<Number> numbers = Arrays.asList(5.0,8.9,88.7);

        //NAO ACEITA DOUBLE POIS NAO EH SUPERCLASSE DO INTEGER
        List<Double> doubles = List.of(1.0,2.0);
        //printApenasIntegers(doubles);

        printApenasIntegers(integers);
        printApenasIntegers(numbers);

        /**RESUMO
         * Upper Bounded (? extends T): Para ler dados de uma lista que contém subclasses de T.
         * Lower Bounded (? super T): Para modificar ou adicionar dados em uma lista que aceita T ou suas superclasses.
         */
    }
}
