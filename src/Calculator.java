import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        double numberOne = userInput.nextDouble();
        System.out.println("Informe o segundo número");
        double numberTwo = userInput.nextDouble();

        double result = numberOne + numberTwo;

        System.out.println("O resultado da soma é: " + result);
    }
}
