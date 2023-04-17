public class TukangPukul {
    
    // Assign atribut class
    private String nama;
    private int power;

    // Constructor untuk membuat objek
    TukangPukul(String nama, int power) {
        this.nama = nama;
        this.power = power;
    }
    
    // Getter untuk
    String getNama() {
        return nama;
    }
    
    int getPower() {
        return power;
    }

    void pukul(TukangPukul musuh) {
        musuh.power = musuh.power - this.power;
    }

}
