public class Koordinator extends Komunitas {
    
    public Koordinator(String nama, String nim, int umur, String jabatan){
        setNama(nama);
        setNim(nim);
        setUmur(umur);
        setJabatan(jabatan);
    }

    public void infoKoordinator(){
        System.out.println("Nama    = " + getNama());
        System.out.println("NIM     = " + getNim());
        System.out.println("Umur    = " + getUmur() + " tahun");
        System.out.println(getNama() + " adalah seorang koordinator bidang " + getJabatan());
        System.out.println();
    }
}
