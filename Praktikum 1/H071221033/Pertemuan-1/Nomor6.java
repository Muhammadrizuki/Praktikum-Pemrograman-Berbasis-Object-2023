import java.util.Scanner;

public class Nomor6 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.print("Input jari-jari : ");
            double r = input.nextDouble();
            double pi = 3.141592; 
            double hitungLuas = pi*r*r;

            System.out.printf("Luas lingkaran : " + "%.2f", hitungLuas);    // printf -> string format, kaya f string, dipake kalau mau nyelipin var inputan
            // "%2f" -> 2 angka belakang koma
        
            input.close();
            
        } catch(Exception e) {
            System.out.println("inputan bukan angka");
        }
    }
}