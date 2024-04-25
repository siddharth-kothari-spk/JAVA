package Sweet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortByChoice {
    public static void main(String[] args) {
        ArrayList<Chocolate> chocolates = new ArrayList<>();
        // Add chocolate objects to the list
        Chocolate choco1 = new Chocolate("Dark Chocolate", 50, 70);
        Chocolate choco2 = new Chocolate("Milk Chocolate", 30, 35);
        Chocolate choco3 = new Chocolate("Caramel Chocolate", 40, 38);
        Chocolate choco4 = new Chocolate("Hazlenut Chocolate", 25, 53);

        chocolates.add(choco1);
        chocolates.add(choco2);
        chocolates.add(choco3);
        chocolates.add(choco4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sort by (1. Weight, 2. Cocoa Content): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            chocolates.sort((c1, c2) -> Double.compare(c1.getWeight(), c2.getWeight()));
        } else if (choice == 2) {
            chocolates.sort((c1, c2) -> Integer.compare(c2.getCocoaContent(), c1.getCocoaContent())); // Descending order for cocoa content
        } else {
            System.out.println("Invalid choice!");
        }

        System.out.println("Sorted chocolates:");
        for (Chocolate chocolate : chocolates) {
            System.out.println(chocolate.getName());
        }
    }
}

