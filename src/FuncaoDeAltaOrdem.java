public class FuncaoDeAltaOrdem {

    //Funções de alta ordem: Recebem uma função por parametro ou retornam uma função por parametro

    public static void main(String[] args) {
        Calculo soma = (a, b) -> a + b;
        Calculo subtracao = (a, b) -> a - b;
        Calculo multiplicacao = (a, b) -> a * b;
        Calculo divisao = (a, b) -> a / b;

        System.out.println(executarOperacao(soma, 1, 4));
        System.out.println(executarOperacao(subtracao, 8, 1));
        System.out.println(executarOperacao(multiplicacao, 7, 7));
        System.out.println(executarOperacao(divisao, 8, 2));
    }

    public static int executarOperacao(Calculo calculo, int a, int b) {
        return calculo.calcular(a, b);
    }
}

@FunctionalInterface
interface Calculo {
    public int calcular(int a, int b);
}


