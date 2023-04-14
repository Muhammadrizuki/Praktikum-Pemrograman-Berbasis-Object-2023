package no02;

public class Player {
    private String name;
    private int hp;
    private int attackPower;
    private int defense;

    public Player(String name, int attackPower, int defense){
        this.name = name;
        this.attackPower = attackPower;
        this.defense = defense;
        this.hp = 100;
    }
    public Player(String name, int defense){
        this.name = name;
        this.defense = defense;
        this.hp = 100;
    }
    public void getDamage(Player enemy){
        if (enemy.attackPower > defense) {
            hp = hp - Math.abs(enemy.getAttackPower()- defense);
        }
    }
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    public void status() {
        System.out.println(name + " status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower + "\n");
    }
    int getAttackPower(){
        return attackPower;
    }
}