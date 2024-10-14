package Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    /**
     * A classe Lista é genérica e permite armazenar qualquer tipo de dado nela,
     * garantindo flexibilidade e reutilização do código
     *
     * O uso do Generics evita a necessidade do 'casting' pois o tipo de dado é definido
     * no momento da criacao da instancia da class.
     *
     * @param <T> representa o tipo genérico que será utilizado
     */

     static class Lista<T> {
        private List<T> lista = new ArrayList<>();
        /**
         * Adiciona um item a lista
         * @param elemento do tipo <T> vai ser inserido na lista
         */
        public void add(T elemento) {
            lista.add(elemento);
        }

        /**
         * Obtem elemento da lista conforme seu indice
         * @param indice do elmento que será retornado
         * @return
         */
        public T obter(int indice) {
            return lista.get(indice);
        }

        public static void main(String[] args) {
            /**
             * Inserindo Integers na minha lista
             */
            Lista<Integer> numeros = new Lista<>();
            numeros.add(1);
            numeros.add(2);
            //Com o generics nao eh preciso fazer o casting para especificar o tipo de veriavel
            int numero = numeros.obter(0);
            int numero2 = numeros.obter(1);
            System.out.println(numero);
            System.out.println(numero2);

            //Inserindo Strings na minha lista
            Lista<String> texto = new Lista<>();
            texto.add("Ola");
            texto.add("Mundo");

            String textos = texto.obter(0);
            String textos2 = texto.obter(1);
            System.out.println(textos);
            System.out.println(textos2);


        }
    }
}
