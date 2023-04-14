import java.util.Scanner;

public class LatihanNo3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        System.out.print( "Name");
        name = sc.nextLine();

        int age;
        System.out.print( "Umur : ");
        age = sc.nextInt();
        sc.nextLine();      

        String hobby;
        System.out.print( "Hobby : ");
        hobby = sc.nextLine();

        System.out.println("Nama saya "+ name + ", " + age + "tahun, hobby" + hobby);

        sc.close();
    }

}