package login_app.utils;

import login_app.models.Profile;

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
    public static void nickName(String fullName, Profile profile){
        String[] fullNameSplit = fullName.split(" ");
        if (fullNameSplit.length == 1){
            profile.setNickName(fullName);                          //<---
        }else {
            profile.setNickName(fullNameSplit[1]);
        }
    }
}
