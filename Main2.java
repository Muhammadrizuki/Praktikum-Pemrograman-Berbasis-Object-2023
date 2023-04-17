public class Main2 {
    
    public static void main(String[] args) {
        // Objek Komunitas
        KomunitasProgrammerUnhas komunitas = new KomunitasProgrammerUnhas();
        
        // Menambahkan nama pengurus inti beserta jabatannya
        komunitas.tambahPengurusInti("Nabila", "Ketua Umum");
        komunitas.tambahPengurusInti("Ika", "Wakil Ketua Umum");
        komunitas.tambahPengurusInti("Rahmat", "Sekretaris");
        komunitas.tambahPengurusInti("Wali", "Bendahara");
        
        // Menambahkan nama koordinator beserta jabatannya
        komunitas.tambahKoordinator("Farah", "Koordinator Bidang Acara");
        komunitas.tambahKoordinator("Alip", "Koordinator Bidang Dokumentasi");
        komunitas.tambahKoordinator("Dapit", "Koordinator Bidang Humas");
        // Menampilkan daftar pengurus inti dan koordinator beserta2
        komunitas.tampilkanPengurus();
    }
}