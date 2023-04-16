package assignment5;
import java.util.Scanner;

public class MainBangun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // instance objek bangun ruang dan bangun datar
        BangunRuang br = new BangunRuang();
        br.listBR();
        BangunDatar bd = new BangunDatar();
        bd.listBD();
        
        // inputan utk memilih nomor brp bangun yg akan dihitung
        System.out.print("\nPilih bangun : ");
        int pilihBangun = sc.nextInt();
        switch(pilihBangun) {
            case 1:
            Kubus kubus = new Kubus(3.0);
            kubus.getRusuk();
            kubus.getVolume();
            kubus.getLuasPermukaan();
            kubus.cetakKubus();
            break;

            case 2:
            Balok balok = new Balok(4.0, 2.5, 3.0);
            balok.getP();
            balok.getL();
            balok.getT();
            balok.getVolume();
            balok.getLuasPermukaan();
            balok.cetakBalok();
            break;

            case 3:
            Bola bola = new Bola(3.0);
            bola.getR();
            bola.getVolume();
            bola.getLuasPermukaan();
            bola.cetakBola();
            break;

            case 4:
            Tabung tabung = new Tabung(3.0, 5.0);
            tabung.getR();
            tabung.getTinggi();
            tabung.getVolume();
            tabung.getLuasPermukaan();
            tabung.cetakTabung();
            break;

            case 5:
            Persegi persegi = new Persegi(3.0);
            persegi.getSisi();
            persegi.getLuas();
            persegi.getKeliling();
            persegi.cetakPersegi();
            break;

            case 6:
            PersegiPanjang pp = new PersegiPanjang(3.0, 4.0);
            pp.getPanjang();
            pp.getLebar();
            pp.getLuas();
            pp.getKeliling();
            pp.cetakPersegiPanjang();
            break;

            case 7:
            Lingkaran lingkaran = new Lingkaran(3.0);
            lingkaran.getR();
            lingkaran.getLuas();
            lingkaran.getKeliling();
            lingkaran.cetakLingkaran();
            break;

            case 8:
            Segitiga segitiga = new Segitiga(5.0, 3.0, 4.0);
            segitiga.getAlas();
            segitiga.getTinggi();
            segitiga.getSisi();
            segitiga.getLuas();
            segitiga.getKeliling();
            segitiga.cetakSegitiga();
            break;
             
            case 9:
            Trapesium trapesium = new Trapesium(2.0, 4.0, 3.0, 3.0, 5.0);
            trapesium.getA();
            trapesium.getB();
            trapesium.getC();
            trapesium.getD();
            trapesium.getTinggi();
            trapesium.getLuas();
            trapesium.getKeliling();
            trapesium.cetakTrapesium();
            break;
        }
        sc.close();
        
    }   
}
