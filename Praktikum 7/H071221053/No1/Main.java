package No1;

public class Main {
    public static void printAttack(Character character) { 
        System.out.println("Nama : " + character.getName());
        System.out.println("ATTAC INFORMATION");
        System.out.println("Attack Power : " + character.attackPower);
        
        if (character instanceof Fighter) { //
            System.out.println("Melee : " + character.attack("Melee"));
            System.out.println("Ranged : " + character.attack("Ranged"));
        } else if (character instanceof Mage) {
            System.out.println("Fire : " + character.attack("Fire"));
            System.out.println("Frost : " + character.attack("Frost"));
        } 
    }
    public static void main(String[] args) {
        Fighter fighter = new Fighter("Nakita", 10);
        Mage mage = new Mage("Salsa", 100);
        Fighter faikter = new Fighter("Awa", 1000);
        Fighter petarung = new Fighter("Arni", 10000);
        Mage mega = new Mage("Cheryl", 100000);
        

        Character[] hero = new Character[5];
        hero[0] = fighter;
        hero[1] = mage;
        hero[2] = faikter;
        hero[3] = petarung;
        hero[4] = mega;
        


        for (Character i : hero) { // membuat perulangan untuk mengeluarkan objek2 yang ada pada list hero. objek2 tsb mau d print informasi ttg attack powernya, jdi dipanggil method print attack.
            Main.printAttack(i);// main, karena method static itu menempel pada kelasnya.
            System.out.println("");
        }
    }
}