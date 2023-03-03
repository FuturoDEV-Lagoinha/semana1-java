import java.util.ArrayList;
import java.util.List;

public class PessoaMain {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.nome = "Renato";
        pessoa1.idade = 25;
        pessoa2.nome = "André";
        pessoa2.idade = 15;
        pessoa3.nome = "Vini";
        pessoa3.idade = 23;

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        //for(int i = 0; condica) { pessoas.get(i) }
        for(Pessoa pessoa : pessoas) {
            pessoa.verificarMaiorIdade();
        }
    }
}
