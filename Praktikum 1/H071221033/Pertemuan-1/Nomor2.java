import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // deklarasi tipe data dan variabel
        int i;
        int n;
        double bil;
        int bilBul = 0;
        int bilDes = 0;

        try {       // pakai try catch utk menghindari error jika yg diinput bukan angka
            System.out.print("Jumlah bilangan n : ");             // utk input banyaknya bilangan yg ingin dimasukkan
            n = sc.nextInt();                                       // variabel utk input banyak bilangan
            System.out.println("Masukkan " + n + " bilangan :");    // utk input bilangan bulat dan desimal
        
            for (i = 0; i < n; i++) {               // perulangan utk mengecek apakah bilangan tsb termasuk bilbul/bildes
                bil = sc.nextDouble();              // variabel utk input bilangan yg ingin dicek
                if (bil % 1 == 0) {                 // pengkondisian jika bilangan yg diinput modulo 1 = 0
                    bilBul++;                       // bilangan tsb dimasukkan variabel bilBul
                } else {                            // hasil modulo selain 0
                    bilDes++;                       // bilangan tsb dimasukkan variabel bilDes
                }   // cth: bil = 1.1 % 1, sisanya 0.1 != 0, maka masuk ke bildes
            } 
            System.out.println(bilBul + " bilangan bulat");        // utk print jumlah bilangan bulat
            System.out.println(bilDes + " bilangan desimal");      // utk print jumlah bilangan desimal
        }  
        catch (Exception e) {                                 
            System.out.println("Inputan bukan angka");      // jika yg diinput bukan angka, maka ini akan terprint
        }
        
        sc.close();
    }
}