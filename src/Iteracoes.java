import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {

        String[] nomes = {"Mateus", "Thalia,", "Cecilia", "Helena", "Paulo"};
        Integer[] numeros = {1, 2, 3, 4, 5};
        imprimirNomesFiltrados(nomes);
        imprimirTodosOsNomes(nomes);
        imprimirODobroDeCadaLista(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("QA");
        profissoes.add("Gerente de projetos");
        profissoes.add("Gerente de qualidade");
        profissoes.add("Agilista");

        profissoes.stream()
                    .filter(profissao -> profissao.startsWith("Gerente"))
                    .forEach(System.out::println);

    }


    public static void imprimirNomesFiltrados(String...nomes){
        String nomesParaImprimir = "";
        for (int i =0; i< nomes.length; i++){
            if (nomes[i].equals("Cecilia")){
                nomesParaImprimir+=nomes[i];
            }
        }
        System.out.println("Laço For: "+nomesParaImprimir);


        String nomesParaImprimirDaStream = Stream.of(nomes).filter(nome -> nome.equals("Cecilia")).collect(Collectors.joining());

        System.out.println("Stream:  "+nomesParaImprimirDaStream);
    }

    public static void imprimirTodosOsNomes(String...nomes){
        for (String nome: nomes) {
            System.out.println("Impresso pelo For: "+nome);
        }
        System.out.println("------------------------");
        Stream.of(nomes).forEach(nome -> System.out.println("Impresso pelo ForEach"+ nome));
    }

    public static void imprimirODobroDeCadaLista(Integer...numeros){
        System.out.println("------------------------");
        System.out.println("Imprimindo o dobro de cada lista");

        for (Integer numero: numeros) {
            System.out.println(numero*2);
        }
    }
}
