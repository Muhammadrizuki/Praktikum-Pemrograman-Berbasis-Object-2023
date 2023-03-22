import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
        
            System.out.print("Name : ");          // 7,12,16 -> bukan println biar yg diinput jdi ke samping
            String name = sc.nextLine();            // nextLine -> biar namanya bisa >= 2                                    

            System.out.print("Umur : ");
            int age = sc.nextInt();
            sc.nextLine();                          // biar bisa input hobby

            System.out.print("Hobby : ");
            String hobby = sc.nextLine();           // nextLine -> biar hobbynya bisa >= 2

            System.out.println("Nama saya "+ name + ", " + age + " tahun, " + "hobby " + hobby);

            sc.close();

        } catch(Exception e) {
            System.out.println("input umur bukan angka");
        }
    }
}