public class ProgramKomunitas {
    public static void main(String[] args) {
        Pengurus PI = new Pengurus("Samuel", "Laki-Laki", "Ketua", "Teknik");
        KoorBidangStaff KBS = new KoorBidangStaff("Karina", "Perempuan", "Staf Administrasi", "Keuangan");

        System.out.println("------ Pengurus Inti -------");
        System.out.println("Nama = " + PI.getNama());
        System.out.println("Jenis Kelamin = " + PI.getJenisKelamin());
        System.out.println("Jabatan = " + PI.getJabatan());
        System.out.println("Divisi = " + PI.getDivisi() + "\n");

        System.out.println("------ Koordinator Bidang & Staff ------");
        System.out.println("Nama = " + KBS.getNama());
        System.out.println("Jenis Kelamin = " + KBS.getJenisKelamin());
        System.out.println("Jabatan = " + KBS.getJabatan());
        System.out.println("Departemen = " + KBS.getDepartemen());
    }
}