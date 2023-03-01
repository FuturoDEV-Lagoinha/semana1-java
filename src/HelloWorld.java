import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String [] args) {
        List<String> names = new ArrayList<>();

        names.add("André");
        names.add("Juan");
        names.add("Ruan");
        names.add("Mariestela");
        names.add("Daniel");

        names.forEach(name -> {
            System.out.println(name);
        });

    }
}
