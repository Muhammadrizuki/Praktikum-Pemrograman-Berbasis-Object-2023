package Lab.Pertemuan1.Tugas;

import java.util.Scanner;

public class No6 {
    public static void main(String[] args) { // Main
        Scanner input = new Scanner(System.in); // Format Input

        try {
            System.out.print("Masukkan Jari-Jari Lingkaran : "); // Format Input jari-jari Bertipe Double
            double jarijari = input.nextDouble();

            String luas = String.format("%.2f" , (Math.PI * jarijari * jarijari)); // "%.2f" = Untuk menentukan 2 Angka di belakang Koma
            // Dan Juga rumus luas lingkaran

            System.out.println("Luas Lingkaran = " + luas); // Format Print Output 1
        } catch (Exception e) {
            System.out.println("Input Harus Berupa Angka!"); // Format Print Output 2
        } // Try Catch Digunakan Untuk Menentukan Input Harus berupa angka
        input.close();
        
    }
    
}
