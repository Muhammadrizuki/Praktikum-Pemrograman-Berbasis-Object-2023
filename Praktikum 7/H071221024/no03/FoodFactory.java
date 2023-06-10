package Praktikum07.no03;

class FoodFactory {
    static Food getFood(String food){
        if(food.equalsIgnoreCase("burger")){
            return new Burger();
        } else if (food.equalsIgnoreCase("pizza")){
            return new Pizza();
        } else if (food.equalsIgnoreCase("steak")){
            return new Steak();
        } else {
            throw new Error(food + " tidak terdapat pada restoran ini");
        }
    }
}
