package TUGAS.Pertemuan5.Nomor1;

public class BangunRuang {
    int sisiKubus;
    int panjangBalok;
    int lebarBalok;
    int tinggiBalok;
    int jariJariBola;
    int jariJariTabung;
    int tinggiTabung;
    
    public int getSisiKubus() {
        return sisiKubus;
    }
    public void setSisiKubus(int sisiKubus) {
        this.sisiKubus = sisiKubus;
    }
    public int getPanjangBalok() {
        return panjangBalok;
    }
    public void setPanjangBalok(int panjangBalok) {
        this.panjangBalok = panjangBalok;
    }
    public int getLebarBalok() {
        return lebarBalok;
    }
    public void setLebarBalok(int lebarBalok) {
        this.lebarBalok = lebarBalok;
    }
    public int getTinggiBalok() {
        return tinggiBalok;
    }
    public void setTinggiBalok(int tinggiBalok) {
        this.tinggiBalok = tinggiBalok;
    }
    public int getJariJariBola() {
        return jariJariBola;
    }
    public void setJariJariBola(int jariJariBola) {
        this.jariJariBola = jariJariBola;
    }
    public int getJariJariTabung() {
        return jariJariTabung;
    }
    public void setJariJariTabung(int jariJariTabung) {
        this.jariJariTabung = jariJariTabung;
    }
    public int getTinggiTabung() {
        return tinggiTabung;
    }
    public void setTinggiTabung(int tinggiTabung) {
        this.tinggiTabung = tinggiTabung;
    }
}

class Kubus extends BangunRuang {
    public Kubus(int sisi) {
        setSisiKubus(sisi);
    }
    double luasPermukaan() {
        return 6*Math.pow(sisiKubus, 2);
    }
    double volume() {
        return Math.pow(sisiKubus, 3);
    }
}

class Balok extends BangunRuang {
    public Balok(int panjang, int lebar, int tinggi) {
        setPanjangBalok(panjang); 
        setLebarBalok(lebar);
        setTinggiBalok(tinggi); 
    }
    double luasPermukaan() {
        return 2*((panjangBalok*lebarBalok)+(panjangBalok*tinggiBalok)+(tinggiBalok*lebarBalok));
    }
    double volume() {
        return panjangBalok*lebarBalok*tinggiBalok;
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

