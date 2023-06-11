package No2;
import No1.Smartphone;
import No1.Car;

public class MainThings{

    public static void main(String[] args) {

        Smartphone hp = new Smartphone(5000000, "Oppo");
        Car car = new Car(6, "hitam", 350);

        hp.move();
        car.move();

    }

}
