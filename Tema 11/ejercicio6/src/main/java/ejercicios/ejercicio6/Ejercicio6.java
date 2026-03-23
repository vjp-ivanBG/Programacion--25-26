/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicios.ejercicio6;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Campania campania = new Campania("Campaña COVID-19");

        int opcion;

        do {
            System.out.println("--- MENÚ DONACIONES ---");
            System.out.println("1. Añadir donación");
            System.out.println("2. Mostrar donaciones");
            System.out.println("3. Mostrar donaciones por nombre");
            System.out.println("4. Mostrar número de donaciones");
            System.out.println("5. Mostrar total recaudado");
            System.out.println("6. Ordenar donaciones (mayor a menor)");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del donante: ");
                    String nombre = sc.nextLine();
                    System.out.print("Cantidad donada: ");
                    double cantidad = sc.nextDouble();
                    sc.nextLine();
                    campania.agregarDonacion(new Donacion(nombre, cantidad));
                    break;

                case 2:
                    campania.mostrarDonaciones();
                    break;

                case 3:
                    System.out.print("Introduce el nombre a buscar: ");
                    String buscar = sc.nextLine();
                    campania.mostrarPorNombre(buscar);
                    break;

                case 4:
                    System.out.println("Número de donaciones: " + campania.numeroDonaciones());
                    break;

                case 5:
                    System.out.println("Total recaudado: " + campania.totalRecaudado() + " €");
                    break;

                case 6:
                    campania.ordenarDonaciones();
                    System.out.println("Donaciones ordenadas correctamente.");
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 7);
    }
}

