package util;

import exception.GarageException;
import model.Vehicle;

import java.util.*;
import java.util.stream.Collectors;

public class Garage {
    LinkedHashSet<Vehicle> vehicles = new LinkedHashSet<>();
    //private Vehicle[] vehicles = new Vehicle[NUMBER_MAXIMUM_VEHICLES];

    public Map<String, Vehicle> convertToMap(){
        Map<String, Vehicle> mapVehicle = new HashMap<>();

        for (Vehicle v : vehicles) {
            if(v != null)
            mapVehicle.put(v.getReference(), v);
        }

        return mapVehicle;
    }

    public void addVehicle(Vehicle newVehicle) {
        vehicles.add(newVehicle);
    }


    public void showVehicles(){
        Map<String, Vehicle> mapVehicle = convertToMap();

            if(mapVehicle.isEmpty()){
                System.out.println(Text.MESSAGE_MISTAKE_EMPTY_GARAGE);
            }else{
                mapVehicle.forEach((key, value) -> System.out.println("Vehículo: "+ key + " value: " + value));
                //vehicles.forEach (vehicle -> System.out.println(vehicle));
            }
    }


    public void showVehiclesHigherTopSpeed(){

        if(vehicles.isEmpty()){
            System.out.println(Text.MESSAGE_MISTAKE_EMPTY_GARAGE);
        }else{
            Optional<Vehicle> maximunSpeed = vehicles.stream()
                    .max((p1,p2)  ->  (int)p1.getMaximumSpeed() - (int)p2.getMaximumSpeed());

            System.out.println("Maximum element: " + maximunSpeed);


        }

    }

    public void showVehiclesLowerTopSpeed(){

        if(vehicles.isEmpty()){
            System.out.println(Text.MESSAGE_MISTAKE_EMPTY_GARAGE);
        }else{
            Optional<Vehicle> minimunSpeed = vehicles.stream()
                    .min((p1,p2)  ->  (int)p1.getMaximumSpeed() - (int)p2.getMaximumSpeed());

            System.out.println("Minimum element: " + minimunSpeed);

        }

    }

    public void showOrderVehiclesByMaximumSpeed(){

        if(vehicles.isEmpty()){
            System.out.println(Text.MESSAGE_MISTAKE_EMPTY_GARAGE);
        }else{
            //Optional<Vehicle> OrderVehiclesByMaximumSpeed = vehicles.stream()
                   // .sorted(Comparator.comparing(Vehicle::getMaximumSpeed))


           //System.out.println("Minimun element: " + OrderVehiclesByMaximumSpeed);

        }

        //https://www.benchresources.net/how-to-sort-linkedhashset-contents-in-java/

    }


}
