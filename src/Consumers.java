import java.util.function.Consumer;

public class Consumers {
    public static void main(String[] args) {
        //Method reference

        // Apenas
        // Utilizar o parametro da forma que ele foi recebido

        //Consumer - Recebe o parametro e não retorna nada

        //opcao 1
        Consumer<String> imprimeUmaFrase = System.out::println;

        //opcao2
        Consumer<String> imprimeUmaFrase2 = frase -> System.out.println(frase);
        imprimeUmaFrase.accept("Hello !!!!!!!!");
    }
}

