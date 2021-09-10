import java.util.function.Supplier;

public class Suplidores {
    public static void main(String[] args) {

        //Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();

        //Com método de referencia
        Supplier<Pessoa> instanciaPessoa = Pessoa::new;

        System.out.println(instanciaPessoa.get());
    }
}

     class Pessoa {
        private String nome;
        private Integer idade;

        public Pessoa() {
            nome = "Mateus";
            idade = 24;
        }

        @Override
        public String toString() {
            return String.format(  "nome: %s, idade: %d", nome, idade );
        }
    }

