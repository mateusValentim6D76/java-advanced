import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExemplo {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        IntStream.range(1,100000).forEach(ParallelStreamExemplo:: fatorial);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução SERIAL :: "+(fim-inicio));

        inicio = System.currentTimeMillis();
        IntStream.range(1,100000).parallel().forEach(ParallelStreamExemplo::fatorial);
         fim = System.currentTimeMillis();
        System.out.println("Tempo de execução PARALLEL :: "+(fim-inicio));

//        List<String> nomes = Arrays.asList("Mateus", "Thalia", "Helena", "Rafael");
//        nomes.parallelStream().forEach(System.out::println);
    }

    public static long fatorial(long num){
        long fat = 1;

        for (int i = 2; i <=num; i++){
            fat*=i;
        }
        return fat;
    }
}
