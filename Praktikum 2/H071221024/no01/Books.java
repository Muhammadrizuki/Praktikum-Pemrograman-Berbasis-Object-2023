package no01;

public class Books {
    String name;
    String author;
    int year;
    String category;
    boolean isBestSeller;
    boolean borrowed;
    
    String borrowBook(){
        this.borrowed = true;
        return "Buku " + name + " telah dipinjam...";
    }
    String returnBook(){
        if (borrowed == true) {
            this.borrowed = false;
            return "Buku " + name + " telah dikembalikan...";
        }
        return "Buku " + name + " belum dipinjam...";
    }
    void printBookDetails() {
        System.out.println("Name : " + name);
        System.out.println("Author : " + author);
        System.out.println("Year : " + year);
        System.out.println("Category : " + category);
        System.out.println("isBestSeller : " + isBestSeller);
        System.out.println("Borrowed : " + borrowed);
    }
    public static void main(String[] args) {
        Books book1 = new Books();
        book1.name = "Atomic Habits";
        book1.author = "James Clear";
        book1.year = 2018;
        book1.category = "Self-Improvement";
        book1.isBestSeller = true;

        System.out.println(book1.borrowBook());
        System.out.println(book1.returnBook());
        book1.printBookDetails();
    }
}