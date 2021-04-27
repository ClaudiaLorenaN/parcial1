package util;

import model.Color;
import model.Vehicle;

public class Menu {

    private final Garage garage = new Garage();

    public void showMenu(){

        System.out.println(Text.WELCOME_GARAGE);
        System.out.println(Text.CHOOSE_OPTION);
        System.out.println(Text.NUMBER_ONE + " " + Text.ADD_VEHICLE);
        System.out.println(Text.NUMBER_TWO + " " + Text.SHOW_GARAGE);
        System.out.println(Text.NUMBER_THREE + " " + Text.EXIT);
    }

    public void runMenu(){
        int option = 0;
        do{
            showMenu();
            option = Validator.validateOption();
            chooseOperation(option);

        }while(option !=3);

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
                if(!garage.isFullGarage()){
                    System.out.println(Text.ADDING_VEHICLES);
                    newVehicle= runMenuAddVehicle();
                    garage.addVehicle(newVehicle);


                }else{
                    System.out.println(Text.MESSAGE_MISTAKE_FULL_GARAGE);

                }
                break;
            case 2:
                garage.showVehicles();
                break;
            case 3:
                System.out.println(Text.GOODBYE);
                break;
            default:
                System.out.println(Text.INVALID_OPTION);
        }

    }
}
