abstract class BangunDatar {
    abstract double hitungKeliling();
    abstract double hitungLuas();
}

class Persegi extends BangunDatar {
    double sisi;

    public Persegi() {}

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    double panjang;
    double lebar;

    public PersegiPanjang() {}

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }


    public double hitungLuas() {
        return panjang * lebar;
    }
}

class Lingkaran extends BangunDatar {
    double jari;

    public Lingkaran() {}

    public void setJari(double jari) {
        this.jari = jari;
    }


    public double hitungKeliling() {
        return 2 * Math.PI * jari;
    }

    
    public double hitungLuas() {
        return Math.PI * jari * jari;
    }
}

class Segitiga extends BangunDatar {
    double alas;
    double sisikiri;
    double sisikanan;
    double tinggi;

    public Segitiga() {}

    public void setAlas(double alas) {
        this.alas = alas;
    }
    public void setSisikiri(double sisikiri) {
        this.sisikiri = sisikiri;
    }
    public void setSisikanan(double sisikanan) {
        this.sisikanan = sisikanan;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungKeliling() {
        return alas + sisikiri + sisikanan;
    }

    @Override
    public double hitungLuas() {
        return (alas * tinggi)/2;
    }
}

class Trapesium extends BangunDatar {
    double alas;
    double sisimiring;
    double atas;
    double tinggi;

    public Trapesium() {}

    public void setAlas(double alas) {
        this.alas = alas;
    }
    public void setSisimiring(double sisimiring) {
        this.sisimiring = sisimiring;
    }
    public void setAtas(double atas) {
        this.atas = atas;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

  
    public double hitungKeliling() {
        return alas + (sisimiring * 2) + atas;
    }

 
    public double hitungLuas() {
        return ((alas + atas) * tinggi)/2;
    }
}