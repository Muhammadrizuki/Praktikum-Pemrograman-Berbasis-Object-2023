import java.util.Scanner;
public class no07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text : ");
        String input = sc.nextLine();
        findIndex(input);
        sc.close();
    }
    static void findIndex(String text) {
        String[] negara = {
            "Indonesia", "Malaysia", "Singapore", "Thailand", "Japan", "Korea"
        };
        String country;
        int canNotFound = 0;
        text = text.toLowerCase();
        for (int i = 0; i < negara.length; i++){
            country = negara[i].toLowerCase();
            if (text.equals(country)) {
                System.out.println("Index : " + i);
                break; 
            } else if (!text.equals(country)) {
                canNotFound += 1;
            } 
        }
        if (canNotFound == negara.length) {
            System.out.println("Index = " + -1);
        }
    }
}
