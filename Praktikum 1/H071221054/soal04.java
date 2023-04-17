import java.util.Scanner;

public class soal04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kalimat ;

        System.out.println("Masukkan Judul Film : ");
        kalimat = input.nextLine();

        StringBuilder kalimatBaru = new StringBuilder();

        for (String kata : kalimat.split(" ")) {
            String kataBaru = kata.substring(0, 1).toUpperCase() +  kata.substring(1).toLowerCase();
            kalimatBaru.append(kataBaru).append(" ");
            
        }
        System.out.println(kalimatBaru);
        input.close();
    }
}
