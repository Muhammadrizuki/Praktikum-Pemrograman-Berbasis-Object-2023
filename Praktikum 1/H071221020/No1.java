import java.util.Scanner;

public class No1 {
    
    public static void main(String[] args) {
        
        // Deklarasi variabel
        String nim;
        int dig, isZero;

        // Menggunaka try with catch agar scanner terutup setelah program dalam try dijalankan
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("NIM : ");

            nim = scan.next(); //Memanggil scanner untuk meminta inputan

            dig = Integer.parseInt(nim.substring(7, 10)); // Mengambil 3 diit terahir dari nim dan diconvert ke integer
            
            isZero = dig%7==0 ? 7 : dig%7; // Ternary untuk mengubah nilai menjadi 7 bila menghasilkan 0
            
            System.out.println("Soal : " + isZero);

        } catch (Exception e) {

            System.out.println("Masukkan NIM yang valid!");

        }

    }

}
