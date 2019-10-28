package model;

public enum Dish {
    BORSHCH(30),
    CREAM_SOUP(35),
    MEAT(50),
    CHICKEN(40),
    FISH(70),
    SALAD(25),
    COFFEE(20),
    COCOA(20),
    DESERT(35);


    private int price;

    Dish(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
