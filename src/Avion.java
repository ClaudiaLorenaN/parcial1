public class Avion extends Vehiculo {

    //propiedad
    private final String altitudMaxima;

    //constructor
    public Avion(String referencia, String velocidadMaxima, String altitudMaxima, Color color) {
        super(referencia, velocidadMaxima, color);
        this.altitudMaxima = altitudMaxima;
    }

    public Avion(Vehiculo vehiculo, String altitudMaxima) {
        super(vehiculo);
        this.altitudMaxima = altitudMaxima;
    }

    //getters
    public String getAltitudMaxima() {
        return altitudMaxima;
    }

    //sobreescritura toString
    @Override
    public String toString() {
        return super.toString() +
                " Altitud máxima: " + altitudMaxima;
    }
}
