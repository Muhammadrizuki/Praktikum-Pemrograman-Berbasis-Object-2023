package assignment5;

// class parent (super class)
public class Anggota {
    String nama;
    int umur;

    public String getNama() {
        return nama;
    }
    public int getUmur() {
        return umur;
    }
}

// class child (subclass)
class PengurusInti extends Anggota {
    String jabatan;

    // constructor dgn parameter atribut dri class parent & class child
    PengurusInti(String nama, int umur, String jabatan) {
        super.nama = nama;          // memanggil atribut dri class parent menggunakan keyword super
        super.umur = umur;
        this.jabatan = jabatan;
    }
    
    public String getJabatan() {
        return jabatan;
    }

    public void dataPengurus() {
        System.out.println("====== PENGURUS INTI ======");
        System.out.println("Nama    = " + super.getNama());
        System.out.println("Umur    = " + super.getUmur());
        System.out.println("Jabatan = " + this.getJabatan());
    }
    public void tugasPengurus() {
        System.out.println("Tugas Ketua Lab = Memimpin dan memantau seluruh kegiatan lab\n");
    }
}

class KoorBidStaf extends Anggota {
    String posisi;

    KoorBidStaf(String nama, int umur, String posisi) {
        super.nama = nama;
        super.umur = umur;
        this.posisi = posisi;
    }

    public String getPosisi() {
        return posisi;
    }

    public void dataKoor() {
        System.out.println("====== KOORDINATOR BIDANG DAN STAF ======");
        System.out.println("Nama    = " + super.getNama());
        System.out.println("Umur    = " + super.getUmur());
        System.out.println("Posisi  = " + this.getPosisi());
    }
    public void tugasKoor() {
        System.out.println("Tugas Koordinator Lab = Menyusun jadwal praktikum lab");
    }
}