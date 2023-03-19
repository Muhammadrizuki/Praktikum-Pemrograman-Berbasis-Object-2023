// SOAL NO 4

class Cuboid {
    double height; // atribut
    double width; // atribut
    double length; // atribut

    double getVolume() { // memiliki method getVolume yang mengembalikan nilai volume dari kubus
        return height * width * length;
    }
}

public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 15.0;
        cuboid.width = 10.0;
        cuboid.length = 30.0;
        System.out.printf("Volume = %.2f", cuboid.getVolume()); // mencetak nilai volume dari objek cuboid dengan menggunakan method getVolume() dan printf()
    }
}