package assignment6;

class SiberianHusky extends Dog {

    @Override
    void move() {
        this.position = 2;
        System.out.println("Siberian Husky bergeser ke kanan sebanyak: " + this.position);
    }

    @Override
    void describe() {
        System.out.println("Ciri-ciri: tubuh besar, bulu lebat dah halus, bersahabat");
    }
}
