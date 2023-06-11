package Praktikum07.no02;

class Main {
    public static void main(String[] args) {
        Product<Integer> product1 = new Product<Integer>("Kinder Joy", 1000, "2023-05-01");
        Product<String> product2 = new Product<String>("Sari Roti", "Rp 15.000", "2023-05-20");
        Product<Double> product3 = new Product<Double>("Susu Kurma", 7.5, "2023-06-01");

        Product<?>[] products = { product1, product2, product3 };
        showDetails(products);
    }
    private static void showDetails(Product<?>[] products){
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getClass().getSimpleName() + " " + (i + 1) + ": " + products[i].getName() + " - " + products[i].getPrice() + " - " + products[i].getExpiryDate());
        }
    }
}
