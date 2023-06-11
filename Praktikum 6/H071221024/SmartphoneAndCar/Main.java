package SmartphoneAndCar;

public class Main {
    public static void main(String[] args) {
        //handphone
        Samsung samsung = new Samsung(3000000);
        Iphone iphone = new Iphone(7000000);
        samsung.move();
        iphone.move();

        System.out.println();

        //Car
        Ferrari ferrari = new Ferrari(7, "Red", 340);
        BMW bmw = new BMW(6, "Silver", 306);
        ferrari.move();
        bmw.move();
    }
}
