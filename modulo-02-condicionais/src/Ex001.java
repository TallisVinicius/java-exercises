import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calcule seu IMC.");
        System.out.print("Sua altura em metros: ");
        double altura = scanner.nextDouble();
        System.out.print("Seu peso em quilogramas: ");
        double peso = scanner.nextDouble();

        double imc = peso / (Math.pow(altura, 2));
        System.out.printf("Seu IMC é: %.2f%n ",imc);
        System.out.print("Classificação: ");

        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25.0) {
            System.out.println("Peso normal");
        } else if (imc >= 25.0 && imc < 30.0) {
            System.out.println("Sobrepeso");
        }else {
            System.out.println("Obesidade (Grau I ou superior)");
        }
    }
}
