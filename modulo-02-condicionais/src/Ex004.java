import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você pode dirigir?");
        System.out.print("Qual sua idade? ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Você tem carteira de motorista? (S/N) ");
        String carteira = scanner.nextLine();
        if (idade >= 18 && carteira.equalsIgnoreCase("S")){
            System.out.println("Você pode dirigir.");
        } else if (idade >= 18 && carteira.equalsIgnoreCase("N")) {
            System.out.println("Você não pode.");
        }else {
            System.out.println("Não pode.");
        }
    }
}
