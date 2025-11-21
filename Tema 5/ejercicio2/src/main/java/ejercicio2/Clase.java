/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author alumno
 */
public class Clase {
 
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.establecerNombreYHoras("Programación", 60);
        curso2.establecerNombreYHoras("Bases de Datos", 45);

        System.out.println("Curso 1: " + curso1.obtenerNombre() + " - " + curso1.obtenerHoras() + " horas");
        System.out.println("Curso 2: " + curso2.obtenerNombre() + " - " + curso2.obtenerHoras() + " horas");

        System.out.println("Número de cursos creados: " + Curso.verNumeroCursos());
    }
}


