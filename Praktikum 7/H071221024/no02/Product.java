package Praktikum07.no02;

class Product <T>{
    private String name;
    public String getName() {
        return name;
    }

    private T price;
    public T getPrice() {
        return price;
    }

    private String expiryDate;
    public String getExpiryDate() {
        return expiryDate;
    }

    Product(String name, T price, String expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    
}
