import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String film;
        System.out.println("Masukkan judul film : ");
        film = sc.nextLine().toLowerCase();

        StringBuilder filmBaru = new StringBuilder();

        for (String kata : film.split(" ")) {
            String kataBaru = kata.substring(0, 1).toUpperCase() + kata.substring(1);

            filmBaru.append(kataBaru).append(" ");
        }
        System.out.println(filmBaru); 
        

        sc.close();
    }
}
