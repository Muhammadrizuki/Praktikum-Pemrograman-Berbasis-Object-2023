import java.util.Scanner;

public class LatihanNo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();

        int akhirNIM = Integer.parseInt(nim.substring(nim.length() - 3));
        // Integer.parseInt() ->utk mengkonversi data bertipe string menjadi tipe integer 
        // nim.substring(nim.length()-3) -> utk mengambil 3 karakter dari belakang

        int noSoal = akhirNIM % 7;                      // buat variabel utk no soal yg akan didapat, isinya akhir nim dimodul
        if (noSoal == 0) {                              // jika nilai noSoal = 0, maka yg didapat adalah soal no 7
            System.out.println("Soal no 7");
        } else {
            System.out.println("soal no " + noSoal);    // jika hasil modul !=0, maka yg ter-print sbg no soal adalah hasil m
        }

        sc.close();
    }
}
