package assignment6;

class Smartphone implements Move{
    int price;
    String brand;

    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
    }
}

// methodnya pasti abstrak tdk usah di declare
// dianjurkan hanya berisi method, no atribut
