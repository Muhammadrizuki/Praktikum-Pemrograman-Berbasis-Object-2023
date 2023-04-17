// SOAL NO 1

public class Skincare {
    // atribut
    String brand;
    String nama;
    String kategori;
    int harga;

    // constructor
    public void brandSkincare (String brandSkincare) {
        brand = brandSkincare;
    }
    public void namaSkincare (String namaSkincare) {
        nama = namaSkincare;
    }
    public void kategoriSkincare (String kategoriSkincare) {
        kategori = kategoriSkincare;
    }
    public void hargaSkincare (int hargaSkincare) {
        harga = hargaSkincare;
    }

    // behavior
    public void detailSkincare() {
        System.out.println("Brand Skincare : " + brand);
        System.out.println("Nama Skincare : " + nama);
        System.out.println("Kategori Skincare : " + kategori);
        System.out.println("Harga Skincare : " + harga);
    }
    public static void main(String[] args) {
        Skincare productSkincare = new Skincare();
        productSkincare.brandSkincare("COSRX");
        productSkincare.namaSkincare("Low pH Good Morning Gel Cleanser");
        productSkincare.kategoriSkincare("Cleanser");
        productSkincare.hargaSkincare(118000);
        // memanggil behavior
        productSkincare.detailSkincare();
    }   
}
