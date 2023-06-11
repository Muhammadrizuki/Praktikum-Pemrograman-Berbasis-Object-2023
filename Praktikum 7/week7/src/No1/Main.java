package No1;

public class Main {

    public static void main(String[] args) {

        Fighter f1 = new Fighter("Kelvin", 100);
        Mage m1 = new Mage("Fail", 10);
        Fighter f2 = new Fighter("Joy", 25);
        Fighter f3 = new Fighter("Aan", 60);
        Mage m2 = new Mage("Ajul", 1);

        Character[] c = new Character[5];
        c[0] = f1;
        c[1] = m1;
        c[2] = f2;
        c[3] = f3;
        c[4] = m2;

        for (Character i : c) {
            Main.printAttack(i);
        }

    }

    static void printAttack(Character c) {
        System.out.println("=".repeat(40));
        System.out.println(c.getName());
        System.out.println("=".repeat(40));
        System.out.println("attack = "+c.attack());
        if (c instanceof Fighter) {
            System.out.println("malee = "+c.attack("melee"));
            System.out.println("ranged = "+c.attack("ranged"));
        } else if (c instanceof Mage) {
            System.out.println("frost = "+c.attack("frost"));
            System.out.println("fire = "+c.attack("fire"));
        }

    }

}
