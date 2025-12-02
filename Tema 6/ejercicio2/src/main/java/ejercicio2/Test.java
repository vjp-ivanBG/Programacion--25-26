/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author alumno
 */
public class Test {
    
    public static void main(String[] args) {
        
        Profesor profesor = new Profesor(" Josemi", "Montaje y manteminiento");
        Alumno alumno = new Alumno(" Juanito", "2ºSMR");
        
        System.out.println("Presentación del profesor");
        System.out.println(profesor.Saludar());
        
        System.out.println("Presentación del alumno");
        System.out.println(alumno.Saludar());
        
        System.out.println("====POLIMORFISMO====");
        
        Persona saludar;
        
        System.out.println("Presentación del profesor");
        System.out.println(saludar.Saludar());
        
        System.out.println("Presentación del alumno");
        System.out.println(alumno.Saludar());
    }
}
