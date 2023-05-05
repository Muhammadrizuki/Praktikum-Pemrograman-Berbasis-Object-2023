package assignment5;

public class MainAnggota {
    public static void main(String[] args) {
    
        // instance objek dri class PengurusInti
        PengurusInti inti = new PengurusInti("Sehun", 29, "Ketua Lab");
        inti.dataPengurus();    // memanggil method
        inti.tugasPengurus();   // memanggil method

        // instance objek dri class KoorBidStaf
        KoorBidStaf koor = new KoorBidStaf("Kai", 29, "Koordinator Lab");
        koor.dataKoor();
        koor.tugasKoor();

        Anggota anggota = new Anggota();    
        System.out.println(anggota.getNama()); // outputnya null karna pengisian atribut dilakukan di constructor pd subclass

    }
}