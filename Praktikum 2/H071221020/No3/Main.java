package No3;
import java.util.Arrays;

class Produk {
  
    int id;
    String nama;
    int stok;
    int harga;
    static int count;

    Produk(int id, String nama, int stok, int harga){
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
        count++;
    }
    
    String cekProduk() {
        String sid = Integer.toString(this.id);
        String sstok = Integer.toString(this.stok);
        String sharga = Integer.toString(this.harga);
        String[] li = {sid, this.nama, sstok, sharga};
        String str = Arrays.toString(li);
        return str;
    }
    
    String cekStok() {
        if (this.stok==0) {
            return "Produk Kosong";
        } else {
            return "Produk Tersedia";
        }
    }
    
}


public class Main {
  
    public static void main(String[] args) {
        Produk p1 = new Produk(1, "Sabun", 0, 10000);
        Produk p2 = new Produk(2, "Shampoo", 5, 12000);

        System.out.printf("Jumlah produk = %d %n", Produk.count);

        System.out.println(p1.cekProduk());
        System.out.println(p1.cekStok());

        System.out.println(p2.cekProduk());
        System.out.println(p2.cekStok());
    }
  
}
