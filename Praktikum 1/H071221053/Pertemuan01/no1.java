import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        int nim;
        Scanner keyboard = new Scanner(System.in);     //in untuk pengimputan karena yg di input pake int 
        System.out.print("Masukkan akhiran NIM: ");
        nim = keyboard.nextInt();   //variabel keyboard untuk pengimputan , nextIn itu untuk kondisitipe data int
        if (nim % 7 == 0) {
            System.out.println("Soal: no 7"); } else   //if else kondisi 
        if (nim % 7 == 1) {
            System.out.println("Soal: no 1");} else 
        if (nim % 7 == 2) {
            System.out.println("Soal: no 2");} else 
        if (nim % 7 == 3) {
            System.out.println("Soal: no 3");} else
        if (nim % 7 == 4) {
            System.out.println("Soal: no 4");} else
        if (nim % 7 == 5) {
            System.out.println("Soal: no 5");} else
        if (nim % 7 == 6) {
            System.out.println("Soal: no 6");}
        keyboard.close();   //harus di close supaya tidak berjalan terus kode nya 
    }

}