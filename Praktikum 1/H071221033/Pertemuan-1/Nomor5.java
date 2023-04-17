import java.util.Scanner;

public class Nomor5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a;       // utk input tanggal
        String hari;
        String bulan;
        String tahun;
        int month;
        int year;

        a = sc.next();
        hari = a.substring(0, 2);   // mengambil a dri indeks 0-2  
        System.out.print(Integer.parseInt(hari));        // utk print hari yg sudah dikonversi

        bulan = a.substring(3, 5);  // mengambil a dri indeks 3-5
        month = Integer.parseInt(bulan);                 // konversi string ke int
        if (month == 1) {
            System.out.print(" Januari");
        }
        else if (month == 2) {
            System.out.print(" Februari");
        }
        else if (month == 3) {
            System.out.print(" Maret");
        }
        else if (month == 4) {
            System.out.print(" April");
        }
        else if (month == 5) {
            System.out.print(" Mei");
        }
        else if (month == 6) {
            System.out.print(" Juni");
        }
        else if (month == 7) {
            System.out.print(" Juli");
        }
        else if (month == 8) {
            System.out.print(" Agustus");
        }
        else if (month == 9) {
            System.out.print(" September");
        }
        else if (month == 10) {
            System.out.print(" Oktober");
        }
        else if (month == 11) {
            System.out.print(" November");
        }
        else if (month == 12) {
            System.out.print(" Desember");
        }

        tahun = a.substring(6, 8);      // mengambil a dri indeks 6-8
        year = Integer.parseInt(tahun);                     // konversi string ke int
        if (year <= 23) {
            System.out.println(" 20" + tahun);
        }
        else {
            System.out.println(" 19" + tahun);
        }

        sc.close();
    }
}
