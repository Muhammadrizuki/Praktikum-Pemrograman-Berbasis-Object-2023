package No3;

import java.util.ArrayList;

interface Food{
    int getPrice();
}

class Burger implements Food{

    int price = 20000;

    @Override
    public int getPrice() {
        return this.price;
    }
}
class Pizza implements Food{

    int price = 80000;

    @Override
    public int getPrice() {
        return this.price;
    }

}
class Steak implements Food{

    int price = 150000;

    @Override
    public int getPrice() {
        return this.price;
    }

}

class FoodFactory {

    static Food getFood(String food){
        Food obj = null;
        if (food.equals("burger")) {
            obj = new Burger();
        } else if (food.equals("pizza")) {
            obj = new Pizza();
        } else if (food.equals("steak")) {
            obj = new Steak();
        }
        return obj;
    }

}

class Restaurant{

    static int calculateTotal(ArrayList<Food> foods) {
        int total = 0;
        for (int i = 0; i<foods.size(); i++) {
            total+=foods.get(i).getPrice();
        }
        return total;
    }

}

class Main{

    public static void main(String[] args) {
        Food burger = FoodFactory.getFood("burger");
        Food pizza = FoodFactory.getFood("pizza");
        Food steak = FoodFactory.getFood("steak");

        ArrayList<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);

        int total = Restaurant.calculateTotal(foods);

        System.out.println("Total price: " + total);
    }
}
