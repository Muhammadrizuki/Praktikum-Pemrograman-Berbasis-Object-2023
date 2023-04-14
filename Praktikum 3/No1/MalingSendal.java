package No1;

public class MalingSendal {

    // inisialisasi atribut
    String nama, level;
    int Jml_Sendal, tkp_warga;
    boolean isSobatPolsek;
    static int sitaan; // nilai ini melekat pada class

    // constructor dengan nilai default yang sudah di assign
    MalingSendal(String nama) {
        this.nama = nama;
        this.Jml_Sendal = 1;
        this.tkp_warga = 0;
    }

    // constructor dengan nilai yang di assign manual oleh user
    MalingSendal(String nama, int Jml_Sendal, int tkp_warga) {
        this.nama = nama;
        this.Jml_Sendal = Jml_Sendal;
        this.tkp_warga = tkp_warga;
    }

    // method curi yang mengurangi jumlah sendal musuh, menambah sendal pencuri, dan menambah jumlah sitaan di polsek
    void curi(int s, MalingSendal musuh) {
        musuh.Jml_Sendal -= s;
        this.Jml_Sendal += s;
        MalingSendal.sitaan = s;
    }

    // method lapor yang akan menambah jumlah tertangkap warga musuh, mengubah jumlah sendalnya jadi 0, mengembalikan sendal yang telah dicuri, dan menentukan apakah pelaku sobat polsek atau tidak
    void lapor(MalingSendal musuh) {
        musuh.tkp_warga +=1;
        musuh.Jml_Sendal = 0;
        this.Jml_Sendal += MalingSendal.sitaan;
        musuh.isSobatPolsek = musuh.tkp_warga>5 ? true : false;
    }

    // getter untuk menampilkan status tiap objek
    void getStatus() {
        System.out.printf("%s sekarang memiliki %d sendal, dan telah %d kali tertangkap warga.%n", this.nama, this.Jml_Sendal, this.tkp_warga);
        if (this.Jml_Sendal>5 && this.isSobatPolsek==false) {
            this.level = "pro, dan bukan sobat polsek.";
        } else if (this.Jml_Sendal>5 && this.isSobatPolsek==true) {
            this.level = "pro, tapi dia sobat polsek.";
        } else if (this.Jml_Sendal<=5 && this.isSobatPolsek==false) {
            this.level = "noob, dan bukan sobat polsek.";
        } else if (this.Jml_Sendal<=5 && this.isSobatPolsek==true) {
            this.level = "noob, tapi dia sobat polsek.";
        }
        System.out.printf("%s adalah maling %s %n", this.nama, this.level);
        System.out.println(" ");
    }

}
