package No3;

public class Store {
    
    // inisialisai atribut
    private String name;
    private Product[] products, rtproducts;

    public Store(String name) {
        this.name = name;
    }

    void addproduct(Product ... products){
        this.products = new Product[products.length];
        for (int i=0; i<products.length; i++){
            if (products[i].getStock()>0){
                this.products[i] = products[i];
            } else {
                this.products[i] = null;
            }
        }
    }

    void showproduct() {
        int d = 1;
        int e = 0;
        // try {
            for (Product i : this.products) {
                if (i!=null) {
                    System.out.printf("%d. %s - $%d | stock %d %n", d, i.getName(), i.getPrice(), i.getStock());
                    d++;
                } else {
                    continue;
                }
            }
            this.rtproducts = new Product[d-1];
            for (Product j : this.products) {
                if (j!=null) {
                    this.rtproducts[e] = j;
                    e++;
                } else {
                    continue;
                }
            }
        if (this.rtproducts.length==0) {
            System.out.println("Tidak ada produk");
        }
    }

    void showgreet() {
        System.out.printf("Selamat Datang di %s %n", this.name);
        System.out.println("Daftar Produk:");
        this.showproduct();
        System.out.println("0. Keluar");
    }

    void conf(int c) {
        System.out.println("Apakah anda yakin ingin membeli:");
        System.out.printf("%s, dengan Harga $%d %n", this.rtproducts[c-1].getName(), this.rtproducts[c-1].getPrice());
        System.out.println("1. Konfirmasi");
        System.out.println("2. Batal");
    }

    void trans(User user, int p) {
        p -=1;

        if (this.rtproducts[p].getPrice()<=user.getBalance()){
            user.setBalance(user.getBalance() - this.rtproducts[p].getPrice());
            this.rtproducts[p].setStock(this.rtproducts[p].getStock() - 1);
            System.out.printf("Anda berhasil membeli %s %n", this.rtproducts[p].getName());
            System.out.println("Apakah anda ingin melanjutkan transaksi?");
            System.out.println("1. Iya");
            System.out.println("2. Tidak");
        } else {
            System.out.println("Uang anda tidak cukup.");
            System.out.printf("Anda gagal membeli %s %n", this.rtproducts[p].getName());
            System.out.println("Apakah anda ingin melanjutkan transaksi?");
            System.out.println("1. Iya");
            System.out.println("2. Tidak");
        }
    }

}
