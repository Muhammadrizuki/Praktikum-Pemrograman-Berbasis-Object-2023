import java.util.Scanner;

public class No7 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String[] list = new String[]{"Ayam", "Sapi", "Kambing", "Anjing", "ayam", "anjing", "Buaya"};

        String s = scan.next();

        No7.findindex(list, s);

        scan.close();

    }

    static void findindex(String[] list, String teks) {

        // Inisialisasi jumlah ditemukan dan indexnya
        int jum = 0;
        int ind = 0;

        int[] lis = new int[list.length]; //membuat list untuk menampung index ditemukan

        // For each untuk menyamakan inputan dengan elemen array
        // Untuk mengabaikan case, digunakan toLowerCase untuk membuat seluruh karakter tidak kapital
        for (String i : list) {

            String lowi = i.toLowerCase();
            String lowt = teks.toLowerCase();

            if (lowi.equals(lowt)) {
                lis[jum] = ind;
                jum++;
            }

            ind++;

        }

        // Pengkondisian untuk menentukan output
        if (jum>0) {
            for (int j=0; j<jum; j++) {
                System.out.printf("[%s] ", lis[j]);
            }
        } else {
            System.out.println("[-1]");
        }

    }

}
