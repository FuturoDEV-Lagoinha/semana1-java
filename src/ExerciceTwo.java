import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciceTwo {
    public static void main(String[] args) {
         /*
        Será apresentado ao usuário um menu com as seguintes opções:
        1 - Adicionar fruta
        2 - Buscar
        3 - Vender
        (3 minutos)
        - caso 1 for selecionado, será perguntado o nome da fruta e
        adicionada a uma lista.
        (6 minutos)

        - caso 2 for selecionado, será perguntado o nome da fruta e
        será feita uma busca na lista. Caso, a fruta exista, será impresso
        temos, caso contrário, será impresso não temos.
        (10 minutos)

        - caso 3 for selecionado, será perguntado o nome da fruta, o valor
        do quilo e a quantidade de quilos comprada. Ao final, será mostrado
        o valor total da compra.
        (10 minutos)
         */
        Scanner input = new Scanner(System.in);
        List<String> fruits = new ArrayList<>();
        int option = 0;

        do {
            System.out.println("1 - Adicionar fruta\n2 - Buscar\n3 - Vender\n0 - Encerrar");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Informe o nome da fruta:");
                    fruits.add(input.next());
                    break;
                case 2:
                    System.out.println("Informe o nome da fruta:");
                    String fruitName = input.next();

                    if (fruits.contains(fruitName)) {
                        System.out.println("Temos!");
                    } else {
                        System.out.println("Não temos!");
                    }
                    break;
                case 3:
                    System.out.println("Informe o nome da fruta:");
                    fruitName = input.next();
                    System.out.println("Informe o valor do quilo:");
                    Double price = input.nextDouble();
                    System.out.println("Informe a quantidade comprada:");
                    Double quantity = input.nextDouble();

                    Double totalCost = price * quantity;

                    System.out.println("O valor total da compra é R$ " + totalCost);
                    break;
            }
        }while (option != 0);
    }
}
