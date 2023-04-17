package No1;

public class Main {
        
    public static void main(String[] args) {
        
        MalingSendal kelvin = new MalingSendal("Kelvin");
        MalingSendal fail = new MalingSendal("Fail", 10, 2);

        kelvin.curi(3, fail);
        kelvin.getStatus();
        fail.getStatus();

        System.out.println("===================");

        fail.lapor(kelvin);
        fail.lapor(kelvin);
        fail.lapor(kelvin);
        fail.lapor(kelvin);
        fail.lapor(kelvin);
        fail.lapor(kelvin);

        kelvin.getStatus();
        fail.getStatus();

        fail.curi(3, kelvin);
        kelvin.getStatus();
        fail.getStatus();

    }

}