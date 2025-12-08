import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o maior numero.");
        System.out.print("Digite o primeiro numero: ");
        int num01 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num02 = scanner.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int num03 = scanner.nextInt();

        if (num01 >= num02 && num01 >= num03){
            System.out.println("Maior numero é "+num01);
        } else if (num02 >= num01 && num02 >= num03) {
            System.out.println("Maior numero é "+num02);
        }else {
            System.out.println("Maior numero é "+num03);
        }


    }
}