package no05;

public class Main {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Panaikang Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Rasyad";
        mahasiswa.nim = "H071221024";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        // System.out.println("Alamat: " + mahasiswa.getAlamat());
        System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());
        // System.out.println("Alamat: " + mahasiswa.getAlamatLengkap());
    }
}
class Mahasiswa {
    Alamat alamat;
    String nama;
    String nim;

    String getNama(){
        return nama;
    }
    String getNim(){
        return nim;
    }
    Alamat getAlamat(){
        return alamat;
    }
}
class Alamat {
    String jalan;
    String kota;
    String getAlamatLengkap(){
        return jalan + ", " + kota;
    };
}