public class ForRepetitionStructure {
    public static void main(String[] args) {
        int [] notes = new int[4];
        String  [] names = new String[2];

        names[0] = "André";
        names[1] = "Gustavo";
        notes[0] = 18;
        notes[1] = 80;
        notes[2] = 84;
        notes[3] = 82;

        //For tradicional
        for(int i = 0; i<names.length;i++){
            if(names[i].equals("André")) {
                System.out.println("André já está cadastrado");
            }
        }

        //For each
        for(int note: notes) {
            if (note == 18) {
                System.out.println("Número 18 encontrado!");
            }
        }

        for(String name: names) {
            if(name.equals("André")) {
                System.out.println("André já está cadastrado");
            }
        }
    }
}
