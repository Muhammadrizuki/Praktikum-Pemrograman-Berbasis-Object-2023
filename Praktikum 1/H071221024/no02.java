import java.util.Scanner;
public class no02 {
    public static void main(String[] args) {
        try {
            int bilBulat, bilDesimal;
            bilBulat = 0;
            bilDesimal = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("n = ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("");
                double inputanAngka = sc.nextDouble();
                if (inputanAngka == (int) inputanAngka) {
                    bilBulat++;
                } else {
                    bilDesimal++;
                }
            }
            System.out.println(bilBulat + " Bilangan Bulat");
            System.out.println(bilDesimal + " Bilangan Desimal");
            sc.close();
        } catch (Exception e){
            System.out.println("Inputan harus berupa angka!");
        }
    }
}
