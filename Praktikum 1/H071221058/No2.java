package Lab.Pertemuan1.Tugas;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in); // Format Input
    int bilBulat,bilDesimal,n,i; // Deklarasi Data Bertype Integer

    bilBulat   = 0; // Bilangan Bulat Dimulai dari 0
    bilDesimal = 0; // Bilangan Desimal Dimulai Dari 0

    try { // Try Catch Untuk Memastikan Inputan Berupa Bilangan!!
        System.out.print("Masukkan Jumlah Bilangan : "); // Output String Input Jumlah Bilangan
        n = userInput.nextInt(); // n adaah variabel sebagai jumlah angka yang akan diinput
        userInput.nextLine(); // NextLine Untuk Enter
        System.out.println("Silahkan Masukkan " + n + " Bilangan : "); // Output Berapa angka yang akan dimasukkan

        for ( i = 0; i < n; i++) {
            double num = userInput.nextDouble();
            if (num % 1 == 0) {
                bilBulat++;
            } else {
                bilDesimal++;
            }}

            System.out.println(bilBulat + " Bilangan Bulat");
            System.out.println(bilDesimal + " Bilangan Desimal");
            userInput.close();
        } catch (Exception e) {
            System.out.println("Input Harus Bilangan!");
        }
    }

    }


