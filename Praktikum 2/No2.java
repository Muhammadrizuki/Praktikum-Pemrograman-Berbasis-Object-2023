class Person {
    String name; //atribut 
    int age;
    boolean isMale; 

    public void setName (String nama){    //memthodd set name digunakan untuk mengatur nilai dari atribut name
        this.name = nama; 
    }
    public String getName () { //untuk mendapatkan nilai dari atribut name
        return name;
    }
    public void setAge (int age) {  //method setage digunakan untuk mengatur nilai dari atribut age
        this.age = age; 
    }
    public int getAge () { //untuk mendapatkan nilai dari atribut age 
        return age;
    }
    public void setGender (boolean gender) {   //digunakan u/mengatur jenis kelamin dengan menerima parameter sebuah string gender 
        this.isMale = gender ;  //mengubah nilai ismale menjadi true jika gender sm dengan male dan false jika tidak
    }
    public String getGender (){  //mendapatkan nilai jenis kelamin dalam bentuk string dengan memeriksa nilai atribut isMale
        if (isMale == true ) {
            return "male";
        }
        else {
            return "female";
        }

    }
}

public class No2{
    public static void main(String[] args) {
        Person orang = new Person ();
        orang.setName("Diva");
        orang.setAge(19);
        orang.setGender(false);

        System.out.println("Nama: " + orang.getName());
        System.out.println("Umur: " + orang.getAge());
        System.out.println("Jenis kelamin: " + orang.getGender());
    }
}

