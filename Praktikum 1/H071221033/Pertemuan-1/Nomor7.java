import java.util.Scanner;

public class Nomor7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        int index, x = 0;
        String cariBuah;

        String[] buah = {"duren", "cempedak", "kedondong", "mengkudu", "kesemek"};
        System.out.println("Input buah yang akan dicari = ");
        cariBuah = sc.nextLine();
        sc.close();

        for (index = 0; index < buah.length; index++) {
            if (buah[index].equalsIgnoreCase(cariBuah)) {             // indeks buah yg ada di array sama dengan buah yg diinput
                System.out.println("Buah yang dicari ada pada indeks ke = " + index);
                break;
            } else {
                x++;    // jika buah yg dicari tidak ada dalam array, masukkan ke x
            }      
        }
        if (x == buah.length) {             // jika x nya sama dengan panjang array,
            System.out.println("-1");    // print -1
        }
        
    }
}
// equalsIgnoreCase -> tidak mempedulikan kapital tidaknya