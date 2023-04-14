package no02;
public class Person {
    String name;
    int age;
    boolean isMale;

    void setName(String setName){
        this.name = setName;
    }
    String getName(){
        return name;
    }
    void setAge(int setAge){
        this.age = setAge;
    }
    int getAge(){
        return age;
    }
    void setGender(Boolean setGender){
        this.isMale = setGender;
    }
    String getGender(){
        if (isMale == true) {
            return "Male";
        }
        return "Female";
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Rasyad");
        person1.setAge(19);
        person1.setGender(false);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getGender());
    }
}
