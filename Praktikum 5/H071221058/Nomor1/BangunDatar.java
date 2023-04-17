package TUGAS.Pertemuan5.Nomor1;

public class BangunDatar {
    int sisiPersegi;
    int panjangPersegiPanjang;
    int lebarPersegiPanjang;
    int jariJariLingkaran;
    int alasSegitiga;
    int tinggiSegitiga;
    int sisi1Segitiga;
    int sisi2Segitiga;
    int sisiAtasTrapesium;
    int tinggiTrapesium;
    int sisiBawahTrapesium; 
    int sisiKananTrapesium; 
    int sisiKiriTrapesium;
    
    public int getSisiPersegi() {
        return sisiPersegi;
    }
    public void setSisiPersegi(int sisiPersegi) {
        this.sisiPersegi = sisiPersegi;
    }
    public int getPanjangPersegiPanjang() {
        return panjangPersegiPanjang;
    }
    public void setPanjangPersegiPanjang(int panjangPersegiPanjang) {
        this.panjangPersegiPanjang = panjangPersegiPanjang;
    }
    public int getLebarPersegiPanjang() {
        return lebarPersegiPanjang;
    }
    public void setLebarPersegiPanjang(int lebarPersegiPanjang) {
        this.lebarPersegiPanjang = lebarPersegiPanjang;
    }
    public int getJariJariLingkaran() {
        return jariJariLingkaran;
    }
    public void setJariJariLingkaran(int jariJariLingkaran) {
        this.jariJariLingkaran = jariJariLingkaran;
    }
    public int getAlasSegitiga() {
        return alasSegitiga;
    }
    public void setAlasSegitiga(int alasSegitiga) {
        this.alasSegitiga = alasSegitiga;
    }
    public int getTinggiSegitiga() {
        return tinggiSegitiga;
    }
    public void setTinggiSegitiga(int tinggiSegitiga) {
        this.tinggiSegitiga = tinggiSegitiga;
    }
    public int getSisi1Segitiga() {
        return sisi1Segitiga;
    }
    public void setSisi1Segitiga(int sisi1Segitiga) {
        this.sisi1Segitiga = sisi1Segitiga;
    }
    public int getSisi2Segitiga() {
        return sisi2Segitiga;
    }
    public void setSisi2Segitiga(int sisi2Segitiga) {
        this.sisi2Segitiga = sisi2Segitiga;
    }
    public int getSisiAtasTrapesium() {
        return sisiAtasTrapesium;
    }
    public void setSisiAtasTrapesium(int sisiAtasTrapesium) {
        this.sisiAtasTrapesium = sisiAtasTrapesium;
    }
    public int getTinggiTrapesium() {
        return tinggiTrapesium;
    }
    public void setTinggiTrapesium(int tinggiTrapesium) {
        this.tinggiTrapesium = tinggiTrapesium;
    }
    public int getSisiBawahTrapesium() {
        return sisiBawahTrapesium;
    }
    public void setSisiBawahTrapesium(int sisiBawahTrapesium) {
        this.sisiBawahTrapesium = sisiBawahTrapesium;
    }
    public int getSisiKananTrapesium() {
        return sisiKananTrapesium;
    }
    public void setSisiKananTrapesium(int sisiKananTrapesium) {
        this.sisiKananTrapesium = sisiKananTrapesium;
    }
    public int getSisiKiriTrapesium() {
        return sisiKiriTrapesium;
    }
    public void setSisiKiriTrapesium(int sisiKiriTrapesium) {
        this.sisiKiriTrapesium = sisiKiriTrapesium;
    } 
}

class Persegi extends BangunDatar {
    public Persegi(int sisi) {
        setSisiPersegi(sisi);
    }
    double luas() {
        return Math.pow(sisiPersegi, 2);
    }
    double keliling() {
        return sisiPersegi*4;
    }
}

class persegiPanjang extends BangunDatar {
    public persegiPanjang(int panjang, int lebar) {
        setPanjangPersegiPanjang(panjang);
        setLebarPersegiPanjang(panjang);
    }
    double luas() {
        return panjangPersegiPanjang*lebarPersegiPanjang;
    }
    double keliling() {
        return (panjangPersegiPanjang*2)+(lebarPersegiPanjang*2);
    }
}

class Lingkaran extends BangunDatar {
    public Lingkaran(int jariJari) {
        setJariJariLingkaran(jariJari);
    }
    double luas() {
        return Math.PI*Math.pow(jariJariLingkaran, 2);
    }
    double keliling() {
        return Math.PI*2*jariJariLingkaran;
    }
}

class Segitiga extends BangunDatar {
    public Segitiga(int alas, int tinggi, int sisi1, int sisi2) {
        setAlasSegitiga(alas);
        setTinggiSegitiga(tinggi);
        setSisi1Segitiga(sisi1);
        setSisi2Segitiga(sisi2);
    }
    double luas() {
        return 0.5*alasSegitiga*tinggiSegitiga;
    }
    double keliling() {
        return sisi1Segitiga+tinggiSegitiga+alasSegitiga;
    }
}

class Trapesium extends BangunDatar {
    public Trapesium(int sisiAtas, int sisiBawah, int sisiKanan, int sisiKiri, int tinggi) {
        setSisiAtasTrapesium(sisiAtas);
        setSisiBawahTrapesium(sisiBawah);
        setSisiKananTrapesium(sisiKanan);
        setSisiKiriTrapesium(sisiKanan);
        setTinggiTrapesium(tinggi);
    }
    double luas() {
        return 0.5*sisiAtasTrapesium*sisiBawahTrapesium*tinggiTrapesium;
    }
    double keliling() {
        return sisiAtasTrapesium+sisiBawahTrapesium+sisiKananTrapesium+sisiKiriTrapesium;
    }
}
