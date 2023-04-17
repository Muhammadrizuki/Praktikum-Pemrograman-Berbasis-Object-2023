class People {
    String nama;
    String alamat;
    String no_hp;

    People(String nama, String alamat, String no_hp) {
        this.nama = nama;
        this.alamat = alamat;
        this.no_hp = no_hp;
    }

    public void kerja () {
        System.out.println(this.nama + " LAGI KERJA...");
    }

}