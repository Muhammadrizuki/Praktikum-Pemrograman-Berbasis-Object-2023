public class No4 {
    public static void main(String[] args) {
        
        //proses instansiasi di class Cuboid dalam class no4
        Cuboid cuboid = new Cuboid();

        // menambahkan nilai pada masing-masing atribut
        cuboid.setHeight(16.509636244473135);
        cuboid.setWidth(16.509636244473135);
        cuboid.setLength(16.509636244473135);
        
        //mengambil nilai getVolume dengan 2 angka dibelakang koma menggunakan string format
        System.out.printf("volume = %.2f ", cuboid.getVolume());
    }     
}
