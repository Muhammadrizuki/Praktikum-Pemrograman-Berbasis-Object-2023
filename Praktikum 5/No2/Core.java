class Core extends People {
    String jabatan;

    Core(String nama, String alamat, String no_hp, String jabatan) {
        super(nama, alamat, no_hp);
        this.jabatan = jabatan;
    }

    public void jadibos () {
        System.out.println("JADI BOS");
    }

}