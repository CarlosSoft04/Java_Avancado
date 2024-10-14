package Generics;

import java.util.ArrayList;
import java.util.List;

public class VarArgs {

    /**
     * A classe TodoList permite gerenciar lista de tarefas com metodos de adicionar e exibir tarefas.
     */
    static class TodoList {

        List<String> lista = new ArrayList<>();

        /**
         * VarArgs é um recurso que permite passar um numero variavel de argumentos do mesmo tipo para um metodo.
         * Ou seja, ao usar VarArgs, o metodo pode ser chamado com diferentes quantidades de argumentos.
         * <p>
         * Use quando nao souber de antemao quantos argumentos serao passados.
         * Representado por '...' depois de definir o tipo da variavel.
         */
        public void add(String... tarefas) {
            for (String tarefa : tarefas) {
                lista.add(tarefa);
            }
        }

        /**
         * Metodo para exibir a minha lista de tarefas
         */
        public void exibir() {
            for (String tarefa : lista) {
                System.out.println(tarefa);

            }

        }

        /**
         * Repare que neste metodo "add2", é limitado, ja que vc so pode passar duas Strings como parametro.
         */
        public void add2(String tarefa1, String tarefa2) {
            lista.add(tarefa1);
            lista.add(tarefa2);
        }

        /**
         * Adicionando um array de tarefas a lista
         * @param tarefas
         */
        public void addLista(String[] tarefas) {
            for (String tarefa : tarefas) {
                lista.add(tarefa);

            }

        }

    }

    /**
     * Metodo main que ira rodar a classe TodoList
     *
     * @param args
     */
    public static void main(String[] args) {
        TodoList t1 = new TodoList();
        t1.add("teste");
        t1.add("teste1", "teste2");
        t1.add(new String[]{"teste", "teste", "teste", "teste", "teste", "teste2"});

        t1.exibir();


    }
}
