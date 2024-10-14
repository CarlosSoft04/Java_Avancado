package Generics;

import java.util.List;

public class Generics_WildCards {

    /**
     * Aplicando wildcards com generics, conseguimos especificar uma lista de objetos genéricos,
     * desde que esses objetos sejam instâncias que estendam uma superclasse específica.
     * Isso permite maior flexibilidade ao trabalhar com tipos genéricos.
     */

    // Superclasse
    static class Animal {
        @Override
        public String toString() {
            return "Animal";
        }
    }

    // Subclasse que estende a superclasse e sobrescreve o metodo da superclasse
    static class Cachorro extends Animal {
        @Override
        public String toString() {
            return "Cachorro";
        }
    }

    // Subclasse que estende a superclasse e sobrescreve o modo da superclasseét
    static class Gato extends Animal {
        @Override
        public String toString() {
            return "Gato";
        }
    }

    /**
     * Metodo que imprime uma lista de naimais utilizando wildcards
     * O wildcard `? extends Animal` permite que sejam passadas listas de qualquer classe
     * que seja uma subclasse de `Animal`, garantindo compatibilidade com o Princípio de Substituição de Liskov (LSP).
     *
     * @param animais lista de objetos que estendem a classe Animal
     */
    public static void ImprimirListaAnimais(List<? extends Animal> animais) {
        for (Animal animal : animais) {
            System.out.println(animal);
        }
    }

    /**
     * Metodo que demonstra o uso de wildcards com listas de diferentes tipos de animais
     * Metodo main que demonstra o uso de wildcards comlistas de diferentes tipos de animais
     * É possível imprimir listas específicas de gatos ou cachorros sem violar a compatibilidade do sistema.
     *
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        // Lista de diferentes tipos de animais
        List<Animal> lista = List.of(gato, cachorro);
        ImprimirListaAnimais(lista);  // Imprime uma lista com diferentes animais

        // Agora, com wildcards, posso imprimir uma lista apenas de gatos ou apenas de cachorros
        List<Gato> listaGatos = List.of(new Gato(), new Gato());
        System.out.println("\nLista de gatos:");
        ImprimirListaAnimais(listaGatos);  // Imprime uma lista apenas de gatos

        List<Cachorro> listaDogs = List.of(new Cachorro(), new Cachorro());
        System.out.println("\nLista de cachorros:");
        ImprimirListaAnimais(listaDogs);  // Imprime uma lista apenas de cachorros
    }
}
