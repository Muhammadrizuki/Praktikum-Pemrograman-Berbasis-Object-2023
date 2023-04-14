import java.util.Scanner;

public class LatihanNo6 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.print("Input jaari-jari : ");
            double r = input.nextDouble();
            double pi = 3.141592;
            double hitungLuas = pi*r*r;

            System.out.printf("Luas lingkaran : " + "%.2f", hitungLuas);
            // "%2f" -> 2 angka belakang koma 

            input.close();

        } catch(Exception e) {
            System.out.println("inputan bukan angka");
        }
    }
} 