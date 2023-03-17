class Cuboid {
    double height;
    double width;
    double length;

    double getVolume() {
        return this.height * this.width * this.length;
    }
}

public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 45;
        cuboid.width = 10;
        cuboid.length = 10;
        System.out.printf("lume = %.2f", cuboid.getVolume());
    }
}
