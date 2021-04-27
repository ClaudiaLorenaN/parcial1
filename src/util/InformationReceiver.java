package util;
import model.Color;

import model.Boat;
import model.Car;
import model.Plane;
import model.Vehicle;

import java.util.Scanner;

public class InformationReceiver {

    private static InformationReceiver instance;

    private InformationReceiver(){

    }

    public static InformationReceiver getInstance(){
        if(instance == null){
            instance = new InformationReceiver();
        }
        return instance;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static Vehicle createInformationVehicle(){
        System.out.println(Text.ADD_COLOR_VEHICLE);
        int option = 0;
        Color color = null;

        do {
            Menu.menuColor();
            option = Validator.validateOption();
            color = chooseColor(option);

        }while (color ==null);

        System.out.println(Text.ADD_REFERENCE_VEHICLE);
        String reference = scanner.nextLine();
        double speedMaximum = Validator.validateDouble(Text.ADD_MAXIMUM_SPEED_VEHICLE);

        Vehicle vehicle = Vehicle.builder()
                .reference(reference)
                .maximumSpeed(speedMaximum)
                .color(color)
                .build();

        return vehicle;

    }

    public static Plane createPlane(){
        System.out.println(Text.ADD_INFO_PLANE);
        Vehicle vehicle = createInformationVehicle();
        double altitudMaxima = Validator.validateDouble(Text.ADD_MAXIMUM_ALTITUDE);
        return new Plane(vehicle, altitudMaxima);

    }

    public static Boat createBoat(){
        System.out.println(Text.ADD_INFO_BOAT);
        Vehicle vehicle = createInformationVehicle();
        double maximumWeight = Validator.validateDouble(Text.ADD_MAXIMUM_WEIGHT);
        return new Boat(vehicle, maximumWeight);

    }

    public static Car createCar(){
        System.out.println(Text.ADD_INFO_CAR);
        Vehicle vehicle = createInformationVehicle();
        int numberGates = Validator.validateInt(Text.ADD_NUMBER_GATES);
        return new Car(vehicle,numberGates);
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
                System.out.println(Text.EXIT_OPTION_ADD);
                return null;
            default:
                System.out.println(Text.INVALID_OPTION);
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
                System.out.println(Text.INVALID_OPTION);
                return null;
        }
    }


}
