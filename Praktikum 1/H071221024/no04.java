import java.util.Scanner;
public class no04 {
    public static void main(String[] args) {
        System.out.println("Masukkan Judul Film");
        Scanner sc = new Scanner(System.in);
        System.out.print("> ");
        String judulFilm = sc.nextLine();

        String[] kalimat = judulFilm.split(" ");
        String hasil = "";
        for (int i = 0; i < kalimat.length; i++) {
           String kata = kalimat[i];
           String hurufDepan = kata.substring(0,1); //dimulai dari index ke 0 (huruf pertama) dan diakhiri di index ke 1 dalam hal ini, index ke 1 tidak termasuk (berperan sebagai stop)
           String sisaHuruf = kata.substring(1); //dimulai dari index pertama (huruf kedua) sampai selebihnya
           hasil += hurufDepan.toUpperCase() + sisaHuruf.toLowerCase() + " "; 
        }
        System.out.println(hasil);
        sc.close();
    }
}
