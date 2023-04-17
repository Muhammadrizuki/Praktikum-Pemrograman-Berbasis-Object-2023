public class Person {
    String name;
    int age;
    boolean isMale;
    //return untuk mengembalikan nilai atribut
    //method this untuk mengakses objek 
    //dan  menghindari kesalahan akses antara property dan argument method yang memiliki nama sama
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    // setGender untuk memperbarui nilai atribut yang ada
    public void setGender(boolean isMale){
        this.isMale =isMale;
    }
    //getGender untuk mengambil nilai atribut yang sudah diperbarui
    public String getGender(){
        return isMale ? "laki-laki":"perempuan"; 
    }   
}
