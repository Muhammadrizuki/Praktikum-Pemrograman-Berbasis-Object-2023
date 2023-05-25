abstract class Character {
    private String name;
    protected int attackPower;

    public Character(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public abstract int attack();

    public abstract int attack(String attackType);
}

class Fighter extends Character {
    public Fighter(String name, int attackPower) {
        super(name, attackPower);
    }

    public int attack() {
        return attackPower;
    }

    public int attack(String attackType) {
        if (attackType.toLowerCase().equals("melee")) {
            return attackPower * 2;
        } else if (attackType.toLowerCase().equals("ranged")) {
            return attackPower;
        } else {
            throw new IllegalArgumentException("Attack Tidak Valid");
        }
    }
}

class Mage extends Character {
    public Mage(String name, int attackPower) {
        super(name, attackPower);
    }

    public int attack() {
        return attackPower;
    }

    public int attack(String attackType) {
        if (attackType.toLowerCase().equals("frost")) {
            return attackPower * 2;
        } else if (attackType.toLowerCase().equals("fire")) {
            return attackPower * 3;
        } else {
            throw new IllegalArgumentException("Attack Tidak Valid");
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Character[] characters = new Character[5];
        characters[0] = new Fighter("Lapu-Lapu", 10);
        characters[0].attack("MELEE");
        characters[1] = new Mage("Lunox", 20);
        characters[1].attack("FROST");
        characters[2] = new Fighter("Paquito", 15);
        characters[2].attack("RANGED");
        characters[3] = new Fighter("Yu Zhong", 12);
        characters[3].attack("MELEE");
        characters[4] = new Mage("Yve", 25);
        characters[4].attack("FIRE");

        System.out.println("=".repeat(5) + "Welcome To Mobile Legends" + "=".repeat(5));
        for (Character character : characters) {
            System.out.println("\n> Attack");
            printAttack(character);
        }
    }
    private static void printAttack(Character character) {
        System.out.printf("%s Attacks With %d Power.\n", character.getName(), character.attack());
    }
}
