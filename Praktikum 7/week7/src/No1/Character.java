package No1;

abstract class Character {

    protected String name;
    protected int attackPower;

    Character(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    abstract int attack();
    abstract int attack(String attackType);

    public String getName() {
        return name;
    }

    public int getAttackPower() {
        return attackPower;
    }

}
