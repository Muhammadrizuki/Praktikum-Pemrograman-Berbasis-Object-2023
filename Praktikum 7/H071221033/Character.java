package assignment7;

public abstract class Character {
    String name;
    
    public String getName() {
        return name;
    }

    public abstract int attack();
    public abstract int attack(String attackType);
}


class Fighter extends Character{
    private int attackPower;

    Fighter(String name, int attackPower){
        super.name = name;
        this.attackPower = attackPower;
    }

    @Override
    public int attack(){
        return attackPower;
    }
    @Override
    public int attack(String attackType){
        if(attackType == "melee"){
            return attackPower*2;
        } else if(attackType == "ranged"){
            return attackPower;
        } else{
            return 0;
        }
    }
}


class Mage extends Character{
    private int attackPower;

    Mage(String name, int attackPower){
        super.name = name;
        this.attackPower = attackPower;
    }

    @Override
    public int attack(){
        return attackPower;
    }
    @Override
    public int attack(String attackType){
        if(attackType == "frost"){
            return attackPower*2;
        } else if (attackType == "fire"){
            return attackPower*3;
        } else {
            return 0;
        }
    }
}