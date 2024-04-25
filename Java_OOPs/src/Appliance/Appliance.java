package Appliance;

public class Appliance {
    private String name;
    private int powerConsumption;

    public Appliance(String name, int powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
    }

    public String getName() {
        return name;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }
}

