public class Alamat {
    String jalan;
        String kota;
        
        // mengambil nilai  method alamat lengkap  
        // dan mengembalikan nilai hasil concat antara nilai method getjalan dan getkota
        public String getAlamatLengkap(){
            return getJalan() + ", " + getKota();
        }
        // setter untuk menambahkan nilai baru pada atribut
        // getter untuk mengambil nilai yang sudah diperbarui
        public void setJalan(String jalan){
            this.jalan = jalan;
        }
        public String getJalan(){
            return jalan;
        }
        public void setKota(String kota){
            this.kota = kota;
        }
        public String getKota(){
            return kota;
        }    
}
