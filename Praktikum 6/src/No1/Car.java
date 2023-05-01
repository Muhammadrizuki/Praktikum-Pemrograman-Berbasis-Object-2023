package No1;

public class Car implements Things{

    protected int totalForwardGear;
    protected String color;
    protected int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.printf("Mobil berwarna %s sedang berakselerasi hingga kecepatan %dkm/j menggunakan transmisi %d percepatan %n", this.color, this.maxSpeed, this.totalForwardGear);
    }
}
