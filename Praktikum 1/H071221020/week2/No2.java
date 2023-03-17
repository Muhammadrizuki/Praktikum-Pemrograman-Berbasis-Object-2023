public class No2 {
    
    public static void main(String[] args) {
        
        // Membuat objek dari class Person
        Person p = new Person();

        // Assign nilai dari setiap atribut
        p.setName("Kelvin");
        p.setAge(18);
        p.setGender(true);

        System.out.printf("saya %s, umur %d, saya seorang %s", p.getName(), p.getAge(), p.getGender());

    }

}
