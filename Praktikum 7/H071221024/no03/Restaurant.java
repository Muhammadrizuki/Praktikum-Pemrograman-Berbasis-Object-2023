package Praktikum07.no03;

import java.util.List;

class Restaurant {
    static int calculateTotal(List<Food> foods){
        int totalPrice = 0;
        for (Food food : foods) {
            totalPrice += food.getPrice();
        }
        return totalPrice;
    }
}
