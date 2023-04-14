package No3;

public class User {
    
    // inisialisasi atribut
    private String name;
    private int balance;

    // constructor
    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    
    // setter dan getter untuk atribut class
    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // method untuk menampilkan card
    public void showcard() {
        System.out.println("----------CARD----------");
        System.out.println(this.name);
        System.out.println(this.balance);
        System.out.println("------------------------");
    }


}
