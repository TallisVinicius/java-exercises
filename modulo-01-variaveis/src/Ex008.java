import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Aumento de salario em 10%.");
        System.out.print("Diga seu salario em reais: ");
        double salarioInicial = scanner.nextDouble();

        double salarioFinal = salarioInicial * 1.10;
        System.out.print("Seu novo salario: R$ " +salarioFinal);

    }
}
