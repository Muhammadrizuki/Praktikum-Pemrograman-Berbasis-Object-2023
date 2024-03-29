package Tugas3;
class Player{
    private String name;
    private int hp;
    private int attackPower;
    private int defense;

    // Menambahkan Constructor Player 1
    public Player (String name, int attackPower, int defense) {
        this.name = name;
        this.defense = defense;
        this.attackPower = attackPower;
    }
    // Menambahkan Constructor Player 2
    public Player (String name, int defense) {
        this.name = name;
        this.defense = defense;
    }
    // Menambahkan Set Attack Power
    public void setAttackPower (int attackPower) {
        this.attackPower = attackPower;
    }
    // Menambahkan Set Hp
    public void setHp (int hp) {
        this.hp = hp;
    }
    
    public void getDamage(Player enemy) {
        hp= hp-Math.abs(enemy.getAttackPower()-defense);
    }

    public void status() {
    System.out.println(name + " status");
    System.out.println("HP = " + hp);
    System.out.println("Defense = " + defense);
    System.out.println("Attack = " + attackPower + "\n");
    }
    
    int getAttackPower() {
        return attackPower;
    }
    // Menambahkan Get Untuk Hp
    int getHp () {
        return this.hp;
    }
}

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Mino", 30,15);
        Player player2 = new Player("Hilda", 10);
        player2.setAttackPower(35);
        player1.setHp(100);
        player2.setHp(100);
        player1.getDamage(player2);
        player1.status();
        player2.status();
        }
    }

