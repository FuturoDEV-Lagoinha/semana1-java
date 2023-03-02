public class WhileRepetitionStructure {
    public static void main(String[] args) {
        int i = 0;
        while(i < 5){
            System.out.println("Executando while");
            i++;
        }

        do {
            System.out.println("Executando do while");
            i++;
        }while(i < 5);
    }
}
