import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
        //Método de referencia
        Predicate<String> estaVazio = String::isEmpty;
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Valentim"));

    }
}
