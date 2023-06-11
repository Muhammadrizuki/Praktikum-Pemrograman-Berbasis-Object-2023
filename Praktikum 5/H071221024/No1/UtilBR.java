import java.util.Scanner;

public class UtilBR extends  BangunRuang {

    public void choice() {

        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        switch (in) {
            case 1:
                super.kubus();
                break;
            case 2:
                super.balok();
                break;
            case 3:
                super.bola();
                break;
            case 4:
                super.tabung();
                break;
        }

    }

}
