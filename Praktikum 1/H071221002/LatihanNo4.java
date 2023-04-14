import java.util.Scanner;

public class LatihanNo4 {


    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      System.out.print("Masukkan Judul Film : ");
      String kalimat = inp.nextLine();
      String[] kata = kalimat.split(" ");
      String kalimatBaru = "";
      for (int i = 0; i < kata.length; i++){
        kalimatBaru += kata[i].substring(1) + " ";
      }
      System.out.println("Kalimat setelah diubah: " + kalimatBaru.trim());
      inp.close();

    }
}
