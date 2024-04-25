import java.util.ArrayList;

public class Pizza {

    private final String base;
    private ArrayList<String> toppings;

    public Pizza(String base, ArrayList<String> toppings) {
        this.base = base;
        this.toppings = toppings;
    }

    public double calculateCost() {
        double baseCost = getBaseCost(base);
        double toppingCost = calculateToppingCost(toppings);
        return baseCost + toppingCost;
    }

    private double getBaseCost(String base) {
        switch (base) {
            case "Standard":
                return 4.00;
            case "Soft":
                return 5.00;
            default:
                return 0.00; // Or throw an exception if invalid base is provided
        }
    }

    private double calculateToppingCost(ArrayList<String> toppings) {
        double toppingCost = 0.0;
        for (String topping : toppings) {
            toppingCost += 0.50;
        }
        return toppingCost;
    }

    public static void main(String[] args) {
        ArrayList<String> toppings = new ArrayList<>();
        toppings.add("Mushrooms");
        toppings.add("Corn");
        toppings.add("Spinach");

        Pizza pizza1 = new Pizza("Standard", toppings);
        System.out.println("Cost of pizza1: $" + pizza1.calculateCost());

        toppings.clear();
        Pizza pizza2 = new Pizza("Soft", toppings);
        System.out.println("Cost of pizza2: $" + pizza2.calculateCost());
    }
}

// Example usage


