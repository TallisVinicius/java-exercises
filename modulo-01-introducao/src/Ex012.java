import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Verifique se um numero é par ou impar.");
        System.out.print("Digite um numero aqui: ");
        int parImpar = scanner.nextInt();
        if (parImpar % 2 == 0){
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }
    }
}
