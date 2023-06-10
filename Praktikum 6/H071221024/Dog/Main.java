package Dog;

public class Main {
    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull();
        SiberianHusky siberianHusky = new SiberianHusky();
        Bulldog bulldog = new Bulldog();
        GermanShepherd germanShepherd = new GermanShepherd();

        pitbull.setAverageLength(50);
        siberianHusky.setAverageLength(56);
        bulldog.setAverageLength(45);
        germanShepherd.setAverageLength(60);

        pitbull.move();
        siberianHusky.move();
        bulldog.move();
        germanShepherd.move();

        System.out.println();

        pitbull.describe();
        System.out.println();

        siberianHusky.describe();
        System.out.println();

        bulldog.describe();
        System.out.println();

        germanShepherd.describe();
        System.out.println();
    }
}
