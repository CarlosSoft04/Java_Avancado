package Threads;


//Classe que implementa a interface Runnable para lidar com a concorrencia
public class PrintTask implements  Runnable {
    private String name;

    public PrintTask(String nome){
        this.name = nome;}


    /**
     * Metodo run() obrigatorio da interface Runnable.
     *Este metodo sera executado quando a Thread for chamada
     * "currentThread().getName()", acessa e diz o nome da thread que esta sendo executada
     */
    @Override
    public void run() {
        System.out.println("%s: Olá, %s".formatted(
        Thread.currentThread().getName(),name));
    }

}
