public class KomunitasProgrammerUnhas {
    
    PengurusInti pengurusInti = new PengurusInti();// Objek PengurusInti dan Koordinator
    KoordinatorBidangdanStaf koordinator = new KoordinatorBidangdanStaf();
    
    public void tambahPengurusInti(String nama, String jabatan) {   // Method untuk menambahkan nama pengurus inti beserta jabatannya
        pengurusInti.tambahPengurus(nama, jabatan);
    }
    
    public void tambahKoordinator(String nama, String jabatan) {  // Method untuk menambahkan nama koordinator beserta jabatannya
        koordinator.tambahPengurus(nama, jabatan);
    }
    
    public void tampilkanPengurus() {  // Method untuk menampilkan daftar pengurus inti dan koordinator beserta jabatannya
        pengurusInti.tampilkanPengurusInti();
        koordinator.tampilkanKoordinator();
    }
    
}

