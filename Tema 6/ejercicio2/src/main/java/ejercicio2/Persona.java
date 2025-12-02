/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author alumno
 */
public abstract class Persona {
    
    public String nombre;
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre() {
        this.nombre = nombre;
    }
    
    public abstract String Saludar(); 
    
}
