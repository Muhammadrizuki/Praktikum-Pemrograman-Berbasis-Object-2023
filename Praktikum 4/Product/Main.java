package Product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Iphone");
        product1.setCategory("Handphone");
        product1.setPrice(500000);
        product1.setStock ("ada") ;
        product1.setIsAvailable(false);
        product1.displayInfo();

        Product product2 = new Product("Samsung","Handphone", 60000,"tidak ada" , true);
        System.out.println(product2.getName());
        System.out.println(product2.getCategory());
        System.out.println(product2.getPrice());
        System.out.println(product2.getStock());

        SelfUtils.displaySelfData();

        
        
    }
}
