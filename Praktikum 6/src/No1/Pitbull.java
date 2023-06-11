package No1;

public class Pitbull extends Dog{

    private int position;
    private int averageLength;

    public Pitbull(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    @Override
    public void move() {
        this.position+=3;
        System.out.printf("Sekarang pitbull sedang berada di %d %n", this.position);
    }

    @Override
    public void describe() {
        System.out.printf("Deskripsi:%n- Memiliki panjang rata-rata %d cm %n", this.averageLength);
    }

}
