public class Person { 

    private String name;
    private int age;
    private boolean isMale;

    // ini Method Setter

    public void setName (String name) {
        this.name = name;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public void setGender (boolean isMale) {
        this.isMale = isMale;
    }

    // Ini Method Setter
    String getName() {
        return this.name;
    }
    int getAge() {
        return this.age;
    }
    boolean getGender() {
        return this.isMale;
    }

    public void person() {
        System.out.println("Name    : " + getName());
        System.out.println("Age     : " + getAge());
        System.out.println("isMale  : " + getGender());
    }
    }



