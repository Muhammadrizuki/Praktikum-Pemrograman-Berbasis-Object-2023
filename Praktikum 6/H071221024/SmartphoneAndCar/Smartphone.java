package SmartphoneAndCar;

abstract class Smartphone{
    public Smartphone(int price) {
        this.price = price;
    }
    protected int price;
    protected String brand;
    abstract void move();
}

class Samsung extends Smartphone {

    public Samsung(int price){
        super(price);
        super.brand = "Samsung";
    }

    @Override
    void move() {
        System.out.println("Smartphone " + super.brand + " berpindah");
    }

}

class Iphone extends Smartphone {
    public Iphone(int price){
        super(price);
        super.brand = "Iphone";
    }

    @Override
    void move() {
        System.out.println("Smartphone " + super.brand + " berpindah");
    }
}

class Main1 {
    public static void main(String[] args) {
        //handphone
        Samsung samsung = new Samsung(3000000);
        Iphone iphone = new Iphone(7000000);
        samsung.move();
        iphone.move();

        //Car
        Ferrari ferrari = new Ferrari(7, "Red", 340);
        BMW bmw = new BMW(6, "Silver", 306);
        ferrari.move();
        bmw.move();
    }    
}