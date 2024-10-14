package WildCards;

import java.util.Arrays;
import java.util.List;

/**
 * O Upper Bounded Wildcard (coringa limitado superiormente) permite que um metodo aceite um lista de tipos
 * que são subclasses ou a própria classe especificada. Esse coringa é representado pela sintaxe '? extends Tipo'
 *
 * Use o Upper Bounded Wildcard quando você quiser **ler** valores de uma estrutura genérica,
 * pois ele garante que os elementos serão, no mínimo, do tipo especificado ou de suas subclasses.
 */

public class UpperBoundedWildCards {

    /**
     * O metodo sum calcula a soma dos elementos em uma lista que contem objetos do tipo 'Number' ou de qualquer
     * subclasse de `Number` (como `Integer`, `Double`, etc.). O wildcard `? extends Number` permite que a lista
     * contenha qualquer tipo que herde de `Number`, mas o metodo apenas le valores
     *
     * @param list uma lista que contém elementos que são subclasses de `Number`
     * @return a soma dos valores na lista
     */
    public static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number i : list)
            sum += i.doubleValue();  // Converte os valores para double e soma
        return sum;
    }

    /**
     * No metodo 'main',demonstramos o uso do wildcard limitado superiormente ao somar listas de diferentes tipos
     * que são subclasses de `Number`, como `Integer` e `Double`.
     *
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args) {
        // Lista de inteiros (Integer)
        List<Integer> integers = Arrays.asList(4, 5, 6, 7, 8);

        // Lista de números decimais (Double)
        List<Double> doubles = Arrays.asList(2.2, 2.4, 4.9);

        // Impressão das listas e resultado da soma utilizando o método sum
        System.out.println("Lista de inteiros: " + integers);
        System.out.println("Soma dos inteiros: " + sum(integers));

        System.out.println("\nLista de doubles: " + doubles);
        System.out.println("Soma dos doubles: " + sum(doubles));
    }

    /**
     * Pq nao podemos adicionar dados com o UpperBounded?
     * Pois o compilador nao sabe o tipo especifico que a lista contem, apoenas eh um tipo que herda de Number,
     * oque geraria inconsistencias
     *
     */
}
