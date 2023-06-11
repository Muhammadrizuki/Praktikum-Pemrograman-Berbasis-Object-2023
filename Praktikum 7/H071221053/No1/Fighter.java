package No1;

public class Fighter extends Character {

    public Fighter(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    int attack() {
        return attackPower;
    }

    @Override
    int attack(String attackType) {
        int AP = attackPower;
        if (attackType.equalsIgnoreCase("melee")) { 
            AP = attackPower * 2; 
        } else if (attackType.equalsIgnoreCase("ranged")) {  
            AP = attackPower;
        }
        return AP;
    } 
}
