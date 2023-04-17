

    public class DataDiri {
        public static void main(String[] args) {
            Alamat alamat = new Alamat();
            alamat.jalan = "Bumi Tamalanrea Permai";
            alamat.kota = "Makassar";
    
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.alamat = alamat;
            mahasiswa.nama = "Mahendra Kirana M.B.";
            mahasiswa.nim = "H071221058";
    
            System.out.println("Nama    : " + mahasiswa.getNama());
            System.out.println("NIM     : " + mahasiswa.getNim());
            System.out.println("Alamat  : " + mahasiswa.getAlamat().getAlamatLengkap());
        }
        
    }

    class Alamat {
        String  jalan,
                kota;
        String getAlamat () {
            return this.jalan;
        }
        String getAlamatLengkap () {
            return this.jalan + ", " + this.kota;
        }
    }

    class Mahasiswa {
        String  nama,
                nim;

        Alamat alamat = new Alamat();
        String getNama () {
            return this.nama;
        }
        String getNim () {
            return this.nim;
        }
        
        String jalan;
        Mahasiswa getAlamat () {
            this.jalan = alamat.getAlamat();
            return this;
        }
        String getAlamatLengkap () {
            return this.jalan + ", " + alamat.kota;
        }
    }