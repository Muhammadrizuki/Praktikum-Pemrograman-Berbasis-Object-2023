import java.util.Scanner;

public class BangunDatar {

    double panjang;
    double lebar;
    double tinggi;
    double sisi;
    double alas;
    double sisiatas;
    double sisibawah;
    double jarijari;

    static Scanner sc = new Scanner(System.in);

    public void persegi () {

        System.out.print(">>");
        this.sisi = sc.nextDouble();

        System.out.println(4*this.sisi);
        System.out.println(this.sisi*this.sisi);

//        sc.close();

    }

    public void persegipanjang () {

        System.out.print(">>");
        this.panjang = sc.nextDouble();
        System.out.print(">>");
        this.lebar = sc.nextDouble();

        System.out.println(2*(this.panjang+this.lebar));
        System.out.println(this.panjang*this.lebar);

//        sc.close();

    }

    public void lingkaran () {

        System.out.print(">>");
        this.jarijari = sc.nextDouble();

        System.out.println(Math.PI*2*this.jarijari);
        System.out.println(Math.PI*this.jarijari*this.jarijari);

//        sc.close();

    }

    public void segitiga () {

        System.out.print(">>");
        this.alas = sc.nextDouble();
        System.out.print(">>");
        this.tinggi = sc.nextDouble();

        System.out.println(this.alas+(2*(Math.sqrt((this.alas*this.alas)+(this.tinggi*this.tinggi)))));
        System.out.println(this.alas*this.tinggi/2);

//        sc.close();

    }

    public void trapesium () {

        System.out.print(">>");
        this.sisibawah = sc.nextDouble();
        System.out.print(">>");
        this.sisiatas = sc.nextDouble();
        System.out.print(">>");
        this.tinggi = sc.nextDouble();

        System.out.println((this.sisibawah+this.sisiatas)*this.tinggi/2);
        System.out.println(2*(Math.sqrt(((this.sisibawah-this.sisiatas)*(this.sisibawah*this.sisiatas))+(this.tinggi*this.tinggi)))+this.sisibawah+this.sisiatas);

//        sc.close();

    }

}
