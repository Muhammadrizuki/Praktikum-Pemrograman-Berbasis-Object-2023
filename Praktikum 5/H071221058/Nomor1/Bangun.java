package TUGAS.Pertemuan5.Nomor1;

import java.util.Scanner;

public class Bangun {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Bangun bangun = new Bangun();

        Kubus kubus = new Kubus(5);
        Balok balok = new Balok(5, 6, 7);
        Bola bola = new Bola(14);
        Tabung tabung = new Tabung(14, 24);
        bangun.detailBangunRuang();
        
        System.out.print("> ");
        int pilihan2 = inp.nextInt();
        inp.nextLine();
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

        Persegi persegi = new Persegi(5);
        persegiPanjang persegip = new persegiPanjang(5, 4);
        Lingkaran lingkaran = new Lingkaran(14);
        Segitiga segitiga = new Segitiga(12, 7, 10);
        Trapesium trapesium = new Trapesium(4, 5, 3, 3, 2);
        bangun.detailBangunDatar();

        System.out.print("> ");
        int pilihan3 = inp.nextInt();
        inp.nextLine();
        switch (pilihan3) {
            case 1:
                System.out.println("Luas        = " + persegi.luas());
                System.out.println("Keliling    = " + persegi.keliling());
                break;
            case 2:
                System.out.println("Luas        = " + persegip.luas());
                System.out.println("Keliling    = " + persegip.keliling());
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
        inp.close();
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
