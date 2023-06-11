public class Main {

    public static void main(String[] args) {

        Core kelvin = new Core("Kelvin", "Jl. Pegangsaan Timur 56", "081386444470", "Ketua Umum");
        Staff fail = new Staff("Fail", "Jl. Merdeka No. 5", "088888888888", "Web Development");

        kelvin.kerja();
        kelvin.jadibos();
        fail.kerja();
        fail.jadikaryawan();

    }

}