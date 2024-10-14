package Threads;

public class Threads_Basics {

    /**
     * Threads sao usadas para realizar tarefas de forma simultanea, o que eh util em cenarios onde há concorrencia ou necessidade de realizar
     * varias tarefas ao mesmo tempo.
     *
     * Ou seja, threads podem possui acesso compartilhado a uma mesma variavel ou recurso, o que eh necessario tomar cuidado e evitar condicoes de corrida
     * e por isso criamos duas threads para rodar as tarefas em paralelo.
     *
     * @param args
     */

    public static void main(String[] args) {
        //Nessa linha estamos criando e instanciando um objto da classe Thread para lidar com a concorrencia.
        Thread thread = new Thread(new PrintTask("Tarefa 1"), "T1");

        //Aqui criamos uma thread para passar oque criamos no PrintTask. Utilizei lambda excluir a necessidade de  criar uma classe separada
        //para uma tarefa simples
        Thread thread1 = new Thread(
                () -> System.out.println(
                        Thread.currentThread().getName())
        );
        thread.start();//Colocando para rodar a thread ao mesmo tempo
        thread1.start();//Colocando para rodar a thread1 ao mesmo tempo
    }


}
