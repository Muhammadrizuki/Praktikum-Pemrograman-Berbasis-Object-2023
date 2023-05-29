public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(10000000, "Iphone");
        smartphone.move();

        Car car = new Car(10, "Black", 1000);
        car.move();

        Bulldog bulldog = new Bulldog(0, 50);
        bulldog.describe();
        bulldog.move();
        bulldog.move();
        
    }
}
