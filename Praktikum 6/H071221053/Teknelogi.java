interface Teknelogi {   //kontrak dari implementasi method atau tidak terikat dgn hirearki 
    
    void move ();
}


class Smartphone implements Teknelogi {
    protected int price;
    protected String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override //untuk instance abstract class hrus di implementasi bodynya 
    public void move() {
        System.out.println("Smartphone berpindah");
    }

    
}

class Car implements Teknelogi {
    protected int totalForwardGear;
    protected String color;
    protected int maxSpeed;

    
    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
    
}
