package Praktikum05.No02;

public class KomunitasProgrammerUnhas {
    protected String nama;
    protected String jenisKelamin;
    protected String alamat;
    public KomunitasProgrammerUnhas(String nama, String jenisKelamin, String alamat) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }
    public void display() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat: " + alamat);
    }
}
class PengurusInti extends KomunitasProgrammerUnhas {
    private String jabatan;
    public PengurusInti(String nama, String jenisKelamin, String alamat, String jabatan) {
        super(nama, jenisKelamin, alamat);
        this.jabatan = jabatan;
    }
    public void display() {
        super.display();
        System.out.println("Jabatan: " + jabatan);
    }
}

class KoordinatorBidang extends KomunitasProgrammerUnhas {
    private String bidang;
    public KoordinatorBidang(String nama, String jenisKelamin, String alamat, String bidang) {
        super(nama, jenisKelamin, alamat);
        this.bidang = bidang;
    }
    public void display() {
        super.display();
        System.out.println("Bidang: " + bidang);
    }
}

class Staf extends KomunitasProgrammerUnhas {
    private String tugas;
    public Staf(String nama, String jenisKelamin, String alamat, String tugas) {
        super(nama, jenisKelamin, alamat);
        this.tugas = tugas;
    }
    public void display() {
        super.display();
        System.out.println("Tugas: " + tugas);
    }
}