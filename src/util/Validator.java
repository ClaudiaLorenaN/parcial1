package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validator {

    private static Scanner scanner = new Scanner(System.in);
    public static double validateDouble(String message){
        double number = 0;
        do {
            System.out.println(message);
            try {
                number = scanner.nextDouble();
            } catch (InputMismatchException ex) {
                number = -1.0;
            }
            scanner.nextLine();
        }while (number == -1.0);
        return number;
    }



    public static int validateOption(){
        int option = 0;
        try {
            option = scanner.nextInt();

        }catch (InputMismatchException e){
            option = 0;

        }
        scanner.nextLine();
        return option;
    }

    public static int validateInt(String message){
        int number = 0;
        do {
            System.out.println(message);
            try {
                number = scanner.nextInt();
            } catch (InputMismatchException ex) {
                number = -1;
            }
            scanner.nextLine();
        }while (number == -1);
        return number;
    }

}
