package Coffee_Shop;

abstract class CoffeeDecorator implements Coffee{
    protected Coffee coffee;
    protected String toppingName;
    protected double toppingCost;

    public CoffeeDecorator(Coffee coffee, String toppingName, double toppingCost) {
        this.coffee = coffee;
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    public double getCost(){
        return coffee.getCost() + toppingCost;
    }

    public String getDescription(){
        return coffee.getDescription() + ", " + toppingName;
    }
}


class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee, "Milk", 0.50);
    }
}

class Caramel extends CoffeeDecorator {
    public Caramel(Coffee coffee) {
        super(coffee, "Caramel", 0.75);
    }
}

class WhippedCream extends CoffeeDecorator {
    public WhippedCream(Coffee coffee) {
        super(coffee, "Whipped Cream", 0.60);
    }
}

class Chocolate extends CoffeeDecorator {
    public Chocolate(Coffee coffee) {
        super(coffee, "Chocolate", 0.80);
    }
}
