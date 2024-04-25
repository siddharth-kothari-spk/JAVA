package Sweet;

public class Sweet {
    private String name;
    private double weight;

    public Sweet(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    // Getters for name and weight
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public static double getTotalWeight(Sweet[] sweets) {
        double totalWeight = 0;
        for (Sweet sweet : sweets) {
            totalWeight += sweet.getWeight();
        }
        return totalWeight;
    }

    public static void main(String[] args) {
        Chocolate choco1 = new Chocolate("Dark Chocolate", 50, 70);
        Chocolate choco2 = new Chocolate("Milk Chocolate", 30, 35);
        Candy candy1 = new Candy("Lollipop", 10, "Strawberry");
        Candy candy2 = new Candy("Gummy Bears", 20, "Mixed Fruit");

        Sweet[] gift = {choco1, choco2, candy1, candy2};
        double totalGiftWeight = getTotalWeight(gift);
        System.out.println("Total weight of the gift: " + totalGiftWeight + " grams");

    }
}




