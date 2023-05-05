class Makeup {
    //atribut
    String nama;
    String jenis;
    int harga;
    Shade shade  ;
    String User;

    
    //behavior 
    public void nama () {
    System.out.println("Nama produk :" + nama);
    }

    public void pakai(Makeup makeup) {
        this.User = "Diva";

        System.out.println(makeup.nama + " Produk ini dipakai oleh " + User);
    }

    
    
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Shade getShade() {
        return shade;
    }

    public void setShade (Shade shade) {
        this.shade = shade;
    }

    //constructor
    public Makeup (String nama, String jenis ) {
        this.nama = nama; 
        this.jenis = jenis;
        this.harga = 10000;
    }

    public Makeup (String nama, String jenis, int harga) {
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
    }
    
}

class Shade {
    String shade;
    int nomor;

    public String getFullShade () {
        return  shade + "," + nomor;
    }

    public String getShade() {
        return shade;
    }


    public void setShade(String shade) {
        this.shade = shade;
    }


    public int getNomor() {
        return nomor;
    }


    public void setNomor (int nomor) {
        this.nomor = nomor;
    }

}


public class No1 {
    public static void main(String[] args) {
        Shade shade = new Shade();
        shade.shade = "Buttercream";
        shade.nomor = 04;

        Makeup makeup = new Makeup("Luxcrime","Cushion");
        Makeup makeup2 = new Makeup("Berenbliss" , "Lipcream");
        makeup.shade = shade ;
        makeup.harga = 120000;

        System.out.println("Nama produk\t\t:" + makeup.nama);
        System.out.println("Jenis produk\t\t:" + makeup.jenis);
        System.out.println("Harga Produk\t\t:" + makeup.getHarga());
        System.out.println("Stok produk\t\t:" + makeup.getShade().getFullShade());
        makeup.pakai(makeup2);
        }
    }


    
    
    
    
    

