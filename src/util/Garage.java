package util;

import exception.GarageException;
import model.Vehicle;

public class Garage {

    public static final int NUMERO_MAXIMO_VEHICULOS = 2;
    private Vehicle[] vehicles = new Vehicle[NUMERO_MAXIMO_VEHICULOS];
    public static final String MENSAJE_ERROR_GARAJE_LLENO = "Garaje lleno";

    public void addVehicle(Vehicle newVehicle) {
        if (null != newVehicle){
            if (isFullGarage()){
                throw new GarageException(MENSAJE_ERROR_GARAJE_LLENO);
            }
            int spaceAvailable = findAvailableSpace();
            vehicles[spaceAvailable] = newVehicle;
        }
    }


    public void showVehicles(){
        for(int i = 0; i< vehicles.length; i++){
            if(vehicles[i] !=null){
                System.out.println((i + 1) + ". " + vehicles[i]);
            }else {
                System.out.println("El garaje esta vacio");
            }
        }
    }


    public int findAvailableSpace(){
        for(int i = 0; i< vehicles.length; i++){
            if(vehicles[i] == null){
                return i;
            }
        }
        return -1;
    }

    public boolean isFullGarage(){
        return findAvailableSpace() == -1;
    }


}
