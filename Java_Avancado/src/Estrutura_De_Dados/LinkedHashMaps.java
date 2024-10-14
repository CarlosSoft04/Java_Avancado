package Estrutura_De_Dados;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps {

    /**
     * LinkedHashMap respeita a ordem de inserção dos registros
     * Podemos tambem configurar o LinkedHashMap para ter ordenacao com base nos itens mais acessados
     */
    public static void main(String[] args) {
        /**
         * O LinkedHashMap permite que os itens mais acessados da lista sejam movidos para posicoes mais proximas no mapa,
         * melhorando a performance onde o acesso frequente a certos elementos sao esperados
         *
         * O parametro 4 define a capacidade inicial do mapa
         * -> 0,75f é o fator de carga que indica a proporcao de ocupacao que o mapa deve atingir
         * -> O "False" significa que a ordem de insercao sera mantida, se definirmos como true o linkedHashMap sera configurado para
         * reordenar o mapa e mandar os itens mais acessados para o final da lista.
         */
        Map<Integer, String> mapa = new LinkedHashMap<>(
                4, 0.75f, false
        );
        mapa.put(104, "Carlos");
        mapa.put(101, "Carol");
        mapa.put(102, "Carpete");

        for (Map.Entry<Integer, String> entrada : mapa.entrySet()) {
            int matricula = entrada.getKey();
            String nome = entrada.getValue();

        }
    }
}
