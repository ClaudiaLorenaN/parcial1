package util;

import exception.GarageException;
import model.Color;
import model.Vehicle;

import java.util.*;
import java.util.stream.Collectors;


public class Garage {
    Set<Vehicle> vehicles = new LinkedHashSet<>();
    int counter = 0;
    final int NUMBER_MAXIMUM_VEHICLES = 10;

    public Map<String, Vehicle> convertToMap(){
        Map<String, Vehicle> mapVehicle = new HashMap<>();

        for (Vehicle v : vehicles) {
            if(v != null)
            mapVehicle.put(v.getReference(), v);
        }

        return mapVehicle;
    }

    public void addVehicle(Vehicle newVehicle) {
        if (null != newVehicle){
            if (isFullGarage()){
                throw new GarageException(Text.MESSAGE_MISTAKE_FULL_GARAGE);
            }

            vehicles.add(newVehicle);
            counter++;
        }
    }

    public boolean isFullGarage(){
        return NUMBER_MAXIMUM_VEHICLES == counter;
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
                    .max(Comparator.comparing(Vehicle::getMaximumSpeed));

            System.out.println("Maximum element: " + maximunSpeed);

        }

    }

    public void showVehiclesLowerTopSpeed(){

        if(vehicles.isEmpty()){
            System.out.println(Text.MESSAGE_MISTAKE_EMPTY_GARAGE);
        }else{
            Optional<Vehicle> minimunSpeed = vehicles.stream()
                    .min(Comparator.comparing(Vehicle::getMaximumSpeed));

            System.out.println("Minimum element: " + minimunSpeed);

        }

    }

    public void showOrderVehiclesByMaximumSpeed(){

        if(vehicles.isEmpty()){
            System.out.println(Text.MESSAGE_MISTAKE_EMPTY_GARAGE);
        }else{
            List<Vehicle> vehiclesByMaximumSpeed = vehicles.stream()
                    .sorted((p1,p2)  ->  (int)p2.getMaximumSpeed() - (int)p1.getMaximumSpeed())
                    .collect(Collectors.toList());

            for(Vehicle vehicle : vehiclesByMaximumSpeed) {
                System.out.println(vehicle);
            }


        }

    }

    public void showBlackOrBlueCars(){

        if(vehicles.isEmpty()){
            System.out.println(Text.MESSAGE_MISTAKE_EMPTY_GARAGE);
        }else{
            Set BlackOrBlueCars = vehicles.stream()
                    .filter(vehicle ->  vehicle.getColor() == Color.NEGRO || vehicle.getColor() == Color.AZUL)
                    .collect(Collectors.toSet());

            System.out.println(BlackOrBlueCars);

        }

    }

    public void showReferencesWhiteOrGreenCars(){

        if(vehicles.isEmpty()){
            System.out.println(Text.MESSAGE_MISTAKE_EMPTY_GARAGE);
        }else{

            String sumReferences = vehicles.stream()
                    .filter(vehicle ->  vehicle.getColor() == Color.BLANCO || vehicle.getColor() == Color.VERDE)
                    .map(Vehicle::getReference)
                    .collect(Collectors.joining(" "));

            System.out.println(sumReferences);


        }

    }


}
