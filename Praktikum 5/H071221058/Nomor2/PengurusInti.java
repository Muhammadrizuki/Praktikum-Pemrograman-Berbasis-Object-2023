public class PengurusInti extends Komunitas {

    public PengurusInti(String nama, String nim, int umur, String jabatan){
        setNama(nama);
        setNim(nim);
        setUmur(umur);
        setJabatan(jabatan);
    }
    
    public void infoPengurus(){
        System.out.println("Nama    = " + getNama());
        System.out.println("NIM     = " + getNim());
        System.out.println("Umur    = " + getUmur() + " tahun");
        System.out.println(getNama() + " adalah seorang " + getJabatan());
        System.out.println();

    }
}
