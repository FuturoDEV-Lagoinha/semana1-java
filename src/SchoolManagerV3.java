import java.util.Scanner;

public class SchoolManagerV3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double sum = 0.0;
        Double [] notes = new Double[4];

        for(int i = 0; i < notes.length; i++) {
            System.out.println("Informe a " + (i + 1) + "° nota:");
            notes[i] = input.nextDouble();
        }

        for(Double note: notes) {
            //sum += note;
        }

        for(int i = 0; i < notes.length;i++) {
            sum += notes[i];
        }

        Double media = sum / notes.length;
        System.out.println("A média das notas é: " + media);
    }
}
