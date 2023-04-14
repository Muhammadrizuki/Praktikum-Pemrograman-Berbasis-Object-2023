package assignment2;

class Person {

    // atribut 
    private String nama;
    private int age;
    private boolean isMale;
    String universitas;

    //set -> instal code runner

    // method setter & getter utk memberi & mengambil nilai pd atribut
    public void setName(String name) {
        this.nama = name;                   // this -> perintah khusus utk mengakses object saat ini
    }                                       
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }
    public String getName()  {
        return nama;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        if (isMale == true) {
            return "Laki-laki";
        } else {
            return "Perempuan";
        }
    }
}

// class Nomor2 utk memanggil objek dan menjalankan program
public class Nomor2 {
    public static void main(String[] args) {
        
        // objek me dari class Person
        Person me = new Person();

        // isi atribut menggunakan set
        me.setName("Nurfadilah");
        me.setAge(18);
        me.setGender(true);

        // mencetak isi atribut menggunakan get
        System.out.println(me.getName());
        System.out.println(me.getAge());
        System.out.println(me.getGender());
    }
}
