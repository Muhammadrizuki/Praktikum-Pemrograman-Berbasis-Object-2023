package no02;

public class Main {
    public static void main(String[] args) {
        Food food1 = new Food();
        food1.setName("Nasi Goreng");
        food1.setType("Indonesian Food");
        food1.setPrice(20000);
        food1.setRating(9);
        
        food1.displayInfo();

        System.out.println();

        Food food2 = new Food("Mie Goreng", "Indonesian Food", 10000, 8);
        System.out.println(food2.getName());
        System.out.println(food2.getType());
        System.out.println(food2.getPrice());
        System.out.println(food2.getRating());

        System.out.println();

        SelfUtils.displaySelfData();
    }
}
