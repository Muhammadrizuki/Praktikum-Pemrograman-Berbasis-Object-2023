package assignment5;
import java.lang.Math;

public class BangunDatar {

    public double luas() {
        return 0;
    }
    public double keliling() {
        return 0;
    }

    public void listBD() {
        System.out.printf("\n==== BANGUN DATAR ====\n");
        System.out.printf("5. Persegi\n6. Persegi Panjang\n7. Lingkaran\n8. Segitiga\n9. Trapesium\n");
    }
}

class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }
    public double getSisi() {
        return sisi;
    }
    public double getLuas() {
        return sisi*sisi;
    }
    public double getKeliling() {
        return 4*sisi;
    }

    public void cetakPersegi() {
        System.out.println("> Hitung Persegi:");
        System.out.println("Sisi Persegi     = " + this.sisi);
        System.out.println("Luas Persegi     = " + this.getLuas());
        System.out.println("Keliling Persegi = " + this.getKeliling());
    }
}

class PersegiPanjang extends BangunDatar {
    double panjang, lebar;

    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double getPanjang() {
        return panjang;
    }
    public double getLebar() {
        return lebar;
    }
    public double getLuas() {
        return panjang*lebar;
    }
    public double getKeliling() {
        return 2*panjang + 2*lebar;
    }

    public void cetakPersegiPanjang() {
        System.out.println("> Hitung Persegi Panjang:");
        System.out.println("Panjang Persegi Panjang  = " + this.panjang);
        System.out.println("Lebar Persegi Panjang    = " + this.lebar);
        System.out.println("Luas Persegi Panjang     = " + this.getLuas());
        System.out.println("Keliling Persegi Panjang = " + this.getKeliling());
    }
}

class Lingkaran extends BangunDatar {
    double r;

    Lingkaran(double r) {
        this.r = r;
    }
    public double getR() {
        return r;
    }
    public double getLuas() {
        return Math.PI * r * r;
    }
    public double getKeliling() {
        return 2 *Math.PI * r;
    }

    public void cetakLingkaran() {
        System.out.println("> Hitung Lingkaran:");
        System.out.println("Jari-Jari Lingkaran = " + this.r);
        System.out.println("Luas Lingkaran      = " + this.getLuas());
        System.out.println("Keliling Lingkaran  = " + this.getKeliling());
    }
}

class Segitiga extends BangunDatar {
    double alas, tinggi, sisi;

    Segitiga(double alas, double tinggi, double sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public double getAlas() {
        return alas;
    }
    public double getTinggi() {
        return tinggi;
    }
    public double getSisi() {
        return sisi;
    }
    public double getLuas() {
        return 0.5 * alas * tinggi;
    }
    public double getKeliling() {
        return sisi + sisi + alas;
    }

    public void cetakSegitiga() {
        System.out.println("> Hitung Segitiga:");
        System.out.println("Alas Segitiga       = " + this.alas);
        System.out.println("Tinggi Segitiga     = " + this.tinggi);
        System.out.println("Sisi lain Segitiga  = " + this.sisi);
        System.out.println("Luas Segitiga       = " + this.getLuas());
        System.out.println("Keliling Segitiga   = " + this.getKeliling());
    }
}

class Trapesium extends BangunDatar {
    double a, b, c, d, tinggi;

    Trapesium(double a, double b, double c, double d, double tinggi) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.tinggi = tinggi;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getD() {
        return d;
    }
    public double getTinggi() {
        return tinggi;
    }
    public double getLuas() {
        return 1/2*a+b*tinggi;
    }
    public double getKeliling() {
        return a+b+c+d;
    }

    public void cetakTrapesium() {
        System.out.println("> Hitung Trapesium:");
        System.out.println("Sisi atas Trapesium     = " + this.a);
        System.out.println("Sisi bawah Trapesium    = " + this.b);
        System.out.println("Sisi samping Trapesium  = " + this.c);
        System.out.println("Sisi samping Trapesium  = " + this.d);
        System.out.println("Tinggi Trapesium        = " + this.tinggi);
        System.out.println("Luas Trapesium          = " + this.getLuas());
        System.out.println("Keliling Trapesium      = " + this.getKeliling());
    }
}
