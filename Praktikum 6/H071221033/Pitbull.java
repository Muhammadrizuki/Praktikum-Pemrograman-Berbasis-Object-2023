package assignment6;

class Pitbull extends Dog {

    @Override
    void move() {
        this.position = 3;
        System.out.println("Pitbull bergeser ke kanan sebanyak: " + this.position);
    }

    @Override
    void describe() {
        System.out.println("Ciri-ciri: tubuh besar, kepala persegi, sifat galak");
    }
}
