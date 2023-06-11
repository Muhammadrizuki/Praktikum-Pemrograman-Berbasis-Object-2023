class PengurusInti extends Anggota {
    // Method untuk menampilkan daftar nama pengurus inti beserta jabatannya
    public void tampilkanPengurusInti() {
        System.out.println("Daftar Pengurus Inti:");
        for (String pengurus : this.pengurus) {
            System.out.println(pengurus);
        }
    }
}