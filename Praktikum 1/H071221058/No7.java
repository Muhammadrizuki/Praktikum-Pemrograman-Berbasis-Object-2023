package Lab.Pertemuan1.Tugas;

import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        String animals[] = {"ayam", "kuda", "sapi", "ardi"};
        Scanner sc = new Scanner(System.in);
        String taman = sc.nextLine();
        int kebun = findIndex(taman,animals);
        System.out.println(kebun);
        sc.close();
}
    public static int findIndex(String teks,String[]animals) {
        for (int i = 0; i < animals.length; i+=1)   {
            if (animals[i].equalsIgnoreCase(teks)) {
                return i ;   
            }
                                                    }
        return -1;
                                                    }
            }   




