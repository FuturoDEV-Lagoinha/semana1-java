import java.util.Scanner;

public class CarroMain {
    public static void main(String[] args) {
        double numero = 3.0;
        Scanner input = new Scanner(System.in);
        Car car = new Car();
        car.motor = 2.0;
        car.aro = 17;

        System.out.println(car.aro);

        car.ligarMotor();
        car.ligarMotor();
    }
}
