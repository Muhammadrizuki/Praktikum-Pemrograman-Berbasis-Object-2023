package Praktikum07.no03;

interface Food {
    int getPrice();
}

class Burger implements Food {
    private int price = 25000;

    @Override
    public int getPrice() {
        return this.price;
    }

}

class Pizza implements Food {
    private int price = 90000;

    @Override
    public int getPrice() {
        return this.price;
    }

}

class Steak implements Food {
    private int price = 35000;

    @Override
    public int getPrice() {
        return this.price;
    }

}
