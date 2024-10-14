package Estrutura_De_Dados;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    /**QUEUES
     * Queues sao estruturas do tipo FIFO(-First in, first out). Interessante usar para controlar acesso a recursos compartilhados pelo sistema operacinonal
     */

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Cliente 1");
        fila.add("Cliente 2");
        fila.add("Cliente 3");

        System.out.println("Clientes na fila: "+fila);

        //removendo e exibindo o elemento da frente da fila
        //metodo pool()
        String removido = fila.poll();
        System.out.println("Removido: " + removido);
        System.out.println("Esperando atendimento: "+fila);

        System.out.println("\n");

        //Exibindo o elemento da frente da fila sem remove-lo
        //Metodo peek()
        String elementoFrente = fila.peek();
        System.out.println("Cliente da frente: " + elementoFrente);
        System.out.println("Cliente na fila apos peek: " + fila );




    }
}
