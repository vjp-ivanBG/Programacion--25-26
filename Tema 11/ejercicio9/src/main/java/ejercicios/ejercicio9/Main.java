/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio9;

/**
 *
 * @author alumno
 */
import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    private static TreeMap<LocalDate, Sorteo> sorteos = new TreeMap<>();
    private static Scanner sc = new Scanner(System.in);

        
    public static void main(String[] args) {

        int opcion;

        do {
            mostrarMenu();
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1: realizarSorteoHoy();
                break;
                
                case 2: repetirSorteoHoy();
                break;
                
                case 3: mostrarSorteosMesActual();
                break;
                
                case 4: mostrarSorteoPorFecha();
                break;
                
                case 5: realizarSorteoPorFecha();
                break;
                
                case 6: mostrarTodos();
                break;
                
                case 7: System.out.println("Saliendo...");
                break;
                
                default: System.out.println("Opción no válida");
            }

        } while (opcion != 0);
    }

    //Método que realiza el sorteo hoy
    private static void realizarSorteoHoy() {
    LocalDate hoy = LocalDate.now();

    if (sorteos.containsKey(hoy)) {
        System.out.println("Ya existe un sorteo hoy.");
        return;
    }

        Sorteo s = new Sorteo(hoy);
        sorteos.put(hoy, s);
        System.out.println("Sorteo realizado: " + s);
    }

    //Método que repite el sorteo de hoy
    private static void repetirSorteoHoy() {
    LocalDate hoy = LocalDate.now();

    if (!sorteos.containsKey(hoy)) {
        System.out.println("No hay sorteo hoy para repetir.");
        return;
    }

        sorteos.remove(hoy);
        Sorteo nuevo = new Sorteo(hoy);
        sorteos.put(hoy, nuevo);

        System.out.println("Sorteo repetido: " + nuevo);
    }

    //Método que muestra los sorteos del mes actual
    private static void mostrarSorteosMesActual() {
    LocalDate hoy = LocalDate.now();
    int mes = hoy.getMonthValue();
    int año = hoy.getYear();

        System.out.println("Sorteos del mes actual:");

        for (Sorteo s : sorteos.values()) {
            LocalDate f = s.getFecha();
            if (f.getMonthValue() == mes && f.getYear() == año) {
            System.out.println(s);
            }
        }
    }

    
    //Método que realiza un sorteo por fecha
    private static void realizarSorteoPorFecha() {
    System.out.print("Introduce fecha (AAAA-MM-DD): ");
    LocalDate f = LocalDate.parse(sc.nextLine());

    if (sorteos.containsKey(f)) {
        System.out.println("Ya existe un sorteo en esa fecha.");
        return;
    }

        Sorteo s = new Sorteo(f);
        sorteos.put(f, s);

        System.out.println("Sorteo realizado: " + s);
    }

    //Método que muestra un sorteo por fecha
    private static void mostrarSorteoPorFecha() {
        System.out.print("Introduce fecha (AAAA-MM-DD): ");
        LocalDate f = LocalDate.parse(sc.nextLine());

        Sorteo s = sorteos.get(f);

        if (s == null)
            System.out.println("No existe sorteo en esa fecha.");
        else
            System.out.println(s);
    }

    //Método que muestra todos los sorteos
    private static void mostrarTodos() {
        System.out.println("Todos los sorteos:");
        for (Map.Entry<LocalDate, Sorteo> e : sorteos.entrySet()) {
            System.out.println(e.getValue());
        }
    }

    //Método que muestra el menú
    private static void mostrarMenu() {
        System.out.println("--- MENÚ SORTEOS ---");
        System.out.println("1. Realizar sorteo hoy");
        System.out.println("2. Repetir sorteo hoy");
        System.out.println("3. Mostrar sorteos del mes actual");
        System.out.println("4. Mostrar sorteo por fecha");
        System.out.println("5. Realizar sorteo por fecha");
        System.out.println("6. Mostrar todos los sorteos");
        System.out.println("7. Salir");
        System.out.print("Elige una opción: ");
    }
}
