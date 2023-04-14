public class No3 {

    public static void main(String[] args) {
        // proses instansiasi di class Produk dalam class no3
        Produk produk = new Produk();
        //pengisian pertama pada atribut dengan nilai
        produk.idProduk = "Bt21";
        produk.namaProduk = "ShookyBT21";
        produk.stok = 7; 
        produk.harga = 57000;

        Produk produk2 = new Produk("Bt22", "ChimmyBt22", 0, 63000);

        //memanggil method untuk menampilkan data baru
        produk.tampilkanInfo();
        produk2.tampilkanInfo();
    } 
}
