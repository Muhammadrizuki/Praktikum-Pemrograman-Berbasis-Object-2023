package no03;

import java.util.ArrayList;

public class Store {
    private String name;
    private ArrayList<String> products = new ArrayList<>();
    private ArrayList<Integer> productsPrice = new ArrayList<>();
    private ArrayList<Integer> productsStock = new ArrayList<>();
    private ArrayList<String> daftarProduk = new ArrayList<>();
    private ArrayList<String> productsName = new ArrayList<>();

    public ArrayList<String> getProductsName() {
        return productsName;
    }
    public String getProductsName(int index) {
        return productsName.get(index);
    }
    public void setProductsName(ArrayList<String> productsName) {
        this.productsName = productsName;
    }
    public void removeProductsName(int index) {
        for (int i = 0; i < productsName.size(); i++){
            if (this.productsStock.get(i) == 0){
                this.productsName.remove(index);
                this.productsStock.remove(index);
            }
        }
    }

    public Store(String name){
        this.name = name;
    }
    public Store(){
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getProducts(int index) {
        return products.get(index);
    }
    public ArrayList<String> getProducts() {
        return products;
    }
    public void setProducts(ArrayList<String> products) {
        this.products = products;
    }

    public ArrayList<String> getProductsPrice() {
        return products;
    }
    public int getProductsPrice(int index) {
        return productsPrice.get(index);
    }
    public void setProductsPrice(ArrayList<Integer> productsPrice) {
        this.productsPrice = productsPrice;
    }

    public ArrayList<Integer> getProductsStock() {
        return productsStock;
    }
    public void setProductsStock(ArrayList<Integer> productsStock) {
        this.productsStock = productsStock;
    }

    public ArrayList<String> getDaftarProduk() {
        return daftarProduk;
    }
    public void setDaftarProduk(ArrayList<String> daftarProduk) {
        this.daftarProduk = daftarProduk;
    }

    public void addProduct(String product){
        this.products.add(product);
    }
    public void addPrice(int priceInt){
        this.productsPrice.add(priceInt);
    }
    public void addStock(int stock){
        this.productsStock.add(stock);
    }
    public void addProductsName(String product){
        this.productsName.add(product);
    }

    public void listProduct(){
        for(int i = 0; i < this.products.size(); i++){
            System.out.println(i + 1 + ". " + this.products.get(i) + " - " + "$" + this.productsPrice.get(i) + " | " + "Stok " + this.productsStock.get(i));
        }
    }

    public void transactionProcess(User user, String product){
        for (int i = 0; i < this.products.size(); i++){
            if (product == this.products.get(i)){
                if (user.balance >= this.productsPrice.get(i)){
                    user.balance -= this.productsPrice.get(i);
                    int remainStock = this.productsStock.get(i);
                    remainStock -= 1;
                    this.productsStock.remove(i);
                    this.productsStock.add(i, remainStock);
                    if (this.productsStock.get(i) == 0){
                        this.products.remove(i);
                        this.productsPrice.remove(i);
                    }
                } else {
                    throw new Error("Saldo anda tidak cukup!!!");
                }
            }
        }
    }
}