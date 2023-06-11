public class BangunDatar {
    double keliling;
    double luas;

    public double getKeliling() {
        return keliling;
    }
    public double getLuas() {
        return luas;
    }
}

class Persegi extends BangunDatar {
    private double sisi;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    public double getKeliling() {
        keliling = sisi + sisi + sisi + sisi;
        return super.getKeliling();
    }
    public double getLuas() {
        luas = sisi * sisi;
        return super.getLuas();
    }
}

class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang=panjang;
        this.lebar=lebar;
    }
    public double getKeliling() {
        keliling = 2 * (panjang + lebar);
        return super.getKeliling();
    }
    public double getLuas() {
        luas = panjang * lebar;
        return super.getLuas();
    }
}

class Lingkaran extends BangunDatar {
    private double jariJari;
    
    public Lingkaran(double jariJari) {
        this.jariJari=jariJari;
    }
    public double getKeliling() {
        keliling = 2 * Math.PI * jariJari;
        return super.getKeliling();
    }
    public double getLuas() {
        luas = Math.PI * jariJari * jariJari;
        return super.getLuas();
    }
}

class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisi;
    
    public Segitiga(double alas, double tinggi, double sisi) {
        this.alas=alas;
        this.tinggi = tinggi;
    }

    public double getKeliling() {
        keliling = sisi + tinggi + alas;
        return super.getKeliling();
    }

    public double getLuas() {
        luas = 0.5 * tinggi * alas;
        return super.getLuas();
    }
}

class Trapesium extends BangunDatar {
    private double tinggi;
    private double alas;
    private double sisimiring;
    private double atas;
    
    public Trapesium(double tinggi, double alas, double sisimiring, double atas) {
        this.tinggi = tinggi;
        this.alas= alas;
        this.sisimiring = sisimiring;
        this.atas = atas;
    }
    
    public double getKeliling() {
        keliling = alas+sisimiring*2 + atas;
        return super.getKeliling();
    }
    public double getLuas(){
        luas = (alas + atas * tinggi)/0.5;
        return super.getLuas();
    }
    
}