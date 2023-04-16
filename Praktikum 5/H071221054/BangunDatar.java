// Parent Class - BangunDatar
public class BangunDatar {
    // Method hitungLuas() dalam parent class
    public double hitungLuas() {
        return 0;   // Nilai default, akan di-override pada child class masing-masing
    }

    // Method hitungKeliling() dalam parent class
    public double hitungKeliling() {
        return 0;   // Nilai default, akan di-override pada child class masing-masing
    }
}

// Child Class - Persegi
class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}

// Child Class - Persegi Panjang
class PersegiPanjang extends BangunDatar {
    private double panjang; 
    private double lebar; 

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

// Child Class - Lingkaran
class Lingkaran extends BangunDatar {
    private double jariJari; 

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

// Child Class - Segitiga
class Segitiga extends BangunDatar {
    private double alas; 
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
    @Override
    public double hitungKeliling() {
    // Di contoh ini, kita asumsikan segitiga merupakan segitiga siku-siku
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }
}

// Child Class - Trapesium
class Trapesium extends BangunDatar {
    private double sisiAtas; 
    private double sisiBawah; 
    private double tinggi; 

    public Trapesium(double sisiAtas, double sisiBawah, double tinggi) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * (sisiAtas + sisiBawah) * tinggi;
    }

    @Override
    public double hitungKeliling() {
    // Di contoh ini, kita asumsikan trapesium adalah trapesium siku-siku
        double sisiMiringAtas = Math.sqrt(sisiAtas * sisiAtas + tinggi * tinggi);
        double sisiMiringBawah = Math.sqrt(sisiBawah * sisiBawah + tinggi * tinggi);
        return sisiAtas + sisiBawah + sisiMiringAtas + sisiMiringBawah;
    }
}

