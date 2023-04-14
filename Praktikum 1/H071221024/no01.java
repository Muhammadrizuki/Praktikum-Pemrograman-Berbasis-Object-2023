import java.util.Scanner;
public class no01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NIM : ");
        String nim = sc.nextLine();
        pembagianSoal(nim);
        sc.close();
    }
    static void pembagianSoal(String nim) {
        int tigaNimTerakhir = Integer.parseInt(nim.substring(nim.length() - 3));
        int questionNumber = 0;
        switch (tigaNimTerakhir % 7) {
            case 1:
                questionNumber = 1;
                break;
            case 2:
                questionNumber = 2;
                break;
            case 3:
                questionNumber = 3;
                break;
            case 4:
                questionNumber = 4;
                break;
            case 5:
                questionNumber = 5;
                break;
            case 6:
                questionNumber = 6;
                break;
            case 0:
                questionNumber = 7;
                break;
        }
        System.out.println("No : " + questionNumber);
    }
}