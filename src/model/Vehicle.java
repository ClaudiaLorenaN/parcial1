package model;

import util.Text;

public class Vehicle{

    //Propiedades
    private final String reference;
    private final double maximumSpeed;
    private final Color color;

    //constructor
    public Vehicle(String reference, double maximumSpeed, Color color) {
        this.reference = reference;
        this.maximumSpeed = maximumSpeed;
        this.color = color;
    }

    public Vehicle(Vehicle vehicle){
        this.reference = vehicle.getReference();
        this.maximumSpeed = vehicle.getMaximumSpeed();
        this.color = vehicle.getColor();
    }

    //getters
    public String getReference() {
        return reference;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public Color getColor() {
        return color;
    }

    //sobreescritura toString
    @Override
    public String toString() {
        return Text.REFERENCE + ":" + " " + reference +
                " " + Text.MAXIMUM_SPEED + ":" + " " +maximumSpeed +
                " " + Text.COLOR + ":" + " " + color;
    }

    public static VehicleBuilder builder(){
        return new VehicleBuilder();
    }

    public static class VehicleBuilder{
        private String reference;
        private double maximumSpeed;
        private Color color;

        public VehicleBuilder reference(String referencia){
            this.reference = referencia;
            return this;
        }

        public VehicleBuilder maximumSpeed(double velocidadMaxima){
            this.maximumSpeed = velocidadMaxima;
            return this;
        }

        public VehicleBuilder color(Color color){
            this.color = color;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(reference, maximumSpeed,color);
        }

    }
}
