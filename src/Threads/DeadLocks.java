package Threads;

/**
 * DeadLocks sao situacoes onde 2 threads ficam bloqueadas indefinidamente, esperando que a outra libere um recurso necessario
 */
public class DeadLocks {
    public static Object colher = new Object();
    public static Object vasilha = new Object();

    public static void main(String[] args) {

        /**
         * Neste exemplo, repare que as duas Threads, 'cozinheiro' tentam segurar dois recursos (colher e vasilha) ao mesmo tempo.
         * Se o cozinheiro pegar a colher e o outro pegar a vasilha, eles se bloqueiam pois nenhum deles consegue avancar sem oq o outro possui
         */
        Thread cozinheiro1 = new Thread(
                () -> {
                    synchronized (colher) {
                        System.out.println("c1 segurando colher...");
                        System.out.println("c1 esperando vasilha...");

                        /**
                         * Agora o cozinheiro 1 tenta adquirir a vasilha, mas pode ficar bloqueando se c2 ja estiver segurando
                         */
                        synchronized (vasilha) {
                            System.out.println("c1 segurando colher e vasillha...");
                        }

                    }
                });
        Thread cozinheiro2 = new Thread(
                () -> {
                    synchronized (vasilha) {
                        System.out.println("c2 segurando vasilha");
                        System.out.println("c2 esperando colher");
                        /**
                         * Aqui c2 esta segurando a vasilha e esperando a colher que esta com cozinheiro 1
                         */
                    synchronized (colher) {
                        System.out.println("c2 segurando colher e vasilha");

                    }
                    }
                }
        );
    }
}
