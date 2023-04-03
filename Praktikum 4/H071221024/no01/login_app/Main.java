package login_app;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import login_app.models.Profile;
import login_app.models.User;
import login_app.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();     
    }

    private static void runApp() {
        // Menu Utama Aplikasi
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Leave");
        System.out.print("> ");
        // Menginput pilihan menu
        try {
            int selectMenu = sc.nextInt();
            sc.nextLine();
            switch (selectMenu) {
                case 1:
                    // Membuka Halaman Login
                    showLoginMenu();
                    break;
                case 2:
                    // Membuka Halaman Register
                    showRegisterMenu();
                case 3:
                    leaveProgram();
                default:
                    System.out.println("Inputan yang anda masukkan salah! Mohon mencoba kembali!");
                    // Mengulang Pemanggilan Menu Utama
                    runApp();
            }
        } catch (InputMismatchException e) {
            System.out.println("Inputan yang anda masukkan salah! Mohon mencoba kembali!");
            sc.nextLine();
            runApp();
        }
    }

    private static void showLoginMenu() {
        // Halaman Login
        System.out.println("-------------------------");
        System.out.println("Login");
        // Menginput Username dan Menyimpannya di attribute username;
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.next();
        // Membuat variabel userIndex yang mana nanti akan menampung index dari user
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            /*
             * TODO
             * Buatlah sebuah perkondisian (IF) yang akan
             * Mengecek apakah user index ke i dari listUser memiliki username yang sama
             * dengan username yang
             * diinput.
             * Jika ada ganti userIndex dengan Index dari User Tersebut, kemudian hentikan
             * perulangan
             */
            if (username.equals(listUser.get(i).getUsername())){
                userIndex = i;                                       //<---
                continue;                 
            }
        }
        // Saat userIndex tidak sama dengan -1 atau userIndexnya ditemukan
        if (userIndex != -1) {
                Boolean loop2 = true;
                while (loop2 == true){

                // Menginput Password
                System.out.println("Password");
                System.out.print("> ");
                String password = sc.next();
                /*
                * TODO
                * Mengecek apakah password dari User yang login berdasarkan username
                * sama dengan password yang diinput sebelumnya, kemudian simpan
                * hasilnya di variabel isPasswordMatch
                */
                String isPasswordMatch = null;
                if (password.equals(listUser.get(userIndex).getPassword())){            //<---
                    isPasswordMatch = password;
                }

                // Jika passwordnya sama maka berhasil login
                if (isPasswordMatch != null) {
                    System.out.println("Berhasil Login");
                    /*
                    * TODO
                    * panggil method showDetailUser dan kirimkan data Profile User yang login
                    * 
                    */
                    showDetailUser(listUserProfile.get(userIndex));    //<---
                    Boolean loop3 = true;
                    while (loop3 == true){
                        System.out.println("-".repeat(25));
                        System.out.println("Opsi Lanjutan :");
                        System.out.println("1. Logout");
                        System.out.println("2. Leave");
                        System.out.print("> ");
                        if (sc.hasNextInt()){
                            int option = sc.nextInt();
                            if (option == 1){
                                loop2 = false;
                                loop3 = false;
                                runApp();
                            } else if (option == 2){
                                System.out.println("Sampai Jumpa!!!");
                                System.exit(0);
                            } else {
                                System.out.println("Inputan yang anda masukkan salah! Mohon mencoba kembali!");
                            }
                        } else {
                            System.out.println("Inputan yang anda masukkan salah! Mohon mencoba kembali!");
                            sc.nextLine();
                        }
                    }
                } else {
                    // saat password salah akan menampikan password salah
                    System.out.println("Password Salah");
                    System.out.println("Mohon untuk menginput kembali!");
                    System.out.println("-------------------------");
                }
            }
        } else {
            System.out.println("Username yang anda masukkan tidak cocok!");
            System.out.println("Mohon untuk menginput kembali!");
            showLoginMenu();
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        // Menginput username dan password
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        if (username.equals("") || username.matches(" ++")){
            System.out.println("Username tidak valid! Mohon input data yang benar!");
            showRegisterMenu();
        }
        String password = "";
        boolean loop1 = true;
        while (loop1 == true){
            System.out.println("Password");
            System.out.print("> ");
            password = sc.nextLine();
            if (password.equals("") || password.matches(" ++")){
                System.out.println("Password tidak valid! Mohon input data yang benar!");
                System.out.println("-------------------------");
            } else if (password.length() < 8){
                System.out.println("Password harus memiliki minimal 8 karakter");
                System.out.println("-------------------------");
            } else {
                loop1 = false;
            }
        }
        /*
         * TODO
         * Buatlah atau Instance objek User baru, dan tambahkan
         * username dan password yang diinput sebelumnya secara langsung
         * saat instance User
         */
        User user = new User(username, password); //<---
        /*
         * TODO
         * Buatlah atau Instance objek Profile baru
         */
        Profile profile = new Profile(); //<---

        // Menginput Data Profile
        String fullName = "";
        while (fullName.equals("")){
            System.out.println("Nama Lengkap");
            System.out.print("> ");
            fullName = sc.nextLine();
            if (fullName.equals("") || fullName.matches(" ++")){
                fullName = "";
                System.out.println("Nama lengkap tidak valid! Mohon input data yang benar!");
                System.out.println("-------------------------");
            }
        }
        boolean loop4 = true;
        int age = 0;
        while (loop4 == true){
            System.out.println("Umur");
            System.out.print("> ");
            if (sc.hasNextInt()){
                age = sc.nextInt();
                sc.nextLine();
                if (age <= 0){
                    System.out.println("Umur tidak valid! Mohon input data yang benar!");
                    System.out.println("-------------------------");
                } else {
                    loop4 = false;
                }
            } else {
                System.out.println("Umur tidak valid! Mohon input data yang benar!");
                System.out.println("-------------------------");
                sc.nextLine();
            }
        }

        String hobby = "";
        while (hobby.equals("")){
            System.out.println("Hobby");
            System.out.print("> ");
            hobby = sc.nextLine();
            if (hobby.equals("") || hobby.matches(" ++")){
                hobby = "";
                System.out.println("Hobby tidak valid! Mohon input data yang benar!");
                System.out.println("-------------------------");
            }
        }

        /*
         * TODO
         * Berikan nilai fullName, age, dan hobby ke objek profile yang telah
         * di Instance sebelumnya. Nilai ini diperoleh dari data profile yang
         * diinput sebelumnya
         */
        profile.setFullName(fullName);
        profile.setAge(age);            //<---
        profile.setHobby(hobby);
        /*
         * TODO
         * Berikan nilai nickName ke objek profile,
         * Nilai ini diperoleh menggunakan static method yang dibuat di class
         * StringUtils, dengan mengirimkan fullName yang diinput sebelumnya
         */
        StringUtils.nickName(fullName, profile); //<---

        // Menambahkan user yang dibuat ke list user
        listUser.add(user);
        // Menambahkan profile user yang dibuat ke list profile
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        /*
         * TODO *
         * Tampilkan semua data profile user yang login
         */
        System.out.println("-".repeat(25));
        System.out.println("SELAMAT DATANG !!");
        System.out.println("-".repeat(25));
        System.out.println("Nama Lengkap    : " + profile.getFullName());   //<---
        System.out.println("Nama Panggilan  : " + profile.getNickName());  
        System.out.println("Umur            : " + profile.getAge());
        System.out.println("Hobby           : " + profile.getHobby());
    }
    private static void leaveProgram(){
        System.out.println("Sampai Jumpa!!!");
        System.exit(0);
    }
}