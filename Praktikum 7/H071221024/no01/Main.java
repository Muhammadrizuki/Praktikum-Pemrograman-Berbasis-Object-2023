package Praktikum07.no01;

class Main {
    public static void main(String[] args) {
        Character[] characters = new Character[5];
        characters[0] = new Fighter("Badang", 18);
        characters[1] = new Mage("Xavier", 21);
        characters[2] = new Fighter("Jawhead", 23);
        characters[3] = new Fighter("Chou", 20);
        characters[4] = new Mage("Pharsa", 21);

        for (Character character : characters){
            if (character instanceof Fighter){
                character.printAttack(character);
                System.out.println("attack power melee type = " + character.attack("melee"));
                System.out.println("attack power ranged type = " + character.attack("ranged"));
                System.out.println();
            } else if (character instanceof Mage){
                character.printAttack(character);
                System.out.println("attack power frost type = " + character.attack("frost"));
                System.out.println("attack power fire type = " + character.attack("fire"));
                System.out.println();
            }
        }
    }
}
