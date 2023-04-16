package Praktikum05.No01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //run program
        runApp();
    }
    private static void runApp(){
        System.out.println("=".repeat(20));
        System.out.println("Selamat Datang!!!");
        System.out.println("=".repeat(20));
        System.out.println("Pilih opsi :");
        System.out.println("1. Bangun Ruang");
        System.out.println("2. Bangun Datar");
        System.out.print("> ");
        try {
            int selectOption1 = sc.nextInt();
            switch (selectOption1) {
                case 1:
                    showBangunRuang();
                    break;
                case 2 :
                    showBangunDatar();
                    break;
                default:
                    System.out.println("Inputan yang anda masukkan salah! Mohon mencoba kembali!");
                    runApp();
            }
        } catch (InputMismatchException e) {
            System.out.println("Inputan yang anda masukkan salah! Mohon mencoba kembali!");
            sc.nextLine();
            runApp();
        }
    }
    private static void showBangunRuang(){
        System.out.println("=".repeat(4) + " BANGUN RUANG " + "=".repeat(4));
        System.out.println("Pilih opsi :");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.println("4. Tabung");
        System.out.print("> ");
        try {
            int selectBangunRuang = sc.nextInt();
            switch (selectBangunRuang) {
                case 1:
                    System.out.println("=".repeat(4) + " SET NILAI " + "=".repeat(4));
                    Kubus kubus = new Kubus();
                    System.out.print("Sisi : ");
                    int inputSisi = sc.nextInt();
                    kubus.setSisi(inputSisi);
                    System.out.println("=".repeat(19));
                    kubus.luasPermukaan();
                    kubus.volume();
                    System.out.println("=".repeat(19));
                    continueOrBreak();
                    break;
                case 2:
                    System.out.println("=".repeat(4) + " SET NILAI " + "=".repeat(4));
                    Balok balok = new Balok();
                    System.out.print("Panjang : ");
                    int inputPanjang = sc.nextInt();
                    balok.setPanjang(inputPanjang);
                    System.out.print("Lebar : ");
                    int inputLebar = sc.nextInt();
                    balok.setLebar(inputLebar);
                    System.out.print("Tinggi : ");
                    int inputTinggi = sc.nextInt();
                    balok.setTinggi(inputTinggi);
                    System.out.println("=".repeat(19));
                    balok.luasPermukaan();
                    balok.volume();
                    System.out.println("=".repeat(19));
                    continueOrBreak();
                    break;
                case 3:
                    System.out.println("=".repeat(4) + " SET NILAI " + "=".repeat(4));
                    Bola bola = new Bola();
                    System.out.print("Jari-jari : ");
                    int inputJariJari = sc.nextInt();
                    bola.setJariJari(inputJariJari);
                    System.out.println("=".repeat(19));
                    bola.luasPermukaan();
                    bola.volume();
                    System.out.println("=".repeat(19));
                    continueOrBreak();
                    break;
                case 4:
                    System.out.println("=".repeat(4) + " SET NILAI " + "=".repeat(4));
                    Tabung tabung = new Tabung();
                    System.out.print("Jari-jari : ");
                    inputJariJari = sc.nextInt();
                    tabung.setJariJari(inputJariJari);
                    System.out.print("Tinggi : ");
                    inputTinggi = sc.nextInt();
                    tabung.setTinggi(inputTinggi);
                    System.out.println("=".repeat(19));
                    tabung.luasPermukaan();
                    tabung.volume();
                    System.out.println("=".repeat(19));
                    continueOrBreak();
                    break;
                default:
                    System.out.println("Inputan yang anda masukkan salah! Mohon mencoba kembali!");
                    showBangunRuang();
            }
        } catch (InputMismatchException e) {
            System.out.println("Inputan yang anda masukkan salah! Mohon mencoba kembali!");
            showBangunRuang();
        }
    }
    private static void showBangunDatar(){
        System.out.println("=".repeat(4) + " BANGUN DATAR " + "=".repeat(4));
        System.out.println("Pilih opsi :");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Segitiga");
        System.out.println("5. Trapesium");
        System.out.print("> ");
        try {
            int selectBangunDatar = sc.nextInt();
            switch (selectBangunDatar) {
                case 1:
                    System.out.println("=".repeat(4) + " SET NILAI " + "=".repeat(4));
                    Persegi persegi = new Persegi();
                    System.out.print("Sisi : ");
                    int inputSisi = sc.nextInt();
                    persegi.setSisi(inputSisi);
                    System.out.println("=".repeat(19));
                    persegi.luas();
                    persegi.keliling();
                    System.out.println("=".repeat(19));
                    continueOrBreak();
                    break;
                case 2:
                    System.out.println("=".repeat(4) + " SET NILAI " + "=".repeat(4));
                    PersegiPanjang persegiPanjang = new PersegiPanjang();
                    System.out.print("Panjang : ");
                    int inputPanjang = sc.nextInt();
                    persegiPanjang.setPanjang(inputPanjang);
                    System.out.print("Lebar : ");
                    int inputLebar = sc.nextInt();
                    persegiPanjang.setLebar(inputLebar);
                    System.out.println("=".repeat(19));
                    persegiPanjang.luas();
                    persegiPanjang.keliling();
                    System.out.println("=".repeat(19));
                    continueOrBreak();
                    break;
                case 3:
                    System.out.println("=".repeat(4) + " SET NILAI " + "=".repeat(4));
                    Lingkaran lingkaran = new Lingkaran();
                    System.out.print("Jari-jari : ");
                    int inputJariJari = sc.nextInt();
                    lingkaran.setJariJari(inputJariJari);
                    System.out.println("=".repeat(19));
                    lingkaran.luas();
                    lingkaran.keliling();
                    System.out.println("=".repeat(19));
                    continueOrBreak();
                    break;
                case 4:
                    System.out.println("=".repeat(4) + " SET NILAI " + "=".repeat(4));
                    Segitiga segitiga = new Segitiga();
                    System.out.print("Alas : ");
                    int inputAlas = sc.nextInt();
                    segitiga.setAlas(inputAlas);
                    System.out.print("Tinggi : ");
                    int inputTinggi = sc.nextInt();
                    segitiga.setTinggi(inputTinggi);
                    System.out.println("=".repeat(19));
                    segitiga.luas();
                    segitiga.keliling();
                    System.out.println("=".repeat(19));
                    continueOrBreak();
                    break;
                case 5:
                    System.out.println("=".repeat(4) + " SET NILAI " + "=".repeat(4));
                    Trapesium trapesium = new Trapesium();
                    System.out.print("Alas : ");
                    inputAlas = sc.nextInt();
                    trapesium.setAlas(inputAlas);
                    System.out.print("Atas : ");
                    int inputAtas = sc.nextInt();
                    trapesium.setAlas(inputAtas);
                    System.out.print("Tinggi : ");
                    inputTinggi = sc.nextInt();
                    trapesium.setTinggi(inputTinggi);
                    System.out.print("Sisi Miring 1 : ");
                    int inputSisiMiring1 = sc.nextInt();
                    trapesium.setAlas(inputSisiMiring1);
                    System.out.print("Sisi Miring 2 : ");
                    int inputSisiMiring2 = sc.nextInt();
                    trapesium.setAlas(inputSisiMiring2);
                    System.out.println("=".repeat(19));
                    trapesium.luas();
                    trapesium.keliling();
                    System.out.println("=".repeat(19));
                    continueOrBreak();
                    break;
                default:
                    System.out.println("Inputan yang anda masukkan salah! Mohon mencoba kembali!");
                    showBangunRuang();
            }
        } catch (Exception e) {
            System.out.println("Inputan yang anda masukkan salah! Mohon mencoba kembali!");
            showBangunRuang();
        }
    }
    private static void continueOrBreak() {
        try {
            System.out.println("Kembali ke menu utama?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.print("> ");  
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    runApp();
                    break;
                case 2:
                    System.out.println("Sampai Jumpa Kembali!!!");
                    break;
                default:
                System.out.println("Inputan yang anda masukkan salah! Mohon mencoba kembali!");
                continueOrBreak();
            }
        } catch (InputMismatchException e) {
            System.out.println("Inputan yang anda masukkan salah! Mohon mencoba kembali!");
            continueOrBreak();
        }
    }
}