package No3;

public class Product {
    
    // inisialisasi atribut
    private String name;
    private int price, stock;

    // constructor dengan nominal price berupa ...k
    public Product(String name, String price, int stock) {
        String slice;

        this.name = name;
        this.stock = stock;

        slice = price;
        slice = slice.substring(0, price.length()-1)+"000";
        this.price = Integer.parseInt(slice);
    }

    // constructor dengan nominal int
    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // setter dan getter untuk atribut class
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    
    public int getStock() {
        return stock;
    }

}
