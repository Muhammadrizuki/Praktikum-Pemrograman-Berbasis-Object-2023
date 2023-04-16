package assignment3;
import java.util.Scanner;
import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // objek user dari class User
        User user = new User("Nurfadilah", 5000);

        // isi list produk dari class Product
        ArrayList<Product> produk = new ArrayList<>();
        produk.add(new Product("Choki-Choki", 1000, 2));
        produk.add(new Product("Better", 2000, 3));
        produk.add(new Product("Teh Pucuk", 3000, 4));

        // objek jajan dari class Store
        Store jajan = new Store("Jajan Kuy", produk);
        jajan.addProduct(new Product("Granita", 1000, 3));

        while (true) {  // loop 1 (true) memang sintaksnya
            user.card();    // menampilkan info user
            jajan.listProduct();    // menampilkan list produk
            System.out.print("> ");
            int pil1 = sc.nextInt();    // input pilihan produk yg akan dibeli

            // input pilihan sama atau tidak lebih dri jumlah produk
            if (pil1 > jajan.getProduct().size()) {
                System.out.println("-".repeat(40));
                System.out.println("Tidak ada dalam pilihan");
                

            // input lebih atau tidak sesuai dengan jumlah produk
            } else if (pil1 >= 1 && pil1 <= produk.size()) {
                System.out.println("-".repeat(40));
                System.out.println("Apakah anda yakin ingin membeli: ");
                System.out.printf("%s, dengan harga %d%n", jajan.getProduct().get(pil1 - 1).getName(), jajan.getProduct().get(pil1 - 1).getPrice());
                System.out.println("-".repeat(40));

                while (true) {  // loop 2 
                    System.out.printf("1. Konfirmasi%n2. Batal%n");
                    System.out.print("> ");
                    int confirm = sc.nextInt();

                    // inputan 1 dan jumlah balance user cukup untuk membeli produk
                    if (confirm == 1 && user.getBalance() >= jajan.getProduct().get(pil1 - 1).getPrice()) { 
                        System.out.println("-".repeat(40));
                        // Mengurangi jumlah stok dan mengecek 
                        // jika stok = 0, maka produk akan di-remove dari list product
                        jajan.getProduct().get(pil1 - 1).sisaStok(jajan); 
                        // Menyesuaikan balance dari user setelah transaksi berhasil
                        user.setBalance(jajan.getProduct().get(pil1 - 1).getPrice()); 

                        System.out.printf("%s berhasil membeli %s.%n", user.getName(), jajan.getProduct().get(pil1 - 1).getName());
                        System.out.println("-".repeat(40));
                        System.out.printf("Lanjutkan Transaksi%n1. Iya%n2. Tidak%n");
                        System.out.print("> ");
                        int pil2 = sc.nextInt();

                        if (pil2 == 1) { // Break Loop 2
                            break;
                        } else {
                            System.out.println("Terima Kasih Telah Berkunjung");
                            System.exit(0); // Menghentikan seluruh Loop / return 0
                        }

                    } else if (confirm == 2) { // Opsi batalkan transaksi (Break Loop 2)
                        break;

                    } else {
                        System.out.println("-".repeat(40));
                        System.out.printf("Transaksi dibatalkan!");
                        break;
                    }
                }   

            } else {
                System.out.println("Terima Kasih Telah Berkunjung");
                break;
            }

        } sc.close();
    }
}
