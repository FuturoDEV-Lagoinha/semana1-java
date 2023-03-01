import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolManagerV2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        List<Double> notes = new ArrayList<>();

        System.out.println("Informe a primeira nota:");
        notes.add(userInput.nextDouble());
        System.out.println("Informe a segunda nota:");
        notes.add(userInput.nextDouble());
        System.out.println("Informe a terceira nota:");
        notes.add(userInput.nextDouble());
        System.out.println("Informe a quarta nota:");
        notes.add(userInput.nextDouble());

        Double median = (notes.get(0) + notes.get(1) + notes.get(2) + notes.get(3))/notes.size();

        if(median >= 7.0) {
            System.out.println("Parabéns, aprovado por média!");
        } else if (median >= 5.0 && median <7.0) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado");
        }
    }
}
