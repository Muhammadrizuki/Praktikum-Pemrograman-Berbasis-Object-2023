import java.util.Scanner;

public class BangunRuang {

    double panjang;
    double lebar;
    double tinggi;
    double sisi;
    double jarijari;

    static Scanner sc = new Scanner(System.in);

    public void kubus () {

        System.out.print(">>");
        this.sisi = sc.nextDouble();

        System.out.println(6*this.sisi*this.sisi);
        System.out.println(this.sisi*this.sisi*this.sisi);

//        sc.close();

    }

    public void balok () {

        System.out.print(">>");
        this.panjang = sc.nextDouble();
        System.out.print(">>");
        this.lebar = sc.nextDouble();
        System.out.print(">>");
        this.tinggi = sc.nextDouble();

        System.out.println((2*(this.panjang*this.lebar))+(2*(this.panjang*this.tinggi))+(2*(this.lebar*this.tinggi)));
        System.out.println(this.panjang*this.lebar*this.tinggi);

//        sc.close();

    }

    public void bola () {

        System.out.print(">>");
        this.jarijari = sc.nextDouble();

        System.out.println(4*Math.PI*this.jarijari*this.jarijari);
        System.out.println(4/3*(Math.PI*this.jarijari*this.jarijari*this.jarijari));

//        sc.close();

    }

    public void tabung () {

        System.out.print(">>");
        this.jarijari = sc.nextDouble();
        System.out.print(">>");
        this.tinggi = sc.nextDouble();

        System.out.println(((2*this.jarijari*Math.PI)*this.tinggi)+(2*(Math.PI*this.jarijari*this.jarijari)));
        System.out.println((Math.PI*this.jarijari*this.jarijari)*this.tinggi);

//        sc.close();

    }

}
