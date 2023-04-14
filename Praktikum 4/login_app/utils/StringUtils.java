package login_app.utils;

import java.lang.reflect.Array;

public class StringUtils {
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
    public static String toNick (String nl) {
        String[] listnama = nl.split(" ");
        String nick = null;
        if (listnama.length==1) {
            nick = nl;
        } else if (listnama.length>1) {
            nick = listnama[1];
        }
        return nick;
    }
}
