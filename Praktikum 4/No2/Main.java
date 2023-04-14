public class Main {

    public static void main(String[] args) {

        Player player1 = new Player();

        player1.setName("Kelvin");
        player1.setLevel(1);
        player1.setHealth(1);
        player1.setMana(1);

        player1.displayinfo();

        Player player2 = new Player("Fail", 2, 2, 2);

        System.out.println(player2.getName());
        System.out.println(player2.getLevel());
        System.out.println(player2.getHealth());
        System.out.println(player2.getMana());

        Utils.displayprofile();
    }


}
