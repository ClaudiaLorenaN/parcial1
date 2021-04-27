package model;

import util.Text;

public class Car extends Vehicle implements Cloneable{

    //propiedad
    private final int numberGates;

    //constructor
    public Car(String reference, double maximumSpeed, int numberGates, Color color) {
        super(reference, maximumSpeed, color);
        this.numberGates = numberGates;
    }

    public Car(Vehicle vehicle, int numberGates) {
        super(vehicle);
        this.numberGates = numberGates;
    }

    //getters
    public int getNumberGates() {
        return numberGates;
    }

    //sobreescritura toString
    @Override
    public String toString() {
        return super.toString() + " " +
                Text.NUMBER_GATES + ":" + " " + numberGates;
    }

    @Override
    protected Car clone() {
        return new Car(this, this.numberGates);
    }
}
