package assignment5;
import java.lang.Math;

public class BangunRuang {

    public double volume() {
        return 0;
    }
    public double luasPermukaan() {
        return 0;
    }

    public void listBR() {
        System.out.println("==== BANGUN RUANG ====");
        System.out.printf("1. Kubus\n2. Balok\n3. Bola\n4. Tabung\n");
    }
}

class Kubus extends BangunRuang {
    double rusuk;

    Kubus(double rusuk) {
        this.rusuk = rusuk;
    }

    public double getRusuk() {
        return rusuk;
    }
    public double getVolume() {
        return Math.pow(rusuk, 3);
    }
    public double getLuasPermukaan() {
        return 6*rusuk*rusuk;
    }

    public void cetakKubus() {
        System.out.println("> Hitung Kubus:");
        System.out.println("Rusuk Kubus          = " + this.rusuk);
        System.out.println("Volume Kubus         = " + this.getVolume());
        System.out.println("Luas Permukaan Kubus = " + this.getLuasPermukaan());
    }
}

class Balok extends BangunRuang {
    double p, l, t;

    Balok(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }
    public double getP() {
        return p;
    }
    public double getL() {
        return l;
    }
    public double getT() {
        return t;
    }
    public double getVolume() {
        return p*l*t;
    }
    public double getLuasPermukaan() {
        return 2*(p*l + p*t + l*t);
    }

    public void cetakBalok() {
        System.out.println("> Hitung Balok:");
        System.out.println("Panjang Balok        = " + this.p);
        System.out.println("Lebar Balok          = " + this.l);
        System.out.println("Tinggi Balok         = " + this.t);
        System.out.println("Volume Balok         = " + this.getVolume());
        System.out.println("Luas Permukaan Balok = " + this.getLuasPermukaan());
    }
}

class Bola extends BangunRuang {
    double r;

    Bola(double r) {
        this.r = r;
    }
    public double getR() {
        return r;
    }
    public double getVolume() {
        return 4/3*Math.PI*r*r*r;
    }
    public double getLuasPermukaan() {
        return 4*Math.PI*r*r;
    }

    public void cetakBola() {
        System.out.println("> Hitung Bola:");
        System.out.println("Jari-Jari Bola      = " + this.r);
        System.out.println("Volume Bola         = " + this.getVolume());
        System.out.println("Luas Permukaan Bola = " + this.getLuasPermukaan());
    }
}

class Tabung extends BangunRuang {
    double r, tinggi;

    Tabung(double r, double tinggi) {
        this.r = r;
        this.tinggi = tinggi;
    }
    public double getR() {
        return r;
    }
    public double getTinggi() {
        return tinggi;
    }
    public double getVolume() {
        return Math.PI*r*r*tinggi;
    }
    public double getLuasPermukaan() {
        return (2*Math.PI*r*tinggi) + (2*Math.PI*r*r);
    }

    public void cetakTabung() {
        System.out.println("> Hitung Tabung:");
        System.out.println("Jari-Jari Tabung      = " + this.r);
        System.out.println("Tinggi Tabung         = " + this.tinggi);
        System.out.println("Volume Tabung         = " + this.getVolume());
        System.out.println("Luas Permukaan Tabung = " + this.getLuasPermukaan());
    }
}
  