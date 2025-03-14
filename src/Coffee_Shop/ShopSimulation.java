package Coffee_Shop;

import java.util.Scanner;

public class ShopSimulation {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Choose a coffee:  Espresso, Cappuccino, Latte, Americano");
        Coffee coffee = CoffeeFactory.createCoffee(in.next().toLowerCase());

        System.out.println("Do you want to add a topping(milk, caramel, whipped cream, chocolate)? Or type done to finish your order.");

        while (true){
            String ingridients = in.nextLine().toLowerCase();
            if(ingridients.equals("done")){
                break;
            }
            coffee = switch (ingridients){
                case "milk" -> new Milk(coffee);
                case "caramel" -> new Caramel(coffee);
                case "whipped cream" -> new WhippedCream(coffee);
                case "chocolate" -> new Chocolate(coffee);
                default -> { System.out.println("Unknown ingredient"); yield coffee; }
            };
        }

        System.out.println("Your order is: " + coffee.getDescription());
        System.out.println("Your total is: " + coffee.getCost());
    }
}
