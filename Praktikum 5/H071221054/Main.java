import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== HITUNG LUAS DAN KELILING ===");
            System.out.println("1. Bangun Datar");
            System.out.println("2. Bangun Ruang");
            System.out.println("3. Keluar");
            System.out.print("Pilih jenis bangun datar atau bangun ruang yang ingin dihitung (1-3): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("=== BANGUN DATAR ===");
                    System.out.println("1. Persegi");
                    System.out.println("2. Persegi Panjang");
                    System.out.println("3. Lingkaran");
                    System.out.println("4. Segitiga");
                    System.out.println("5. Trapesium");
                    System.out.print("Pilih bangun datar yang ingin dihitung (1-5): ");
                    int pilihanDatar = input.nextInt();
                    switch (pilihanDatar) {
                        case 1:
                            System.out.print("Masukkan panjang sisi: ");
                            double sisiPersegi = input.nextDouble();
                            Persegi persegi = new Persegi(sisiPersegi);
                            System.out.println("Luas: " + persegi.hitungLuas());
                            System.out.println("Keliling: " + persegi.hitungKeliling());
                            break;
                        case 2:
                            System.out.print("Masukkan panjang: ");
                            double panjangPersegiPanjang = input.nextDouble();
                            System.out.print("Masukkan lebar: ");
                            double lebarPersegiPanjang = input.nextDouble();
                            PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                            System.out.println("Luas: " + persegiPanjang.hitungLuas());
                            System.out.println("Keliling: " + persegiPanjang.hitungKeliling());
                            break;
                        case 3:
                            System.out.print("Masukkan jari-jari: ");
                            double jariJariLingkaran = input.nextDouble();
                            Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
                            System.out.println("Luas: " + lingkaran.hitungLuas());
                            System.out.println("Keliling: " + lingkaran.hitungKeliling());
                            break;
                        case 4:
                            System.out.print("Masukkan alas: ");
                            double alasSegitiga = input.nextDouble();
                            System.out.print("Masukkan tinggi: ");
                            double tinggiSegitiga = input.nextDouble();
                            Segitiga segitiga = new Segitiga(alasSegitiga, tinggiSegitiga);
                            System.out.println("Luas: " + segitiga.hitungLuas());
                            System.out.println("Keliling: " + segitiga.hitungKeliling());
                            break;
                        case 5:
                            System.out.print("Masukkan panjang sisi atas: ");
                            double sisiAtasTrapesium = input.nextDouble();
                            System.out.print("Masukkan panjang sisi bawah: ");
                            double sisiBawahTrapesium = input.nextDouble();
                            System.out.print("Masukkan tinggi: ");
                            double tinggiTrapesium = input.nextDouble();
                            Trapesium trapesium = new Trapesium(sisiAtasTrapesium, sisiBawahTrapesium, tinggiTrapesium);
                            System.out.println("Luas: " + trapesium.hitungLuas());
                            System.out.println("Keliling: " + trapesium.hitungKeliling());
                            break;
                        default:
                            System.out.println("Pilihan Bangun Datar Tidak Valid!");
                            break;
                    } 
                    break;

                case 2:
                    System.out.println("=== BANGUN RUANG ===");
                    System.out.println("1. Kubus");
                    System.out.println("2. Balok");
                    System.out.println("3. Tabung");
                    System.out.println("4. Bola");
                    System.out.print("Pilih bangun ruang yang ingin dihitung (1-4): ");
                    int pilihanRuang = input.nextInt();
                    switch (pilihanRuang) {
                        case 1:
                            System.out.print("Masukkan panjang sisi: ");  
                            double sisiKubus = input.nextDouble();
                            Kubus kubus = new Kubus(sisiKubus);
                            System.out.println("Luas: " + kubus.hitungLuas());
                            System.out.println("Keliling: " + kubus.hitungKeliling());
                            break;
                        case 2:
                            System.out.print("Masukkan panjang: ");
                            double panjangBalok = input.nextDouble();
                            System.out.print("Masukkan lebar: ");
                            double lebarBalok = input.nextDouble();
                            System.out.print("Masukkan tinggi: ");
                            double tinggiBalok = input.nextDouble();
                            Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                            System.out.println("Luas: " + balok.hitungLuas());
                            System.out.println("Keliling: " + balok.hitungKeliling());
                            break;
                        case 3:
                            System.out.print("Masukkan jari-jari: ");
                            double jariJariTabung = input.nextDouble();
                            System.out.print("Masukkan tinggi: ");
                            double tinggiTabung = input.nextDouble();
                            Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                            System.out.println("Luas: " + tabung.hitungLuas());
                            System.out.println("Keliling: " + tabung.hitungKeliling());
                            break;
                        case 4:
                            System.out.print("Masukkan jari-jari: ");
                            double jariJariBola = input.nextDouble();
                            Bola bola = new Bola(jariJariBola);
                            System.out.println("Luas: " + bola.hitungLuas());
                            System.out.println("Keliling: " + bola.hitungKeliling());
                            break;
                        default:
                            System.out.println("Pilihan Bangun Ruang Tidak Valid!");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Sampai Jumpa!");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid!");
                    break;
                }
            } while (pilihan != 3);
            
            input.close();
        }
    }
