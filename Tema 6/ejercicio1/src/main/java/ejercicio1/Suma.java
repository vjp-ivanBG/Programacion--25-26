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
public class Suma extends Calculadora {
    
    public double sumando;
    
    //Constructores
    public Suma(double numero, double sumando) {
        this.numero = numero;
        this.sumando = sumando;
    }
    
    //Método para hacer la suma
    @Override
    public double realizarOperacion() {
        return (numero + sumando);
    }
    
    //Getters y Setters
    public double getSumando(){
        return sumando;
    }
    
    public void setSumando(){
        this.sumando = sumando;
    }
    
    public double getNumero() {
        return numero;
    }
    
    public void setNumero() {
        this.numero = numero;
    }
}
