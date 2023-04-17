import java.util.Scanner;
public class no03 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

        System.out.print("Name : ");
        String name = sc.nextLine();

        System.out.print("Umur : ");
        int age = sc.nextInt();
        sc.nextLine(); // Kode ini untuk membuat inputan baru pada tipe data String

        System.out.print("Hobby : ");
        String hobby = sc.nextLine();
        sc.close();

        System.out.printf("\nNama saya %s, %d tahun, hobby %s ", name, age, hobby);
        } catch (Exception e) {
            System.out.println("Inputan pada umur harus berupa angka");
        }
    }
}
