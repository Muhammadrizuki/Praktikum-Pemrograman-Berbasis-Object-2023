import java.util.Scanner;

public class soal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Name : ");
            String name = input.nextLine();

            System.out.print("Age : ");
            int age = input.nextInt();
            input.nextLine();

            System.out.print("Hobby : ");
            String hobby = input.nextLine();

            System.out.println("Nama saya " + name + ", " + age + " tahun, hobby " + hobby + ".");    
        } catch (Exception e) {
            System.out.println("Umur Harus Berupa Angka");
        }
        input.close();
    }
}