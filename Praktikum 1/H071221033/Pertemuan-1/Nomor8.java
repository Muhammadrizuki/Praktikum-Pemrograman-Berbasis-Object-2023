import java.util.Scanner;

public class Nomor8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        boolean found = false;
        
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Masukkan angka yang ingin dicari : ");
        angka = sc.nextInt();

        try {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == angka) {
                        System.out.printf("Found %d at [%d][%d]\n", angka, i, j);
                        found = true;
                        break;
                    }       // cth indeks yg dicari 1 : i < panjang array, maka i ditambah
                }           // jika j < 
            }
        } catch (Exception e) {
            if (!found) {
                System.out.println("Angka " + angka + " tidak ditemukan");
            }    
        } sc.close();
    }
}