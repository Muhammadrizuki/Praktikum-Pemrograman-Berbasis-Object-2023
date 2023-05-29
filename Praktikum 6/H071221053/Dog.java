abstract class Dog {  //abstract class itu sebuah class yang mempunyai method tp tidak mempunyai implementasi body.Dia punya method tpi nd ada isinya 
    
    protected int position;
    protected int averageLength;

    abstract void move();
    abstract void describe();

    
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAverageLength() {
        return averageLength;
    }

    public void setAverageLength(int averageLength) {
        this.averageLength = averageLength;
    }

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    
}


class Pitbull extends Dog{

    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void move() {
        setPosition(getPosition()+3);
        System.out.println("Bergerak 3 kali ke kanan, posisi sekarang di" + getPosition()+ "langkah di kanan");
    }

    @Override
    void describe() {
        System.out.println("Panjang rata-rata Pitbull adalah" + getAverageLength() + "cm");
    }
    
}

class SiberianHusky extends Dog  {

    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void move() {
        setPosition(getPosition()+2);
        System.out.println("Bergerak 2 kali ke kanan, posisi sekarang di" + getPosition()+ "langkah di kanan");
    }

    @Override
    void describe() {
        System.out.println("Panjang rata-rata Siberian Husky adalah" + getAverageLength() + "cm");
    }
    
}

class Bulldog extends Dog {

    public Bulldog(int position, int averageLength) {
        super(position, averageLength);

    }

    @Override
    void move() {
        setPosition(getPosition()+1);
        System.out.println("Bergerak 1 kali ke kanan, posisi sekarang di " + getPosition()+ " langkah di kanan");
    }

    @Override
    void describe() {
        System.out.println("Panjang rata-rata Bulldog adalah " + getAverageLength() + " cm");
    }
    
}

class GermanShepherd extends Dog {

    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void move() {
        setPosition(getPosition()+3);
        System.out.println("Bergerak 3 kali ke kanan, posisi sekarang di" + getPosition()+ "langkah di kanan");
    }

    @Override
    void describe() {
        System.out.println("Panjang rata-rata German Shepherd adalah" + getAverageLength() + "cm");
    }
    
}




