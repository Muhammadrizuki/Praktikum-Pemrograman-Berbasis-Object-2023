public class BangunRuang {
    double volume,luasPermukaan;

    public double getVolume() {
        return volume;
    }
    public double getluasPermukaan() {
        return luasPermukaan;
    }
}

class Kubus extends BangunRuang{
    private double sisi;
    
    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    public double getVolume() {
        volume =  sisi * sisi * sisi;
        return super.getVolume();
    }
    public double getluasPermukaan() {
        luasPermukaan =  6 * sisi * sisi;
        return super.getluasPermukaan();
    }
}

class Balok extends BangunRuang{
    private double panjang;
    private double lebar;
    private double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public double getVolume() {
        volume = panjang * lebar * tinggi;
        return super.getVolume();
    }
    public double getluasPermukaan() {
        luasPermukaan = 2 * panjang * lebar + panjang * tinggi + lebar * tinggi;
        return super.getluasPermukaan();
    }
}

class Bola extends BangunRuang{
    private double jariJari;
    
    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }
    public double getVolume() {
        volume = 4/3 *Math.PI*jariJari*jariJari*jariJari;
        return super.getVolume();
    }
    public double getluasPermukaan() {
        luasPermukaan = 4 * Math.PI*jariJari*jariJari;
        return super.getluasPermukaan();
    } 
}

class Tabung extends BangunRuang{
    private double jariJari;
    private double tinggi;
    
    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }
    
    public double getVolume() {
        volume = 2*Math.PI*jariJari*(jariJari+tinggi);
        return super.getVolume();
    }

    public double getluasPermukaan() {
        luasPermukaan = Math.PI * jariJari * jariJari * tinggi;
        return super.getluasPermukaan();
    }
}
