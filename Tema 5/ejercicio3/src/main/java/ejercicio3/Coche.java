/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author alumno
 */
public class Coche {
    private String marca;
    private String modelo;
    private Rueda ruedas; // Esto es un objeto, no un número ni texto

    // Método para establecer la marca
    public void establecerMarca(String marca) {
        this.marca = marca;
    }

    // Método para establecer el modelo
    public void establecerModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método para obtener la marca
    public String obtenerMarca() {
        return marca;
    }

    // Método para obtener el modelo
    public String obtenerModelo() {
        return modelo;
    }

    // Método para establecer la rueda 
    public void establecerRueda(Rueda rueda) {
        this.ruedas = rueda;
    }

    // Método que devuelve las ruedas
    public Rueda obtenerRueda() {
        return ruedas;
    }
}


