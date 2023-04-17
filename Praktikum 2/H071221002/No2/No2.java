public class No2 {
    
    
    public static void main(String[] args) {
        Person person = new Person();
        
        //menambahkan nilai pada masing-masing atribut
        person.setName("Ardika");
        person.setAge(18);
        person.setGender(false);
        
        //mengambil nilai dari method yang sudah diset nilai atributnya
        System.out.println("\nNama saya "+ person.getName());
        System.out.println("Saya berumur " + person.getAge());
        System.out.println("Dan saya seorang " + person.getGender());
    }
}

    
