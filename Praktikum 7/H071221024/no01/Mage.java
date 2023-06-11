package Praktikum07.no01;

class Mage extends Character{

    Mage(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    int attack() {
        return super.getAttackPower();
    }

    @Override
    void printAttack(Character character) {
        System.out.println("name = " + character.getName());
        System.out.println("attack power = " + character.attack());
    }

    @Override
    int attack(String attackType) {
        if (attackType.equalsIgnoreCase("frost")) {
            return super.getAttackPower()*2;
        } else if (attackType.equalsIgnoreCase("fire")){
            return super.getAttackPower()*3;
        } else {
            throw new Error("attack type fighter hanya berupa frost dan fire");
        }
    }
    
}
