package SmartphoneAndCar;

abstract class Car {
    public Car(int totalForwardGear, String color, int maxSpeed){
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    protected int totalForwardGear;
    protected String color;
    protected int maxSpeed;
    protected String nameCar;

    abstract void move();
}

class Ferrari extends Car {

    public Ferrari(int totalForwardGear, String color, int maxSpeed){
        super(totalForwardGear, color, maxSpeed);
        super.nameCar = "Ferrari";
    }

    @Override
    void move() {
        System.out.println("Mobil " + super.nameCar + " sedang berakselerasi");
    }

}

class BMW extends Car {

    public BMW(int totalForwardGear, String color, int maxSpeed){
        super(totalForwardGear, color, maxSpeed);
        super.nameCar = "BMW";
    }

    @Override
    void move() {
        System.out.println("Mobil " + super.nameCar + " sedang berakselerasi");
    }

}
