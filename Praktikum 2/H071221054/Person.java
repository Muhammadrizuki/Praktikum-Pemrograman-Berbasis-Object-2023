// SOAL NO 2

class Person {
    public String name;
    public int age;
    public boolean isMale;

    
    public void setName(String Name) {
        this.name = Name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int Age) {
        this.age = Age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(boolean Male) {
        this.isMale = Male;
    }

    public String getGender() {
        return isMale ? "Male" : "Female";
    }
    public static void main(String[] args) {
        Person person1 = new Person ();
        person1.setName("Acha");
        person1.setAge(18);
        person1.setGender(true);

        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Gender: " + person1.getGender());

    }
}
