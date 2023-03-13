package Lab.Pertemuan1.Tugas;

import java.util.Scanner;

public class No1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Format Input
        System.out.print("NIM   : ");  
        String NIM = input.next(); // Format input Untuk NIM

        int Soal = Integer.parseInt(NIM.substring(7)); // parseInt (Mengubah String Ke Int), subString(Untuk Menentukan Index).

        if (Soal % 7 == 0) {  // Perkondisian Untuk Menentukan Soal Bernomor 7
            System.out.println("Soal    : no 7"); // Format Output
        } else { // Else Untuk menentuka nomor soal yang bukan no.7 dengan nomor soal ditentukan dengan modolu
            System.out.println("Soal : no " + Soal % 7); 
        }
        input.close(); // Untuk Menutup Penginputan
        
    }
    
}
