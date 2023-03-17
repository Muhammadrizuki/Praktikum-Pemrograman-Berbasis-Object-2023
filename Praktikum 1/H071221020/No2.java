import java.util.Scanner;

public class No2 {
    
    public static void main(String[] args) {

        // Deklarasi variabel
        int jum, bul, des;
        double elm;
        Double[] lis;
        
        // Menggunaka try with catch agar scanner terutup setelah program dalam try dijalankan
        try (Scanner scan = new Scanner(System.in);) {
            
            jum = scan.nextInt(); // Memanggil acanner untuk meminta inputan jumlah isi array

            lis = new Double[jum]; // Inisiasi array

            // Loop untuk mengambil sebanyak jum bilangan dari scanner
            // Bila bilangan terlalu sedikit, kode Error
            // Bila bilangan terlalu banyak, yang diambil hanya sebanyak jum bilangan
            for (int i=0; i<jum ;i++) {

                elm = scan.nextDouble();
                lis[i] = elm;

            }

            // For each untuk menentukan bilangan bulat atau desimal
            // Menambahkan nilai bul atau des bila ditemukan
            bul = 0;
            des = 0;
            for (double j : lis) {

                if (j%1==0) {
                    bul++;
                } else {
                    des++;
                }
            }

            System.out.println(bul + " Bilangan Bulat");
            System.out.println(des + " Bilangan Desimal");

        } catch (Exception e) {

            System.out.println("Masukkan hanya bilangan dan jumlahnya sesuai!");

        }

    }

}
