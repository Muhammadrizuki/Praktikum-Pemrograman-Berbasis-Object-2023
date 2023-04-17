import java.util.Scanner;

public class No5 {
    
    public static void main(String[] args) {
        
        // Deklarasi variabel
        String str, tgl, bln, thn;
        int tglint, blnint, thnint;

        Scanner scan = new Scanner(System.in);

        str = scan.nextLine();

        tgl = str.substring(0, 2);
        tglint = Integer.parseInt(tgl); // Mengubah tanggal untuk menangani 0 di depan 
        
        bln = str.substring(3, 5);
        blnint = Integer.parseInt(bln); // Mengubah nilai bulan ke int untuk dicocokkan

        // Switch case untuk mengubah bulan dari angka ke kata
        switch (blnint) {
            case 1:  bln = "Januari";
                break;
            case 2:  bln = "Februari";
                break;
            case 3:  bln = "Maret";
                break;
            case 4:  bln = "April";
                break;
            case 5:  bln = "Mei";
                break;
            case 6:  bln = "Juni";
                break;
            case 7:  bln = "Juli";
                break;
            case 8:  bln = "Agustus";
                break;
            case 9:  bln = "September";
                break;
            case 10: bln = "Oktober";
                break;
            case 11: bln = "November";
                break;
            case 12: bln = "Desember";
                break;
        }

        thn = str.substring(6, 8);
        thnint = Integer.parseInt(thn); // Mengubah nilai thn ke integer untuk dibandingkan dalam pengkondisian

        // Kondisi untuk melengkapi tahun
        if (thnint<=23) {
            thn = "20"+thn;
        } else {
            thn = "19"+thn;
        }

        System.out.printf("%s %s %s", tglint, bln, thn);

        scan.close();

    }

}
