package Praktikum05.No01;

public class BangunRuang {
    protected void luasPermukaan(){
        System.out.print("Luas = ");
    }
    protected void volume(){
        System.out.print("Volume = ");
    }
}

class Kubus extends BangunRuang {
    private double sisi;
    
    public double getSisi() {
        return sisi;
    }
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    public void luasPermukaan() {
        super.luasPermukaan();
        double luas = 6* (sisi*sisi);
        System.out.print(luas);
        System.out.println();
    }
    public void volume() {
        super.volume();
        double volume = sisi*sisi*sisi;
        System.out.print(volume);
        System.out.println();
    }
}

class Balok extends BangunRuang{
    private double panjang, lebar, tinggi;
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

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void luasPermukaan() {
        super.luasPermukaan();
        double luas = 2*(panjang*lebar + panjang*tinggi + tinggi*lebar);
        System.out.print(luas);
        System.out.println();
    }
    public void volume() {
        super.volume();
        double volume = panjang*lebar*tinggi;
        System.out.print(volume);
        System.out.println();
    }
    
}

class Tabung extends BangunRuang{
    private double jariJari, tinggi;
    public double getJariJari() {
        return jariJari;
    }
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    private double pi = 3.14;

    public void luasPermukaan() {
        super.luasPermukaan();
        double luas = 2*pi*jariJari*(jariJari+tinggi);
        System.out.print(luas);
        System.out.println();
    }
    public void volume() {
        super.volume();
        double volume = pi*jariJari*jariJari*tinggi;
        System.out.print(volume);
        System.out.println();
    }
}
class Bola extends BangunRuang{
    private double pi = 3.14;
    private double jariJari;
    public double getJariJari() {
        return jariJari;
    }
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    
    public void luasPermukaan() {
        super.luasPermukaan();
        double luas = 4*this.pi*this.jariJari*this.jariJari;
        System.out.print(luas);
        System.out.println();
    }
    public void volume() {
        super.volume();
        double volume = 4/3*(this.pi*this.jariJari*this.jariJari*this.jariJari);
        System.out.print(volume);
        System.out.println();
    }
}