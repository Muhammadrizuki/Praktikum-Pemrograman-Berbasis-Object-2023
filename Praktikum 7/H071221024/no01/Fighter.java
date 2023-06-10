package Praktikum07.no01;

class Fighter extends Character {

    Fighter(String name, int attackPower) {
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
        if (attackType.equalsIgnoreCase("melee")) {
            return super.getAttackPower()*2;
        } else if (attackType.equalsIgnoreCase("ranged")){
            return super.getAttackPower();
        } else {
            throw new Error("attack type fighter hanya berupa melee dan ranged");
        }
    }
    
}
