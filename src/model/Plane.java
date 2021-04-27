package model;

import util.Text;

public class Plane extends Vehicle implements Cloneable{

    //propiedad
    private final double maximumAltitude;

    //constructor
    public Plane(String reference, double maximumSpeed, double maximumAltitude, Color color) {
        super(reference, maximumSpeed, color);
        this.maximumAltitude = maximumAltitude;
    }

    public Plane(Vehicle vehicle, double maximumAltitude) {
        super(vehicle);
        this.maximumAltitude = maximumAltitude;
    }

    //getters
    public double getMaximumAltitude() {
        return maximumAltitude;
    }

    //sobreescritura toString
    @Override
    public String toString() {
        return super.toString() + " " +
                Text.MAXIMUM_ALTITUDE + ":" + " " + maximumAltitude;
    }

    @Override
    protected Plane clone() {
        return new Plane(this, this.maximumAltitude);
    }
}
