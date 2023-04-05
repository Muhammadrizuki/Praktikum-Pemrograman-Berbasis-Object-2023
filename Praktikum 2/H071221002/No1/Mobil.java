public class Mobil {
    // atribut
    String warna;
    String merek;
    int tahunProduksi;
    
    // behavior
    public void info() {
        System.out.println("Mobil " + merek + " warna " + warna + " diproduksi pada tahun " + tahunProduksi);
    }
}
