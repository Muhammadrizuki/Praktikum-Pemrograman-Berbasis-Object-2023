package assignment6;

class Bulldog extends Dog {
    
    @Override
    void move() {
        this.position = 1;
        System.out.println("Bulldog bergeser ke kanan sebanyak: " + this.position);
    }

    @Override
    void describe() {
        System.out.println("Ciri-ciri: tubuh lebar, kaki pendek, katanya jinak");
    }
}
