public class Product {
    String id;
    String nama;
    int stok;
    int harga;

    // Constructor untuk menginisialisasi atribut-atribut produk
    public Product(String id, String nama, int stok, int harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }
    
    // Method untuk mendapatkan ID produk
    String getIdProduk () {
        return id;
    }

    // Method untuk mendapatkan nama produk
    String getNama () {
        return nama;
    }

    // Method untuk mendapatkan stok produk
    public int getStok () {
        return stok;
    }

    // Method untuk mendapatkan harga produk
    int getHarga () {
        return harga;
    }

    // Method untuk melakukan pengecekan ketersediaan stok produk
    public boolean cekStok () {
        return (stok > 0);
    }

    // Method untuk menampilkan informasi produk
    void tampilkanInfo () {
        System.out.println("__I N F O  P R O D U K__");
        System.out.println("ID              : " + id);
        System.out.println("Nama            : " + nama);  
        System.out.println("Stok            : " + stok);
        System.out.println("Harga           : " + harga);
        if (stok <= 0) {
            System.out.println("Stok produk sudah habis.\n");
        } else {
            System.out.println("Stok produk masih tersedia.\n");
        }
    }
    
    public static void main(String[] args) {
        Product produk1 = new Product("A01", "Teh Pucuk Harum", 0, 4000);
        produk1.tampilkanInfo();
        Product produk2 = new Product("A02", "Golda Coffee", 200, 3000);
        produk2.tampilkanInfo();
    }

}