import java.util.Scanner;

public class No4 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String kalimat = scan.nextLine();

        No4.cap(kalimat);

        scan.close();

    }

    static void cap(String kalimat) {

        String[] lis = kalimat.split(" "); // Membagi kalimat yang telah diinput dengan spasi

        // For each untuk mengambil huruf pertama dan dijadikan huruf kapital dan huruf selanjutnya menjadi tidak kapital dalam 1 kata
        for (String i : lis) {
            String first = (i.substring(0, 1)).toUpperCase();
            String rest = (i.substring(1, i.length())).toLowerCase();

            System.out.print(first+rest + " ");
        }

    }

}

// paDa HarI MingGu Ku turuT aYaH kE koTa