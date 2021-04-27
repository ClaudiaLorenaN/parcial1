package model;

import util.Text;

public class Boat extends Vehicle implements Cloneable{

    //propiedad
    private final double maximumWeight;

    //constructor
    public Boat(String reference, double maximumSpeed, double maximumWeight, Color color) {
        super(reference, maximumSpeed, color);
        this.maximumWeight = maximumWeight;
    }

    public Boat(Vehicle vehicle, double maximumWeight) {
        super(vehicle);
        this.maximumWeight = maximumWeight;
    }

    //getters
    public double getMaximumWeight() {
        return maximumWeight;
    }

    //sobreescritura toString
    @Override
    public String toString() {
        return super.toString() +
                " " + Text.MAXIMUM_WEIGHT + ":" + " " + maximumWeight;
    }

    @Override
    protected Boat clone() {
        return new Boat(this, this.maximumWeight);
    }
}
