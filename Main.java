import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ==== BANGUN RUANG ==== ");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.println("4. Tabung\n\n");
        System.out.println(" ==== BANGUN DATAR ==== ");
        System.out.println("5. Persegi");
        System.out.println("6. Persegi Panjang");
        System.out.println("7. Lingkaran");
        System.out.println("8. Segitiga");
        System.out.println("9. Trapesium");

        System.out.print("> ");
        int pilih = sc.nextInt();
        System.out.println(" ====================== ");
        switch(pilih){
            case 1 :
            Kubus kubus = new Kubus();  
            System.out.print("Masukkan panjang sisi : ");
            Double angka = sc.nextDouble();
            kubus.setSisi(angka);
            System.out.println("Luas Permukaan : " + kubus.hitungLuas());
            System.out.println("Volume         : " + kubus.hitungVolume());
            break ;

            case 2 :
            Balok balok = new Balok();
            System.out.print("Masukkan panjang balok : ");
            Double angka1 = sc.nextDouble();
            balok.setPanjang(angka1);

            System.out.print("Masukkan lebar balok  : ");
            Double angka2 = sc.nextDouble();
            balok.setLebar(angka2);

            System.out.print("Masukkan tinggi balok : ");
            Double angka3 = sc.nextDouble();
            balok.setTinggi(angka3);

            System.out.println("Luas Permukaan : " + balok.hitungLuas());
            System.out.println("Volume         : " + balok.hitungVolume());
            break ; 

            case 3 :
            Bola bola = new Bola();
            System.out.print("Masukkan jari-jari bola : ");
            Double angka4 = sc.nextDouble();
            bola.setJari(angka4);

            System.out.println("Luas Permukaan : " + bola.hitungLuas());
            System.out.println("Volume         : " + bola.hitungVolume());
            break ; 

            case 4:
            Tabung tabung = new Tabung();
            System.out.print("Masukkan jari-jari tabung : ");
            Double angka5 = sc.nextDouble();
            tabung.setJari(angka5);

            System.out.print("Masukkan tinggi tabung : ");
            Double angka6 = sc.nextDouble();
            tabung.setTinggi(angka6);

            System.out.println("Luas Permukaan : " + tabung.hitungLuas());
            System.out.println("Volume         : " + tabung.hitungVolume());
            break ; 

            case 5 :
            Persegi persegi = new Persegi();
            System.out.print("Masukkan panjang sisi : ");
            Double angka7 = sc.nextDouble();
            persegi.setSisi(angka7);

            System.out.println("Keliling : " + persegi.hitungKeliling());
            System.out.println("Luas     : " + persegi.hitungLuas());            
            break ; 

            case 6 :
            PersegiPanjang persegiPanjang = new PersegiPanjang();
            System.out.print("Masukkan panjang : ");
            Double angka8 = sc.nextDouble();
            persegiPanjang.setPanjang(angka8);

            System.out.print("Masukkan lebar : ");
            Double angka9 = sc.nextDouble();
            persegiPanjang.setLebar(angka9);

            System.out.println("Keliling : " + persegiPanjang.hitungKeliling());
            System.out.println("Luas     : " + persegiPanjang.hitungLuas());    
            break ; 

            case 7 :
            Lingkaran lingkaran = new Lingkaran();
            System.out.print("Masukkan jari-jari : ");
            Double angka10 = sc.nextDouble();
            lingkaran.setJari(angka10);

            System.out.println("Keliling : " + lingkaran.hitungKeliling());
            System.out.println("Luas     : " + lingkaran.hitungLuas());
            break ; 

            case 8 :
            Segitiga segitiga = new Segitiga();
            System.out.print("Masukkan alas : ");
            Double angka11 = sc.nextDouble();
            segitiga.setAlas(angka11);

            System.out.print("Masukkan sisi kiri : ");
            Double angka12 = sc.nextDouble();
            segitiga.setSisikiri(angka12);

            System.out.print("Masukkan sisi kanan : ");
            Double angka13 = sc.nextDouble();
            segitiga.setSisikanan(angka13);

            System.out.print("Masukkan tinggi : ");
            Double angka14 = sc.nextDouble();
            segitiga.setTinggi(angka14);

            System.out.println("Keliling : " + segitiga.hitungKeliling());
            System.out.println("Luas     : " + segitiga.hitungLuas());
            break ;

            case 9 :
            Trapesium trapesium = new Trapesium();
            System.out.print("Masukkan alas : ");
            Double angka15 = sc.nextDouble();
            trapesium.setAlas(angka15);

            System.out.print("Masukkan sisi miring : ");
            Double angka16 = sc.nextDouble();
            trapesium.setSisimiring(angka16);

            System.out.print("Masukkan atas : ");
            Double angka17 = sc.nextDouble();
            trapesium.setAtas(angka17);

            System.out.print("Masukkan tinggi : ");
            Double angka18 = sc.nextDouble();
            trapesium.setTinggi(angka18);

            System.out.println("Keliling : " + trapesium.hitungKeliling());
            System.out.println("Luas     : " + trapesium.hitungLuas());
            break ; 

            default :
            System.out.println("tidak ada dalam pilihan");
        }
    sc.close();
    }
}