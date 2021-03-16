import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir1 = false;
        boolean salir2 = false;
        boolean seguir = true;
        int opcion;
        int opcion2;
        int tamañoGaraje = 10;

        //arreglo
        Vehiculo[] garaje = new Vehiculo[tamañoGaraje];
        int contador = 0;

        // Menú #1
        while (!salir1) {
            System.out.println("Escoge una de las siguientes opciones");
            System.out.println("1. Agregar vehículo");
            System.out.println("2. Mostrar garaje");
            System.out.println("3. Salir");

            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        salir2 = false;
                        System.out.println("Has seleccionado la opcion 1, agregar vehículo");

                        //Menú #2
                        while (!salir2) {

                            if (contador == tamañoGaraje) {
                                System.out.println("El garaje está lleno");
                                salir2 = true;

                            } else {
                                System.out.println("1. Avión");
                                System.out.println("2. Yate");
                                System.out.println("3. Carro");
                                System.out.println("4. Salir");

                                try {

                                    System.out.println("Escribe una de las opciones");
                                    opcion2 = sn.nextInt();

                                    switch (opcion2) {

                                        case 1:
                                            System.out.println("Has seleccionado la opcion 1, Avión");
                                            Avion avion = new RecibidorDeInformacion().ingresarInformacionAvion();
                                            garaje[contador] = avion;
                                            contador++;
                                            break;

                                        case 2:

                                            System.out.println("Has seleccionado la opcion 2, Yate");
                                            Yate yate = new RecibidorDeInformacion().ingresarInformacionYate();
                                            garaje[contador] = yate;
                                            contador++;

                                            break;
                                        case 3:
                                            System.out.println("Has seleccionado la opcion 3, Carro");
                                            Carro carro = new RecibidorDeInformacion().ingresarInformacionCarro();
                                            garaje[contador] = carro;
                                            contador++;
                                            break;
                                        case 4:
                                            salir2 = true;
                                            break;

                                        default:
                                            System.out.println("Opción no válida");
                                            System.out.println("Solo números entre 1 y 4");
                                    }

                                } catch (InputMismatchException e) {
                                    System.out.println("Debes insertar un número");
                                    sn.next();
                                }

                            }
                        }
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2, mostrar garaje");

                        if (contador == 0) {
                            System.out.println("El garaje está vacio");
                        } else {
                            for (int i = 0; i < garaje.length; i++) {
                                System.out.println(garaje[i]);
                            }
                        }

                        break;
                    case 3:
                        salir1 = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }

}
