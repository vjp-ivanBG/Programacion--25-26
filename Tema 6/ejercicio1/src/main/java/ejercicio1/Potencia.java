/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Potencia extends Calculadora{
    
    public double exponente;
    
    
    //Constructores
    public Potencia(int numero, double exponente) {
        
        this.numero = numero;
        this.exponente = exponente;
    }
    
    //Método para relizar la operacion de la potencia
    @Override
    public double realizarOperacion() {
        return (int) (Math.pow(numero, exponente));
    }
    
    //Getters y Setters
    public double getExponente() {
        return exponente;
    }
    
    public void setExponente() {
        this.exponente = exponente;
    }
    
    public double getNumero() {
        return numero;
    }
    
    public void setNumero() {
        this.numero = numero;
    }
}
