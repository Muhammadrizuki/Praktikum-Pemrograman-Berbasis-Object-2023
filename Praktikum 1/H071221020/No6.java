import java.util.Scanner;

public class No6 {
    
    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            
            double r = scan.nextDouble();

            System.out.printf("%.2f", r*r*3.14);

        } catch (Exception e) {
            System.out.println("Masukkan input yang valid!");
        }

    }

}
