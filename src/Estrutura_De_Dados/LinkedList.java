package Estrutura_De_Dados;


public class LinkedList {

    /**
     * O LinkedList é uma coleção que possui vantagens como inserção e remoção de elementos de forma mais performática e menos custosa,
     * por ser estruturado em nós encadeados por ponteiros. Nesse caso, é melhor que o ArrayList, pois o ArrayList realiza um shift de
     * todos os elementos subsequentes ao inserir ou remover no meio da lista.
     *
     * Porém, em relação à busca de elementos na coleção, o LinkedList é menos performático e mais custoso que o ArrayList,
     * pois ele itera sobre cada elemento até encontrar o desejado. Já o ArrayList tem acesso direto aos elementos devido à alocação
     * sequencial de memória.
     *
     * Ou seja:
     * -> LinkedList: Mais eficiente para inserções e remoções frequentes, especialmente no meio ou início da lista.
     * -> ArrayList: Mais eficiente para leituras frequentes.
     */


    public static void main(String[] args) {
        var MyList = new java.util.LinkedList<String>(); //Criando uma lista de Strings
        //Inserindo itens na lista
        MyList.add("A");
        MyList.add("B");
        MyList.add("C");

        System.out.println(MyList);
        //Removendo
        MyList.remove("C");

        System.out.println(MyList);

    }
}
