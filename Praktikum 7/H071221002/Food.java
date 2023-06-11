package assignment7;

interface Food {
    int getPrice();
}

class Burger implements Food{
    private int price = 5000;

    @Override
    public int getPrice(){
        return price;
    }
}


class Pizza implements Food{
    private int price = 7000;

    @Override
    public int getPrice(){
        return price;
    }
}


class Steak implements Food{
    private int price = 10000;

    @Override
    public int getPrice(){
        return price;
    }
}
