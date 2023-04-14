class Snack {
    String merek;
    String rasa;
    int pembelian;
    double harga;
    
    public Snack() {
    }

    public Snack(String merek, String rasa, int pembelian, double harga) {
        this.merek = merek;
        this.rasa = rasa;
        this.pembelian = pembelian;
        this.harga = harga;
    }

    public Snack(String merek, String rasa, double harga) {
        this.merek = merek;
        this.rasa = rasa;
        this.pembelian = 2;
        this.harga = harga;
    }

    public String getMerekString() {
        return merek;
    }

    String getRasa() {
        return rasa;
    }

    int getPembelian() {
        return pembelian;
    }

    void detailSnack() {
        System.out.println("Merek Snack : " + merek);
        System.out.println("Rasa Snack : " + rasa);
        System.out.println("Pembelian : " + pembelian);
        System.out.println("Harga per item : " + harga);
    }

    public double HargaSnack() {
        return pembelian * harga;
    }

    public static void main(String[] args) {
        Snack snack1 = new Snack("Taro", "Rumput Laut", 2, 7000);
        Snack snack2 = new Snack("Maitos", "Jagung Bakar", 13000);

        snack1.detailSnack();
        System.out.println("Total harga:" + snack1.HargaSnack());
        System.out.println("-------------------------------------------------------");
        snack2.detailSnack();
        System.out.println("Total harga: " + snack2.HargaSnack());

    }
}