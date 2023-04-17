public class MainAnggota {
    public static void main(String[] args) { //method yang dapat dipakai tanpa harus mendeklarasikan suatu class 
        PengurusInti pengurusInti = new PengurusInti("Diva", 19, "Wanita", "Ketua");
        System.out.println("Nama : " + pengurusInti.getName());
        System.out.println("Umur : " + pengurusInti.getAge());
        System.out.println("Gender : " + pengurusInti.getGender());
        System.out.println("Jabatan : " + pengurusInti.getJabatan());


        KordinatorBidangStaff koordinasiBidangStaff = new KordinatorBidangStaff("Arni", 19,"Wanita", "Humas");
        System.out.println("Nama : " + koordinasiBidangStaff.getName());
        System.out.println("Umur : " + koordinasiBidangStaff.getAge());
        System.out.println("Gender : " + koordinasiBidangStaff.getGender());
        System.out.println("Bidang : " + koordinasiBidangStaff.getBidang());
    }
}
