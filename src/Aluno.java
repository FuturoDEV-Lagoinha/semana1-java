import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno {
    String nome;
    List<Double> notas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    void adicionarNota() {
        System.out.println("Informe a nota do aluno:");
        notas.add(scanner.nextDouble());
        System.out.println("Nota adicionada com sucesso!");
    }

    Double calcularMedia() {
        Double somatorio = 0.0;
        for(Double nota : notas) {
            somatorio += nota;
        }
        return somatorio /4;
    }
}
