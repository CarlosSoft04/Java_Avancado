package Programacao_Funcional.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Os streams sao uma sequenia de elementos que permitem diferentes tipos de operacoes para
 * manipulacao de ddados
 */

/**
 * filter(Predicate): Filtra elementos com base em uma condição.
 *  * map(Function): Transforma elementos de um tipo em outro.
 *  * flatMap(Function): Mapeia cada elemento para um stream e depois concatena os resultados.
 *  * distinct(): Remove duplicatas.
 *  * sorted(): Ordena os elementos.
 *  * Terminais: Executam o pipeline.
 *  * collect(): Converte o stream em uma coleção ou outro formato.
 *  * reduce(): Reduz o stream a um único valor, usando um acumulador.
 *  * forEach(): Executa uma ação para cada elemento.
 *  * count(): Conta os elementos no stream.
 */
public class Stream {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        //Exemplos de algumas operacos com Streams
        List<Integer> result = numeros.stream()
                .filter(n -> n > 2)
                .distinct()
                .sorted()
                .collect(Collectors.toList());   //Coleta os resultados em uma nova lista

        result.forEach(System.out::println);
    }


}
