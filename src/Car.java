public class Car {
    Integer aro;
    Double motor;
    String fabricante;
    Double mala;
    boolean estaLigado = false;

    void ligarMotor(){
        if(!this.estaLigado) {
            System.out.println("Motor ligado");
            this.estaLigado = true;
        }
    }

    void desligarMotor() {
        System.out.println("Motor desligado");
    }

    void abrirMala() {
        System.out.println("Mala aberta");
    }
}
