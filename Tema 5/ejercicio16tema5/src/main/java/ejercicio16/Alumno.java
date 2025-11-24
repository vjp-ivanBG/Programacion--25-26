/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author bueso
 */
public class Alumno {
    String nombre;   
    int nota;        

    //Constructor
    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    //Método que devuelve la calificación según la nota
    public String obtenerCalificacion() {
        if (nota >= 0 && nota <= 4) {
            return "Suspenso";
        } else if (nota <= 6) {
            return "Bien";
        } else if (nota <= 8) {
            return "Notable";
        } else if (nota <= 10) {
            return "Sobresaliente";
        } else {
            return "Error: nota fuera de rango"; // Por si alguien mete un número loco
        }
    }

    //Método que muestra los datos del alumno
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota: " + nota);
        System.out.println("Calificación: " + obtenerCalificacion());
    }
}


