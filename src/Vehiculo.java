public class Vehiculo {

    //Propiedades
    private final String referencia;
    private final String velocidadMaxima;
    private final Color color;

    //constructor
    public Vehiculo(String referencia, String velocidadMaxima, Color color) {
        this.referencia = referencia;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
    }

    public Vehiculo(Vehiculo vehiculo){
        this.referencia = vehiculo.getReferencia();
        this.velocidadMaxima = vehiculo.getVelocidadMaxima();
        this.color = vehiculo.getColor();
    }

    //getters
    public String getReferencia() {
        return referencia;
    }

    public String getVelocidadMaxima() {
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
                " Color: " + color;
    }
}
