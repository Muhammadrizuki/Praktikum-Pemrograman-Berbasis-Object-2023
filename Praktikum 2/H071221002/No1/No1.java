public class No1 {

        public static void main(String[] args) {
            // membuat objek dari kelas Mobil
            Mobil mobilSaya = new Mobil();
            
            // mengisi nilai pada atribut mobilSaya
            mobilSaya.warna = "Merah";
            mobilSaya.merek = "Toyota";
            mobilSaya.tahunProduksi = 2021;
            
            // memanggil behavior info()
            mobilSaya.info();
        }
    
}
