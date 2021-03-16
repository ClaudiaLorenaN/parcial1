import java.util.Locale;
import java.util.Scanner;

public class RecibidorDeInformacion {
    private final Scanner scanner = new Scanner(System.in);


    public void recibirInformacion(){
        Avion avion = ingresarInformacionAvion();
        Yate yate =  ingresarInformacionYate();
        Carro carro = ingresarInformacionCarro();
    }

    public Avion ingresarInformacionAvion(){
        System.out.println("Ingrese la información del avión");
        Vehiculo vehiculo = ingresarInformacionVehiculo();
        System.out.println("Ingrese la altitud máxima");
        String altitudMaxima = scanner.nextLine();
        return new Avion(vehiculo, altitudMaxima);

    }

    public Yate ingresarInformacionYate(){
        System.out.println("Ingrese la información del yate");
        Vehiculo vehiculo = ingresarInformacionVehiculo();
        System.out.println("Ingrese el peso máximo");
        int pesoMaximo = scanner.nextInt();
        scanner.nextLine();
        return new Yate(vehiculo, pesoMaximo);

    }

    public Carro ingresarInformacionCarro(){
        System.out.println("Ingrese la información del carro");
        Vehiculo vehiculo = ingresarInformacionVehiculo();
        System.out.println("Ingrese el numero de puertas");
        int numeroDePuertas = scanner.nextInt();
        scanner.nextLine();
        return new Carro(vehiculo,numeroDePuertas);
    }

    public Vehiculo ingresarInformacionVehiculo(){
        System.out.println("Ingrese la referencia");
        String referencia = scanner.nextLine();
        System.out.println("Ingrese la velocidad máxima");
        String velocidadMaxima = scanner.nextLine();

        Color color = Color.AZUL;

        try{
            System.out.println("Ingrese el color");
            color = Color.valueOf(scanner.nextLine().toUpperCase());
        }catch (IllegalArgumentException e){
            System.out.println("Solo se aceptan los colores: blanco, negro, gris, azul y verde " + e.getMessage()+ " Ocurrio la excepción IllegalArgumentException");
        }
        return new Vehiculo(referencia, velocidadMaxima, color);


    }


}
