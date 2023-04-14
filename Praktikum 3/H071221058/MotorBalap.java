package Tugas3;

public class MotorBalap {
    // 3 Attribute
    String      owner;
    String      merk;
    int         kecepatan;
    MotorBalap  lawan;

    // Menambahkan 2 Constructor
    // 2 Constructor
    public MotorBalap(String owner, String merk, int kecepatan) {
        this.owner = owner;
        this.merk = merk;
        this.kecepatan = kecepatan;
    }
    public MotorBalap(String owner, String merk, int kecepatan, MotorBalap lawan) {
        this.owner = owner;
        this.merk = merk;
        this.kecepatan = kecepatan;
        this.lawan = lawan;
    }

    // Menambahkan 2 Behavior
    // Behavior 1
    public void balap() {
        if (this.lawan == null) {
            System.out.println("==================================================================");
            System.out.println("Tidak bisa balap, lawan tidak ditemukan.");
            System.out.println("==================================================================");
            System.out.println();
        } else {
            if (this.kecepatan > this.lawan.kecepatan) {
                System.out.println("==================================================================");
                System.out.println("> Motor " + this.owner + " Dengan Merk " + this.merk + " Berkecepatan " + this.kecepatan + " Km/jam" ); 
                System.out.println("  Menang Dalam Balapan Melawan");
                System.out.println("  Motor " + this.lawan.owner + " Dengan Merk " + this.lawan.merk + " Berkecepatan " + this.lawan.kecepatan + " Km/jam");
                System.out.println("==================================================================");
                System.out.println();
            } else if (this.kecepatan == this.lawan.kecepatan) {
                System.out.println("==================================================================");
                System.out.println("> Motor" + this.owner + " Dengan" + this.lawan.owner + " Seri Dalam Balapan.");
                System.out.println("==================================================================");
            } else {
                System.out.println("==================================================================");
                System.out.println("> Motor " + this.owner + " Dengan Merk " + this.merk + " Berkecepatan " + this.kecepatan + " Km/jam" ); 
                System.out.println("  Kalah Dalam Balapan Melawan");
                System.out.println("  Motor " + this.lawan.owner + " Dengan Merk " + this.lawan.merk + " Berkecepatan " + this.lawan.kecepatan + " Km/jam");
                System.out.println("==================================================================");
            } 
        }
    }

    // Behavior 2 + Behaviournya Berinteraksi Dengan Attribute User Defined Variable = ( MotorBalap Lawan )
    public void cariLawan(MotorBalap lawan) {
        this.lawan = lawan;
        System.out.println("==================================================================");
        System.out.println("> Lawan Ditemukan");
        System.out.println("=================");
        System.out.println("> Motor " + this.merk + " Milik " + this.owner + " Melawan " + "Motor " + this.lawan.merk + " Milik " + this.lawan.owner);
    }
}
