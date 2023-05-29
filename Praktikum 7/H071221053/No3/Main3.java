import java.util.List;
import java.util.ArrayList;


interface Food {
    int getPrice();
}

class Burger implements Food{
    protected int harga;

    @Override
    public int getPrice() {
        return 45000;
    }    
}

class Pizza implements Food {
    protected int harga;

    @Override
    public int getPrice() {
        return 245000;
    }
    
}

class Steak implements Food{
    protected int harga;

    @Override
    public int getPrice() {
       return 350000;
    }
}

class Nasigoreng implements Food {
    protected int harga ;

    @Override
    public int getPrice() {
        return 24000;
    }
}

class FoodFactory {
    static Food getFood(String food) { 
        Food makanan = null; 
        if (food.equals("burger")) {  //Jika nilainya adalah burger, maka objek makanan akan diinisialisasi dengan objek dari kelas Burger
            makanan = new Burger(); 
        } else if (food.equals("pizza")) {
            makanan = new Pizza(); 
        } else if (food.equals("steak")) {
            makanan = new Steak(); 
        } else if (food.equals("nasi goreng")) {
            makanan = new Nasigoreng();
        }
        return makanan;
    }
}

class Restaurant {
    static int calculateTotal(List<Food> listMakanan) {
        int totalPrice = 0;
        for (Food i : listMakanan) { 
            totalPrice += i.getPrice();
        }
        return totalPrice;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Food burger = FoodFactory.getFood("burger");
        Food pizza = FoodFactory.getFood("pizza");
        Food steak = FoodFactory.getFood("steak"); // Objek-objek ini diinisialisasi dengan memanggil metode getFood() pada kelas FoodFactory
        Food nasigoreng = FoodFactory.getFood("nasi goreng");

        List<Food> foods = new ArrayList<>(); //setelah itu, objek-objek Food tersebut ditambahkan ke dalam sebuah ArrayList yang bernama foods.
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);
        foods.add(nasigoreng);

        int total = Restaurant.calculateTotal(foods);  // Metode ini akan menghitung total harga dari semua objek Food dalam list foods, dan mengembalikan nilai total harga tersebut.

        System.out.println("Total price: " + total); //program mencetak hasil perhitungan total harga dengan menggunakan perintah 
    }
}
