public class Yate extends Vehiculo {

    //propiedad
    private final int pesoMaximo;

    //constructor
    public Yate(String referencia, String velocidadMaxima, int pesoMaximo, Color color) {
        super(referencia, velocidadMaxima, color);
        this.pesoMaximo = pesoMaximo;
    }

    public Yate(Vehiculo vehiculo, int pesoMaximo) {
        super(vehiculo);
        this.pesoMaximo = pesoMaximo;
    }

    //getters
    public int getPesoMaximo() {
        return pesoMaximo;
    }

    //sobreescritura toString
    @Override
    public String toString() {
        return super.toString() +
                " Peso máximo: " + pesoMaximo;
    }
}
