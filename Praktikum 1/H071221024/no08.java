import java.util.Scanner;
public class no08 {
    public static void main(String[] args) {
        try {
            int notFind = 0;
            int lengthTotal = 0;
            int[][] nums = {
                {0, 1, 2, 3, 0},
                {4, 5, 6, 0},
                {7, 8, 9, 0}
            };
            Scanner sc = new Scanner(System.in);
            System.out.print("Find = ");
            int input = sc.nextInt();
            for (int i = 0; i < nums.length; i++) {
                lengthTotal += nums[i].length;
                for (int j = 0; j < nums[i].length; j++) {
                    if (input == nums[i][j]) {
                        System.out.println("Found " + input + " at " + "[" + i + "]" + "[" + j + "]");
                    } else if (input != nums[i][j]) {
                        notFind ++;
                    }
                }
            }
            if (notFind == lengthTotal) {
                System.out.println("Didn't found " + input);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("The input has to be a number");
        }
    }
}
