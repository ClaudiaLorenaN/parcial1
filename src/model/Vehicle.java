package model;

public class Vehicle {

    //Propiedades
    private final String referencia;
    private final double velocidadMaxima;
    private final Color color;

    //constructor
    public Vehicle(String referencia, double velocidadMaxima, Color color) {
        this.referencia = referencia;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
    }

    public Vehicle(Vehicle vehicle){
        this.referencia = vehicle.getReferencia();
        this.velocidadMaxima = vehicle.getVelocidadMaxima();
        this.color = vehicle.getColor();
    }

    //getters
    public String getReferencia() {
        return referencia;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public Color getColor() {
        return color;
    }

    //sobreescritura toString
    @Override
    public String toString() {
        return "Referencia: " + referencia +
                " Velocidad Maxima: " + velocidadMaxima +
                " model.Color: " + color;
    }
}
