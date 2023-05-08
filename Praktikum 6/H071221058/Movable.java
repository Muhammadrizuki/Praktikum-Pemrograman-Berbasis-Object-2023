package TUGAS.Pertemuan6;

// Abstract Class Dog for Menambahkan atribut dan constructor untuk class anakannya (Pitbull,SiberianHusky,Bulldog and German_Shepherd).
abstract class Dog {
    public int position;
    public int averageLength;
        
    Dog (int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }
    abstract void describe();
    
}

//Interface Movable Berfungsi untuk Methodnya di Override di Class yang Di Implementasikan (Smartphone and Car)
interface Movable {
    void move();  
}



class Pitbull extends Dog implements Movable {
    // Get Constructor dari Class Parent(Dog)
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }
    
    // Merubah nilai dari method move() yang ada di abstract class Dog
    @Override
    public void move() {
        position += 3;
    }

    // Merubah nilai dari method describe() yang ada di abstract class Dog
    @Override
    protected void describe() {
        System.out.println(cutLineString("Pitbull adalah ras anjing yang kuat dan berotot."));
    }
    private static String cutLineString(String str) {
        String[] temp = str.split(" ");
        String tempStr = "";
        for (int i = 0; i < temp.length; i++) {
            if ((i + 1) % 4 == 0) {
                tempStr += temp[i] + "\n";
            } else {
                tempStr += temp[i] + " ";
            }
        }
        return tempStr.trim();
    }
}

class Siberian_Husky extends Dog implements Movable {
    // Get Constructor dari Class Parent(Dog)
    public Siberian_Husky(int position, int averageLength) {
        super(position, averageLength);
    }
    
    // Merubah nilai dari method move() yang ada di abstract class Dog
    @Override
    public void move() {
        position += 2;
    }

    // Merubah nilai dari method describe() yang ada di abstract class Dog
    @Override
    protected void describe() {
        System.out.println(cutLineString("Siberian Husky adalah ras anjing yang pintar dan suka bekerja."));
    }
    private static String cutLineString(String str) {
        String[] temp = str.split(" ");
        String tempStr = "";
        for (int i = 0; i < temp.length; i++) {
            if ((i + 1) % 4 == 0) {
                tempStr += temp[i] + "\n";
            } else {
                tempStr += temp[i] + " ";
            }
        }
        return tempStr.trim();
    }
}

class Bulldog extends Dog implements Movable {
    // Get Constructor dari Class Parent(Dog)
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }
    
    // Merubah nilai dari method move() yang ada di abstract class Dog
    @Override
    public void move() {
        position += 1;
    }

    // Merubah nilai dari method describe() yang ada di abstract class Dog
    @Override
    protected void describe() {
        System.out.println(cutLineString("Bulldog adalah ras anjing yang pendek dan gemuk."));
    }
    private static String cutLineString(String str) {
        String[] temp = str.split(" ");
        String tempStr = "";
        for (int i = 0; i < temp.length; i++) {
            if ((i + 1) % 4 == 0) {
                tempStr += temp[i] + "\n";
            } else {
                tempStr += temp[i] + " ";
            }
        }
        return tempStr.trim();
    }
}

class German_Shepherd extends Dog implements Movable{
    // Get Constructor dari Class Parent(Dog)
    German_Shepherd(int position, int averageLength) {
        super(position, averageLength);
    }
    
    // Merubah nilai dari method move() yang ada di abstract class Dog
    @Override
    public void move() {
        position += 3;
    }
    
    // Merubah nilai dari method describe() yang ada di abstract class Dog
    @Override
    protected void describe() {
        System.out.println(cutLineString("German Shepherd adalah ras anjing yang cerdas dan taat."));
    }
    private static String cutLineString(String str) {
        String[] temp = str.split(" ");
        String tempStr = "";
        for (int i = 0; i < temp.length; i++) {
            if ((i + 1) % 4 == 0) {
                tempStr += temp[i] + "\n";
            } else {
                tempStr += temp[i] + " ";
            }
        }
        return tempStr.trim();
    }
}

class Smartphone implements Movable {
    public int price;
    public String brand;
    
    // Constructor For set price and brand Smartphone
    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }
    
    // Merubah Method move() yang ada di interface Movable
    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
    }

    public void showDetails() {
        System.out.println("Brand   : " + brand);
        System.out.println("Price   : " + price);
    }
}

class Car implements Movable {
    public int totalForwardGear;
    public String color;
    public int maxSpeed;
    
    // Constructor For set totalforwardgear, color, and maxSpeed CAR
    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    
    // Merubah Method move() yang ada di interface Movable
    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }

    public void showDetails() {
        System.out.println("Color           : " + color );
        System.out.println("Forward Gear    : " + totalForwardGear);
        System.out.println("Max Speed       : " + maxSpeed );
    }
}


class Main {
    public static void main(String[] args) {
        // Instances Dari Dog
        Dog pitbull         = new Pitbull(20, 80);
        Dog siberianHusky   = new Siberian_Husky(30, 60);
        Dog bulldog         = new Bulldog(40, 50);
        Dog germanShepherd  = new German_Shepherd(50, 70);

        // move The Dog
        ((Movable) pitbull).move();
        ((Movable) siberianHusky).move();
        ((Movable) bulldog).move();
        ((Movable) germanShepherd).move();
        
        // Output positions of the dog dan describe the dog
        System.out.println("=".repeat(15) + " DOG " + "=".repeat(15));
        System.out.println("1.PITBULL");
        System.out.println("> Pitbull Position            : " + pitbull.position);
        System.out.println("> Deskripsi Pitbull           : ");
        pitbull.describe();
        System.out.println();
        
        System.out.println("2.SIBERIAN HUSKY");
        System.out.println("> Siberian Husky Position     : " + siberianHusky.position);
        System.out.println("> Deskripsi Siberian Husky    : ");
        siberianHusky.describe();
        System.out.println();

        System.out.println("3.BULLDOG");
        System.out.println("> Bulldog Position            : " + bulldog.position);
        System.out.println("> Deskripsi Bulldog           :");
        bulldog.describe();
        System.out.println();

        System.out.println("4.GERMAN SHEPHERD");
        System.out.println("> German Shepherd Position    : " + germanShepherd.position);
        System.out.println("> Deskripsi German Shepherd   :");
        germanShepherd.describe();
        System.out.println();
        
        
        // Instance Smartphone Dan Car
        Smartphone smartphone = new Smartphone(32_000_000, "Iphone 14 Pro Max");
        Car car = new Car(6, "Grey", 500);

        // Move the Smartphone Dan Car
        System.out.println("=".repeat(9) + " Smartphone Move " + "=".repeat(9));
        smartphone.showDetails();
        System.out.print("> ");
        smartphone.move();
        System.out.println();

        System.out.println("=".repeat(13)+ " Car Move " + "=".repeat(12));
        car.showDetails();
        System.out.print("> ");
        car.move();
        System.out.println();
    }
}