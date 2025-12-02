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
public class Multiplicacion extends Calculadora {
    
    public double multiplicacion;
    
    
    //Constructores
    public Multiplicacion(int numero, double multiplicacion) {
        this.numero = numero;
        this.multiplicacion = multiplicacion;
    }
    
    //Método para hacer la multiplicacion
    @Override
    public double realizarOperacion() {
        return (numero * multiplicacion);
    }
    
    //Getters y Setters
    public double getMultiplicacion(){
        return multiplicacion;
    }
    
    public void setMultiplicacion(){
        this.multiplicacion = multiplicacion;
    }
    
    public double getNumero() {
        return numero;
    }
    
    public void setNumero() {
        this.numero = numero;
    }
}


