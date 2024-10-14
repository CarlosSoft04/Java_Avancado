package Programacao_Funcional.Method_References;

/**
 * Method_References em java sao uma forma de simplificar o uso de lambda, referenciando diretamente metodos ou construtores ja existentes
 *
 */
@FunctionalInterface
interface Methods_Referencess {
    String process(String str);


    public class Utils {
       public static String toUpper(String string){
        return string.toUpperCase();
       }
    }
}