package Lab.Pertemuan1.Tugas;

import java.util.Scanner;


public class No8 {
    public static void main(String[] args) {

    try {
    Scanner sc = new Scanner(System.in);

    // Inputan
    System.out.print("Masukkan satu Bilangan : ");
    int bilangan = sc.nextInt();
    
    
    //Array 2D
    int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    boolean found = false;

    // Perulangan untuk mencari bilangan pada array 2D
    for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < nums[i].length; j++) {
            if (nums[i][j] == bilangan) {
                System.out.println("Found " + bilangan + " at [" + i + "][" + j + "]");
                found = true;
            }
        }
    }

    if (!found) { // if tidak ditemukan
        System.out.println("Bilangan " + bilangan + " Tidak Ditemukan Pada Array2D"); // output
    }
    sc.close(); }

    catch (Exception e) {
        System.out.println("Inputan Harus Berupa Angka");} // catch jika inputan bukan angka
    

}  
    
}
