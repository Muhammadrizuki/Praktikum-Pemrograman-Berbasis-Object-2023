package assignment3;

class Player {
    private String name;
    private int hp = 100;
    private int attackPower;
    private int defense;

    public Player() {}

    // method getDamage utk menghitung hp dari objek player
    // caranya: mengurangi hp saat ini dgn selisih antara attpower dari enemy dgn nilai defense
    // Math.abs utk mengambil nilai absolut dri selisih tsb, hasilnya selalu positif
    public void getDamage(Player enemy) {
        hp = hp - Math.abs(enemy.getAttackPower() - defense);
    }
    // lengkapi

    // constructor player1
    Player(String name, int attackPower, int defense) {
        this.name = name;
        this.attackPower = attackPower;
        this.defense = defense;
    }
    // constructor player2
    Player(String name, int defense) {
        this.name = name;
        this.defense = defense;
    }
    
    // method setter getter
    public void setName(String name) {
        this.name = name;
    }
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public int getAttackPower() {
        return attackPower;
    }
    
    // method status 
    public void status() {
        System.out.println(name + " status");
        System.out.println("HP      = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack  = " + attackPower + "\n");
    }
}

public class Nomor2 {
    public static void main(String[] args) {
        
        // membuat objek baru bernama player1 dan player2
        Player player1 = new Player("Mino", 30, 15);
        Player player2 = new Player("Hilda", 10);

        player2.setAttackPower(35);

        player1.getDamage(player2);

        player1.status();
        player2.status();
    }    
}
