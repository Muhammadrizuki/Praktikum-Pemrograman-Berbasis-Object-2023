package Dog;
abstract class Dog {
    protected String name;
    protected int position;
    protected int averageLength;
    public void setAverageLength(int averageLength) {
        this.averageLength = averageLength;
    }
    public int getAverageLength() {
        return averageLength;
    }
    abstract void describe(); 
}

interface Action {
    void move();
}

class Pitbull extends Dog implements Action {

    public Pitbull(){
        super.name = "Pitbull"; 
    }

    @Override
    public void move(){
        super.position += 3;
        System.out.println(this.name + " berpindah sejauh +" + super.position + " ke kanan");
    }

    @Override
    void describe(){
        System.out.println("Ras anjing: " + super.name);
        System.out.println("Posisi: +" + super.position + " ke kanan");
        System.out.println("Tinggi rata-rata: " + super.averageLength  + " cm");
    }

}

class SiberianHusky extends Dog implements Action{

    public SiberianHusky(){
        super.name = "Siberian Husky";
    }

    @Override
    public void move(){
        super.position += 2;
        System.out.println(this.name + " berpindah sejauh +" + super.position + " ke kanan");
    }

    @Override
    void describe(){
        System.out.println("Ras anjing: " + super.name);
        System.out.println("Posisi: +" + super.position + " ke kanan");
        System.out.println("Tinggi rata-rata: " + super.averageLength + " cm");
    }

}

class Bulldog extends Dog implements Action{

    public Bulldog(){
       super.name = "Bulldog";
    }

    @Override
    public void move(){
        super.position += 1;
        System.out.println(this.name + " berpindah sejauh +" + super.position + " ke kanan");
    }

    @Override
    void describe(){
        System.out.println("Ras anjing: " + super.name);
        System.out.println("Posisi: +" + super.position + " ke kanan");
        System.out.println("Tinggi rata-rata: " + super.averageLength  + " cm");
    }

}

class GermanShepherd extends Dog implements Action{

    public GermanShepherd(){
       super.name = "German Shepherd";
    }

    @Override
    public void move(){
        super.position += 3;
        System.out.println(this.name + " berpindah sejauh +" + super.position + " ke kanan");
    }

    @Override
    void describe(){
        System.out.println("Ras anjing: " + super.name);
        System.out.println("Posisi: +" + super.position + " ke kanan");
        System.out.println("Tinggi rata-rata: " + super.averageLength  + " cm");
    }

}