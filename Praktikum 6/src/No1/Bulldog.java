package No1;

public class Bulldog extends Dog{

    private int position;
    private int averageLength;

    public Bulldog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    @Override
    public void move() {
        this.position+=1;
        System.out.printf("Sekarang Bulldog sedang berada di %d %n", this.position);
    }

    @Override
    public void describe() {
        System.out.printf("Deskripsi:%n- Memiliki panjang rata-rata %d cm %n", this.averageLength);
    }

}
