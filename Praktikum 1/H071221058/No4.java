package Lab.Pertemuan1.Tugas;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        // Deklarasi Scanner

        Scanner sc = new Scanner(System.in);

        // Deklarasi Variable

        String kalimat; 

        // Inpu

        System.out.println("Masukkan Judul Film : ");
        kalimat = sc.nextLine();

        // String Builder = modifikasi String
        StringBuilder kalimatbaru = new StringBuilder();
        
        // For loop
        for (String kata : kalimat.split(" ")) {
        String katabaru = kata.substring(0,1).toUpperCase() + kata.substring(1).toLowerCase();
        kalimatbaru.append(katabaru).append(" ");
        }

        // Output
        System.out.println(kalimatbaru);
        sc.close();

    }  
}
