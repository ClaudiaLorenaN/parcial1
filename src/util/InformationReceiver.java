package util;
import model.*;
import model.Color;
import util.Menu;

import model.Boat;
import model.Car;
import model.Plane;
import model.Vehicle;

import java.awt.*;
import java.util.Scanner;

public class InformationReceiver {

    private static InformationReceiver instancia;

    private InformationReceiver(){

    }

    public static InformationReceiver getInstance(){
        if(instancia == null){
            instancia = new InformationReceiver();
        }
        return instancia;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static Vehicle createInformationVehicle(){
        System.out.println("Ingrese el color del vehiculo");
        int option = 0;
        Color color = null;

        do {
            Menu.menuColor();
            option = Validator.validateOption();
            color = chooseColor(option);

        }while (color ==null);

        System.out.println("Ingrese la referencia del vehiculo");
        String referencia = scanner.nextLine();
        double velocidadMaxima = Validator.validateDouble("Ingrese la velocidad máxima del vehiculo");
        return new Vehicle(referencia, velocidadMaxima, Color.NEGRO);

    }

    public static Plane createPlane(){
        System.out.println("Ingrese la información del avión");
        Vehicle vehicle = createInformationVehicle();
        double altitudMaxima = Validator.validateDouble("Ingrese la altitud máxima");
        return new Plane(vehicle, altitudMaxima);

    }

    public static Boat createBoat(){
        System.out.println("Ingrese la información del yate");
        Vehicle vehicle = createInformationVehicle();
        double pesoMaximo = Validator.validateDouble("Ingrese el peso máximo");
        return new Boat(vehicle, pesoMaximo);

    }

    public static Car createCar(){
        System.out.println("Ingrese la información del carro");
        Vehicle vehicle = createInformationVehicle();
        int numeroDePuertas = Validator.validateInt("Ingrese el numero de puertas");
        return new Car(vehicle,numeroDePuertas);
    }


    public static Vehicle chooseVehicle(int option){

        switch (option){
            case 1:
                return createPlane();
            case 2:
                return createBoat();
            case 3:
                return createCar();
            case 4:
                System.out.println("Saliendo de la opción de agregado");
                return null;
            default:
                System.out.println("Opción no válida");
                return null;
        }

    }



    public static Color chooseColor(int option){
        switch (option){
            case 1:
                return Color.NEGRO;
            case 2:
                return Color.BLANCO;
            case 3:
                return Color.AZUL;
            case 4:
                return Color.VERDE;
            case 5:
                return Color.GRIS;
            default:
                System.out.println("Opción no válida");
                return null;
        }
    }


}
