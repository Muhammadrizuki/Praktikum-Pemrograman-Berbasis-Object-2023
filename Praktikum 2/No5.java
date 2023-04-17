class Mahasiswa{
    String name;
    String nim;
    Alamat alamat;

    public String getNama(){
        return name;
    }
    public String getNim(){
        return nim;
    }
    public Alamat getAlamat(){
        return alamat;
    }

}

class Alamat {
    String jalan;
    String kota;
    Mahasiswa mahasiswa;

    public String getAlamatLengkap() { 
        return jalan + "," + kota;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa ;
    }
}


public class No5{
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Hertasning";
        alamat.kota = "Makassar";
        

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.name = "Diva Aisyah Arfillah";
        mahasiswa.nim = "H071221053";
        alamat.mahasiswa = mahasiswa;


        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("NIM : " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());
        System.out.println(alamat.getMahasiswa().getNama());
    }
}