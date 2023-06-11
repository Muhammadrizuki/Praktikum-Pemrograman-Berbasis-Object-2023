package assignment7;

public class Main1 {
    public static void main(String[] args) {
        // arraylist simpan character sebanyak 5
        Character[] characters = new Character[5];
        characters[0] = new Fighter("Fighter 1", 10);
        characters[1] = new Mage("Mage 1", 20);
        characters[2] = new Fighter("Fighter 2", 15);
        characters[3] = new Fighter("Fighter 3", 25);
        characters[4] = new Mage("Mage 2", 5);

        // perulangan utk cetak info semua character
        for (Character character : characters) {
            printAttack(character);
        }   
    }

    private static void printAttack(Character character){
        // variabel yg memanggil method attack dgn parameter
        int melee = character.attack("melee");
        int ranged = character.attack("ranged");
        int frost = character.attack("frost");
        int fire = character.attack("fire");

        System.out.println(character.getName());
        System.out.println("Attack power awal: " + character.attack());
        System.out.println("Attack type melee: " + melee);
        System.out.println("Attack type ranged: " + ranged);
        System.out.println("Attack type frost: " + frost);
        System.out.println("Attack type fire: " + fire);
        System.out.println("=".repeat(25));
    }
}
