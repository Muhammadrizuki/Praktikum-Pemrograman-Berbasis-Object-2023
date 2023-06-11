package No1;

public class Smartphone implements Things{

    protected int price;
    protected String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.printf("Smartphone %s seharga %d berpindah %n", this.brand, this.price);
    }
}
