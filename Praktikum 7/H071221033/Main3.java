package assignment7;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        // bikin variabel bertipe Food trs panggil getFood dri 
        // FoodFactory utk samain type makanannya
        Food burger = FoodFactory.getFood("burger");
        Food pizza = FoodFactory.getFood("pizza");
        Food steak = FoodFactory.getFood("steak");
        // Food mangga = FoodFactory.getFood("mangga");

        // list Foods dri kelas Food, isi list ditambah dri variabel diatas
        List<Food> Foods = new ArrayList<>();
        Foods.add(burger);
        Foods.add(pizza);
        Foods.add(steak);
        // Foods.add(mangga);

        // hitung total makanan, manggil method dri kelas Restaurant
        int total = Restaurant.calculateTotal(Foods);

        System.out.println("Total Price: " + total);
        System.out.println(steak.getPrice());
    }
}
