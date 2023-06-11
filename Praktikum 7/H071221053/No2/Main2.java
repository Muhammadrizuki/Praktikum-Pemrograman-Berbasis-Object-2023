package No2;

public class Main2 {
    public static void main(String[] args) {
        Product<Integer> product = new Product<>("Kinderjoy", 10000, "2023-05-01");
        Product<String> productLagi = new Product<>("Sari Roti", "Rp 15.00", "2023-05-20");
        Product<Double> productLagiLagi = new Product<>("Susu Kurma", 7.5, "2023-06-01");

        System.out.println(product.getNama() + " - " + product.getHarga() + " - " + product.getExpire());
        System.out.println(productLagi.getNama() + " - " + productLagi.getHarga() + " - " + productLagi.getExpire());
        System.out.println(productLagiLagi.getNama() + " - " + productLagiLagi.getHarga() + " - " + productLagiLagi.getExpire());
    }
}


