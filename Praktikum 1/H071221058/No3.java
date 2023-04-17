package Lab.Pertemuan1.Tugas;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // Format Untuk Melakukan Input Di Program

        try {
            System.out.print("Name  : "); //Format Input Name Berupa String
            String name = input.nextLine(); //Fungsi Dari nextLine untuk menambahkan Enter

            System.out.print("Age   : "); //Format Input Age (umur) Berupa Integer
            int age = input.nextInt(); // Kenapa Tidak NextLine? Karena input int harus memakai nextInt
            input.nextLine(); // Fungsi Untuk Menambahkan Enter

            System.out.print("hobby : "); // Format Input Hobby Berupa String
            String hobby = input.nextLine(); // Fungsi untuk menambahkan enter

            System.out.println("Nama saya " + name + ", " + age + " Tahun, Hobby " + hobby); // Format print Nama,age, dan Hobby
        } catch (Exception e) {
            System.out.println("Umur Harus Berupa Angka"); // Jika Age =! Angka maka akan print ini
        }// Kegunaan Try Catch Disini hanya untuk mengecek apakah age merupakan angka atau bukab, sebenarnya jika ingin tanpa mengecek age adalah angka bisa langsung input print saja
        input.close(); //Untuk Mengehentikan Input 

        
        
    }
    
}
