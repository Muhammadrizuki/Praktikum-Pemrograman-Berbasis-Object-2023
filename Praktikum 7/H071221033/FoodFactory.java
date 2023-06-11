package assignment7;

import java.util.List;

public class FoodFactory {
    public static Food getFood(String type){
        // jika type == "burger", maka akan mengembalikan objek makanan sesuai jenisnya
        if(type == "burger"){
            return new Burger();
        } else if(type == "pizza"){
            return new Pizza();
        } else if(type == "steak"){
            return new Steak();
        } else{
            throw new IllegalArgumentException("Invalid food type: " + type);
        }
    }
}


class Restaurant{
    // method yg menerima list berisi makanan dri kelas Food
    public static int calculateTotal(List<Food> Foods){
        int total = 0;          // knp hrus = 0
        for(Food food : Foods){
            total += food.getPrice();
        }
        return total;
    }
}
