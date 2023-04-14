public class Person {
    
    // Assign atribut class
    String name;
    int age;
    boolean isMale;

    // Setter dan getter untuk atribut
    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    String getGender() {
        // Cond State untuk mengembalikan jenis kelamin
        if (isMale==true) {
            return "Laki-Laki";
        } else {
            return "Perempuan";
        }
    }

}
