/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author alumno
 */
public class Curso {
    private String nombre;
    private int numeroHoras;
    private static int numeroDeCursos = 0;

    // Constructor para los cursos
    public Curso() {
        sumarCursos();
    }

    // Método que establece el nombre y hora
    public void establecerNombreYHoras(String nombre, int horas) {
        this.nombre = nombre;
        this.numeroHoras = horas;
    }
    //Método que obtiene el nombre
    public String obtenerNombre() {
        return nombre;
    }
    //Método que obtiene las horas
    public int obtenerHoras() {
        return numeroHoras;
    }

    // Método que suma los cursos
    public static void sumarCursos() {
        numeroDeCursos++;
    }
    //Método que regresa el numero de cursos
    public static int verNumeroCursos() {
        return numeroDeCursos;
    }
}


