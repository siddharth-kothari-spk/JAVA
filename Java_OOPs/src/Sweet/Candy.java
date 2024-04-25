package Sweet;

public class Candy extends Sweet {
    private String flavor;

    public Candy(String name, double weight, String flavor) {
        super(name, weight);
        this.flavor = flavor;
    }

    // Getter for flavor
    public String getFlavor() {
        return flavor;
    }
}

