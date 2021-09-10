import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {

        Function<String, String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();

        Function<String, Integer> converteStringParaInteiroECalculaODobro = string -> Integer.valueOf(string) * 2;

        System.out.println(retornaNomeAoContrario.apply("Mateus Valentim"));
        System.out.println(converteStringParaInteiroECalculaODobro.apply("7"));
    }
}
