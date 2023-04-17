package No3;

import java.util.Scanner;

public class SimpleStoreApp {
    
    public static void main(String[] args) {
        
        // inisialisasi objek
        Scanner sc = new Scanner(System.in);
        User user = new User("Kelvin", 1000);
        Store store = new Store("Toko Laptop");
        Product l1 = new Product("Asus Vivobook", 3000, 0); 
        Product l2 = new Product("Acer Aspire", 2000, 0);
        Product l3 = new Product("HP Pavilion", "4k", 0);
        Product l4 = new Product("HP Omen", "4k", -2);

        // perulangan untuk kembali menjalankan program bila user tetap ingin bertransaksi
        while (true) {

            store.addproduct(l1, l2, l3, l4); // memasukkan objek ke dalam list
            user.showcard(); // menampilkan card dari user
            store.showgreet(); // menampilkan sapaan selamat datang

            int choice = sc.nextInt(); // meminta inputan pilihan produk

            // pengkondisian untuk pilihan 0
            if (choice<=0) {
                break;
            } else {
                store.conf(choice);
            }

            int conf = sc.nextInt(); // meminta inputan konfirmasi pembelian produk

            // pengkondisian untuk tetap ada dalam program atau keluar setelah bertransaksi
            if (conf==1) {
                store.trans(user, choice);
                int cont = sc.nextInt(); // meminta inputan confirmasi melanjutkan program
                if (cont==1) {
                    continue;
                } else {
                    break;
                }
            } else {
                continue;
            }
        }

        sc.close();

    }

}
