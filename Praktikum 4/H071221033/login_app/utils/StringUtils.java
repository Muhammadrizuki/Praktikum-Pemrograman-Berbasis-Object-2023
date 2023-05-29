package login_app.utils;

public class StringUtils {

    // method static yg mengembalikan nickName berdasarkan fullName
    public static String getNickName(String fullName) {
        // array name berisi fullName
        // fullName akan dipisah menjadi beberapa bagian menggunakan spasi
        String[] name = fullName.split(" ");
        if (name.length == 1) {     // jika panjang array name = 1
            return fullName;        // return nilai fullName
        } else {                    // selain dri itu
            return name[1];         // return indeks 1 dri array name
        }
    }
    /*
     TODO
     * Buatlah sebuah method static yang akan
     * mengembalikan nickName berdasarkan fullName yang diberikan
     * aturan pembuatan nickName adalah :
     * 1. Jika fullName hanya 1 kata maka nickName = fullName
     * (ex: FullName = Agus, maka NickName = Agus)
     * 2. Jika fullName lebih dari 1 kata maka nickName adalah kata kedua dari
     * fullName
     * (ex: FullName = Eurico Devon, maka NickName = Devon)
     */
}
