package model;

import java.awt.*;

public class Plane extends Vehicle {

    //propiedad
    private final double altitudMaxima;

    //constructor
    public Plane(String referencia, double velocidadMaxima, double altitudMaxima, Color color) {
        super(referencia, velocidadMaxima, color);
        this.altitudMaxima = altitudMaxima;
    }

    public Plane(Vehicle vehicle, double altitudMaxima) {
        super(vehicle);
        this.altitudMaxima = altitudMaxima;
    }

    //getters
    public double getAltitudMaxima() {
        return altitudMaxima;
    }

    //sobreescritura toString
    @Override
    public String toString() {
        return super.toString() +
                " Altitud máxima: " + altitudMaxima;
    }
}
