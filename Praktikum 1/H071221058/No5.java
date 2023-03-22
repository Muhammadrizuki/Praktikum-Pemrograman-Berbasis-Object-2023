package Lab.Pertemuan1.Tugas;

import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();

        String tanggal = a.substring(0,2);
        System.out.print(Integer.parseInt(tanggal));

        String bulan = a.substring(3,5);
        int month =Integer.parseInt(bulan);

        if (month == 1) {
            System.out.print(" Januari"); 
        } else if (month == 2) {
            System.out.print(" Februari");
        } else if (month == 3) {
            System.out.print(" Maret");
        } else if (month == 4) {
            System.out.print(" April");
        } else if (month == 5) {
            System.out.print(" Mei");
        } else if (month == 6) {
            System.out.print(" Juni");
        } else if (month == 7) {
            System.out.print(" Juli");
        } else if (month == 8) {
            System.out.print(" Agustus");
        } else if (month == 9) {
            System.out.print(" September");
        } else if (month == 10){
            System.out.print(" Oktober");
        } else if (month == 11){
            System.out.print(" November");
        } else if (month == 12){
            System.out.print(" Desemeber");
        }

        String tahun = a.substring(6,8);
        int year = Integer.parseInt(tahun);

        if (year <= 23) {
            System.out.println(" 20" + tahun);
        } else {
                System.out.println(" 19" + tahun);
        }
        input.close();
        }
        
        
    }
    

