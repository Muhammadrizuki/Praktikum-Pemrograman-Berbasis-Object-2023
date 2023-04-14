package assignment2;

class Maspion {

    // atribut
    int kecepatan;
    int timer;
    String gerak;

    // method menyala 
    void menyala() {
        System.out.println("Kipas menyala dengan kecepatan nomor " + kecepatan);
        System.out.println("Timer kipas diatur selama " + timer + " jam");
    }

    // method adem mengembalikan nilai false jika gerak = berputar dan sebaliknya
    boolean adem() {
        if (gerak == "berputar") {
            return false;
        } else {
            return true;
        }
        
    }
}

// class Nomor1 utk memanggil objek dan menjalankan program
public class Nomor1 {
    public static void main(String[] args) {
        
        // objek kipas dari class Maspion
        Maspion kipas = new Maspion();

        // isi atribut dari class Maspion
        kipas.kecepatan = 2;
        kipas.timer = 3;
        kipas.gerak = "Berputar";

        // menmanggil method
        kipas.menyala();

        // ini akan ter-print jika atribut gerak bernilai true
        if (kipas.adem()) {
            System.out.println("Nanti menggigil");
        }

    }
}