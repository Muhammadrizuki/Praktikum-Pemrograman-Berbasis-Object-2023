package assignment6;

class Car implements Move{
    int totalForwardGear;
    String color;
    int maxSpeed;

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}
