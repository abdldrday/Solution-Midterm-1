package Coffee_Shop;

public class CoffeeFactory {
    public static Coffee createCoffee(String type){
        return switch (type){
            case "espresso" -> new CoffeeTypes("Espresso", 2.00);
            case "cappuccino" -> new CoffeeTypes("Cappuccino", 3.00);
            case "latte" -> new CoffeeTypes("Latte", 3.50);
            case "americano" -> new CoffeeTypes("Americano", 2.50);
            default -> throw new IllegalArgumentException("Unknown coffee type");
        };
    }
}
