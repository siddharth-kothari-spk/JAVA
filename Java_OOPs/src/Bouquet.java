import java.util.ArrayList;
import java.util.List;

class Flower {
    String name;
    double cost;

    public Flower(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
}

class Bouquet {
    List<Flower> flowers;

    public Bouquet() {
        flowers = new ArrayList<Flower>();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public double calculateCost() {
        double totalCost = 0;
        for (Flower flower : flowers) {
            totalCost += flower.cost;
        }
        return totalCost;
    }

    public static void main(String[] args) {
        // Create some flower objects
        Flower rose = new Flower("Rose", 1);
        Flower jasmine = new Flower("Jasmine", 2);
        Flower lily = new Flower("Lily", 3);

        // Create a bouquet object
        Bouquet bouquet = new Bouquet();

        // Add flowers to the bouquet
        bouquet.addFlower(rose);
        bouquet.addFlower(jasmine);
        bouquet.addFlower(lily);
        bouquet.addFlower(rose); // Add another rose

        // Calculate the cost of the bouquet
        double cost = bouquet.calculateCost();

        // Print the cost of the bouquet
        System.out.println("The cost of the bouquet is: $" + cost);
    }
}



