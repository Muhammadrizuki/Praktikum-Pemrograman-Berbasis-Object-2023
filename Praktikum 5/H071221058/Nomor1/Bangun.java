package TUGAS.Pertemuan5.Nomor1;
import java.util.Scanner;
public class Bangun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bangun  tidur   = new Bangun();

        Kubus   kubus   = new Kubus(1);
        Balok   balok   = new Balok(23, 10, 5);
        Bola    bola    = new Bola(14);
        Tabung  tabung  = new Tabung(14, 24);
        tidur.detailBangunRuang();
        
        System.out.print("> ");
        int pilihan2    = scanner.nextInt();
        scanner.nextLine();
        switch (pilihan2) {
            case 1:
                System.out.println("Luas Permukaan = " + kubus.luasPermukaan());
                System.out.println("Volume         = " + kubus.volume());
                break;
            case 2:
                System.out.println("Luas Permukaan = " + balok.luasPermukaan());
                System.out.println("Volume         = " + balok.volume());
                break;
            case 3:
                System.out.println("Luas Permukaan = " + bola.luasPermukaan());
                System.out.println("Volume         = " + bola.volume());
                break;
            case 4:
                System.out.println("Luas Permukaan = " + tabung.luasPermukaan());
                System.out.println("Volume         = " + tabung.volume());
                break;
            default:
                System.out.println("INPUTAN TIDAK VALID");
                break;
        }

        Persegi         persegi      = new Persegi(1);
        persegiPanjang  persegii     = new persegiPanjang(2, 7);
        Lingkaran       lingkaran    = new Lingkaran(20);
        Segitiga        segitiga     = new Segitiga(12, 2, 2, 2);
        Trapesium       trapesium    = new Trapesium(5, 2, 1, 6, 2);
        tidur.detailBangunDatar();

        System.out.print("> ");
        int pilihan3 = scanner.nextInt();
        scanner.nextLine();
        switch (pilihan3) {
            case 1:
                System.out.println("Luas        = " + persegi.luas());
                System.out.println("Keliling    = " + persegi.keliling());
                break;
            case 2:
                System.out.println("Luas        = " + persegii.luas());
                System.out.println("Keliling    = " + persegii.keliling());
                break;
            case 3:
                System.out.println("Luas        = " + lingkaran.luas());
                System.out.println("Keliling    = " + lingkaran.keliling());
                break;
            case 4:
                System.out.println("Luas        = " + segitiga.luas());
                System.out.println("Keliling    = " + segitiga.keliling());
                break;
            case 5:
                System.out.println("Luas        = " + trapesium.luas());
                System.out.println("Keliling    = " + trapesium.keliling());
                break;
            default:
                System.out.println("INPUTAN TIDAK VALID");
                break;
        }
        scanner.close();
    }
    
    public void detailBangunRuang() {
        System.out.println("======= BANGUN RUANG =======");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
    }
    public void detailBangunDatar() {
        System.out.println("======= BANGUN DATAR =======");
        System.out.println("1. PERSEGI");
        System.out.println("2. PERSEGI PANJANG");
        System.out.println("3. LINGKARAN");
        System.out.println("4. SEGITIGA");
        System.out.println("5. TRAPESIUM");
    }

}
