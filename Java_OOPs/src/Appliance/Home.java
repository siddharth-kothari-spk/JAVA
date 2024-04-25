package Appliance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Home {
    private Appliance[] appliances;

    public Home(Appliance[] appliances) {
        this.appliances = appliances;
    }

    public int calculateCurrentLoad() {
        int totalConsumption = 0;
        for (Appliance appliance : appliances) {
            totalConsumption += appliance.getPowerConsumption();
        }
        return totalConsumption;
    }

    // Sort appliances by name (example)
    public void sortByNames() {
        Arrays.sort(appliances, (appliance1, appliance2) -> appliance1.getName().compareTo(appliance2.getName()));
    }

    // Alternative sorting by power consumption (uncomment to use)

    public void sortByPowerConsumption() {
        Arrays.sort(appliances, (appliance1, appliance2) -> appliance1.getPowerConsumption() - appliance2.getPowerConsumption());
    }


    public static void main(String[] args) {
        Appliance[] appliances = new Appliance[]{
                new Appliance("FAN", 1),
                new Appliance("Light", 2),
                new Appliance("TV", 3),
                new Appliance("Laptop", 4)
        };

        Home home = new Home(appliances);

        // Sort appliances by name (uncomment the chosen sort method)
        System.out.println("\nAppliances (sorted): by names");
        home.sortByNames();
        System.out.println("\nAppliances (sorted):");
        for (Appliance appliance : home.appliances) {
            System.out.println(appliance.getName() + ": " + appliance.getPowerConsumption() + " units");
        }

        System.out.println("\nAppliances (sorted): by power");
         home.sortByPowerConsumption();
        System.out.println("\nAppliances (sorted):");
        for (Appliance appliance : home.appliances) {
            System.out.println(appliance.getName() + ": " + appliance.getPowerConsumption() + " units");
        }

        System.out.println("Total Power Consumption: " + home.calculateCurrentLoad() + " units");


    }
}
