/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author bueso
 */
public class Test {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Lucía", 9);
        Alumno a2 = new Alumno("Carlos", 6);
        Alumno a3 = new Alumno("Marta", 3);
        
        mostrarAlumno(a1);
        mostrarAlumno(a2);
        mostrarAlumno(a3);
    }

    //Método que muestra los datos de un alumno
    public static void mostrarAlumno(Alumno alumno) {
        System.out.println("\n--- Datos del alumno ---");
        alumno.mostrarDatos();
    }
}


