/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author bueso
 */
public class Empleado {
    String nombre;
    int salario;
    Direccion direccion;
    
    //Constructor 
    public Empleado(String nombre, int salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }
    //Método para mostrar los datos del empleado
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Dirección:");
        System.out.println(direccion.mostrarDireccion());
        System.out.println();
    }
}


