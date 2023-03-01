import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        String name = scanner.next();
        int n = Integer.parseInt(name);
        System.out.println("Olá, " + name);
    }
}
