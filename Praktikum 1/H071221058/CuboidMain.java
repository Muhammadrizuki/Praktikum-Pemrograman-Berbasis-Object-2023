public class CuboidMain {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.width(15.0);
        cuboid.height(20.0);
        cuboid.length(15.0);
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}
