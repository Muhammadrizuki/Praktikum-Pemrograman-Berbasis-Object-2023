package no02;
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Mino", 30, 15);
        // Player player2 = new Player("Hilda", 2, 10);
        Player player3 = new Player("Jawhead", 10);

        // player2.setAttackPower(35);

        // player1.getDamage(player2);
        player1.getDamage(player3);
        player1.status();
        // player2.status();
        player3.status();
    }
}