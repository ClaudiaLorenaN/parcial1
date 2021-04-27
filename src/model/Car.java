package model;

public class Car extends Vehicle {

    //propiedad
    private final int numeroDePuertas;

    //constructor
    public Car(String referencia, double velocidadMaxima, int numeroDePuertas, Color color) {
        super(referencia, velocidadMaxima, color);
        this.numeroDePuertas = numeroDePuertas;
    }

    public Car(Vehicle vehicle, int numeroDePuertas) {
        super(vehicle);
        this.numeroDePuertas = numeroDePuertas;
    }

    //getters
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    //sobreescritura toString
    @Override
    public String toString() {
        return super.toString() +
                " Número de puertas: " + numeroDePuertas;
    }
}
