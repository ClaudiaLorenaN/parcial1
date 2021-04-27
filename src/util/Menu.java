package util;

import model.Color;
import model.Vehicle;

public class Menu {

    private final Garage garage = new Garage();

    public void showMenu(){

        System.out.println("Bienvenido al garaje");
        System.out.println("Escoge una de las siguientes opciones");
        System.out.println("1. Agregar vehículo");
        System.out.println("2. Mostrar garaje");
        System.out.println("3. Salir");
    }

    public void ranMenu(){
        int option = 0;
        do{
            showMenu();
            option = Validator.validateOption();
            chooseOperation(option);

        }while(option !=3);

    }

    public void menuVehicles(){
        System.out.println("¿Qué vehiculo desea agregar?");
        System.out.println("1. model.Avion");
        System.out.println("2. model.Yate");
        System.out.println("3. model.Carro");
        System.out.println("4. Salir");

    }

    public Vehicle ranMenuAddVehicle(){
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
        System.out.println("1. " + Color.NEGRO);
        System.out.println("2. " + Color.BLANCO);
        System.out.println("3. " + Color.AZUL);
        System.out.println("4. " + Color.VERDE);
        System.out.println("5. " + Color.GRIS);
    }

    public void chooseOperation(int option){
        switch (option){
            case 1:
                Vehicle newVehicle = null;
                if(!garage.isFullGarage()){
                    System.out.println("Adicionando vehiculos");
                    newVehicle=ranMenuAddVehicle();
                    garage.addVehicle(newVehicle);


                }else{
                    System.out.println(garage.MENSAJE_ERROR_GARAJE_LLENO);

                }
                break;
            case 2:
                //System.out.println("Mostrando vehiculos");
                garage.showVehicles();
                break;
            case 3:
                System.out.println("Gracias por utilizar nuestra aplicación");
                break;
            default:
                System.out.println("Opción no válida");
        }

    }






}
