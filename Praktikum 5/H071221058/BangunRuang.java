package TUGAS.Pertemuan5.Nomor1;

public class BangunRuang {
    double luasPermukaan() {
        return 0;
    }
    double volume() {
        return 0;
    }
}

class Kubus extends BangunRuang {
    int sisi;
    public Kubus(int sisi) {
        this.sisi= sisi;
    }
    double luasPermukaan() {
        return 6*Math.pow(sisi, 2);
    }
    double volume() {
        return Math.pow(sisi, 3);
    }
}

class Balok extends BangunRuang {
    int panjang;
    int lebar;
    int tinggi;
    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    double luasPermukaan() {
        return 2*((panjang*lebar)+(panjang*tinggi)+(tinggi*lebar));
    }
    double volume() {
        return panjang*lebar*tinggi;
    }
}

class Bola extends BangunRuang {
    int jariJari;
    public Bola(int jariJari) {
        this.jariJari = jariJari;
    }
    double luasPermukaan() {
        return 4*Math.PI*Math.pow(jariJari, 2);
    }
    double volume() {
        return (4/3)*Math.PI*Math.pow(jariJari, 3);
    }
}

class Tabung extends BangunRuang {
    int jariJari;
    int tinggi;
    public Tabung(int jariJari, int tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }
    double luasPermukaan() {
        return (2*Math.PI*jariJari*tinggi) + (2*Math.PI*Math.pow(jariJari, 2));
    }
    double volume() {
        return Math.PI*Math.pow(jariJari, 2)*tinggi;
    }
}

