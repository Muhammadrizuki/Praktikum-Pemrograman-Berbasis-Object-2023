import java.util.*;

public class No8 {
    
    public static void main(String[] args) {
        
        // Inisialisasi Variabel
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int ini = 0;
        int inj = 0;
        boolean dapat = false;

        try (Scanner scan = new Scanner(System.in)) {
            int s = scan.nextInt(); // Mengambil input integer
            if (dapat==false) {
                for (int[] i : nums) {
                    if (dapat==false){
                        for (int j : i) {
                            if (j==s){
                                System.out.printf("dapat [%d] di [%d][%d]", s, ini, inj);
                                dapat = true;
                            }
                            inj++;
                        }
                        ini++;
                        inj = 0;
                    }
                }
            }

            if (dapat==false) {
                System.out.println("Tidak ditemukan");
            }

        } catch (Exception e) {
            System.out.println("Masukkan input yang valid!");
        }

    }

}
