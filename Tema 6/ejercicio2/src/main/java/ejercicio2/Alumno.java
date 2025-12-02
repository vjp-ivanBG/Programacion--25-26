/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author alumno
 */
public class Alumno extends Persona {
    
    private String grupo;
    
    public Alumno(String nombre, String grupo) {
        this.nombre = nombre;
        this.grupo = grupo;
    }
    
    @Override
    public String Saludar() {
        return "Hola soy " + nombre + " del grupo " + grupo;
    }
    
     public String getNombre() {
        return nombre;
    }
    
    public void setNombre() {
        this.nombre = nombre;
    }
    
    public String getGrupo() {
        return grupo;
    }
    
    public void setGrupo() {
        this.grupo = grupo;
    }
}

