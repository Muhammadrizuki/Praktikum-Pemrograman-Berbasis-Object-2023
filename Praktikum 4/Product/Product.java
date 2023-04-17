package Product;
public class Product {
    private String name;
    private String category;
    private int price;
    private String stock;
    private boolean IsAvailable ;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public boolean isIsAvailable() {
        return IsAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        IsAvailable = isAvailable;
    }
    public Product(){

    }

    public Product(String name, String category, int price, String stock, boolean isAvailable) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        IsAvailable = isAvailable;
    }

    public void displayInfo(){
        System.out.println(name);
        System.out.println(category);
        System.out.println(price);
        System.out.println(stock);
        System.out.println(isIsAvailable());

}
}
