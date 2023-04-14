public class Mahasiswa {
    String nama;
    String nim; 
    Alamat alamat;
    // setter untuk menambahkan nilai baru pada atribut
    // getter untuk mengambil nilai yang sudah diperbarui
    public void setName(String name){
        this.nama= name;
    }
    public String getName(){
        return nama;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getNim(){
        return nim;
    }
    // untuk menset nilai baru pada class alamat 
    // dan mengembbalikannya dengann nilai alamat pada class Alamat
    public void setAlamat(Alamat alamat){
        this.alamat = alamat;
    }
    public Alamat getAlamat(){
        return alamat;
    }
}
