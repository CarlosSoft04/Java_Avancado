package Generics;

import java.util.List;

public class Liskov_Substitution {

    /**
     * O principio da substituicao de Liskov (LSP), garante que as subclasses possam ser usadas de forma intercambivel com suas superclasses
     * sem alterar o comportamento correto do programa.
     *
     * Ou seja, os objetos de uma superclasse devem poder substituir objetos da superclassse sem interromper na funcionalidade do programa.
     */

    /**
     * Metodo que ira impimrir a lista de animais
     * Como estamos usando o tipo 'Animal', podemos passar qualquer objeto que seja um subclsse de Animal
     * @param animais
     */
    public static void ImprimirListaAnimais(List<Animal> animais){
        for(Animal animal : animais){
            System.out.println(animal);
        }
    }

    //SuperClasse
    static class Animal{
        public String toString(){
            return "Ola sou um animal";
        }
    }

    //Subclasse que herda da superclasse Animal e sobrescreve o metodo da superclasse
     static class Gato extends  Animal {
         public String toString() {
             return "Ola sou um gato";
         }
     }
    //Subclasse que herda da superclasse Animal e sobrescreve o metodo da superclasse
        static class Cachorro extends Animal{
            public String toString(){
                return "Ola sou um cachorro";
            }
        }

    /**
     * Metodo main que esta instanciando dois objetos diferentes da mesma superclasse.
     *
     * Vmaos supor agora,que eu queira imrpimrir uma lista apenas de gatos ou uma lista apenas de cachorros, como faco isso sem ferir o
     * principio LSP? --> Conceito que abordaremos com WildCards,que permite trabalhar com lista de subclasse sem perder compatibilidade
     * @param args
     */
    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        List<Animal> animais = List.of(gato,cachorro);
        ImprimirListaAnimais(animais);







    }
}
