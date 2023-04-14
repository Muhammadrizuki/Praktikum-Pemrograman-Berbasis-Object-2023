package no03;

public class Books {
    String name;
    int id;
    int stock;
    String prize;
    String author;
    int year;
    String category;
    boolean isBestSeller;

    void printBookDetails() {
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Author : " + author);
        System.out.println("Year : " + year);
        System.out.println("Category : " + category);
        System.out.println("isBestSeller : " + isBestSeller);
        System.out.println("Stock : " + stock);
        System.out.println("Prize : " + prize);
    }
    void checkStock(String nameBook){
        if (this.name == nameBook) {
            if (stock > 0) {
                System.out.println(name + " is available");
                System.out.println("remaining stock : " + stock);
            } else {
                System.out.println(name + " is not available");
            }
        } else {
            System.out.println("The book is not available");
        }
    }
    public static void main(String[] args) {
        Books book1 = new Books();
        book1.name = "Atomic Habits";
        book1.author = "James Clear";
        book1.year = 2018;
        book1.stock = 5;
        book1.id = 001;
        book1.prize = "Rp120.000";
        book1.category = "Self-Improvement";
        book1.isBestSeller = true;

        Books book2 = new Books();
        book2.name = "Naruto";
        book2.author = "Masashi Kishimoto";
        book2.year = 2000;
        book2.stock = 12;
        book2.id = 002;
        book2.prize = "Rp20.000";
        book2.category = "Komik";
        book2.isBestSeller = true;

        // book1.printBookDetails();
        book1.checkStock("Atomic Habits");
        book2.checkStock("Naruto");
    }
}
