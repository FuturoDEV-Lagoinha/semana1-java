public class Pessoa {
    String nome;
    Integer idade;

    void verificarMaiorIdade() {
        if(this.idade >= 18) {
            System.out.println(this.nome + " é maior de idade");
        } else {
            System.out.println(this.nome + " é menor de idade");
        }
    }
}
