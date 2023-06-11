package No1;

abstract class Character {
    protected String name ;
    protected int attackPower;

    public String getName() {
        return name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public Character(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }
    
    abstract int attack();
    abstract int attack(String attackType);  //method overloading memiliki method yang sama tetapi parameter yang berbeda

}