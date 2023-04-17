class PUBG {
    // Atribut
    private String playerName; 
    private int level;
    private int health;

    // Constructor
    public PUBG(String playerName, int level) {
        this.playerName = playerName;
        this.level = level;
        this.health = 100;
    }

    // Constructor
    public PUBG(String playerName, int level, int health) {
        this.playerName = playerName;
        this.level = level;
        this.health = health;
    }
    
    // Behavior
    public void levelUp() {
        this.level++;
        System.out.println("Selamat " + this.playerName + " telah mencapai level " + this.level + ".");
    }

    // Behavior
    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(this.playerName + " telah terkena " + damage + " damage. HP dia sekarang sebesar " + this.health + ".");
        System.out.println("========================================\n");
    }

    // Getter
    public String getPlayerName() {
        return playerName;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

public static void main(String[] args) {
    PUBG p1 = new PUBG("Jaemin", 1);
    PUBG p2 = new PUBG("Mark", 2, 50);

    System.out.println("Level " + p1.getPlayerName() + " adalah " + p1.getLevel() + " dengan " + p1.getHealth() + " HP.");
    System.out.println("Level " + p2.getPlayerName() + " adalah " + p2.getLevel() + " dengan " + p2.getHealth() + " HP.\n");
    System.out.println("========================================");

    p1.levelUp();
    p2.takeDamage(20);

    System.out.println("Level " + p1.getPlayerName() + " adalah " + p1.getLevel() + " dengan " + p1.getHealth() + " HP.");
    System.out.println("Level " + p2.getPlayerName() + " adalah " + p2.getLevel() + " dengan " + p2.getHealth() + " HP.");
    }
}