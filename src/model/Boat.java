package model;

public class Boat extends Vehicle {

    //propiedad
    private final double pesoMaximo;

    //constructor
    public Boat(String referencia, double velocidadMaxima, double pesoMaximo, Color color) {
        super(referencia, velocidadMaxima, color);
        this.pesoMaximo = pesoMaximo;
    }

    public Boat(Vehicle vehicle, double pesoMaximo) {
        super(vehicle);
        this.pesoMaximo = pesoMaximo;
    }

    //getters
    public double getPesoMaximo() {
        return pesoMaximo;
    }

    //sobreescritura toString
    @Override
    public String toString() {
        return super.toString() +
                " Peso máximo: " + pesoMaximo;
    }
}
