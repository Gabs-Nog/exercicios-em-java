public class exercicios {

    public static void main(String[] args) {
        mediaNotas();
        castingDoubleParaInt();
        concatenarCharEString();
        calcularValorTotal();
        conversaoDolarParaReal();
        aplicarDesconto();
    }

    public static void mediaNotas() {
        double nota1 = 7.5;
        double nota2 = 8.3;
        double media = (nota1 + nota2) / 2;
        System.out.println("Média das notas: " + media);
    }

    public static void castingDoubleParaInt() {
        double notaDecimal = 8.9;
        int notaInteira = (int) notaDecimal;
        System.out.println("Nota como inteiro (casting): " + notaInteira);
    }

    public static void concatenarCharEString() {
        char letra = 'A';
        String palavra = "lura";
        System.out.println("Concatenação: " + letra + palavra);
    }

    public static void calcularValorTotal() {
        double precoProduto = 29.90;
        int quantidade = 3;
        double total = precoProduto * quantidade;
        System.out.println("Valor total: R$ " + total);
    }

    public static void conversaoDolarParaReal() {
        double valorEmDolares = 50.0;
        double cotacao = 4.94;
        double valorEmReais = valorEmDolares * cotacao;
        System.out.printf("Valor em reais: R$ %.2f%n", valorEmReais);
    }

    public static void aplicarDesconto() {
        double precoOriginal = 120.00;
        double percentualDesconto = 10.0;
        double desconto = precoOriginal * (percentualDesconto / 100);
        double novoPreco = precoOriginal - desconto;
        System.out.printf("Preço com desconto: R$ %.2f%n", novoPreco);
    }
}
