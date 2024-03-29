package No2;

class Player{
    private String name;
    private int hp;
    private int attackPower;

    private int defense;

    public Player(String name, int attackPower, int defense) {
        this.name = name;
        this.hp = 100;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    public Player(String name, int defense) {
        this.name = name;
        this.hp = 100;
        this.defense = defense;
    }

    public Player(){}

    public void getDamage(Player enemy) {
        hp= hp-Math.abs(enemy.getAttackPower()-defense);
    }

    // Lengkapi

    public void status() {
        System.out.println(name + " status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower + "\n");
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    int getAttackPower() {
        return attackPower;
    }

}

public class Main {
    public static void main(String [] args) {

        Player player1= new Player("Mino", 30, 105);
        Player player2= new Player("Hilda", 10);

        player2.setAttackPower(35);

        player1.getDamage(player2);

        player1.status();
        player2.status();
    }
}
    