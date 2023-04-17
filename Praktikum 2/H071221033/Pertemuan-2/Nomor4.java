package assignment2;

class Cuboid {
    // definisi atribut 
    double height;
    double width;
    double length;

    // method getVolume untuk menghitung volume dan mengembalikan nilainya
    double getVolume() {                        // ? public double getVolume 
        double volume = height*width*length;    // public bisa dipake di semua
        return volume;                          // default = class sendiri, class dlm package
    }

    // method setter & getter utk memberikan nilai & mengambil nilai pd atribut
    public void setTinggi(double height) {          // ? penggunaan public dan void
        this.height = height;                       // ? pake setter getter
    }                                               // ? yg ditulis set dlu atau get dlu
    public void setLebar(double width) {            
        this.width = width;
    }
    public void setPanjang(double length) {
        this.length = length;
    }
    /*public double getTinggi() {
        return height;
    }
    public double getLebar() {
        return width;
    }
    public double getPanjang() {
        return length;
    } */
}

// class Nomor4 utk memanggil objek dan menjalankan program
public class Nomor4 {
    public static void main(String[] args) {
        
        // buat objek baru dari class Cuboid
        Cuboid cuboid = new Cuboid();   
        
        // mengisi atribut menggunakan setter
        cuboid.setTinggi(2.5); 
        cuboid.setLebar(2.5); 
        cuboid.setPanjang(2.5);

        // print volume dengan format 2 angka di belakang koma, memanggil method getVolume
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}
