package no02;

public class Food {
    private String name, type;
    private int price, rating;

    public Food(String name, String type, int price, int rating){
        this.name = name;
        this.type = type;
        this.price = price;
        this.rating = rating;
    }
    public Food(){
        
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    public void displayInfo(){
        System.out.println("Name   : " + this.name);
        System.out.println("Type   : " + this.type);
        System.out.println("Price  : " + this.price);
        System.out.println("Rating : " + this.rating);
    }
}
