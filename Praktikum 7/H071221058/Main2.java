import java.text.SimpleDateFormat;
import java.util.Date;

class Product<T> {
    private String name;
    private T price;
    private Date expiryDate;
    
    public Product(String name, T price, Date expiryDate) {
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
    
    public Date getExpiryDate() {
        return expiryDate;
    }
}

public class Main2 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        //nilai 123 pada parameter pertama merupakan nilai untuk tahun relatif dari 1900, bukan tahun absolut. 
        //Artinya, nilai 123 sebenarnya merepresentasikan tahun 2023, bukan 2123.
        Product<Integer>    product1 = new Product<Integer>("Kinder Joy", 10000, new Date(123, 3, 21));
        Product<String>     product2 = new Product<String>("Sari Roti", "Rp 15.000", new Date(130, 4, 19));
        Product<Double>     product3 = new Product<Double>("Susu Kurma", 7.5, new Date(129, 5, 8));
        Product<Integer>    product4 = new Product<Integer>("Taro Drink", 12, new Date(124, 7, 21) );
        Product<String>     product5 = new Product<String>("Teh Pucuk", "5 Ribu", new Date(126, 0, 0));

        System.out.println("\n" + "=".repeat(16) + " INFO PRODUK " + "=".repeat(16));
        System.out.println("Product 1: " + product1.getName() + " - " + product1.getPrice() + " - " + dateFormat.format(product1.getExpiryDate()));
        System.out.println("Product 2: " + product2.getName() + " - " + product2.getPrice() + " - " + dateFormat.format(product2.getExpiryDate()));
        System.out.println("Product 3: " + product3.getName() + " - " + product3.getPrice() + " - " + dateFormat.format(product3.getExpiryDate()));
        System.out.println("Product 4: " + product4.getName() + " - " + product4.getPrice() + " - " + dateFormat.format(product5.getExpiryDate()));
        System.out.println("Product 5: " + product5.getName() + " - " + product5.getPrice() + " - " + dateFormat.format(product5.getExpiryDate()) + "\n");

    }
}
