package assignment3;

class Kendaraan {
    String nama, warna;
    int tahun, kilometer;
    Kendaraan mobil;

    // constructor 1
    Kendaraan(String nama, String warna, int tahun, int kilometer) {
        this.nama = nama;
        this.warna = warna;
        this.tahun = tahun;
        this.kilometer = kilometer;
    }
    // constructor 2
    Kendaraan(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }
    
    // method setter getter
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }
    public String getNama() {
        return nama;
    }
    public String getWarna() {
        return warna;
    }
    public int getTahun() {
        return tahun;
    }
    public int getKilometer() {
        return kilometer;
    }

    // method utk menampilkan info kendaraan
    public void tampilkanInfo() {
        // behaviour
        System.out.println("======Info Kendaraan======");
        System.out.println("Nama    : " + this.getNama());
        System.out.println("Warna   : " + this.getWarna());
        System.out.println("Tahun   : " + this.getTahun());
        System.out.println("Kilometer : " + this.getKilometer() + "\n");
    }
    // method servis
    public void servis() {
        if (kilometer > 10000) {
            // behaviour
            System.out.println("Servis ringan perlu dilakukan!" + "\n");
        } else {
            System.out.println("Servis belum diperlukan");
        }
    }
    // method adu 
    public void adu(Kendaraan mobil) {
        if (this.getKilometer() > mobil.getKilometer()) {
            // behaviour
            System.out.println(this.getNama() + " lebih sering dipakai" + "\n");
        } else {
            System.out.println("enakan pakai " + mobil.getNama());
        }
    }
}


public class Nomor1 {
    public static void main(String[] args) {
        
        Kendaraan motor = new Kendaraan("Honda Beat", "Hitam");
        Kendaraan mobil = new Kendaraan("Suzuki APV", "Silver", 2013, 13457);

        motor.setTahun(2021);
        //motor.setKilometer(3568);
        
        motor.tampilkanInfo();
        mobil.tampilkanInfo();
        
        motor.servis();
        //mobil.servis();

        motor.adu(mobil);
        mobil.adu(motor);
    }    
}
