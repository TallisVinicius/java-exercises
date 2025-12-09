import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de metros para centímentros.");
        System.out.print("Digite aqui os metros: ");
        double metros = scanner.nextDouble();
        double centimetros = metros * 100;

        System.out.printf("O resultado em centímetros é:  %.2fcm%n", centimetros);
    }
}
