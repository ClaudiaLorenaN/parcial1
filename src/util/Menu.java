package util;

import model.Color;
import model.Vehicle;

public class Menu {

    private final Garage garage = new Garage();
    public static int counter = 0;
    public static final int NUMBER_MAXIMUM_VEHICLES = 2;

    public void showMenu(){

        System.out.println(Text.WELCOME_GARAGE);
        System.out.println(Text.CHOOSE_OPTION);
        System.out.println(Text.NUMBER_ONE + " " + Text.ADD_VEHICLE);
        System.out.println(Text.NUMBER_TWO + " " + Text.SHOW_GARAGE);
        System.out.println(Text.NUMBER_THREE + " " + Text.FIND_CAR_HIGHER_TOP_SPEED); ///
        System.out.println(Text.NUMBER_FOUR + " " + Text.FIND_CAR_LOWER_TOP_SPEED); ///
        System.out.println(Text.NUMBER_FIVE + " " + Text.SORT_CARS_BY_MAXIMUM_SPEED_HIGHEST_TO_LOWEST); ///
        System.out.println(Text.NUMBER_SIX + " " + Text.SHOW_CARS_BLACK); ///
        System.out.println(Text.NUMBER_SEVEN + " " + Text.SHOW_REFERENCES_WHITE_CARS); ///
        System.out.println(Text.NUMBER_EIGHT + " " + Text.EXIT);
    }

    public void runMenu(){
        int option = 0;
        do{
            showMenu();
            option = Validator.validateOption();
            chooseOperation(option);

        }while(option !=8); //cambio######################

    }

    public void menuVehicles(){
        System.out.println(Text.QUESTION_ADD_VEHICLE);
        System.out.println(Text.NUMBER_ONE + " " + Text.PLANE);
        System.out.println(Text.NUMBER_TWO + " " + Text.BOAT);
        System.out.println(Text.NUMBER_THREE + " " + Text.CAR);
        System.out.println(Text.NUMBER_FOUR + " " + Text.EXIT);

    }

    public Vehicle runMenuAddVehicle(){
        int option = 0;
        Vehicle vehicle =null;
        do{
            menuVehicles();
            option = Validator.validateOption();
            InformationReceiver ic = InformationReceiver.getInstance();
            vehicle = ic.chooseVehicle(option);

        }while(option != 4 && vehicle == null);
        return vehicle;
    }

    public static void menuColor(){
        System.out.println(Text.NUMBER_ONE + " " + Color.NEGRO);
        System.out.println(Text.NUMBER_TWO + " " + Color.BLANCO);
        System.out.println(Text.NUMBER_THREE + " " + Color.AZUL);
        System.out.println(Text.NUMBER_FOUR + " " + Color.VERDE);
        System.out.println(Text.NUMBER_FIVE + " " + Color.GRIS);
    }

    public void chooseOperation(int option){
        switch (option){
            case 1:
                Vehicle newVehicle = null;
                if(counter >= NUMBER_MAXIMUM_VEHICLES){
                    System.out.println(Text.MESSAGE_MISTAKE_FULL_GARAGE);

                }else{
                    System.out.println(Text.ADDING_VEHICLES);
                    newVehicle= runMenuAddVehicle();
                    garage.addVehicle(newVehicle);
                    counter ++;
                }
                break;
            case 2:
                garage.showVehicles();
                break;
            case 3:
                garage.showVehiclesHigherTopSpeed();
                break;
            case 4:
                garage.showVehiclesLowerTopSpeed();
                break;
            case 5:
                garage.showOrderVehiclesByMaximumSpeed();
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                System.out.println(Text.GOODBYE);
                break;
            default:
                System.out.println(Text.INVALID_OPTION);
        }

    }
}
