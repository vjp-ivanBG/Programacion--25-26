/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
public abstract class Calculadora {
    
    public double numero;
    
    //Creo los getters y setters
    public double getNumero() {
        return numero;
    }
    
    public void setNumero() {
        this.numero = numero;
    }
    
    public abstract double realizarOperacion(); 
}
