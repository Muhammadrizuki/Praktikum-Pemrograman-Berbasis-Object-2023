package TUGAS.Pertemuan4;

public class SelfUtils {
    static String nama = "Mahendra Kirana M.B.";
    static String nim  = "H071221058";

    static String getNama() {
        return ("Nama   : " + nama);
    }
    static String getNim() {
        return ("NIM    : " + nim);
    }

    static void displaySelfData() {
        System.out.println("__ INFO AUTHOR __");
        System.out.println(getNama());
        System.out.println(getNim());
    }
}
