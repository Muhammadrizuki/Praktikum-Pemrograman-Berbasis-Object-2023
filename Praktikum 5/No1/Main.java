import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UtilBR br = new UtilBR();
        UtilBD bd = new UtilBD();

        int c = 0;

        while (c == 0) {

            System.out.println("1. ==== BANGUN RUANG ====");
            System.out.println("2. ==== BANGUN DATAR ====");
            System.out.println("0. KELUAR");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("1. KUBUS");
                    System.out.println("2. BALOK");
                    System.out.println("3. BOLA");
                    System.out.println("4. TABUNG");
                    br.choice();
                    break;
                case 2:
                    System.out.println("1. PERSEGI");
                    System.out.println("2. PERSEGI PANJANG");
                    System.out.println("3. LINGKARAN");
                    System.out.println("4. SEGITIGA");
                    System.out.println("5. TRAPESIUM");
                    bd.choice();
                    break;
                case 0:
                    System.out.println("SAMPAI JUMPA");
                    c=1;
                    break;
            }

        }

    }

}
