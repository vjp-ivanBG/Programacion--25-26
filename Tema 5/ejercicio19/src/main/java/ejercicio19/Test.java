/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Test {
        
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado[] empleados = new Empleado[3];

        // Pedimos los datos de cada empleado
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Introduce el nombre del empleado " + (i + 1) + ":");
            String nombre = sc.nextLine();

            System.out.println("Horas trabajadas por " + nombre + ":");
            int horas = Integer.parseInt(sc.nextLine());

            System.out.println("Tarifa por hora de " + nombre + ":");
            double tarifa = Double.parseDouble(sc.nextLine());

            empleados[i] = new Empleado(nombre, horas, tarifa);
        }

        // Mostramos el sueldo bruto de cada uno
        System.out.println("\n--- Sueldos brutos ---");
        for (Empleado emp : empleados) {
            emp.mostrarSueldo();
        }

        sc.close();
    }
}


