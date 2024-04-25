package Sweet;

public class Chocolate extends Sweet {
    private int cocoaContent;

    public Chocolate(String name, double weight, int cocoaContent) {
        super(name, weight);
        this.cocoaContent = cocoaContent;
    }

    // Getter for cocoaContent
    public int getCocoaContent() {
        return cocoaContent;
    }
}
