import java.util.Scanner;

public class ExerciceOne {
    public static void main(String[] args) {
        /*
        O usuário vai inserir o nome de uma fruta,

        - caso essa fruta for maçã, o sistema vai
        imprimir o quilo custa R$ 5.99

        - Caso essa fruta for uva, o sistema vai imprimir
        não temos.

        - Caso essa fruta for melancia, o sistema vai imprimir
        vai querer quantas?

        Scanner switch
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Informe uma fruta:");
        String fruit = input.next().toLowerCase();

        switch (fruit) {
            case "maçã":
                System.out.println("o quilo custa R$ 5.99");
                break;
            case "uva":
                System.out.println("Não temos.");
                break;
            case "melancia":
                System.out.println("vai querer quantas?");
                break;
        }
    }
}
