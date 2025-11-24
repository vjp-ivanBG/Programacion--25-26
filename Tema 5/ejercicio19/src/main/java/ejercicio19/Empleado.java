/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author alumno
 */
public class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private double tarifaPorHora;

    //Constructor que recibe todos los datos del empleado
    public Empleado(String nombre, int horasTrabajadas, double tarifaPorHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    //Método que calcula el sueldo bruto
    public double calcularSueldoBruto() {
        if (horasTrabajadas <= 40) {
            return horasTrabajadas * tarifaPorHora;
        } else {
            int horasExtras = horasTrabajadas - 40;
            return (40 * tarifaPorHora) + (horasExtras * tarifaPorHora * 1.5);
        }
    }

    //Método que muestra la informacion del empleado
    public void mostrarSueldo() {
        System.out.println(nombre + " trabajó " + horasTrabajadas + " horas, cobra " +
            tarifaPorHora + " euros la hora, por lo que le corresponde un sueldo de " +
            calcularSueldoBruto() + " euros.");
    }
}


