public class Produk {
    String idProduk;
    String namaProduk;
    int stok;
    double harga;

    public Produk(){
    }

    public Produk(String idProduk, String namaProduk, int stok, double harga){
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.stok = stok;
        this.harga = harga;
    }

    // setter untuk menambahkan nilai baru pada atribut
    // getter untuk mengambil nilai yang sudah diperbarui
    public void setIdProduk(String idProduk){
        this.idProduk = idProduk;
    }
    public String getIdProduk(){
        return idProduk;
    }
    public void setNamaPd(String namaProduk){
        this.namaProduk = namaProduk;
    }
    public String getNamaPd(){
        return namaProduk;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    public int getStok(){
        return stok;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }
    public double getHarga(){
        return harga;
    }
    //method untuk menampilkan semua data produk
    public void tampilkanInfo(){
        System.out.println("ID produk \t: "+ idProduk);
        System.out.println("Nama produk \t: "+ namaProduk);
        System.out.println("stok \t\t: "+ stok);
        System.out.println("Harga \t\t: "+ harga);
        //kondisi untuk melakukan pengecekan terhadap stok barang atau produk
        // \t untuk memposisikan kursor ke tab berikutnya agar penempatan outpunya rapi dan sama rata
        // \n untuk membuat baris baru
        if (stok <= 0){
            System.out.println("stok barang tidak tersedia \n");
        }else {
            System.out.println("stok barang masing ada \n");
        }   
    }
    
}
