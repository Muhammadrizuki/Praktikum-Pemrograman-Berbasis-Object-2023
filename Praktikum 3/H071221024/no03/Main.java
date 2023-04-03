package no03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store("Sisfo Computer");
        User user1 = new User("Rasyad", 3000);
        Product product1 = new Product("HP Pavilion Gaming 15", "2k", 15, store);
        Product product2 = new Product("ASUS VivoBook 15 A516MAO N4020", "4k", 4, store);
        Product product3 = new Product("Lenovo IdeaPad S145", 1500, 2, store);
        Scanner sc = new Scanner(System.in);
        boolean a = true;

        while(a == true){
            boolean b = true;
            Boolean c = true;
            Boolean shouldBreak = false;
            System.out.println("-".repeat(11) + "CARD" + "-".repeat(11));
            System.out.println(user1.getName());
            System.out.println(user1.getBalance());
            System.out.println("-".repeat(26));

            System.out.println("Selamat Datang di " + store.getName());
            System.out.println("Daftar Produk:");
            store.listProduct();
            System.out.println("0. Keluar");
            System.out.print("> ");
            int input1 = sc.nextInt();

            for (int i = 0; i < store.getProducts().size() && !shouldBreak; i++){
                if (input1 <= store.getProducts().size() && input1 > 0){
                    System.out.println("Apakah anda yakin ingin membeli:");
                    System.out.println(store.getProducts(input1 - 1) + ", dengan Harga " + "$" + store.getProductsPrice(input1 - 1));
                    System.out.println("1. Konfirmasi");
                    System.out.println("2. Batal");
                    System.out.print("> ");
                    int input2 = sc.nextInt();
                    if (input2 == 1){
                        store.transactionProcess(user1, store.getProducts(input1 - 1));
                        while (c == true){
                            System.out.println(user1.getName() + " berhasil membeli " + store.getProductsName(input1 - 1));
                            store.removeProductsName(input1 - 1);
                            System.out.println("-".repeat(20));
                            System.out.println("Lanjutkan Transaksi?");
                            System.out.println("1. Iya");
                            System.out.println("2. Tidak");
                            System.out.print("> ");
                            int input3 = sc.nextInt();
                            if (input3 == 1){
                                c = false;
                                shouldBreak = true;
                            } else if (input3 == 2){
                                shouldBreak = true;
                                a = false;
                                c = false;
                                System.out.println("Sampai Jumpa Kembali!!!");
                            } else {
                                System.out.println("Inputan Salah! Mohon Mencoba Kembali!");
                            }
                        }
                    } else if (input2 == 2){
                        shouldBreak = true;
                    } else {
                        System.out.println("Inputan Salah! Mohon Mencoba Kembali!");
                    }
                } else {
                    while (b == true){
                        System.out.println("Inputan Salah! Mohon Mencoba Kembali!");
                        System.out.println("-".repeat(20));
                        System.out.println("Ingin Kembali ke Menu Utama?");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        System.out.print("> ");
                        int input2 = sc.nextInt();
    
                        if (input2 == 1){
                            b = false;
                        } else if (input2 == 2){
                            a = false;
                            b = false;
                            System.out.println("Sampai Jumpa Kembali!!!");
                        }
                    }
                }
            }
        }
        sc.close();
    }
}