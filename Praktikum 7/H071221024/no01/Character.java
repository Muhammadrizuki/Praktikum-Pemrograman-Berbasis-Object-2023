package Praktikum07.no01;

abstract class Character {
    Character(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    protected String name;
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    
    protected int attackPower;
    int getAttackPower() {
        return attackPower;
    }
    void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    abstract int attack();
    abstract int attack(String attackType);
    abstract void printAttack(Character character);
}