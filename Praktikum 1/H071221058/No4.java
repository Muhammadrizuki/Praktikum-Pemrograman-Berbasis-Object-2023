package Lab.Pertemuan1.Tugas;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        // Deklarasi Scanner

        Scanner sc = new Scanner(System.in);

        // Deklarasi Variable

        String kalimat;

        System.out.println("Masukkan Judul Film : ");
        kalimat = sc.nextLine();

        StringBuilder kalimatbaru = new StringBuilder();
        
        for (String kata : kalimat.split(" ")) {
        String katabaru = kata.substring(0,1).toUpperCase() + kata.substring(1).toLowerCase();
        kalimatbaru.append(katabaru).append(" ");
        }

        System.out.println(kalimatbaru);
        sc.close();

    }  
}
