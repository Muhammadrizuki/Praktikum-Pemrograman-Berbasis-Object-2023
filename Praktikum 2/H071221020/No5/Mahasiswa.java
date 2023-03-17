package No5;

public class Mahasiswa {
    
    // Deklarasi atribut
    Alamat alamat;
    String nama;
    String nim;

    // Getter untuk atribut
    String getNama() {
        return nama;
    }

    String getNim() {
        return nim;
    }

    Alamat getAlamat() {
        return alamat;
    }

    // String getAlamatLengkap() {
    //     return alamat.jalan.toString() + ", " + alamat.kota.toString();
    // }

}
