// SOAL NO 5
class Alamat {
    String jalan;
    String kota;

    public String getAlamatLengkap() {
        return jalan + ", " + kota;
    }
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
    public Alamat getAlamat() {
        return alamat;
    }
}

public class DataDiri {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Perintis Kemerdekaan 3";
        alamat.kota = "Makassar";
        
    
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Natasya Indriani";
        mahasiswa.nim = "H071221054";
    
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}


