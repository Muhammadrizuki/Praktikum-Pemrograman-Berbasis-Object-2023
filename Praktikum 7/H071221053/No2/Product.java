package No2;

public class Product <T> {  //generic type untuk membuat kls interface atau method yg dpt mnerima argumen tipe data yg berbeda2
    protected String nama;
    protected T harga;
    protected String expire;
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public T getHarga() {
        return harga;
    }
    public void setHarga(T harga) {
        this.harga = harga;
    }
    public String getExpire() {
        return expire;
    }
    public void setExpire(String expire) {
        this.expire = expire;
    }
    public Product(String nama, T harga, String expire) {
        this.nama = nama;
        this.harga = harga;
        this.expire = expire;
    }   
}

