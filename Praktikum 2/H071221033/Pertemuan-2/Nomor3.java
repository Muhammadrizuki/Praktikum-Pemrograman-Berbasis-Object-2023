package assignment2;

class Product {

    // atribut
    private String nama;
    private String id;
    private int stok;
    private String harga;

    // method setter & getter utk memberi & mengambil nilai pd atribut
    public void setName(String nama) {
        this.nama = nama;
    }
    public String getName() {
        return nama;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setStock(int stok) {
        this.stok = stok;
    }
    public String getStock() {
        return nama;
    }
    public void setPrice(String harga) {
        this.harga = harga;
    }
    public String getPrice() {
        return harga;
    }

    // method dataProduk utk mencetak data produk
    public void dataProduk() {
        System.out.println("Nama Produk     : " + nama);
        System.out.println("ID Produk       : " + id);
        System.out.println("Stok Produk     : " + stok);
        System.out.println("Harga Produk    : " + harga);
    }

    // method cekStok utk mengecek stok produk
    public void cekStok() {
        if (stok > 0) {
            System.out.println("Produk masih tersedia sebanyak " + stok + " buah");
        } else {
            System.out.println("Produk habis");
        }
    }
}

// class Nomor3 utk memanggil objek dan menjalankan program
public class Nomor3 {
    public static void main(String[] args) {
        
        // objek sendal dari class Product
        Product sendal = new Product();
        Product sendal2 = new Product();

        // isi atribut menggunakan set
        sendal.setName("Crocs");
        sendal.setId("A013"); 
        sendal.setStock(10); 
        sendal.setPrice("Rp30.000"); 

        sendal2.setName("Swallow");
        sendal2.setId("A013"); 
        sendal2.setStock(0); 
        sendal2.setPrice("Rp30.000"); 

        // memanggil method dataProduk dan cekStok
        sendal.dataProduk();
        sendal.cekStok();
        sendal2.dataProduk();
        sendal2.cekStok();
    }
}
