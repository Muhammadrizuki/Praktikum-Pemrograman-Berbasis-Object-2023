class Produk{
  String id;  //ini atribut 
  String nama;
  int stok;
  int harga;


  public void  isAvailable(){ 
      if (stok > 0) {
        System.out.println("Tersedia");
    
      } else {
        System.out.println("Tidak tersedia");
      }
  }
  public void barang() {
    System.out.println("Nama : " + nama);
    System.out.println(id);
    System.out.println(stok);
    System.out.println(harga);

  }

  public String getId(){  
      return id;
  }
  public String getNama(){
      return nama;
  }
  public int getStok(){
      return stok;
  }
  public int getHarga(){
      return harga;
  }
}

public class No3{
  public static void main(String[] args) {
      Produk produk1 = new Produk();
      Produk produk2 = new Produk();

      produk1.id = "H0001";
      produk1.nama = "Baju kaos";
      produk1.stok = 0;
      produk1.harga = 50000;

      produk2.id = "H0002";
      produk2.nama = "Celana pendek";
      produk2.stok = 12;
      produk2.harga = 35000;

      
      produk1.isAvailable();  //untuk pemanggilan 
      produk1.barang();
      produk2.isAvailable();
      produk2.barang();

  }
}