/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio6;

/**
 *
 * @author alumno
 */
public class Donacion {
    private String nombreDonante;
    private double cantidad;

    public Donacion(String nombreDonante, double cantidad) {
        this.nombreDonante = nombreDonante;
        this.cantidad = cantidad;
    }

    public String getNombreDonante() {
        return nombreDonante;
    }

    public double getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return nombreDonante + " donó " + cantidad + " €";
    }
}

