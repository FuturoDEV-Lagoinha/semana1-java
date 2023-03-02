public class SwitchCaseConditionalStructure {
    public static void main(String[] args) {
        String option = "André";
        switch (option) {
            case "André":
                System.out.println("0");
                break;
            case "Daniel":
                System.out.println("1");
                break;
            case "Ruan":
                System.out.println("2");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
