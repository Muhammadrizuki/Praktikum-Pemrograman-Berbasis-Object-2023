package Lab.Pertemuan1.Tugas;

import java.util.Scanner;



public class No7 {
    public static void main(String[] args) {
        // Array Animals/List
        String animals[] = {"ayam", "kuda", "sapi", "ardi"};
        // Input
        Scanner sc = new Scanner(System.in);
        String taman = sc.nextLine();
        int kebun = findIndex(taman,animals);
        System.out.println(kebun);
        sc.close();
}
    // Method baru beserta For loop
    public static int findIndex(String teks,String[]animals) {
        for (int i = 0; i < animals.length; i++)   {
            if (animals[i].equalsIgnoreCase(teks)) { // equalsIgnoreCase = menyampingksn huruf kapital dan kecil pada pengecekan teks
                return i ;  // return indeks
            } 
        }
        return -1; // else
}
                                               
} 




