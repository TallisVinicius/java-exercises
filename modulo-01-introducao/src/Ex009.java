import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor do produto:");
        double valorProduto = scanner.nextDouble();
        System.out.print("porcentagem do desconto:");
        double valorDesconto = scanner.nextDouble();

        double descontoFinal = valorDesconto / 100;
        double valorProdutoFinal = valorProduto - (descontoFinal * valorProduto);
        System.out.printf("Valor a pagar: R$ %.2f ",valorProdutoFinal);
    }
}
