/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author alumno
 */
public class Profesor extends Persona{
    
    private String especialidad;
    
    public Profesor(String nombre, String especialidad) {
        this.especialidad = especialidad;
        this.nombre = nombre;
    }
    
    @Override
    public String Saludar() {
        return "Hola soy" + nombre + " de la especalidad de " + especialidad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre() {
        this.nombre = nombre;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }
    
    public void setEspecialidad() {
        this.especialidad = especialidad;
    }
}
