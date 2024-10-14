package Programacao_Funcional.Interfaces_Funcionais;

/**
 * A interface funcional "Operacao" possui apenas um método abstrato, o que permite que ela seja usada com expressões lambda.
 * A anotação "@FunctionalInterface" garante que não mais de um  método abstrato seja adicionado à interface, garantindo
 * que ela siga o contrato de interface funcional.
 *
 * A vantagem de usar as interfaces funcionais eh que garante a diminuicao das linhas dos codigos com as expressoes lambadas
 * alem da flexibilidadde
 */
@FunctionalInterface
public interface Operacao {
    int somar(int a, int b);

    public class Main {
        public static void main(String[] args) {
            // Uso de Lambdas
            Operacao soma = (a, b) -> a + b;
            System.out.println("A soma de 5 e 3 é: " + soma.somar(5, 3));
        }
    }
}
