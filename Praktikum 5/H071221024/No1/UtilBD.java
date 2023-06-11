import java.util.Scanner;

public class UtilBD extends BangunDatar{

    public void choice() {

        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        switch (in) {
            case 1:
                super.persegi();
                break;
            case 2:
                super.persegipanjang();
                break;
            case 3:
                super.lingkaran();
                break;
            case 4:
                super.segitiga();
                break;
            case 5:
                super.trapesium();
                break;
        }

    }

}
