package Programacao_Funcional.Method_References;

public class Main {

    public static void main(String[] args) {
        String texto = "Hello";

        /**
         * Essa linha cria uma instancia da interface funcional Methods_Referencess usando uma method reference para o metodo estatico toUpper
         * da classe Utils
         */
        Methods_Referencess processo = Methods_Referencess.Utils::toUpper;
        System.out.println(processo.process(texto));
    }
}
