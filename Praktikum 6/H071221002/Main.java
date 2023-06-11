package assignment6;

public class Main {
    public static void main(String[] args) {
        GermanShepherd rex = new GermanShepherd();
        rex.move();
        rex.describe();

        Smartphone phone = new Smartphone();
        phone.move();

        Car car = new Car();
        car.move();
    }
}
