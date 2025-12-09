import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        double nota01 = scanner.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        double nota02 = scanner.nextDouble();
        System.out.print("Digite sua terceira nota: ");
        double nota03 = scanner.nextDouble();
        System.out.print("Digite sua quarta nota: ");
        double nota04 = scanner.nextDouble();

        double media = (nota01 + nota02 + nota03 + nota04) / 4;

        System.out.println("Sua media é: " + media);
    }
}
