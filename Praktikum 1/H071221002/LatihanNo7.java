public class LatihanNo7 {
    // Inisialisasi array dengan data buah
    // membuat member hanya bisa diakses oleh dari dalam class itu sendiri
    private static String[] data = {"apel", "jeruk", "mangga", "anggur", "pisang", "semangka", "durian"};

    public static int findIndex(String text) {
        // konversi text ke huruf kecil agar case-insensitive
        text = text.toLowerCase();

        // cari index text dalam array
        for (int i = 0; i < data.length; i++) {
        // equals membandingkan dua String berdasarkan kontennya.
            if (data[i].toLowerCase().equals(text)) {
                return i;
            }
        }

        // Jika text tidak ditemukan, kembalikan -1
        return -1;
    }

    public static void main(String[] args) {
        // digunakan untuk mencari posisi (index) pertama suatu string dalam string yang lain
        // Cari index text dalam array
        System.out.println("Index dari 'anggur': " + findIndex("Anggur"));
        System.out.println("Index dari 'mangga': " + findIndex("Mangga"));

        // Cari index text yang tidak ada dalam array
        System.out.println("Index dari 'apel hijau': " + findIndex("Apel hijau"));
    }
}


