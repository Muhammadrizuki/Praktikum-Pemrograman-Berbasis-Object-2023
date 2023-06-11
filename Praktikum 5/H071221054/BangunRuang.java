// Parent Class - BangunRuang
public class BangunRuang {
    // Method untuk menghitung luas bangun ruang
    public double hitungLuas() {
        return 0;   // Nilai default, akan di-override pada child class masing-masing
    }

    // Method untuk menghitung keliling bangun ruang
    public double hitungKeliling() {
        return 0;   // Nilai default, akan di-override pada child class masing-masing
    }
}

// Child Class - Kubus
class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return 6 * sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 12 * sisi;
    }
}

// Child Class - Balok
class Balok extends BangunRuang {
    private double panjang; 
    private double lebar;
    private double tinggi; 

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    @Override
    public double hitungKeliling() {
        return 4 * (panjang + lebar + tinggi);
    }
}

// Child Class - Bola
class Bola extends BangunRuang {
    private double jariJari; 

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

// Child Class - Tabung
class Tabung extends BangunRuang {
    private double jariJari; 
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }
    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}