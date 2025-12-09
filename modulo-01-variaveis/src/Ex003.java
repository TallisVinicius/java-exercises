import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numb01 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numb02 = scanner.nextInt();
        int resultado = numb01 + numb02;
        System.out.print("Resultado da soma dos dois números: " + resultado);
    }
}
