package Coffee_Shop;

public class CoffeeTypes implements Coffee{
    private final String name;
    private final double cost;

    public CoffeeTypes(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost(){
        return cost;
    }

    public String getDescription(){
        return name;
    }
}
