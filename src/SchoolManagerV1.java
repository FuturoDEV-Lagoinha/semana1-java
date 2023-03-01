import java.util.Scanner;

public class SchoolManagerV1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double [] notes = new Double[4];

        System.out.println("Informe a primeira nota:");
        notes[0] = input.nextDouble();
        //notes.add(input.nextDouble());
        System.out.println("Informe a segunda nota:");
        notes[1] = input.nextDouble();
        System.out.println("Informe a terceira nota:");
        notes[2] = input.nextDouble();
        System.out.println("Informe a quarta nota:");
        notes[3] = input.nextDouble();

        Double media = (notes[0] + notes[1] + notes[2] + notes[3]) / notes.length;
        //Double media = (notes.get(0) + notes[1] + notes[2] + notes[3]) / notes.length;
        System.out.println("A média das notas é: " + media);
    }
}
