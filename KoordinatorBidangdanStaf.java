class KoordinatorBidangdanStaf extends Anggota {
    // Method untuk menampilkan daftar nama koordinator beserta jabatannya
    public void tampilkanKoordinator() {
        System.out.println("Daftar Koordinator:");
        for (String pengurus : this.pengurus) {
            System.out.println(pengurus);
        }
    }
}