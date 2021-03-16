public class Carro extends Vehiculo {

    //propiedad
    private final int numeroDePuertas;

    //constructor
    public Carro(String referencia, String velocidadMaxima, int numeroDePuertas, Color color) {
        super(referencia, velocidadMaxima, color);
        this.numeroDePuertas = numeroDePuertas;
    }

    public Carro(Vehiculo vehiculo, int numeroDePuertas) {
        super(vehiculo);
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
