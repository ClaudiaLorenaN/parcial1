package util;

import exception.GarageException;
import model.Vehicle;

public class Garage {

    public static final int NUMBER_MAXIMUM_VEHICLES = 10;
    private Vehicle[] vehicles = new Vehicle[NUMBER_MAXIMUM_VEHICLES];


    public void addVehicle(Vehicle newVehicle) {
        if (null != newVehicle){
            if (isFullGarage()){
                throw new GarageException(Text.MESSAGE_MISTAKE_FULL_GARAGE);
            }
            int spaceAvailable = findAvailableSpace();
            vehicles[spaceAvailable] = newVehicle;
        }
    }


    public void showVehicles(){
        boolean empty = true;

        for(int i = 0; i< vehicles.length; i++){
            if(vehicles[i] !=null){
                System.out.println((i + 1) + ". " + vehicles[i]);
                empty=false;
            }
        }

        if (empty) {
            System.out.println(Text.MESSAGE_MISTAKE_EMPTY_GARAGE);
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
