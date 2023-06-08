package assignment6;

class GermanShepherd extends Dog{

    @Override
    void move() {
        this.position = 3;
        System.out.println("German Shepherd bergeser ke kanan sebanyak: " + this.position);
    }

    @Override
    void describe() {
        System.out.println("Ciri-ciri: tubuh memanjang, telinga tegak, mata berwarn gelap");
    }
}
