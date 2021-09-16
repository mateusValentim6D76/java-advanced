import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class InferenciaExemplo {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://docs.oracle.com/javase/10/language/");
        URLConnection urlConnection = url.openConnection();

        //getInputStream - Captura todo a entrada de dados, fluxo de dados, todos os bytes e coloca dentro do InputStream
        //InputStreamReader - Trabalhando com Reader ao inves de Stream
        // BufferedReader - Transforma os dados capturados em linhas
         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
    }

    public void testar(){

    }
}
