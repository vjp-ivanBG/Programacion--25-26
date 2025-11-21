/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
public class Coche {
    // Atributos privados
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido = false;

    // Métodos públicos
    public void establecerMarca(String marca) {
        this.marca = marca;
    }

    public void establecerModelo(String modelo) {
        this.modelo = modelo;
    }

    public void establecerColor(String color) {
        this.color = color;
    }
    //Método que enciende el coche
    public void arrancarCoche() {
        motorEncendido = true;
        velocidad = 10;
    }
    //Método que apaga el coche
    public void apagarCoche() {
        motorEncendido = false;
        velocidad = 0;
    }
    //Método que aumenta en 20 la velocidad
    public void acelerarCoche() {
        velocidad += 20;
    }
    //Método para disminuir la velocidad en 6
    public void frenarCoche() {
        velocidad -= 6;
        if (velocidad < 0) velocidad = 0;
    }

    public void obtenerEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Motor encendido: " + motorEncendido);
    }
 }
