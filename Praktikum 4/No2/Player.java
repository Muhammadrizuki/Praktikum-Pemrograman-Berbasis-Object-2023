public class Player {

    public Player(String name, int level, int health, int mana) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.mana = mana;
    }

    private String name;
    private int level;
    private int health;
    private int mana;

    Player () {};


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void displayinfo() {
        System.out.println(name);
        System.out.println(health);
        System.out.println(level);
        System.out.println(mana);
    }

}
