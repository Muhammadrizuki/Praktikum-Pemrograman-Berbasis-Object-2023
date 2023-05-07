package No2;

public class Product<T> {

    protected String name;
    protected T price;
    protected String expiryDate;

    public Product(String name, T price, String expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public T getPrice() {
        return price;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

}

class Main{

    public static void main(String[] args) {

        Product<String> p1 = new Product<>("Bakwan", "Rp1000", "01-01-3023");
        Product<Integer> p2 = new Product<>("Tahu", 2000, "01-01-2045");
        Product<Double> p3 = new Product<>("Tempe", 1234.5, "17-05-2004");

        Product[] l = new Product[]{p1, p2, p3};

        for (int i = 0; i<l.length; i++) {
            System.out.printf("Produk %d: %s | %s | %s %n",i, l[i].getName(), l[i].getPrice(), l[1].getExpiryDate());
        }

    }

}