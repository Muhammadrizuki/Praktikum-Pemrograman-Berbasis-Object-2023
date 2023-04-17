package assignment3;
import java.util.ArrayList;

class User {
    String name;
    int balance;

    // constructor
    User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    // method setter getter
    public void setName(String name) {
        this.name = name;
    }
    public void setBalance(int balance) {
        this.balance = this.balance - balance;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }

    // method utk menampilkan info user
    public void card() {
        System.out.println("-".repeat(40));
        System.out.println(this.getName());
        System.out.println(this.getBalance());
        System.out.println("-".repeat(40));
    }
}


class Product {
    String name;
    int price;
    int stock;

    // constructor
    Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // method setter getter
    public String getName() {
        return name;
    } 
    public int getPrice() {
        return price;
    } 
    public int getStock() {
        return stock;
    } 

    // method utk mengurangi stok produk ketika sudah terjual
    public void sisaStok(Store store) {
        if (stock > 0) {        // jika stok bernilai > 0
            stock--;            // maka stok akan dikurangi nilainya sebesar 1
        } else {
            System.out.println("Barang habis");
        }
    }
}


class Store {
    String name;
    ArrayList<Product> product;     // sama dgn array
    
    // constructor
    Store(String name, ArrayList<Product> product) {
        this.name = name;
        this.product = product;
    }

    // method setter getter
    public String getName() {
        return name;
    }
    public ArrayList<Product> getProduct() {
        return product;
    }

    // method utk menampilkan list produk
    public void listProduct() {
        int i = 1;
        System.out.printf("Selamat datang di %s%nDaftar produk:%n", this.getName());
        // jika produk masuk ke dalam class Product maka list product akan ditambah
        for (Product produk : this.product) {
            System.out.printf("%d. %s - %d | Stok %d%n", i, produk.getName(), produk.getPrice(), produk.getStock());
            i++;
        }
        System.out.println("0. Keluar");
    }

    // method utk menambah produk ke dalam list product
    public void addProduct(Product product) {
        this.product.add(product);
    }
}

public class Nomor3 {
    
}
