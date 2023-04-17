public class No1 {
    
    public static void main(String[] args) {
        // Membuat objek dari kelas TukangPukul
        TukangPukul kelvin = new TukangPukul("kelvin", 1000);
        TukangPukul fail = new TukangPukul("fail", 100);

        // Interaksi antar objek dengan method dalam class
        kelvin.pukul(fail);

        System.out.printf("Kekuatan fail sekarang = %d", fail.getPower());

    }

}


