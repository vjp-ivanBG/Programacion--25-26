/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author bueso
 */
public class Test {
    public static void main(String[] args) {
        Direccion d1 = new Direccion("Gran Vía", 12, "3A", "Madrid");
        Direccion d2 = new Direccion("Calle Mayor", 45, "2B", "Barcelona");
        Direccion d3 = new Direccion("Avenida del Sol", 101, "1C", "Sevilla");

        Empleado e1 = new Empleado("Ana Torres", 2500, d1);
        Empleado e2 = new Empleado("Luis Gómez", 3200, d2);
        Empleado e3 = new Empleado("Marta Ruiz", 2800, d3);

        System.out.println("EMPLEADO 1:");
        e1.mostrarDatos();

        System.out.println("EMPLEADO 2:");
        e2.mostrarDatos();

        System.out.println("EMPLEADO 3:");
        e3.mostrarDatos();
    }
}


