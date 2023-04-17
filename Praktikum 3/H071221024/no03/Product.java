package no03;

public class Product {
    public String name;
    public int price;
    public int stock;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void remainStock(){
        this.stock --;
    }

    public Product(String name, int price, int stock, Store store){
        this.name = name;
        this.price = price;
        this.stock = stock;
        store.addProduct(this.name);
        store.addProductsName(this.name);
        store.addPrice(this.price);
        store.addStock(this.stock);
    }
    public Product(String name, String price, int stock, Store store){
        this.name = name;
        this.stock = stock;
        if (price.matches("^\\d+k$")){
            this.price = Integer.parseInt(price.substring(0, price.length() - 1)) * 1000;
        } else if (price.matches("^\\d+$")) {
            this.price = Integer.parseInt(price);
        } else {
            throw new Error("Price tidak valid");
        }
        store.addProduct(this.name);
        store.addProductsName(this.name);
        store.addPrice(this.price);
        store.addStock(this.stock);
    }  
}
