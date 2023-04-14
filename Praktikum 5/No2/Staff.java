class Staff extends People {
    String bidang;

    Staff(String nama, String alamat, String no_hp, String bidang) {
        super(nama, alamat, no_hp);
        this.bidang = bidang;
    }

    public void jadikaryawan () {
        System.out.println("JADI KARYAWAN");
    }

}