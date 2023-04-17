class Makeup {
    String merk  ; //atribut
    String warna ;
    int harga ;

    public String getMerk () {   //method
        return merk;
    }
    public String getWarna () {
        return warna;
    }
    public int getHarga () {
        return harga;
    }
}

public class No1  { 
    public static void main(String[] args) { //main nya
        Makeup ip = new Makeup ();
        ip.merk  = "Luxcrime";
        ip.warna = "Hijau";
        ip.harga = 50000;

        System.out.println("Merk Makeup: " + ip.getMerk());
        System.out.println("Warna Makeup: " + ip.getWarna());
        System.out.println("Harga Makeup: " + ip.getHarga());
     
    }
}