import java.util.Scanner;
public class no06 {
    public static void main(String[] args) {
        try {
            double pi, r, hasil;
            pi = 3.14159265358979323846;
            Scanner sc = new Scanner(System.in);
            System.out.print("r = ");
            r = sc.nextDouble();
            hasil = pi*r*r;
            System.out.printf("Luas Lingkaran = %.2f", hasil);
            sc.close();
        } catch (Exception e) {
            System.out.println("Inputan harus berupa angka!");
        }
    }
    
}