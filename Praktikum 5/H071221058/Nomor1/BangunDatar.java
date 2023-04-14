package TUGAS.Pertemuan5.Nomor1;

public class BangunDatar {
    double luas() {
        return 0;
    }
    double keliling() {
        return 0;
    }
}

class Persegi extends BangunDatar {
    int sisi;
    public Persegi(int sisi) {
        this.sisi = sisi;
    }
    double luas() {
        return Math.pow(sisi, 2);
    }
    double keliling() {
        return sisi*4;
    }
}

class persegiPanjang extends BangunDatar {
    int panjang;
    int lebar;
    public persegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    double luas() {
        return panjang*lebar;
    }
    double keliling() {
        return (panjang*2)+(lebar*2);
    }
}

class Lingkaran extends BangunDatar {
    int jariJari;
    public Lingkaran(int jariJari) {
        this.jariJari = jariJari;
    }
    double luas() {
        return Math.PI*Math.pow(jariJari, 2);
    }
    double keliling() {
        return Math.PI*2*jariJari;
    }
}

class Segitiga extends BangunDatar {
    int alas;
    int tinggi;
    int sisi1;
    int sisi2;
    public Segitiga(int alas, int tinggi, int sisi1) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        // this.sisi2 = sisi2;
    }
    double luas() {
        return 0.5*alas*tinggi;
    }
    double keliling() {
        return sisi1+tinggi+alas;
    }
}

class Trapesium extends BangunDatar {
    int sisiAtas;
    int tinggi;
    int sisiBawah;
    int sisiKanan;
    int sisiKiri;
    public Trapesium(int sisiAtas, int sisiBawah, int sisiKanan, int sisiKiri, int tinggi) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.sisiKanan = sisiKanan;
        this.sisiKiri = sisiKiri;
        this.tinggi = tinggi;
    }
    double luas() {
        return 0.5*sisiAtas*sisiBawah*tinggi;
    }
    double keliling() {
        return sisiAtas+sisiBawah+sisiKanan+sisiKiri;
    }
}
