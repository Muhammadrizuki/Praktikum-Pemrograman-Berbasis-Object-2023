class Player{
    private String name; 
    private int hp;
    private int attackPower; 
    private int defense;

    public Player(){}

    public void getDamage(Player enemy) {
         hp= hp-Math.abs(enemy.getAttackPower()-defense);
    }
    public void setHp() {
        this.hp = 100;
    }

    public Player(String name, int attackPower, int defense) {
        setHp();
        this.name = name;
        this.defense = defense;
        this.attackPower = attackPower;

    }

    public Player(String name, int defense) {
        setHp();
        this.name = name;
        this.defense = defense;
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

    int getAttackPower() { 
        return attackPower;
    } 


    public class Main {
        public static void main(String [] args) {

            Player player1= new Player("Mino", 30, 15); 
            Player player2= new Player("Hilda", 10);

            player2.setAttackPower(35);

            player1.getDamage(player2);

            player1.status();
            player2.status();
      }
    }
}