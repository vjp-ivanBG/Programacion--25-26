/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicios.ejercicio15;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
import java.util.Random;

public class Ejercicio15 {
    static final int MESES = 12;
    static int[] ventas = new int[MESES];
    static String[] nombresMeses = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };
    
    //Método main para el menú
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> rellenarVentas();
                case 2 -> mostrarVentas();
                case 3 -> mostrarVentasReverso();
                case 4 -> mostrarSumaTotal();
                case 5 -> mostrarVentasMesesPares();
                case 6 -> mostrarMesMayorVenta();
                case 7 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 7);
    }

    static void mostrarMenu() {
        System.out.println("--- MENÚ DE VENTAS DE COCHES ---");
        System.out.println("1. Rellenar ventas mensuales (aleatorio 10-100)");    
        System.out.println("2. Mostrar ventas mensuales");    
        System.out.println("3. Mostrar ventas en orden inverso");    
        System.out.println("4. Mostrar suma total del año");    
        System.out.println("5. Mostrar ventas de meses pares");    
        System.out.println("6. Mostrar mes con más ventas");    
        System.out.println("7. Salir");
    }

    //Método que rellena las ventas
    static void rellenarVentas() {
        Random rand = new Random();
        for (int i = 0; i < MESES; i++) {
            ventas[i] = rand.nextInt(91) + 10;
        }
        System.out.println("Ventas generadas correctamente.");
    }

    static void mostrarVentas() {
        for (int i = 0; i < MESES; i++) {
            System.out.println(nombresMeses[i] + ": " + ventas[i] + " coches");
        }
    }

    static void mostrarVentasReverso() {
        for (int i = MESES - 1; i >= 0; i--) {
            System.out.printf("%s: %d coches%n", nombresMeses[i], ventas[i]);
        }
    }

    static void mostrarSumaTotal() {
        int suma = 0;
        for (int venta : ventas) {
            suma += venta;
        }
        System.out.println("Ventas totales del año: " + suma);
    }

    static void mostrarVentasMesesPares() {
        int suma = 0;
        for (int i = 1; i < MESES; i += 2) {
            suma += ventas[i];
        }
        System.out.println("Ventas en meses pares: " + suma);
    }

    static void mostrarMesMayorVenta() {
        int max = ventas[0];
        int indiceMax = 0;
        for (int i = 1; i < MESES; i++) {
            if (ventas[i] > max) {
                max = ventas[i];
                indiceMax = i;
            }
        }
        System.out.printf("Mes con más ventas: %s (%d coches)%n", nombresMeses[indiceMax], max);
    }
}


