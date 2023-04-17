import java.util.Scanner;

public class No3 {

    public static void main(String[] args) {
        
        // Deklarasi variabel
        String nama, hobi;
        int umur;

        // Try cath digunakan untuk menangani eror dalam blok kode di dalamnya
        // Menggunaka try with catch agar scanner terutup setelah program dalam try dijalankan
        try (Scanner scan = new Scanner(System.in);) {

            // Memanggil scanner untuk meminta input
            System.out.print("Name : ");
            nama = scan.nextLine();

            System.out.print("Umur : ");
            umur = scan.nextInt();
            scan.nextLine(); // Digunakan agar scanner dapat kembali mengambil inputan dibawahnya

            System.out.print("Hobi : ");
            hobi = scan.nextLine();

            System.out.printf("Nama saya %s, umur %s tahun, hobi %s", nama, umur, hobi);

        } catch (Exception e) {

            System.out.println("Masukkan hanya angka dalam kolom umur!");

        }

    }

}