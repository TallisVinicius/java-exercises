import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversor de Celsius para Fahrenheit.");
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = ((celsius * 9) / 5) + 32;

        System.out.printf("Essa é a temperatura em fahrenheit: %.2f%n", fahrenheit);

    }
}
