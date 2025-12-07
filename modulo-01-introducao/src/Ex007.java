import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calcular a area de um circulo.");
        System.out.println("Digite o raio do circulo: ");
        double raio = scanner.nextDouble();

        double circulo = 3.14 * Math.pow(raio, 2);

        System.out.printf("Area do circulo é: %.2f%n ", circulo);

    }
}
