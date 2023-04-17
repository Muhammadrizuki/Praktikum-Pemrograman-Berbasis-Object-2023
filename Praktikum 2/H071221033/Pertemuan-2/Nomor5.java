package assignment2;

class Alamat {
    String jalan;
    String kota;
    String nim;
    Mahasiswa mahasiswa;                    // tambahan

    public void setJalan(String jalan) {
        this.jalan = jalan;
    }
    public String getJalan() {
        return jalan;
    }
    public void setKota(String kota) {
        this.kota = kota;
    }
    public String getKota() {
        return kota;
    }
    public Mahasiswa getMahasiswa() {       // tambahan
        return mahasiswa;
    }
    public String getAlamatLengkap() {
        return (jalan + ", " + kota);
    }
}


class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;                  // alamat memanggil object Alamat dimana Alamat itu class

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNim() {
        return nim;
    }
    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }
    public Alamat getAlamat() {
        return alamat;
    }
}



public class Nomor5 {
    public static void main(String[] args) {
    
        // objek1 = alamat, dari class Alamat
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";
        
        // objek2 = mahasiswa, dari kelas Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Nurfadilah";
        mahasiswa.nim = "H071221033";
        alamat.mahasiswa = mahasiswa;           // tambahan

        System.out.println("Nama    : " + mahasiswa.getNama());
        System.out.println("NIM     : " + mahasiswa.getNim());
        System.out.println("Alamat  : " + mahasiswa.getAlamat().getAlamatLengkap());
        System.out.println("Nim  : " + alamat.getMahasiswa().getNim());         // tambahan
    }
}
