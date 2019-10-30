package votingSystem.model;

public enum Dish {
    BORSHCH("Borshch", 30),
    CREAM_SOUP("Cream soup",35),
    MEAT("Meat",50),
    CHICKEN("Chicken",40),
    FISH("Fish",70),
    SALAD("Salad",25),
    COFFEE("Coffee",20),
    COCOA("Cocoa",20),
    DESERT("Desert",35);


    private String name;
    private int price;

    Dish(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
