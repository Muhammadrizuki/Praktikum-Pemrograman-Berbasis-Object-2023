package Praktikum05.No01;

public class BangunDatar {
    protected void luas(){
        System.out.print("Luas = ");
    }
    protected void keliling(){
        System.out.print("Keliling = ");
    }
}

class Persegi extends BangunDatar {
    private double sisi;
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    public double getSisi() {
        return sisi;
    }
    public void luas(){
        super.luas();
        double luas = this.sisi*this.sisi;
        System.out.print(luas);
        System.out.println();
    }
    public void keliling() {
        super.keliling();
        double keliling = 4*this.sisi;
        System.out.print(keliling);
        System.out.println();
    }
}

class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;
    public double getPanjang() {
        return panjang;
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public void luas() {
        super.luas();
        double luas = this.panjang*this.lebar;
        System.out.print(luas);
        System.out.println();
    }
    public void keliling() {
        super.keliling();
        double keliling = 2*(this.panjang + this.lebar);
        System.out.print(keliling);
        System.out.println();
    }
}

class Lingkaran extends BangunDatar {
    private double pi = 3.14;
    private double jariJari;
    public double getPi() {
        return pi;
    }
    public void setPi(double pi) {
        this.pi = pi;
    }
    public double getJariJari() {
        return jariJari;
    }
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    public void luas() {
        super.luas();
        double luas = this.pi*this.jariJari*this.jariJari;
        System.out.print(luas);
        System.out.println();
    }
    public void keliling() {
        super.keliling();
        double keliling = 2*this.pi*this.jariJari;
        System.out.print(keliling);
        System.out.println();
    }
}

class Segitiga extends BangunDatar{
    private double alas;
    private double tinggi;
    public double getAlas() {
        return alas;
    }
    public void setAlas(double alas) {
        this.alas = alas;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public void luas() {
        super.luas();
        double luas = this.alas*this.tinggi/2;
        System.out.print(luas);
        System.out.println();
    }
    public void keliling() {
        super.keliling();
        double keliling = this.alas*3;
        System.out.print(keliling);
        System.out.println();
    }
}

class Trapesium extends BangunDatar{
    private double alas, atas, sisiMiring1, sisiMiring2;
    private double tinggi;
    public double getAlas() {
        return alas;
    }
    public void setAlas(double alas) {
        this.alas = alas;
    }
    public double getAtas() {
        return atas;
    }
    public void setAtas(double atas) {
        this.atas = atas;
    }
    public double getsisiMiring1() {
        return sisiMiring1;
    }
    public void setsisiMiring1(double sisiMiring1) {
        this.sisiMiring1 = sisiMiring1;
    }
    public double getsisiMiring2() {
        return sisiMiring2;
    }
    public void setsisiMiring2(double sisiMiring2) {
        this.sisiMiring2 = sisiMiring2;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public void luas() {
        super.luas();
        double luas = this.tinggi*(this.alas+this.atas)/2;
        System.out.print(luas);
        System.out.println();
    }
    @Override
    public void keliling() {
        super.keliling();
        double keliling = this.alas+this.atas+this.sisiMiring1+this.sisiMiring2;
        System.out.print(keliling);
        System.out.println();
    }
}
