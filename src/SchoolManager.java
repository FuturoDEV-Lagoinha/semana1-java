import java.util.Scanner;

public class SchoolManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double noteOne, noteTwo, noteThree, noteFour;

        System.out.println("Informe a primeira nota:");
        noteOne = input.nextDouble();
        System.out.println("Informe a segunda nota:");
        noteTwo = input.nextDouble();
        System.out.println("Informe a terceira nota:");
        noteThree = input.nextDouble();
        System.out.println("Informe a quarta nota:");
        noteFour = input.nextDouble();

        Double media = (noteOne + noteTwo + noteThree + noteFour) / 4;

        System.out.println("A média das notas é: " + media);
    }
}
